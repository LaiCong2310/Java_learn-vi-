package Bai3_Chuvi_dientich_hinhchunhat;

import java.util.Scanner;

public class Bai3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Chuong trinh tinh hinh chu nhat");
        System.out.print("Nhap chieu dai: ");
        int CD = sc.nextInt();
        System.out.print("Nhap chieu rong: ");
        int CR = sc.nextInt();
        
        int chuvi = (CD + CR)*2;
        int dientich = CD * CR;
        System.out.printf("\nChu vi: (%d + %d)*2 = %d",CD,CR,chuvi);
        System.out.printf("\nDien tich: %d * %d = %d",CD,CR,dientich);

        // System.out.printf("Chu vi: %d",chuvi);
        // System.out.printf("\nDien tich: %d",dientich);
        sc.close();

    }
}
