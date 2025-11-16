package Bai6_Timso_chan._le;

import java.util.Scanner;

public class Bai6 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("======== Nhap mot so nguyen N de kiem tra so do la chan hay le ========");

        System.out.print("Nhap N: ");
        int n = sc.nextInt();

        if (n % 2 == 0) {
            System.out.printf("So %d la so CHAN", n);
        } else {
            System.out.printf("So %d la so LE", n);
        }
        sc.close();
    }
}
