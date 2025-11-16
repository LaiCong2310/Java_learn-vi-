package Buoi_2.Bai3;

import java.util.Scanner;

public class Bai3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int thang = 0;
        while (true) {
            try {
                System.out.print("Nhap thang: ");
                thang = sc.nextInt();
                break;
            } catch (Exception e) {
                System.out.println("Loi nhap lieu!");
                sc.nextLine();
            }
        }
            switch (thang) {
                case 2: case 3: case 4:
                System.out.printf("Thang %d thuoc mua Xuan",thang);
                    break;
                case 5: case 6: case 7:
                System.out.printf("Thang %d thuoc mua He",thang);
                break;

                case 8: case 9: case 10:
                System.out.printf("Thang %d thuoc mua Thu",thang);
                break;

                case 11: case 12: case 1:
                System.out.printf("Thang %d thuoc mua Dong",thang);
                break;

                default:
                System.out.println("Nhap sai thang!");
                    break;
            }
        
        sc.close();
    }
}
