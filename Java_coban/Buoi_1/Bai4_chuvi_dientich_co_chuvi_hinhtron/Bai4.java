package Bai4_chuvi_dientich_co_chuvi_hinhtron;

import java.util.Scanner;
// import java.math.*;

public class Bai4 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Tinh chu vi, dien tich hinh tron co binh phuong");

        // System.out.print("Nhap Chieu Dai: ");
        // double CD = sc.nextDouble();
        // System.out.print("Nhap Chieu Rong: ");
        // double CR = sc.nextDouble();
        System.out.print("Nhap ban kinh: ");
        double ban_kinh = sc.nextDouble();

        double chuvi = 2*Math.PI*ban_kinh;
        double dientich = Math.pow(ban_kinh,2);

        System.out.printf("\nChu vi hinh tron(khong lam tron) la: %f",chuvi);
        System.out.printf("\nDien tich hinh tron(khong lam tron) la: %f",dientich);

        System.out.printf("\n\nChu vi hinh tron(lam tron) la: %.2f%n",chuvi);
        System.out.printf("Dien tich hinh tron(lam tron) la: %.2f%n",dientich);

        // System.out.printf("\n\nChu vi hinh tron la: %.2f",chuvi);
        // System.out.printf("\nDien tich hinh tron la: %.2f",dientich);
        sc.close();
    }
}
