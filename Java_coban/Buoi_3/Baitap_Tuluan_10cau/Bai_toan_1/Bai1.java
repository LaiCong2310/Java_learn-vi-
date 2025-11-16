package Buoi_3.Baitap_Tuluan_10cau.Bai_toan_1;
import java.util.Random;

public class Bai1 {
    public static void main(String[] args) {
        Random rand = new Random();
        int sinhLuc = 100;
        int diemKhoBau = 0;
        int lan = 1;

        System.out.println("=== TRO CHOI: THAM HIEM HANG DONG BI AN ===");

        do {
            System.out.println("\nLan tham hiem thu " + lan + ":");

            // 0 = gap quai, 1 = gap bay, 2 = an toan
            int suKien = rand.nextInt(10); // sinh số 0 -> 9 (10 giá trị)
            // 0–3 = 40%, 4–6 = 30%, 7–9 = 30%

            if (suKien <= 3) {
                // 40% gặp quái
                sinhLuc -= 20;
                System.out.println("Gap sinh vat nguy hiem! Mat 20 diem sinh luc.");
            } else if (suKien <= 6) {
                // 30% gặp bẫy
                sinhLuc -= 10;
                System.out.println("Gap cam bay! Mat 10 diem sinh luc.");
            } else {
                // 30% an toàn
                int khoBau = rand.nextInt(151) + 50; // 50 → 200 điểm
                diemKhoBau += khoBau;
                sinhLuc += 20; // hồi 20 sinh lực
                if (sinhLuc > 100) sinhLuc = 100; // không vượt quá 100
                System.out.println("An toan! Tim thay kho bau + " + khoBau + " diem va hoi 20 sinh luc!");
            }

            // Hiển thị trạng thái hiện tại
            System.out.println("Sinh luc hien tai: " + sinhLuc);
            System.out.println("Tong diem kho bau: " + diemKhoBau);

            // Kiểm tra điều kiện thắng / thua
            if (sinhLuc <= 0) {
                System.out.println("\nBan da het sinh luc! That bai trong cuoc tham hiem!");
                break;
            }

            if (diemKhoBau >= 500) {
                System.out.println("\nChuc mung! Ban da tim duoc 500 diem kho bau va chien thang!");
                break;
            }

            lan++;

        } while (lan <= 8);

        if (lan > 8 && diemKhoBau < 500 && sinhLuc > 0) {
            System.out.println("\nHet 8 lan tham hiem ma chua du 500 diem kho bau. That bai!");
        }

        System.out.println("\n=== KET THUC TRO CHOI ===");
    }
}
