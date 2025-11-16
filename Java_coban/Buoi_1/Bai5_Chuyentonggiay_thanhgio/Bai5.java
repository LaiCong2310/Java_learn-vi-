package Bai5_Chuyentonggiay_thanhgio;

import java.util.Scanner;

public class Bai5 {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap tong so giay: ");
        int ts = sc.nextInt();

        int gio = ts /3600;
            ts = ts %3600;
        int m = ts /60;
        int s = ts %60;

        System.out.printf("\nSo gio la: %d",gio);
        System.out.printf("\nTong so phut la: %d",m);
        System.out.printf("\nSo giay con lai la: %d",s);
        System.out.printf("\n\nTong thoi gian chuyen sang gio la: %d gio %d phut %d giay",gio,m,s);

        System.out.printf("\n\nSo gio la: %02d",gio);
        System.out.printf("\nTong so phut la: %02d",m);
        System.out.printf("\nSo giay con lai la: %02d",s);
        System.out.printf("\n\nTong thoi gian chuyen sang gio la: %02d gio %02d phut %02d giay",gio,m,s);

        sc.close();

    }
}
