
import java.util.Scanner;

public class Day71 {
    public static void main(String[] args) {
        Scanner marwa = new Scanner (System.in);

        System.out.print("Masukkan Tinggi :");
        int a = marwa.nextInt();

        for (int i = a; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
