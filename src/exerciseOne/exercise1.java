package exerciseOne;

import java.util.Scanner;

public class exercise1 {
    private static Scanner request = new Scanner(System.in);
    public static void main(String[] args) {
        int yourYear = input();
        int yourAge = findYourAge(yourYear);
        System.out.println("--------------------------------------");
        System.out.println("tuổi của mày là : " + yourAge );

    }
    public static int findYourAge(int Year){
        int age =  2024 - Year;
        return age;
    }
    public static int input() {
        System.out.println("cho tao xin cái tuổi: ");
        int Year = request.nextInt();

        while (Year < 0 || Year > 2024) {
            System.out.println("cho tao xin lại cái tuổi: ");
            Year = request.nextInt();
        }

        return Year;
    }
}
