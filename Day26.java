package latihanngoding;
import java.util.Scanner;

public class Latihanngoding {
    public static void main(String[] args) {
        Scanner marwa = new Scanner(System.in);
        
        double jari = marwa.nextDouble();
        double PI = 3.14;
        double luas = PI * jari * jari;
        
        System.out.println(luas);
        
        marwa.close();
    }
}
