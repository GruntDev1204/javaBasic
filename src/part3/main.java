package part3;
import java.time.LocalDate;

public class main {
    public static void main(String[] args) {
        countStudent s1 = new countStudent("hồ trung" , 7 , 555);
        countStudent s2 = new countStudent("hồ trung" , 7 , 555);
        countStudent s3 = new countStudent("hồ trung" , 7 , 555);
        countStudent s4 = new countStudent("hồ trung" , 7 , 555);

        System.out.println(countStudent.returnCount());

        System.out.println( mathMethods.Cong(10,5));
        System.out.println( mathMethods.Tru(33,14));
        System.out.println( mathMethods.nhan(10,5));
        System.out.println( mathMethods.chia(20,5));



        String dateStr1 = "20/08/2024";
        LocalDate date1 = dateFormat.fromStringToDate_ddMMyyyy(dateStr1);
        System.out.println("Chuyển đổi từ chuỗi dd/MM/yyyy sang LocalDate: " + date1);

        // Test chuyển đổi chuỗi với định dạng yyyy/MM/dd sang LocalDate
        String dateStr2 = "2024/08/20";
        LocalDate date2 = dateFormat.fromStringToDate_ddMMyyyy(dateStr2);
        System.out.println("Chuyển đổi từ chuỗi yyyy/MM/dd sang LocalDate: " + date2);

        // Test chuyển đổi LocalDate sang chuỗi với định dạng dd/MM/yyyy
        String formattedDate1 = dateFormat.fromDateToString_yyyyMMdd(date1);
        System.out.println("Chuyển đổi từ LocalDate sang chuỗi dd/MM/yyyy: " + formattedDate1);

        // Test chuyển đổi LocalDate sang chuỗi với định dạng yyyy/MM/dd
        String formattedDate2 = dateFormat.fromDateToString_ddMMyyyy (date2) ;
        System.out.println("Chuyển đổi từ LocalDate sang chuỗi yyyy/MM/dd: " + formattedDate2);


    }
}
