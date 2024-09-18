package part5;


import java.util.Scanner;

public class Main {
    static Scanner request = new Scanner(System.in);

    //Use in Linked and Array List
    static int addList[] = {10, 20, 30, 40, 50};
    static int additionalList[] = {60, 70, 80, 90, 100};

    //Use in Stack and Queue
    static int listTest[] = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
    static String listStringTest[] = {"Ngọc" , "Ly" , "Vui" , "Như" , "Trang" , "Châu" , "Nhi" , "Ngân"};


    public static void main(String[] args) {

        System.out.println("Choose one!");
        System.out.println("1. Test MyArrayList ");
        System.out.println("2. Test Linked ");
        System.out.println("3. Test Stack by LinkedList ");
        System.out.println("4. Test Stack by ArrayList ");
        System.out.println("5. Test Queue by LinkedList ");
        System.out.println("6. Test Queue by ArrayList ");



        int choose = request.nextInt();
        do {
            if (choose < 1 || choose > 6) {
                System.out.println("Menu not found!");
                choose = request.nextInt();
            }
        } while (choose < 1 || choose > 6);

        switch (choose) {
            case 1:
                returnArrayListProgram();
                break;
            case 2:
                returnLinkedListProgram();
                break;
            case 3:
                returnStackListByLinked();
                break;
            case 4:
                returnStackListByArrayList();
                break;
            case 5:
                returnQueueByLinked();
                break;
            case 6:
                returnQueueByArraylist();
                break;
            default:
                break;
        }

    }

    public static void returnArrayListProgram() {
        System.out.println("=============ARRAYLIST_ACTIVE===============");

        MyArrayList<Integer> myList = new MyArrayList<>();


        for (int i = 0; i < addList.length; i++) {
            myList.add(addList[i]);
        }


        // Hiển thị danh sách
        System.out.println("Danh sách sau khi thêm phần tử:");
        System.out.println(myList);

        // Thêm phần tử vào vị trí index
        myList.add(2, 25);
        System.out.println("Sau khi thêm phần tử vào vị trí index 2:");
        System.out.println(myList);

        // Lấy phần tử tại vị trí index 3
        System.out.println("Phần tử tại vị trí index 3: " + myList.getElement(3));

        // Lấy vị trí của phần tử 30
        System.out.println("Vị trí của phần tử 30: " + myList.indexOf(30));

        // Xóa phần tử tại vị trí index 4
        myList.removeIndex(4);
        System.out.println("Sau khi xóa phần tử tại vị trí index 4:");
        System.out.println(myList);

        // Xóa tất cả các phần tử có giá trị 25
        myList.removeElement(25);
        System.out.println("Sau khi xóa phần tử 25:");
        System.out.println(myList);

        // Thêm thêm vài phần tử để kiểm tra tăng kích thước mảng
        for (int i = 0; i < additionalList.length; i++) {
            myList.add(additionalList[i]);
        }
        System.out.println("Sau khi thêm nhiều phần tử:");
        System.out.println(myList);

        System.out.println("Vị trí cuối cùng của phần tử 50: " + myList.lastIndexOf(50));
        System.out.println("=============ARRAYLIST_END===============");
    }

    public static void returnLinkedListProgram() {
        System.out.println("=============LINKEDLIST_active===============");

        MyLinkedList<Integer> myLinkedList = new MyLinkedList();

        int listAddFirst[] = {10, 20, 30, 40, 50};

        for (int i = 0; i < listAddFirst.length; i++) {
            myLinkedList.addFirst(listAddFirst[i]);
        }


        // Hiển thị danh sách
        System.out.println(myLinkedList);

        // Thêm phần tử vào vị trí index
        myLinkedList.add(2, 25);
        System.out.println("Sau khi thêm phần tử 25 vào vị trí index 2: " + myLinkedList);

        // Lấy phần tử tại vị trí index 2
        System.out.println("Phần tử tại vị trí index 2: " + myLinkedList.get(2));

        // Thay thế phần tử tại vị trí index 2
        myLinkedList.set(2, 50);
        System.out.println("Sau khi thay thế phần tử tại vị trí index 2 bằng 50: " + myLinkedList);

        // Xóa phần tử đầu tiên
        myLinkedList.removeFirst();
        System.out.println("Sau khi xóa phần tử đầu tiên: " + myLinkedList);

        // Xóa phần tử cuối cùng
        myLinkedList.removeLast();
        System.out.println("Sau khi xóa phần tử cuối cùng: " + myLinkedList);

        // Xóa phần tử tại vị trí index 1
        myLinkedList.remove(1);
        System.out.println("Sau khi xóa phần tử tại vị trí index 1: " + myLinkedList);

        // Lấy phần tử đầu tiên
        System.out.println("Phần tử đầu tiên: " + myLinkedList.getFirst());

        // Lấy phần tử cuối cùng
        System.out.println("Phần tử cuối cùng: " + myLinkedList.getLast());

        // Lấy chỉ số của phần tử 50
        System.out.println("Chỉ số của phần tử 50: " + myLinkedList.indexOf(50));

        // Lấy chỉ số của phần tử cuối cùng của phần tử 30
        System.out.println("Chỉ số cuối cùng của phần tử 30: " + myLinkedList.lastIndexOf(30));


        System.out.println("=============LINKEDLIST_END===============");
    }


