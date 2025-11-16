package Buoi_4.On_tap_Kiemtra.Bai_26_Tonghop_Nhap_mang_nguyenduong_N;

import java.util.Scanner;
import java.util.Arrays;


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



public class Bai_26 {
    // Scanner duoc khai bao toan cuc de tranh loi dong/mo nhieu lan
    private static final Scanner sc = new Scanner(System.in); 

    public static void main(String[] args) {
        
        System.out.println("--- CHUONG TRINH XU LY MANG SO NGUYEN ---");
        
        int N = kiemTraSoPhanTu();
        int[] arr = nhapMang(N);

        System.out.println("\n----------------- KET QUA -----------------");

        // d1- Xuat mang
        xuatMang(arr);

        // d2- Dem so phan tu chan, le
        demChanLe(arr);

        // d3- Xuat va dem so nguyen to
        demVaXuatSoNguyenTo(arr);

        // Nhan gia tri K tu nguoi dung (Goi lai ham nhap so de dam bao K la so nguyen duong)
        System.out.println("\n--- Yeu cau d4, d5, d6 (Nhap K) ---");
        int K = kiemTraSoNguyenDuong("Nhap gia tri K (so nguyen duong): ");

        // d4- Dem so luong gia tri giong K
        demGiaTriGiongK(arr, K);

        // d5- Xuat cap gia tri co tong bang K
        xuatCapTongBangK(arr, K);

        // d6- Xuat cap gia tri co tong gan bang K
        xuatCapTongGanBangK(arr, K);
        
        // d7- Tim so co nhieu uoc so nhat
        timSoNhieuUocSoNhat(arr);

        sc.close(); // Dong Scanner khi ket thuc chuong trinh
    }

    // A/B - Kiem tra so phan tu phai duong va bat loi nhap lieu
    public static int kiemTraSoPhanTu() {
        int N = 0;
        while (true) {
            try {
                System.out.print("Nhap so luong phan tu N (> 0): ");
                N = sc.nextInt();
                if (N > 0) {
                    break;
                } else {
                    System.out.println("So phan tu phai la so nguyen duong!");
                }
            } catch (Exception e) {
                System.out.println("Loi nhap lieu! Vui long nhap so nguyen.");
                sc.nextLine(); // Xoa bo dem
            }
        }
        return N;
    }

    // C - Kiem tra mot so la so nguyen duong (dung cho nhap K)
    public static int kiemTraSoNguyenDuong(String thongBao) {
        int so = 0;
        while (true) {
            try {
                System.out.print(thongBao);
                so = sc.nextInt();
                if (so > 0) {
                    break;
                } else {
                    System.out.println("Gia tri phai la so nguyen duong!");
                }
            } catch (Exception e) {
                System.out.println("Loi nhap lieu! Vui long nhap so nguyen duong.");
                sc.nextLine(); // Xoa bo dem
            }
        }
        return so;
    }

    // C - Nhap mang so nguyen duong
    public static int[] nhapMang(int N) {
        int[] arr = new int[N];
        System.out.println("Nhap cac phan tu cua mang (so nguyen duong):");
        for (int i = 0; i < N; i++) {
            arr[i] = kiemTraSoNguyenDuong("Nhap phan tu [" + i + "]: ");
        }
        return arr;
    }

    // d1- Xuat mang
    public static void xuatMang(int[] arr) {
        System.out.print("d1- Mang vua nhap: ");
        System.out.println(Arrays.toString(arr));
    }

    // d2- Dem so phan tu chan, le
    public static void demChanLe(int[] arr) {
        int demChan = 0;
        int demLe = 0;
        for (int x : arr) {
            if (x % 2 == 0) {
                demChan++;
            } else {
                demLe++;
            }
        }
        System.out.printf("d2- So phan tu chan: %d, So phan tu le: %d\n", demChan, demLe);
    }

    // Ham kiem tra so nguyen to
    public static boolean laSoNguyenTo(int n) {
        if (n <= 1) return false;
        if (n <= 3) return true;
        if (n % 2 == 0 || n % 3 == 0) return false;
        for (int i = 5; i * i <= n; i = i + 6) {
            if (n % i == 0 || n % (i + 2) == 0) return false;
        }
        return true;
    }

