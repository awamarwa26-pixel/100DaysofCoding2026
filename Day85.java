
import java.util.Scanner;

public class Day85 {
    public static void main(String[] args) {

        Scanner awa = new Scanner(System.in);

        // Memasukkan jumlah angka
        System.out.print("Masukkan jumlah angka: ");
        int n = awa.nextInt();

        // Membuat array
        int[] angka = new int[n];

        // Memasukkan data ke dalam array
        for (int i = 0; i < n; i++) {
            System.out.print("Masukkan angka ke-" + (i + 1) + ": ");
            angka[i] = awa.nextInt();
        }

        // Menentukan angka terkecil
        int minimal = angka[0];

        for (int i = 1; i < n; i++) {
            if (angka[i] < minimal) {
                minimal = angka[i];
            }
        }

        // Menampilkan data array
        System.out.println("\nData Array:");

        for (int i = 0; i < n; i++) {
            System.out.print(angka[i] + " ");
        }

        System.out.println("\nAngka terkecil adalah: " + minimal);

        
    }
}
