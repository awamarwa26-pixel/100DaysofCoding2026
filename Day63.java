package Day63;
import java.util.Scanner;
public class java {
     public static void main(String[] args) {
         Scanner marwa = new Scanner (System.in);
         
         System.out.print("M :");
         int m = marwa.nextInt();
         System.out.print("N :");
         int n = marwa.nextInt();
         
         long hasil = 1;
         
          for (int i = 1; i <= n; i++){
         hasil = hasil * m;
     }
         System.out.println(m + " pangkat " + n + " = " + hasil);
     }
}
