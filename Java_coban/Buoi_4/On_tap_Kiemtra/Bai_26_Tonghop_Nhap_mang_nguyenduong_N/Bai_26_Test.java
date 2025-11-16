package Buoi_4.On_tap_Kiemtra.Bai_26_Tonghop_Nhap_mang_nguyenduong_N;

import java.util.Scanner;

// 26.	Tổng hợp. Viết  chương trình nhập mảng số nguyên dương N phần tử.
// a) Kiểm tra giá trị số phần tử phải dương
// b) Bắt lỗi chương trình nếu có xảy ra lỗi.
// c) Nhập mảng.
// d) Viết hàm cho các nội dung sau:
//      d1- Xuất mảng,
//      d2- Đếm số phần tử chẵn, lẻ trong mảng
//      d3- Xuất các số nguyên tố trong mảng, đếm số nguyên tố.
//      d4- Nhập giá trị K, cho biết có bao nhiêu giá trị giống K trong mảng.
//      d5- Xuất ra cặp giá trị trong mảng có tổng bằng K
//      d6-Xuất ra cặp giá trị trong mảng có tổng gần bằng K
//      d7-Cho biết số nào trong mảng có nhiều ước số nhất

public class Bai_26_Test {
    public static void main(String[] args) {
        int N = nhapN();
        int [] a = nhapMang(N);
        xuatMang(a);
        demChanLe(a);
        kiemtra_songuyento(N);
        dem_xuat_SNT(a);
        int K = NhapK();
        demK(a, K);
    }
    public static int nhapN() {
        Scanner sc = new Scanner(System.in);
        int N;
        while (true) {
            try {
                System.out.print("Nhap phan tu cua mang: ");
                N = sc.nextInt();

                if (N>0)
                    break;
                
                else 
                    System.out.println("Vui long nhap lai so nguyen duong.");
            } catch (Exception e) {
                System.out.println("Loi nhap lieu");
                sc.nextLine();
            }
        }
        // sc.close();
        return N;
    }

    public static int [] nhapMang(int N){
        Scanner sc = new Scanner(System.in);

        int a[] = new int [N];
        for(int i = 0; i< N;i++){
            while (true) {
                try {
                    System.out.print(" Nhap mang: ");
                    a[i] = sc.nextInt();
                    break;

                } catch (Exception e) {
                    System.out.println("Vui long nhap lai");
                    sc.nextLine();
                }
            }
        }
        return a;
    }

    public static void xuatMang (int [] a){
        System.out.println("\n--- Xuat Mang ---\n");
        System.out.print("Cac phan tu cua mang la: ");
        for(int i = 0;i <a.length;i++){
            System.out.printf("%d ",a[i]);
        }
    }

    public static void demChanLe(int [] a){
        int demChan = 0; int demLe = 0;
        for (int i = 0; i < a.length; i++){
            if (a[i] % 2 == 0) {
                demChan++;
            }
            else
                demLe++;
        }
        System.out.printf("\nCo %d so chan va %d so le trong mang",demChan,demLe);
    }

    public static boolean kiemtra_songuyento(int so){
        if (so <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(so); i ++){
            if (so % i == 0) {
                return false;
            }
        }
        return true;
    }
    public static void dem_xuat_SNT (int[] a){
        int dem_xuat_SNT = 0;
        boolean flag = false;
        String chuoiso = " ";
        for (int i = 0; i < a.length; i++){
            if (kiemtra_songuyento(a[i])) {
                flag = true;
                dem_xuat_SNT++;
                chuoiso += a[i] + " ";
            }
        }
        if (flag) {
            System.out.printf("\nCo %d so nguyen to trong mang",dem_xuat_SNT);
            System.out.printf("\nCac so nguyen to la: %s",chuoiso);
        }
        else 
            System.out.println("Khong co so nguyen to trong mang");
    }

    public static int NhapK(){
        Scanner sc = new Scanner(System.in);
        int K;
        while (true) {
            try {
                System.out.print("\n\nNhap so phan tu K: ");
                K = sc.nextInt();
                break;
            } catch (Exception e) {
                System.out.println("Loi nhap lieu");
                sc.nextLine();
            }
        }
        sc.close();
        return K;
    }

    public static void demK(int []a, int K){
        int dem = 0;
        for(int i = 0; i < a.length; i++){
            if (a[i] == K) {
                dem++;
            }
        }
        
        if (dem > 0) {
            System.out.printf("Co %d gia tri = %d trong mang",dem,K);
        }
        else {
            System.out.printf("Khong co gia tri %d trong mang.",K);
        }
    }
}//end
