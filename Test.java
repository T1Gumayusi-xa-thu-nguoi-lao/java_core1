package bai9;

import java.awt.*;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        int n,m;
        Scanner sc =new Scanner(System.in);
        System.out.print("nhập n=");
        n=sc.nextInt();
        System.out.print("nhập m=");
        m=sc.nextInt();
        Rectangle[] cn = new Rectangle[n];

        for (int i=0;i<n;i++)
        {
         cn[i]= new Rectangle("màu trắng");
         cn[i].nhap();
         cn[i].setColor();
         System.out.print(cn[i].toString());
         System.out.print(cn[i].getColor());
        }

        Triangle[] tg = new Triangle[m];

        for (int i=0;i<m;i++)
        {
            tg[i] = new Triangle("màu trắng");
            tg[i].nhap();
            tg[i].setColor();
            System.out.print(tg[i].toString());
            System.out.print(tg[i].getColor());
        }

    }
}
