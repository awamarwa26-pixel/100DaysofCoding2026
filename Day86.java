
import java.util.Scanner;

public class day86 {
    public static void main(String[] args) {
        Scanner awa = new Scanner (System.in);

         // Memasukkan jumlah angka
        System.out.print("Masukkan jumlah angka: ");
        int n = awa.nextInt();

        // Membuat array
        int[] angka = new int[n];

        // Memasukkan elemen array
        for (int i = 0; i < n; i++) {
            System.out.print("Masukkan angka ke-" + (i + 1) + ": ");
            angka[i] = awa.nextInt();
        }

        // Memasukkan angka yang ingin dicari
        System.out.print("Masukkan angka yang dicari: ");
        int cari = awa.nextInt();

        // Proses pencarian
        boolean ditemukan = false;

        for (int i = 0; i < n; i++) {
            if (angka[i] == cari) {
                System.out.println("Angka " + cari +
                    " ditemukan pada indeks ke-" + i);
                ditemukan = true;
                break;
            }
        }

        // Jika angka tidak ditemukan
        if (!ditemukan) {
            System.out.println("Angka " + cari +
                " tidak ditemukan dalam array.");
        }
    }
}
