package exerciseOne;
import java.util.Scanner;

public class exercise1D {

    private  static int quantity ;
    private static double point , coefficient , SumPoint = 0 , totalCoefficients = 0;
    public static String name;

    private static Scanner request = new Scanner(System.in);

    public static void Input(){
        System.out.println("nhập số môn bạn đã học : ");
        quantity = request.nextInt();
        request.nextLine();
        for ( int i = 1 ; i <= quantity ; i++){
           System.out.println("nhập tên môn thứ " + i + ": " );
           name = request.nextLine();
           System.out.println("nhập điểm môn thứ " + i + ": " );
           point = request.nextDouble();
           System.out.println("nhập hệ số môn thứ " + i + ": " );
           coefficient = request.nextDouble();
           request.nextLine();

           SumPoint += point*coefficient;
           totalCoefficients += coefficient;

        }
    }
    public static void OutPut(){
        System.out.println("điểm TB : " +  SumPoint/totalCoefficients);
    }

    public static void main(String[] args) {
        Input();
        OutPut();
    }
}
