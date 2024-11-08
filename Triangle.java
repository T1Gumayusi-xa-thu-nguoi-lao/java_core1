package bai9;

import java.util.Scanner;

 public class Triangle extends Shape{
    private int base;
    private int height;

     public Triangle(String color) {
         super(color);
     }

     public Triangle( int base, int height,String color) {
         super(color);
         this.base = base;
         this.height = height;
     }

     public void nhap(){
        Scanner sc=new Scanner(System.in);
        System.out.print("nhập đáy:");
        base =sc.nextInt();
        System.out.print("nhập chiều cao:");
        height =sc.nextInt();
    }

     public String getColor() {
         return "màu của hình tam giác là:"+color+"\n";
     }

     public void setColor() {
         Scanner sc=new Scanner(System.in);
         System.out.print("nhập màu:");
         this.color =sc.nextLine();
         System.out.print("\n");
     }

     @Override
    public double getArea() {
        double area=0.5*base*height;
        return area;
    }

    @Override
    public String toString() {
        return "đáy,chiều cao của hình tam giác là:"+base+","+ height+ "\n" +
                "diện tích hình tam giác là:"+getArea()+"\n";
    }
}
