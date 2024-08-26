package part4;

import java.util.Scanner;

public class NewPhone extends MobilePhone {
    private int quantity;

    public NewPhone(String id, double price, int guaranteeTime, String companyName, String name, int quantity) {
        super(id, price, guaranteeTime, companyName, name);
        this.quantity = quantity;
    }

    public NewPhone(){
        super();
        this.quantity = 0;
    }


    @Override
    public void input(){
        Scanner request = new Scanner(System.in);

        super.input();
        System.out.println("nhập vào số lượng : ");
        this.setQuantity(request.nextInt());
    }
    @Override
    public void output(){

        super.output();
        System.out.println(" số lượng : " + this.getQuantity());
        System.out.println("--------------------------");

    }


    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
