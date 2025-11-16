package Buoi_3.Bai2_bangcuuchuong;

public class Bai2 {
    public static void main(String[] args) {
    System.out.println("\t\t\t\t\t\t--- BANG CUU CHUONG TU 2 DEN 9 ---\n");
    
    // Mỗi lần lặp sẽ in ra MỘT HÀNG NGANG
    for (int j = 1; j <= 10; j++) {             // Vòng lặp ngoài (j): Đại diện cho số bị nhân (từ 1 đến 10)
        
        // Lặp 8 lần để tạo 8 cột trong cùng một hàng
        for (int i = 2; i <= 9; i++) {         // Vòng lặp trong (i): Đại diện cho số nhân (từ 2 đến 9)

            int ketQua = i * j;
            
            System.out.printf("%d x %d = %d\t", i, j, ketQua);
        }
        System.out.println(); 
        
        }
    }
}
