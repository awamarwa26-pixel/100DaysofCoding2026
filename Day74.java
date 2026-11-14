package Day74;
import java.util.Scanner;

public class Day74 {
    public static void main(String[] args) {
        Scanner marwa = new Scanner(System.in);

        System.out.print("Masukkan nama kamu: ");
        String nama = marwa.nextLine();

        System.out.println("Panjang nama: " + nama.length());
        System.out.println("Huruf besar: " + nama.toUpperCase());
        System.out.println("Huruf kecil: " + nama.toLowerCase());

        marwa.close();
    }
}
