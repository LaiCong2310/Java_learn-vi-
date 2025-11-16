package Buoi_3.Bai3_Nhapvakiemtra_2SonguyenDuong;

import java.util.Scanner;

public class Bai3 {
    public static void main(String[] args) {
        int A, B;
        A = nhapso();
        B = nhapso();
        System.out.println("Cau a: Uong so chung lo nhat");
        System.out.printf("Uoc so chung lon nhat cua %d va %d la: %d\n\n",A,B,uoc_so_chung_LN(A, B));

        System.out.println("Boi uoc chung lon nhat");
        System.out.printf("Boi so chung nho nhat cua %d va %d la: %d",A,B,boi_uoc_chung_NN(A, B));
    }
    public static int nhapso(){
        Scanner sc = new Scanner(System.in);
        int so;
        while (true) {
            try {
                System.out.print("Nhap so: ");
                so = sc.nextInt();
                if (so > 0) 
                    break;
                 else 
                    System.out.println("Vui long nhap so nguyen duong!");
                
            } catch (Exception e) {
                System.out.println("Loi nhap lieu");
                sc.nextLine();
            }
        }
        return so;
        
    }

    public static int uoc_so_chung_LN(int A, int B){  //Cau a: Tìm ước số chung lớn nhất
        while (B != 0) {
            int temp = B;
            B = A % B;
            A = temp;
        }
        return A;
    }

    public static int boi_uoc_chung_NN(int A, int B){ //Cau b: Tìm bội số chung nhỏ nhất
        int max = A > B? A:B;
        int boi_uoc_chung_NN = max;
        while (boi_uoc_chung_NN % A != 0 || boi_uoc_chung_NN % B != 0) {
            boi_uoc_chung_NN += max;
        }
        return boi_uoc_chung_NN;
    }
}
