package part2.Clas;
import java.util.Scanner;


public class student {
    private int id;
    String name ;
    int score;
    Scanner req = new Scanner(System.in);

   

    public student(int id, String name, int score) {
        this.id = id;
        this.name = name;
        this.score = score;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        do {
            if (name.isEmpty()) {
                System.out.println("Tên không được để trống. Vui lòng nhập lại.");
                name = req.nextLine().trim();
            }
        } while (name.isEmpty());

        this.name = name;
    }


    public int getScore() {
        return score;
    }
    public void setScore(int score) {
          do {
            if (score < 0 || score > 10) {
                score = req.nextInt(); // Loại bỏ khoảng trắng đầu và cuối
                System.out.println("diem chi duoc tu 1 den 10");
            }
        } while (score < 0 || score > 10);

        this.score = score;
    }

    public void outPut(){
        System.out.println("id hs la : "  + this.getId());
        
        System.out.println("ten hs la : "  + this.getName());

        System.out.println("diem cua hs la : "  + this.getScore());
    }

    

}
