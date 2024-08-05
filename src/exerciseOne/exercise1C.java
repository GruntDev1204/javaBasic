package exerciseOne;

import java.util.Scanner;

public class exercise1C {

    private static double price;
    private static int quantity;
    private static String name;
    private static Scanner request = new Scanner(System.in);


    private static final double tax = 0.1;

    public static void main(String[] args) {
        Input();
        OutPut();
    }

    public static void Input(){
        System.out.println("cho bố mày xin cái tên : ");
        name = request.nextLine();

        System.out.println("cho bố mày xin cái giá : ");
       price = request.nextDouble();

       System.out.println("cho bố mày xin cái số lượng : ");
       quantity = request.nextInt();
    }
    public static void OutPut(){
        double sumPrice =  quantity*price;
        double VAT = sumPrice*tax;

        System.out.println("-----------");
        System.out.println("Tên sản phẩm : " + name);

        System.out.println("tổng số tiền : " + sumPrice);
        System.out.println("VAT : " + VAT);
    }
   



}
