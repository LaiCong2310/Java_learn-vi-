package Bai8_Giai_PT_bac2;

import java.util.Scanner;

public class Bai8 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Giai phuong trinh bac 2: ax^2 + bx + c = 0");

        System.out.print("\nNhap a: ");
        double a = sc.nextDouble();
        System.out.print("\nNhap b: ");
        double b = sc.nextDouble();
        System.out.print("\nNhap c: ");
        double c = sc.nextDouble();

         System.out.printf("Phuong trinh bac 2 vua nhap la: %fx^2 + %fx + %f = 0",a,b,c);
        if (a == 0) {
            if (b == 0) {
                if (c == 0) {
                    System.out.println("\nPhuong trinh vo so nghiem.");
                } else {
                    System.out.println("\nPhuong trinh vo nghiem.");
                }

            } else {
                double x = -c / b;
                System.out.printf("\nDay la phuong trinh bac nhat, nghiem x = %.2f%n", x);
            }
        } else {// Tính Delta
            double delta = b * b - 4 * a * c;

            if (delta < 0) {
                System.out.println("\nPhuong trinh vo nghiem.");

            } else if (delta == 0) {
                double x = -b / (2 * a);
                System.out.printf("\nPhuong trinh co nghiem kep x1 = %.2f%n", x);

            } else { // delta > 0
                double x1 = (-b + Math.sqrt(delta)) / (2 * a);
                double x2 = (-b - Math.sqrt(delta)) / (2 * a);
                System.out.println("\nPhuong trinh co hai nghiem phan biet:");
                System.out.printf("x1 = %.2f%n", x1);
                System.out.printf("x2 = %.2f%n", x2);

                sc.close();
            }
        }
    }
}
