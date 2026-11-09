package Day69;
import java.util.Scanner;

public class Day69 {
    public static void main(String[] args) {
        Scanner marwa = new Scanner(System.in);

        System.out.print("Masukkan baris: ");
        int baris = marwa.nextInt();
        System.out.print("Masukkan kolom: ");
        int kolom = marwa.nextInt();

        for (int i = 1; i <= baris; i++) {
            for (int j = 1; j <= kolom; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        marwa.close();
    }
}
