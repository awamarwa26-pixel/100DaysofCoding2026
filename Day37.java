import java.util.Scanner;

public class CekBilangan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan sebuah bilangan: ");
        int bilangan = input.nextInt();
        
        if (bilangan > 0) {
            System.out.println(bilangan + " adalah bilangan POSITIF");
        } else if (bilangan < 0) {
            System.out.println(bilangan + " adalah bilangan NEGATIF");
        } else {
            System.out.println("Bilangan adalah NOL");
        }
        
        input.close();
    }
}
