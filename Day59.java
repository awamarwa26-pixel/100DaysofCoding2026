package Day59;
import java.util.Scanner;

public class Day59 {
    public static void main(String[] args) {
        Scanner marwa = new Scanner(System.in);

        System.out.print("N: ");
        int n = marwa.nextInt();
        System.out.print("M: ");
        int m = marwa.nextInt();

        System.out.print("Kelipatan " + m + " : ");
        for (int i = 1; i <= n; i++) {
            if (i % m == 0) {
                System.out.print(i + " ");
            }
        }
        marwa.close();
    }
}
