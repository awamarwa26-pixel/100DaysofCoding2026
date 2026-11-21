package Day81;
import java.util.Scanner;

public class Day81 {
    public static void main(String[] args) {
        Scanner marwa = new Scanner(System.in);

        String[] buah = new String[4];

        // 1. Mengisi elemen array
        for (int i = 0; i < 4; i++) {
            System.out.print("Masukkan buah ke-" + (i + 1) + " : ");
            buah[i] = marwa.nextLine();
        }

        System.out.println("\n--- Semua Buah ---");

        // 2. Menampilkan semua elemen array
        for (int i = 0; i < 4; i++) {
            System.out.println(buah[i]);
        }

        
    }
}
