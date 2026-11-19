import java.util.Scanner;

public class Day79 {
    public static void main(String[] args) {
        Scanner marwa = new Scanner (System.in);

        String[] nama = new String[5];
        int[] nilai = new int[5];

        for (int i = 0; i < 5; i++) {
            System.out.print("Masukkan Nama Ke-" + (i + 1) + " : ");
            nama[i] = marwa.nextLine();
            System.out.print("Masukkan Nilai " + nama[i] + " : ");
            nilai[i] = marwa.nextInt();
            marwa.nextLine();
        
        }

        System.out.println("\n=== DAFTAR NILAI ===");
        for (int i = 0; i < 5; i++) {
            System.out.println((i + 1) + ". " + nama[i] + " = " + nilai[i]);
            
        }

    }
}
