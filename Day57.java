package Day57;
import java.util.Scanner;
public class java {
     public static void main(String[] args) {
        Scanner marwa = new Scanner(System.in);
        System.out.print("N: ");
        int n = marwa.nextInt();

        System.out.print("Ganjil : ");
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 1) System.out.print(i + " ");
        }

        System.out.print("\nGenap : ");
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) System.out.print(i + " ");
        }

        marwa.close();
    }
}
