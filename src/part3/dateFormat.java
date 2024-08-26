package  part3;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class dateFormat {

    // Chuyển đổi chuỗi với định dạng dd/MM/yyyy sang LocalDate
    public static LocalDate fromStringToDate_ddMMyyyy(String dateString) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        return LocalDate.parse(dateString, formatter);
    }

    // Chuyển đổi chuỗi với định dạng yyyy/MM/dd sang LocalDate
    public static LocalDate fromStringToDate_yyyyMMdd(String dateString) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy/MM/dd");
        return LocalDate.parse(dateString, formatter);
    }

    // Chuyển đổi LocalDate sang chuỗi với định dạng dd/MM/yyyy
    public static String fromDateToString_ddMMyyyy(LocalDate date) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        return date.format(formatter);
    }

    // Chuyển đổi LocalDate sang chuỗi với định dạng yyyy/MM/dd
    public static String fromDateToString_yyyyMMdd(LocalDate date) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy/MM/dd");
        return date.format(formatter);
    }
}