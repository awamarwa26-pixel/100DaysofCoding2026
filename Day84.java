import java.util.Scanner;

public class Day84 {
    public static void main(String[] args) {
        Scanner awa = new Scanner(System.in);

        // Meminta jumlah angka
        System.out.print("Masukkan jumlah angka: ");
        int n = awa.nextInt();

        // Membuat array
        int[] angka = new int[n];

        // Memasukkan angka ke dalam array
        for (int i = 0; i < n; i++) {
            System.out.print("Masukkan angka ke-" + (i + 1) + ": ");
            angka[i] = awa.nextInt();
        }

        // Menentukan angka terbesar
        int maksimal = angka[0];

        for (int i = 1; i < n; i++) {
            if (angka[i] > maksimal) {
                maksimal = angka[i];
            }
        }

        // Menampilkan hasil
        System.out.println("\nData Array:");

        for (int i = 0; i < n; i++) {
            System.out.print(angka[i] + " ");
        }

        System.out.println("\nAngka terbesar adalah: " + maksimal);

        
    }
}

    
