import java.util.Scanner;

public class Day73 {
    public static void main(String[] args) {
        Scanner marwa = new Scanner (System.in);

        int pilihan;

        do {
            System.out.println("=== MENU ===");

            System.out.println("1. Sapa");
            System.out.println("2. Hitung");
            System.out.println("3. Keluar");

            System.out.print("Pilih Menu : ");
            pilihan = marwa.nextInt();

            if (pilihan == 1) {
                System.out.println("Halo");
            } else if (pilihan == 2) {
                System.out.println("2 Tambah 2 Sama Dengan 4");
            } else if (pilihan == 3) {
                System.out.println("Keluar Dari Program");
            } else {
                System.out.println("Pilihan Tidak Valid");
            }

        } while (pilihan != 3);
    }
}
