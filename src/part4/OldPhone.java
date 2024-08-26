package part4;

import java.util.Scanner;

public class OldPhone extends MobilePhone {
    private float batteryRate;
    private String describe;



    public OldPhone(String id, double price, int guaranteeTime, String companyName, String name, float batteryRate, String describe) {
        super(id, price, guaranteeTime, companyName, name);
        this.batteryRate = batteryRate;
        this.describe = describe;
    }

    public OldPhone(){
        super();

    }

    @Override
    public void input(){
        Scanner request = new Scanner(System.in);

        super.input();

        System.out.println("nhập vào % PIN : ");
        this.setBatteryRate(request.nextFloat());
        request.nextLine();

        System.out.println("nhập vào mo ta : ");
        this.setDescribe(request.nextLine());
    }
    @Override
    public void output(){
        super.output();

        System.out.println(" %Pin : " + this.getBatteryRate());
        System.out.println("mo ta : " + this.getBatteryRate());
        System.out.println("--------------------------");


    }

    public float getBatteryRate() {
        return batteryRate;
    }

    public void setBatteryRate(float batteryRate) {
        this.batteryRate = batteryRate;
    }

    public String getDescribe() {
        return describe;
    }

    public void setDescribe(String describe) {
        this.describe = describe;
    }



}
