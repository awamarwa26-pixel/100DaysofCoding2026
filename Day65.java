package Day65;
import java.util.Scanner;

public class Day65 {
    public static void main(String[] args) {
        Scanner marwa = new Scanner(System.in);

        System.out.print("Masukkan N: ");
        int n = marwa.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.println("*");
        }

        marwa.close();
    }
}
