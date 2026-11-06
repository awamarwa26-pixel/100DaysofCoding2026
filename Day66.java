package Day66;
import java.util.Scanner;

public class Day66 {
    public static void main(String[] args) {
        Scanner marwa = new Scanner(System.in);

        System.out.print("Masukkan N: ");
        int n = marwa.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.print("* ");
        }

        marwa.close();
    }
}
