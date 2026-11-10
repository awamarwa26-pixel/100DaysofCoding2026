
import java.util.Scanner;

public class piramida2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("input = ");
        int inp = in.nextInt();
       

        for (int i = 0; i <= inp; i++) {
            System.out.println();
            for (int j = 0; j <= inp - i; j++) {
               System.out.print(" "); 
  
            }
            
            for (int k = 0; k <= i; k++) {
                 System.out.print("*"); 
            }
            for (int k = 0; k <= i-1; k++) {
                 System.out.print("*"); 
            }
           
        }
         for (int i = 0; i <= i-1; i++) {
                 System.out.print("*"); 
            }
        
    }
}
