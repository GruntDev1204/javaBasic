package exerciseOne;
import java.util.Scanner;
import java.lang.Math;

public class exercise1E {
  private static Scanner request =  new Scanner(System.in);
  private static double r , C, A ;
  private static final double pi = Math.PI;

  public static void Input(){
        System.out.println("nhập vào bán kính hình tròn : ");
        r = request.nextDouble();
        C = 2*pi*r;
        A = Math.pow(r , 2)* pi;
  }
  public static void OutPut(){
    System.out.println("KẾT QUẢ CHU VI  :  " + C );
    System.out.println("KẾT QUẢ DIỆN TÍCH   :  " + A );
  }
  public static void main(String[] args) {
    Input();
    OutPut();
  }


}
