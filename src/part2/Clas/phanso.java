package part2.Clas;

public class phanso {
     int tuSo ,mauSo;

    public phanso(){
        tuSo = 0;
        mauSo = 1;
    }
    public phanso(int tuSo){
        this.tuSo = tuSo;
        mauSo = 1;
    }
    public phanso(int tuSo , int mauSo){
        this.tuSo = tuSo;
        this.mauSo = mauSo ;
    }

    public void outPut(){
        double value = tuSo/mauSo;
        System.out.printf("phan so : %d/%d = %f " , tuSo, mauSo , value);
    }


}
