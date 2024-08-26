package part1.exerciseoneclass;

import java.util.Scanner;

public class Student
{
    public String name;
    public  double mathScore , literatureScore ,averageScore ;
    public Scanner req = new Scanner(System.in);


    public  void Input(){
        System.out.println("nhap vao ten cua hoc sinh : ");
        name = req.nextLine();
        System.out.println("nhap vao diem toan : ");
        mathScore = req.nextDouble();
        System.out.println("nhap vao diem van : ");
        literatureScore = req.nextDouble();
    }
    public double calculateAverageScore(){
        averageScore = (literatureScore+ mathScore)/2;
        return averageScore;
    }
    public void output(){
        System.out.println("----------------------");
        System.out.println("ten hoc sinh : " + name);
        System.out.println("diem toan : " + mathScore);
        System.out.println("diem van : " + literatureScore);
        System.out.println("diem tb : " + averageScore);

    }

}