    // d3- Xuat va dem so nguyen to
    public static void demVaXuatSoNguyenTo(int[] arr) {
        int dem = 0;
        System.out.print("d3- Cac so nguyen to trong mang: ");
        for (int x : arr) {
            if (laSoNguyenTo(x)) {
                System.out.print(x + " ");
                dem++;
            }
        }
        if (dem == 0) {
            System.out.print("Khong co.");
        }
        System.out.printf("\n    Tong so nguyen to: %d\n", dem);
    }

    // d4- Nhap gia tri K, dem so luong gia tri giong K
    public static void demGiaTriGiongK(int[] arr, int K) {
        int dem = 0;
        for (int x : arr) {
            if (x == K) {
                dem++;
            }
        }
        System.out.printf("d4- So luong gia tri giong K = %d trong mang: %d\n", K, dem);
    }

    // d5- Xuat cap gia tri trong mang co tong bang K
    public static void xuatCapTongBangK(int[] arr, int K) {
        System.out.printf("d5- Cac cap gia tri co tong bang K = %d:\n", K);
        boolean timThay = false;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == K) {
                    System.out.printf("    (%d, %d) tai vi tri (%d, %d)\n", arr[i], arr[j], i, j);
                    timThay = true;
                }
            }
        }
        if (!timThay) {
            System.out.println("    Khong tim thay cap nao.");
        }
    }

    // d6- Xuat cap gia tri trong mang co tong gan bang K
    public static void xuatCapTongGanBangK(int[] arr, int K) {
        if (arr.length < 2) {
            System.out.println("d6- Mang phai co it nhat 2 phan tu de tim cap gan bang K.");
            return;
        }
        
        int minChenhLech = Integer.MAX_VALUE;
        int tongGanNhat = 0;
        
        // Buoc 1: Tim tong gan nhat
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                int tong = arr[i] + arr[j];
                int chenhLech = Math.abs(tong - K);
                
                if (chenhLech < minChenhLech) {
                    minChenhLech = chenhLech;
                    tongGanNhat = tong;
                }
            }
        }
        
        // Buoc 2: Xuat ra tat ca cac cap co tong bang tongGanNhat
        System.out.printf("d6- Cac cap gia tri co tong gan bang K=%d (Tong gan nhat la %d, chenh lech %d):\n", 
                          K, tongGanNhat, minChenhLech);
        
        boolean timThay = false;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == tongGanNhat) {
                    System.out.printf("    (%d, %d) tai vi tri (%d, %d)\n", arr[i], arr[j], i, j);
                    timThay = true;
                }
            }
        }
        if (!timThay) { 
            // Truong hop nay chi xay ra neu co loi logic, nhung van de phong
            System.out.println("    Khong tim thay cap nao co tong gan nhat.");
        }
    }

    // Ham dem so uoc so cua mot so
    public static int demSoUocSo(int n) {
        if (n <= 0) return 0;
        int dem = 0;
        for (int i = 1; i * i <= n; i++) {
            if (n % i == 0) {
                if (i * i == n) {
                    dem++;
                } else {
                    dem += 2; // Dem ca i va n/i
                }
            }
        }
        return dem;
    }

    // d7- Cho biet so nao trong mang co nhieu uoc so nhat
    public static void timSoNhieuUocSoNhat(int[] arr) {
        if (arr.length == 0) {
            System.out.println("d7- Mang rong, khong co so nao de kiem tra.");
            return;
        }

        int maxUocSo = -1;
        int soCoNhieuUocNhat = -1;

        // Buoc 1: Tim so luong uoc so lon nhat
        for (int x : arr) {
            int soUoc = demSoUocSo(x);
            if (soUoc > maxUocSo) {
                maxUocSo = soUoc;
                soCoNhieuUocNhat = x; 
            }
        }

        System.out.printf("\nSo dau tien co nhieu uoc nhat la: %d\n\n", soCoNhieuUocNhat);

        // Buoc 2: Xuat ra tat ca cac so dat den so luong uoc so lon nhat
        System.out.printf("d7- So co nhieu uoc so nhat (Max uoc: %d): ", maxUocSo);
        boolean daXuat = false;
        for (int x : arr) {
            if (demSoUocSo(x) == maxUocSo) {
                if (!daXuat) {
                    System.out.print(x);
                    daXuat = true;
                } else {
                    System.out.print(", " + x);
                }
            }
        }
        System.out.println();
    }
}
