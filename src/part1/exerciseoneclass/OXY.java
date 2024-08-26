package part1.exerciseoneclass;
import java.util.Scanner;
//import java.lang.Math;

public class OXY {
    int x1,x2,y1,y2;
    double distance;
    private Scanner req = new Scanner(System.in);


    public void Input(){
        System.out.println("nhap toa do cho diem A ( truc 2 chieu ) : ");

        System.out.println("X : ");
        x1 = req.nextInt();
        System.out.println("Y : ");
        y1 = req.nextInt();


        System.out.println("nhap toa do cho diem B ( truc 2 chieu ) : ");
        
        System.out.println("X : ");
        x2 = req.nextInt();
        System.out.println("Y : ");
        y2 = req.nextInt();

    }
    public void outPut(){
        distance = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        System.out.println("Khoảng cách giữa điểm A và B là: " + distance);
    }

    public static int check = 0;


}