    public static void returnStackListByLinked() {
        int i;

        //true là First
        MyStack<Integer> mySTListFirst = new MyStack(true);

        System.out.println("Push : ");

        for (i = 0; i < listTest.length; i++) {
            mySTListFirst.push(listTest[i]);
            System.out.println(mySTListFirst);

        }


        //in ra màn hình sau khi push
        System.out.println("the final rs of Stack : " + mySTListFirst);

        System.out.println("size : " + mySTListFirst.size());
        System.out.println("Is empty ? " + mySTListFirst.isEmpty());


        //using Peek
        System.out.println("Using peek : " + mySTListFirst.peek());

        //using pop
        while (!mySTListFirst.isEmpty()) {
            mySTListFirst.pop();
            System.out.println("using pop in time " + i + ": " + mySTListFirst);
        }


        //check the capacity
        System.out.println("final size : " + mySTListFirst.size());
        System.out.println("final Is empty ? " + mySTListFirst.isEmpty());


        //false là addlast
        System.out.println("=====================================================================");
        MyStack<Integer> mySTListLast = new MyStack(false);

        System.out.println("Push : ");
        for (i = 0; i < listTest.length; i++) {
            mySTListLast.push(listTest[i]);
            System.out.println(mySTListLast);
        }


        //in ra màn hình sau khi push
        System.out.println("the final rs of Stack : " + mySTListLast);
        System.out.println("size : " + mySTListLast.size());
        System.out.println("Is empty ? " + mySTListLast.isEmpty());


        //using Peek

        System.out.println("Using peek : " + mySTListLast.peek());

        //using pop
        while (!mySTListLast.isEmpty()) {
            mySTListLast.pop();
            System.out.println("using pop: " + mySTListLast);
        }


        //check the capacity
        System.out.println("final size : " + mySTListLast.size());
        System.out.println("final Is empty ? " + mySTListLast.isEmpty());

    }

    public static void returnStackListByArrayList() {
        int i;
        MyStackByAL<Integer> myStByArr = new MyStackByAL<>();
        //Push
        for (i = 0; i < listTest.length; i++) {
            myStByArr.push(listTest[i]);
            System.out.println("push : " + myStByArr);
        }

        System.out.println("is Empty? : " + myStByArr.isEmpty() );
        System.out.println("the Size : " + myStByArr.size() );


        //using peek
        System.out.println("using peek : " + myStByArr.peek() );

        //using Pop
        while (!myStByArr.isEmpty()){
            myStByArr.pop();
            System.out.println("using pop : " + myStByArr );
        }


        System.out.println("final is Empty? : " + myStByArr.isEmpty() );
        System.out.println("final the Size : " + myStByArr.size() );


    }




    public static void returnQueueByLinked(){
            int i ;

          MyQueue<String> myQueueFirst = new MyQueue<>(true);

          for(i = 0 ; i < listStringTest.length; i ++){
              myQueueFirst.add(listStringTest[i]);
              System.out.println("method add : " + myQueueFirst);
          }

        System.out.println("size : " +  myQueueFirst.size());
        System.out.println("is Empty? : " +  myQueueFirst.isEmpty());

        System.out.println("peek : "+ myQueueFirst.peek());

        while(!myQueueFirst.isEmpty()){
            myQueueFirst.remove();
            System.out.println("Using remove : " + myQueueFirst);
        }

        System.out.println("final size : " +  myQueueFirst.size());
        System.out.println("final is Empty? : " +  myQueueFirst.isEmpty());


        System.out.println("=======================================================");

        MyQueue<String> myQueueLast = new MyQueue<>(false);

        for(i = 0 ; i < listStringTest.length; i ++){
            myQueueLast.add(listStringTest[i]);
            System.out.println("method add : " + myQueueLast);
        }

        System.out.println("size : " +  myQueueLast.size());
        System.out.println("is Empty? : " +  myQueueLast.isEmpty());

        System.out.println("peek : "+ myQueueLast.peek());

        while(!myQueueLast.isEmpty()){
            myQueueLast.remove();
            System.out.println("Using remove : " + myQueueLast);
        }


        System.out.println("final size : " +  myQueueLast.size());
        System.out.println("final is Empty? : " +  myQueueLast.isEmpty());
    }

    public static void returnQueueByArraylist(){
        MyQueueByAL<String> myQueueByAL =  new MyQueueByAL<>();
        int i;

        for(i = 0 ; i < listStringTest.length ; i++){
            myQueueByAL.add(listStringTest[i]);
            System.out.println("add methods : " + myQueueByAL);
        }

        System.out.println("size : " + myQueueByAL.size());
        System.out.println("is Empty? : " + myQueueByAL.isEmpty());

        System.out.println("peek : " + myQueueByAL.peek());


        while(!myQueueByAL.isEmpty()){
            myQueueByAL.remove();
            System.out.println("using remove" + myQueueByAL);
        }

        System.out.println("final size : " + myQueueByAL.size());
        System.out.println("final is Empty? : " + myQueueByAL.isEmpty());


    }


}
