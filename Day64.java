package Day64;
import java.util.Scanner;

public class Day64 {
    public static void main(String[] args) {
        Scanner marwa = new Scanner(System.in);

        System.out.print("Masukkan N: ");
        int n = marwa.nextInt();

        long hasil = 1;
        for (int i = 1; i <= n; i++) {
            hasil = hasil * i;
        }

        System.out.println(n + "! = " + hasil);
      
    }
              }
