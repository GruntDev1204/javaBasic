package part4;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static boolean action  = true;
    public static  Scanner request  = new Scanner(System.in);
    static ArrayList<OldPhone> oldPh = new ArrayList<>();
    static ArrayList<NewPhone> newPh = new ArrayList<>();
    static   ArrayList<MobilePhone> listAllPhone = new ArrayList<>();

    //show list menu
    public static void menuList(){
        int menuChoose = 0;
        System.out.println("-- CHƯƠNG TRÌNH QUẢN LÝ ĐIỆN THOẠI -");
        System.out.println("-- 1. Xem danh sách điện thoại -");
        System.out.println("-- 2. Thêm mới -");
        System.out.println("-- 3. Cập nhật -");
        System.out.println("-- 4. Xóa -");
        System.out.println("--5. Sắp xếp theo giá  -");
        System.out.println("-- 6. Tìm kiếm -");
        System.out.println("-- 7. Tính tổng tiền -");
        System.out.println("-- 8. Giảm giá cho điện thoại cũ -");
        System.out.println("-- 9. Thoát-");
        System.out.print("Chọn: ");

        menuChoose = request.nextInt();

        do {
            if(menuChoose <= 0 || menuChoose > 9){
                System.out.println("chỉ lựa chọn trong chương trình!");
                menuChoose = request.nextInt();
            }
        }while (menuChoose <= 0  || menuChoose > 9);

        switch (menuChoose) {
            case 1:
                viewPhoneMenu();
                break;
            case 2:
                addMenu();
                break;

            case 3 :
                updateMenu();
                break;
            case 4:
                deleteMenu();
                break;
            case 5:
                arrangePhoneMenu();
                break;
            case 6:
                findMenu();
                break;

            case 9:
                System.out.println("Chương trình kết thúc!");
                action = false; // Thoát chương trình
            default:
                break;
        }
    }


    //Read
    // Hiển thị danh sách điện thoại
    private static void displayPhoneList(ArrayList<? extends MobilePhone> listPhone, String phoneType) {
        System.out.println(" =================> Danh sách điện thoại " + phoneType + " :" + "<==================");
        for (int i = 0; i < listPhone.size(); i++) {
            listPhone.get(i).output();
        }
        System.out.println("===============================================");
    }


    private static void displayPhoneList(){
        System.out.println(" =================> Danh sách điện thoại  :" + "<==================");
        listAllPhone.addAll(oldPh);
        listAllPhone.addAll(newPh);
        for (int i = 0; i < listAllPhone.size(); i++) {
            listAllPhone.get(i).output();
        }
        System.out.println("===============================================");

    }

    //OPTION CHO VIỆC XEM DANH SÁCH
    public static void viewPhoneMenu(){
        int viewChoice = 0;
        do {
            System.out.println("-- XEM DANH SÁCH ĐIỆN THOẠI --");
            System.out.println("1. Xem tất cả");
            System.out.println("2. Xem điện thoại cũ");
            System.out.println("3. Xem điện thoại mới");
            System.out.println("4. Trở về menu chính");
            System.out.print("Chọn: ");
            viewChoice = request.nextInt();

            if (viewChoice <= 0 || viewChoice > 4) {
                System.out.println("Chỉ lựa chọn trong chương trình!");
            } else if (viewChoice != 4) {  // Nếu không chọn "Trở về menu chính", hiển thị danh sách điện thoại
                viewPhones(viewChoice);
            }

        } while (viewChoice != 4);  // Chỉ kết thúc vòng lặp khi người dùng chọn "Trở về menu chính"
    }

    //show danh sách
    public static void viewPhones(int optionlist){
        switch (optionlist){
            case 1:
                System.out.println("---All Phones List---");
                displayPhoneList();

                break;
            case 2 :
                displayPhoneList(oldPh , "Cũ" );
                break;
            case 3 :
                displayPhoneList(newPh , "Mới" );
                break;

        }

    }


    //Create
    //auto creat new ID
    private static String autoGenerateID(boolean isNew){
            String implementPart = isNew ? "DTM" : "DTC";
            ArrayList<? extends MobilePhone> listPhone  = isNew ? newPh : oldPh;

            if(listPhone.size() == 0) {
                return implementPart + "001";
            }

            int maxID = Integer.parseInt(listPhone.get(0).getId().substring(3));

           for (int i = 1 ; i < listPhone.size() ; i ++ ){
               int subID = Integer.parseInt(listPhone.get(i).getId().substring(3));
               if(maxID <  subID) {
                   maxID = subID;
               }
           }
            return   implementPart + String.format("%03d", maxID + 1);
    }

    //menu thêm
    public static void addMenu(){
        int choiceCreate =  0;
        do{
            System.out.println("Thêm điện thoại : "  );
            System.out.println("1 : ĐT Mới"  );
            System.out.println("2 : ĐT Cũ "  );
            System.out.println("3 : Không thêm nữa "  );

            do{
                choiceCreate = request.nextInt();

                if(choiceCreate < 1 || choiceCreate > 3){
                    System.out.println(" chỉ thêm trong option : ");
                    choiceCreate = request.nextInt();
                }

            }while(choiceCreate < 1 || choiceCreate > 3);

            addPhone(choiceCreate);

        }while (choiceCreate !=3);
    }

    //thêm đt
    public static void addPhone(int addNewOption){

        switch (addNewOption){
            case 1 :
                NewPhone newP = new NewPhone();
                newP.input();
                newP.setId(autoGenerateID(true));
                newPh.add(newP);

                displayPhoneList(newPh , "Mới");

                break;
            case  2 :
                OldPhone oldP = new OldPhone();
                oldP.input();
                oldP.setId(autoGenerateID(false));
                oldPh.add(oldP);

                displayPhoneList(oldPh , "Cũ");

                break;
            case 3 :
                break;
        }

    }


    //Update
    //option update
    public static void updateMenu() {
        int updateChoice = 0;

        do {
            System.out.println("Chọn mã điện thoại bạn cần cập nhật : ");
            System.out.println("1. Điện thoại mới (mã DTM)");
            System.out.println("2. Điện thoại cũ (mã DTC)");
            System.out.println("3. Cancel");
            System.out.print("Chọn: ");
            updateChoice = request.nextInt();
            request.nextLine(); // Đọc dòng còn lại để tránh lỗi khi đọc chuỗi sau đó

            if (updateChoice < 1 || updateChoice > 3) {
                System.out.println("Chỉ được chọn trong các lựa chọn sẵn có!");
            }

        } while (updateChoice < 1 || updateChoice > 3);

        // Nếu người dùng chọn "Cancel", quay lại menu chính
        if (updateChoice == 3) {
            return;
        }

        String formatCode = updateChoice == 1 ? "DTM" : "DTC";
        String tailNumberOfId;

        // Nhập và kiểm tra ID
        do {
            ArrayList<? extends MobilePhone> listPhoneUpdate = updateChoice==1 ? newPh : oldPh;

            displayPhoneList(listPhoneUpdate, updateChoice == 1 ? "Mới" : "Cũ");

            System.out.println("Hãy nhập 3 số cuối của ID mà bạn muốn cập nhật (ví dụ: 001):");
            tailNumberOfId = request.nextLine(); // Đọc chuỗi từ bàn phím

            if (tailNumberOfId.length() != 3 || !tailNumberOfId.matches("\\d{3}")) {
                System.out.println("Hãy nhập đúng 3 chữ số!");
            }
        } while (tailNumberOfId.length() != 3 || !tailNumberOfId.matches("\\d{3}"));

        String idUpdate = formatCode + tailNumberOfId;
        updatePhone(idUpdate);
    }

    //update phone
    public static void updatePhone(String idUpdate) {
        boolean isNew = idUpdate.startsWith("DTM") ;
        ArrayList<? extends MobilePhone> listPhoneUpdate = isNew ? newPh : oldPh;

        boolean isExistPhone = false;

        // Cập nhật điện thoại
        for (MobilePhone phone : listPhoneUpdate) {
            if (phone.getId().equals(idUpdate)) {
                isExistPhone = true;
                phone.input();
                System.out.println("Cập nhật thành công! (" + idUpdate.substring(0, 3) + ")");
                break;
            }
        }

        if (!isExistPhone) {
            System.out.println("Không tìm thấy ID cần cập nhật");
        }

        displayPhoneList(listPhoneUpdate , isNew ? "Mới" : "Cũ");
    }


    //Delete
    //option Delete
    public static void deleteMenu() {
        int deleteChoice = 0;

        do {
            System.out.println("Chọn mã điện thoại bạn cần xóa : ");
            System.out.println("1. Điện thoại mới (mã DTM)");
            System.out.println("2. Điện thoại cũ (mã DTC)");
            System.out.println("3. Cancel");
            System.out.print("Chọn: ");
            deleteChoice = request.nextInt();
            request.nextLine(); // Đọc dòng còn lại để tránh lỗi khi đọc chuỗi sau đó

            if (deleteChoice < 1 || deleteChoice > 3) {
                System.out.println("Chỉ được chọn trong các lựa chọn sẵn có!");
            }

        } while (deleteChoice < 1 || deleteChoice > 3);

        // Nếu người dùng chọn "Cancel", quay lại menu chính
        if (deleteChoice == 3) {
            return;
        }

        String formatCode = deleteChoice == 1 ? "DTM" : "DTC";
        String tailNumberOfId;

        // Nhập và kiểm tra ID
        do {
            ArrayList<? extends MobilePhone> listPhoneDelete = deleteChoice==1 ? newPh : oldPh;

            displayPhoneList(listPhoneDelete, deleteChoice == 1 ? "Mới" : "Cũ");

            System.out.println("Hãy nhập 3 số cuối của ID mà bạn muốn xóa (ví dụ: 001):");
            tailNumberOfId = request.nextLine(); // Đọc chuỗi từ bàn phím

            if (tailNumberOfId.length() != 3 || !tailNumberOfId.matches("\\d{3}")) {
                System.out.println("Hãy nhập đúng 3 chữ số!");
            }
        } while (tailNumberOfId.length() != 3 || !tailNumberOfId.matches("\\d{3}"));

        String idDelete = formatCode + tailNumberOfId;

        System.out.println("Bạn có chắc chắn muốn xóa điện thoại có ID " + idDelete + "?");
        System.out.println("1. Yes");
        System.out.println("2. No");
        int confirmChoice = request.nextInt();
        request.nextLine(); // Đọc dòng còn lại

        if (confirmChoice == 1) {
            deletePhone(idDelete);
        } else {
            System.out.println("Hủy bỏ xóa.");
        }
    }

    //delete
    public static void deletePhone(String id){
        boolean isNew = id.startsWith("DTM") ? true : false;
        ArrayList<? extends MobilePhone> listPhone = isNew ? newPh : oldPh;

        // Xóa điện thoại
        boolean isExistPhone = false;
        for (MobilePhone phone : listPhone) {
            if (phone.getId().equals(id)) {
                isExistPhone = true;
                listPhone.remove(phone);
                System.out.println("Xóa thành công! (" + id + ")");
                break;
            }
        }

        if (!isExistPhone) {
            System.out.println("Không tìm thấy ID cần xóa");
        }

        displayPhoneList(listPhone , isNew ? "Mới" : "Cũ");

    }



    //Sắp xếp
    //menu
    public static void arrangePhoneMenu(){

        System.out.println("---------Sắp Xếp theo giá---------- ");

        System.out.println("1. Tăng gần  ");
        System.out.println(" 2. Giảm dần  ");
        System.out.println(" 3. Trở về menu chính ");
        System.out.println("Chọn : ");


        int choice = request.nextInt();
        do{
            if(choice < 1 || choice > 3){
                System.out.println("chỉ được chọn lựa chọn sẵn có!");
                choice = request.nextInt();
            }
        }while(choice < 1 || choice > 3);

        if(choice == 3 ){
            return;
        }

        switch (choice){
            case 1 :
                arrangePhoneByPrice(1);
                break;
            case 2 :
                arrangePhoneByPrice(2);
                break;
            case 3 :
                break;
        }
    }

    //sắp xếp
    public static void arrangePhoneByPrice(int option){
        int n = listAllPhone.size();
        listAllPhone.addAll(oldPh);
        listAllPhone.addAll(newPh);

        switch (option){
            case 1 :
                //tăng dần
                // Duyệt qua từng phần tử trong danh sách
                for (int i = 0; i < n - 1; i++) {
                    for (int j = i + 1; j < n; j++) {
                        double priceI = listAllPhone.get(i).getPrice();
                        double priceJ = listAllPhone.get(j).getPrice();

                        // So sánh giá của phần tử tại i và j
                        if (priceI > priceJ) {
                            // Hoán đổi nếu giá của phần tử tại i lớn hơn giá của phần tử tại j
                            MobilePhone temp = listAllPhone.get(i);
                            listAllPhone.set(i, listAllPhone.get(j));
                            listAllPhone.set(j, temp);
                        }
                    }
                }

                for (int i = 0; i < listAllPhone.size(); i++) {
                    listAllPhone.get(i).output();
                }
                break;
            case 2 :
                //giảm dần
                for (int i = 0; i < n - 1; i++) {
                    for (int j = i + 1; j < n; j++) {
                        double priceI = listAllPhone.get(i).getPrice();
                        double priceJ = listAllPhone.get(j).getPrice();

                        // So sánh giá của phần tử tại i và j
                        if (priceI < priceJ) {
                            // Hoán đổi nếu giá của phần tử tại i lớn hơn giá của phần tử tại j
                            MobilePhone temp = listAllPhone.get(i);
                            listAllPhone.set(i, listAllPhone.get(j));
                            listAllPhone.set(j, temp);
                        }
                    }
                }

                for (int i = 0; i < listAllPhone.size(); i++) {
                    listAllPhone.get(i).output();
                }
                break;
            case 3 :
                break;
        }
    }



    //tìm kiếm
    //menu
    public static void findMenu(){
        System.out.println("-------------Tìm Kiếm--------------------");
        System.out.println("1. Tìm kiếm tất cả điện thoại");
        System.out.println("2. Tìm kiếm điện thoại cũ");
        System.out.println(" 3. Tìm kiếm điện thoại mới");
        System.out.println(" 4. Trở về menu chính");
        System.out.println(" Chọn : ");

        int choice = request.nextInt();

        do{
            if(choice < 1 || choice > 4){

                System.out.println("chỉ lựa chọn đã sẵn có : ");
                 choice = request.nextInt();
            }
        }while (choice < 1 || choice > 4);


        switch (choice){
            case 1 :
                findByValueMenu(1);
                break;
            case 2 :
                findByValueMenu(2);
                break;
                case 3 :
                    findByValueMenu(3);
                break;
            case 4 :
                break;
            default:
                break;

        }

    }

    public static void findByValueMenu(int option){

        System.out.println("----------lựa chọn tìm kiếm theo giá-----------");
        System.out.println("    1. Tìm kiếm theo giá (Nhập khoảng từ bao nhiêu đến bao nhiêu) " );
        System.out.println(" 2. Tìm kiếm theo tên");
        System.out.println(" 3. Tìm kiếm theo hãng");
        System.out.println(" 4. Trở về menu Tìm kiếm");
        System.out.println("chon : ");
        int choice = request.nextInt();

        do{
            if(choice >4 || choice < 1){
                System.out.println("chỉ lựa chọn sẵn có : ");
                choice = request.nextInt();
            }
        }while (choice >4 || choice < 1);

        switch (choice){
            case 1 :
                findByPrice(option);
                break;
            case 2 :
                findByName(option);
                break;
            case 3 :
                findByCompany(option);
                break;
            case 4 : break;
        }
    }

    public static void findByPrice(int option){}

    public static void findByName(int option){}

    public static void findByCompany(int option){}



    public static void main(String[] args) {
       while (action == true){
           menuList();
       }
    }



}
