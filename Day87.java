import java.util.Scanner;

public class Day87 {
    public static void main(String[] args) {
        Scanner awa = new Scanner(System.in);

        // Memasukkan jumlah data
        System.out.print("Masukkan jumlah data: ");
        int n = awa.nextInt();

        // Membuat array
        int[] angka = new int[n];

        // Memasukkan data array
        for (int i = 0; i < n; i++) {
            System.out.print("Masukkan angka ke-" + (i + 1) + ": ");
            angka[i] = awa.nextInt();
        }

        // Menampilkan data sebelum diubah
        System.out.println("\nData sebelum diubah:");

        for (int i = 0; i < n; i++) {
            System.out.print(angka[i] + " ");
        }

        // Memilih indeks yang akan diubah
        System.out.print("\nMasukkan indeks yang ingin diubah: ");
        int indeks = awa.nextInt();

        // Memasukkan nilai baru
        System.out.print("Masukkan nilai baru: ");
        int nilaiBaru = awa.nextInt();

        // Mengubah elemen array
        if (indeks >= 0 && indeks < n) {
            angka[indeks] = nilaiBaru;
            System.out.println("\nData berhasil diubah!");
        } else {
            System.out.println("\nIndeks tidak valid!");
        }

        // Menampilkan data setelah diubah
        System.out.println("\nData setelah diubah:");

        for (int i = 0; i < n; i++) {
            System.out.print(angka[i] + " ");
        }

    }
}
