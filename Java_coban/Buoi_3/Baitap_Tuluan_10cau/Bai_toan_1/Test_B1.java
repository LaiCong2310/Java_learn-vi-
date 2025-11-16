package Buoi_3.Baitap_Tuluan_10cau.Bai_toan_1;

import java.util.Random;

public class Test_B1 {
    public static void main(String[] args) {
        Random rand = new Random();
        int sinhLuc = 100;
        int diemKhoBau = 0;
        int lan = 1;

        System.out.println("=== TRO CHOI: THAM HIEM HANG DONG BI AN ===");

        do {
            System.out.println("\nLan tham hiem thu " + lan + ":");

            boolean gapQuai = rand.nextInt(100) < 40;  // 40% gặp quái
            boolean gapBay = rand.nextInt(100) < 30;   // 30% gặp bẫy
            boolean hoiSuc = rand.nextInt(100) < 3;    // 3% hồi sinh lực

            if (gapQuai) {
                sinhLuc -= 20;
                System.out.println(" Gap sinh vat nguy hiem! -20 sinh luc");
            }

            if (gapBay) {
                sinhLuc -= 10;
                System.out.println(" Gap cam bay! -10 sinh luc");
            }

            if (!gapQuai && !gapBay) {
                int khoBau = rand.nextInt(151) + 50; // 50 -> 200
                diemKhoBau += khoBau;
                System.out.println(" An toan! Tim thay kho bau + " + khoBau + " diem!");
            }

            if (hoiSuc) {
                sinhLuc += 20;
                if (sinhLuc > 100) sinhLuc = 100;
                System.out.println(" Ban duoc phuc hoi 20 sinh luc!");
            }

            // Hiển thị trạng thái
            System.out.println("Sinh luc hien tai: " + sinhLuc);
            System.out.println("Tong diem kho bau: " + diemKhoBau);

            // Kiểm tra điều kiện dừng
            if (sinhLuc <= 0) {
                System.out.println("\n Ban da het sinh luc! That bai trong cuoc tham hiem!");
                break;
            }

            if (diemKhoBau >= 500) {
                System.out.println("\n Chuc mung! Ban da tim duoc 500 diem kho bau va chien thang!");
                break;
            }

            lan++;

        } while (lan <= 8);

        if (lan > 8 && diemKhoBau < 500 && sinhLuc > 0) {
            System.out.println("\n Het 8 lan tham hiem ma chua du 500 diem kho bau. That bai!");
        }

        System.out.println("\n=== KET THUC TRO CHOI ===");
    }
}
