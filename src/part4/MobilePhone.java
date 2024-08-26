package part4;

import java.util.Scanner;

public class MobilePhone {

    private String id;
    private  String name;
    private double price;
    private String companyName;
    private int guaranteeTime;



    public MobilePhone(String id, double price, int guaranteeTime, String companyName, String name) {
        this.id = id;
        this.price = price;
        this.guaranteeTime = guaranteeTime;
        this.companyName = companyName;
        this.name = name;
    }

    public MobilePhone() {
    }

    public void input(){
        Scanner request = new Scanner(System.in);

        System.out.println("nhập vào tên điện thoại : ");
        this.setName(request.nextLine());

        System.out.println("nhập vào giá cả : ");
        this.setPrice(request.nextDouble());
        request.nextLine();

        System.out.println("nhập vào hãng : ");
        this.setCompanyName(request.nextLine());

        System.out.println("nhập vào thời gian bảo hành ( tính theo tháng) : ");
        this.setGuaranteeTime(request.nextInt());
    }

    public void output(){
        System.out.println("Id :" + this.getId());
        System.out.println("tên điện thoại :" + this.getName());
        System.out.println("giá điện thoại :" + this.getPrice());
        System.out.println("hãng điện thoại :" + this.getCompanyName());
        System.out.println("thời gian bảo hành điện thoại (theo tháng) :" + this.getGuaranteeTime());
    }


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getGuaranteeTime() {
        return guaranteeTime;
    }

    public void setGuaranteeTime(int guaranteeTime) {
        this.guaranteeTime = guaranteeTime;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
