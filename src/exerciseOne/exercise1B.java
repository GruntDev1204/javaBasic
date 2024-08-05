package exerciseOne;

import java.util.Scanner;

public class exercise1B {
    private static int a, b , choice , result;
    private static Scanner request = new Scanner(System.in);
  
    public static void main(String[] args) {

       
        input();
        OutPut();

    }
    public static void input() {
        System.out.println("nhập vào số đầu tiên : ");
        a = request.nextInt();
        System.out.println("nhập vào số thứ 2 : ");
        b = request.nextInt();
    }

    public static void OutPut(){
        System.out.println("Chọn phép toán: ");
        System.out.println("1. Cộng");
        System.out.println("2. Trừ");
        System.out.println("3. Nhân");
        System.out.println("4. Chia");

        choice = request.nextInt();

        switch (choice) {
            case 1:
                result = Sum2Numbers(a, b);
                System.out.println("Kết quả: " + result);
                break;

            case 2:
                result = Subtraction2Numbers(a, b);
                System.out.println("Kết quả: " + result);
                break;
            case 3:
                result = multiplication2Numbers(a, b);
                System.out.println("Kết quả: " + result);
                break;
            case 4:
                result = division2Numbers(a, b);
                System.out.println("Kết quả: " + result);
                break;

        }
    }

    public static int Sum2Numbers(int numb1, int numb2) {
        return numb1 + numb2;
    }

    public static int Subtraction2Numbers(int numb1, int numb2) {
        if (numb1 > numb2) {
            return numb1 - numb2;
        } else {
            return numb2 - numb1;
        }
    }

    public static int multiplication2Numbers(int numb1, int numb2) {
        return numb1 * numb2;
    }

    public static int division2Numbers(int numb1, int numb2) {
        if (numb1 > numb2) {
            return numb1 / numb2;
        } else {
            return numb2 / numb1;
        }
    }
}
