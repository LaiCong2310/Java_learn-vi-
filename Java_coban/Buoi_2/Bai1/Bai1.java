package Buoi_2.Bai1;

import java.util.Scanner;

public class Bai1 {
    public static void main (String [] args){
        Scanner sc = new Scanner(System.in);
        int N, tong = 0, tongsole = 0, tongsochan = 0, sole = 0, sochan = 0;
        while (true) {
            try {
                System.out.print("Nhap so nguyen duong: ");
                    N = sc.nextInt();
                    if (N == 0)
                        break;
                    tong += N;
                    if (N%2 == 0 ) {
                        sochan++;
                        tongsochan += N;
                    }
                    else{
                        sole++;
                        tongsole += N;
                    }
            } catch (Exception e) {
                System.out.println("Loi nhap so lieu!");
                sc.nextLine();
            }
        }
        System.out.println("\n=================================================================================");
        System.out.println("\nTong cac so vua nhap: "+ tong);
        System.out.println("\tTrong do co:");

        System.out.println("\t\tTong cac so chan co: "+ tongsochan);
        System.out.println("\t\tTong cac so le co: "+ tongsole);

        System.out.println("\tVa");
        System.out.printf("\t\tBan da nhap %d so le", sole);
        System.out.printf("\n\t\tBan da nhap %d so chan", sochan);

        sc.close();
    }
}
