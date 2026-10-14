package latihanngoding;
import java.util.Scanner;
public class Day43 {
    public static void main(String []args){
        Scanner marwa = new Scanner(System.in);
        
        System.out.print("Masukkan Angka :");
        int a = marwa.nextInt();
        
        if (a % 3 == 0 && a % 5 == 0) {
            System.out.println(a + " adalah kelipatan 3 dan 5");
        }else if (a % 3 == 0) {
            System.out.println(a + " adalah kelipatan 3");
        }else if (a % 5 == 0) {
            System.out.println(a + " adalah kelipatan 5");
        }else {
            System.out.println(a + " adalah bukan kelipatan 3 dan 5");
        }
        
        marwa.close();
    }
}
