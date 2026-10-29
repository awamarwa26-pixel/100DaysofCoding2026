package Day58;
import java.util.Scanner;

public class Day58 {
    public static void main(String[] args) {
        Scanner marwa = new Scanner(System.in);
        
        System.out.print("N: ");
        int n = marwa.nextInt();

        System.out.print("Ganjil N-1 : ");
        for (int i = 1; i < n; i++) { // < n artinya sampai N-1
            if (i % 2 == 1) {
                System.out.print(i + " ");
            }
        }

        System.out.print("\nGenap N-1  : ");
        for (int i = 1; i < n; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }

        marwa.close();
    }
}
