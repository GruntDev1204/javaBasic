package part3;

import java.util.Scanner;
import java.util.Random;

public class countStudent {
    private int hashCode;
    private String name;



    private float score;
    public static int studentCount = 0 ;
    Scanner  scanner = new Scanner(System.in);
    Random rand = new Random();

    public countStudent(){}



    public countStudent(String name, float score, int hashCode) {
        this.name = name;
        this.score = score;
        this.hashCode = hashCode;
        studentCount++;
    }
    public int getHashCode() {
        return hashCode;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        name = name;
    }

    public float getScore() {
        return score;
    }

    public void setScore(float score) {
        this.score = score;
    }

    public static  void Count(){
        studentCount++;
    }
    public static   int returnCount(){
        return studentCount;
    }

    public void AddStudent(){
        hashCode = rand.nextInt(1000);
        System.out.println("nhập tên sinh viên : ");
        name = scanner.nextLine();
        System.out.println("nhập điểm  sinh viên : ");
        score = scanner.nextFloat();
        Count();
    }

    public void Show(){
        System.out.println("id sinh viên : " + hashCode);
        System.out.println(" tên sinh viên : " + name);
        System.out.println(" điểm sinh viên : " + score);
        System.out.println("số lượng  sinh viên đã đăng kí : " + studentCount);
    }
}
