package Buoi_2.Bai4_Viet_ham;

import java.util.Scanner;

public class Bai4_Tinh_N_giaithua {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N;
        while (true) {
        try {
            System.out.print("Nhap N: ");
            N = sc.nextInt();
            if (N>0) {
                break;
            }
        } catch (Exception e) {
            System.out.println("Loi nhap lieu!");
            sc.nextLine();
        }    
        }//while

        System.out.printf("Cach lam 1: %d! = %d ",N,Giaithua(N));
        Giaithua01(N);
        System.out.printf("\nCach lam 3: %d! = %d",N, g_thua(N));

        sc.close();
    }//main

    public static long Giaithua(int N){     // Cach lam 1: can gia tri tra ve
        long gt = 1;
        for (int i = 2; i <= N; i++)
            gt *= i;

        return gt;
    }

    public static void Giaithua01(int N){   // Cac lam 2: khong can gia tri tra ve 
        long gt = 1;
        for (int i = 2; i <= N; i++)
            gt *= i;
        System.out.printf("\nCach lam 2: %d! = %d",N,gt);
    }

    public static long g_thua(int N){ // Cach lam 3: Tinh giai thua bang DE QUY
        if (N < 2)
            return 1;
        return N * g_thua(N-1);
    }
}//class
