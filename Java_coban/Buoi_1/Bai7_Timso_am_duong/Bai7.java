package Bai7_Timso_am_duong;

import java.util.Scanner;

public class Bai7 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so nguyen N: ");
        int N = sc.nextInt();

        if (N > 0){
            System.out.printf("\nSo %d la so nguyen duong",N);
        } else { // N <= 0
            if (N < 0) {
                System.out.printf("\nSo %d la so nguyen am",N);
            } else {
                System.out.printf("\nSo %d = 0",N);
            }
        }
        sc.close();
    }
}
