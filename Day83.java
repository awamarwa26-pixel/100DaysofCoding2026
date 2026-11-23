import java.util.Scanner;

public class Day83 {
    public static void main(String[] args) {
        Scanner awa = new Scanner (System.in);

        int[] angka = new int[5];
        int total = 0;

        for (int i = 0; i < 5; i++) {
            System.out.print("Masukkan Angka Ke-" + (i+1) + " : ");
            angka[i] = awa.nextInt();
        }
        System.out.println("\n--- Semua Angka ---");

        for (int i = 0; i < 5; i++) {
            System.out.println(angka[i]);

            total = total + angka[i];
            
        }

        System.out.println("\nTotal : " + total);
    }
}
