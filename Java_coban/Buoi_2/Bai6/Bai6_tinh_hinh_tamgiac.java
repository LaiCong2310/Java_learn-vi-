package Buoi_2.Bai6;

import java.util.Scanner;

public class Bai6_tinh_hinh_tamgiac {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a,b,c;
        while (true) { // Nhap a
        try {
            System.out.print("Nhap a: ");
            a = sc.nextInt();
            if (a > 0) {
                break;
            }
        } catch (Exception e) {
            System.out.println("Loi nhap lieu!");
            sc.nextLine();
        }    
        }//while

        while (true) { // Nhap b
            try {
                System.out.print("Nhap b: ");
                b = sc.nextInt();
                if (b > 0) {
                    break;
                }
            } catch (Exception e) {
                System.out.println("Loi nhap lieu!");
                sc.nextLine();
            }    
            }//while

        while (true) { // Nhap c
        try {
            System.out.print("Nhap c: ");
            c = sc.nextInt();
            if (c > 0) {
                break;
            }
        } catch (Exception e) {
            System.out.println("Loi nhap lieu!");
            sc.nextLine();
        }    
        }//while

        if (!kiem_tra(a, b, c)) {
            System.out.println("Ba canh nay khong tao thanh mot tam giac hop le!");
        } else {
        System.out.print("Chu vi hinh tam giac la: "+Chu_vi(a, b, c));
        System.out.print("\nDien tich hinh tam giac la: "+Dien_tich(a, b, c));
        }

        sc.close();
    }
    public static boolean kiem_tra(int a, int b, int c){    //Kiem tra xem no co hinh thanh tam giac hay vi 2 canh lon hon canh con lai
        if ((a + b > c) && (a + c > b) && (b + c > a))
            return true;
        return false;
    }

    public static int Chu_vi(int a, int b, int c){  //Tinh chu vi tam giac
        return a + b + c;
    }

    public static double Dien_tich(double a, double b, double c){   //Tinh dien tich hinh tam giac
        double Chu_vi = (a + b + c) /2;
        return Math.sqrt(Chu_vi*(Chu_vi - a) * (Chu_vi - b) * (Chu_vi - c));
    }
}
