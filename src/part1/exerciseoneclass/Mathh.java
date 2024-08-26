package part1.exerciseoneclass;
import java.util.Scanner;


public class Mathh{
    private int tuso , mauso;
    Scanner req = new Scanner(System.in);

    public void Input(){
        System.out.println("nhap tu so : ");
        tuso = req.nextInt();

        System.out.println("nhap mau so  : ");
        mauso = req.nextInt();

        do{
            if(mauso == 0){
                System.out.println("nhap lai mau so (khac 0)  : ");
                mauso = req.nextInt();
            }
        }while(mauso == 0);

    }

    public int UCLN(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public void output(){
        int uc = UCLN(tuso, mauso);
        mauso = mauso/uc;
        tuso = tuso/uc;
        if (mauso < 0) {
            tuso = -tuso;
            mauso = -mauso;
        }

        if (mauso == 1) {
            System.out.printf("Phân số là: %d\n", tuso);
        } else {
            System.out.printf("Phân số là: %d/%d\n", tuso, mauso);
        }
    }

}
