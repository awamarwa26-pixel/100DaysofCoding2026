import java.util.Scanner;

public class Day72 {
    public static void main(String[] args) {
        Scanner marwa = new Scanner (System.in);

        int total = 0;

        while (true) {
            System.out.print("Masukkan Angka (Negatif untuk berhenti) : ");

            int angka = marwa.nextInt();

            if (angka < 0) {
                break;
            }

            total = total + angka;
        }
        System.out.println("Total penjumlahan :" + total);
    }
    
}
