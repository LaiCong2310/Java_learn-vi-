package Buoi_2.Bai2;

import java.util.Scanner;

public class Bai2 {
    public static void main (String [] args){
        Scanner sc = new Scanner(System.in);
        int N;
        while (true){
            try {
                System.out.print("Nhap so nguyen duong N: ");
                N = sc.nextInt();
                if (N > 0) 
                    break;

                } catch (Exception e) {
                    System.out.println("Loi nhap lieu!");
                    sc.nextLine();
            }//end catch
        }//end while
        //Cau a
        int Sa = 0;
        for (int i = 0; i <= N; i++){
            Sa += (2 * i + 1);
        }
        //Cau b
        int Sb = 0 ;
        for (int i = 1; i <= N; i++){
            Sb += 2 * i;
        }
        //Cau c
        double Sc = 0;
        for (int i = 1; i <= N; i++){
            Sc += ((2 * i - 1)*1.0)/(2*i);
        }
        //Cau d
        double Sd = 0;
        int tong = 0;
        for (int i = 1; i <= N; i++){
            tong += i;
            Sd += i*1.0/tong;
        }

        System.out.printf("Tong cau a: (1 + 3 + 5 + ... + (2*N+1) la: %d",Sa);
        System.out.printf("\nTong cau b: (2 + 4 + ...+2N) la: %d",Sb);
        System.out.printf("\nTong cau c: (1/2 + 3/4 + ... + (2N-1)/2n) la: %.2f%n",Sc);
        System.out.printf("Tong cau d: (1/1 + 2/1+2 + 3/1+2+3 +...+ n/1+...n) la: %.2f%n",Sd);
        
        sc.close();
    }//end main 
}//end class

