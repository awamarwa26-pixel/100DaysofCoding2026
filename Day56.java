package Day56;
import java.util.Scanner;
public class java {
     public static void main(String[] args) {
    Scanner marwa= new Scanner(System.in);
    
         System.out.print("N :");
         int n = marwa.nextInt();
         
         // 1. Cetak 1 - N
        System.out.print("\n1 sampai N : ");
        for (int i = 1; i <= n; i++) {
            System.out.print(i + " ");
        }

        // 2. Cetak N - 1
        System.out.print("\nN sampai 1 : ");
        for (int i = n; i >= 1; i--) {
            System.out.print(i + " ");
        }
         
         
          marwa.close();
}
}
