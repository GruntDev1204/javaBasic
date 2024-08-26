package part2.Clas;

public class time {
     int hour , minute ,second;
     
    public time(){
        hour = 0;
        minute = 0;
        second = 0;
    }
    public time(int h  ){
        hour = h;
        minute = 0;
        second = 0;
    }
    public time(int h , int m ){
        hour = h;
        minute = m;
        second = 0;
    }
    public time(int h , int m , int s ){
        hour = h;
        minute = m;
        second = s;
    }
    public void outPut(){
        String res = String.format("%02d:%02d:%02d", hour, minute, second);
        System.out.println("time is : " + res);
    }
}
