package Buoi_3.Bai1_Nhapvao1so_daonguocsodo;

import java.util.Scanner;

public class Bai1 {
    public static void main(String[] args) {
        long so = nhapso() ;

        System.out.printf("So dao cua %d la: %s",so,daoso(so));
    }
    public static long nhapso(){

        Scanner sc = new Scanner(System.in);
        System.out.println("----So dao nguoc ----");
        long so = 0;

        while (true) {
            try {
                System.out.print("Nhap so: ");
                so = sc.nextLong();
                if(so >0){
                    break;
                }
                else
                    System.out.println("Vui long nhap so nguyen duong!");
            } catch (Exception e) {
                System.out.println("Loi nhap lieu!");
                sc.nextLine();
            }
        }
        sc.close(); 
        return so;
    }
    public static String daoso(long so){
        String soDao = " ";
        int soDu = 0;
        while (so != 0) {
            soDu = (int)so % 10;
            soDao += soDu;
            so /= 10;
        }
        return soDao;
    }
}
