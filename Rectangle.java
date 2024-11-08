package bai9;

import java.util.Scanner;

public class Rectangle extends Shape {
    private int length;
    private int width;

    public Rectangle(String color) {
        super(color);
    }

    public Rectangle(int length, int width, String color) {
        super(color);
        this.length = length;
        this.width = width;
    }
    public void nhap(){
        Scanner sc=new Scanner(System.in);
        System.out.print("nhập chiều dài:");
        length =sc.nextInt();
        System.out.print("nhập chiều rộng:");
        width=sc.nextInt();
    }

    public String getColor() {
        return "màu của hình chữ nhật là:"+color+"\n";
    }

    public void setColor() {
        Scanner sc=new Scanner(System.in);
        System.out.print("nhập màu:");
        this.color =sc.nextLine();
        System.out.print("\n");
    }

    @Override
    public double getArea() {
        double area=length*width;
        return area;
    }

    @Override
    public String toString() {
        return "chiều dài , rộng của hình chữ nhật là:"+length+","+ width + "\n" +
                "diện tích hình chữ nhật là:"+getArea()+"\n";
    }
}
