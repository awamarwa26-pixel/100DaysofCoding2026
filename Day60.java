package Day60;
import java.util.Scanner;

public class Day60 {
    public static void main(String[] args) {
        Scanner marwa = new Scanner(System.in);

        System.out.print("N: ");
        int n = marwa.nextInt();

        int total = 0;
        for (int i = 1; i <= n; i++) {
            total = total + i;
        }

        System.out.println("Jumlah 1 sampai " + n + " = " + total);
        marwa.close();
    }
}
