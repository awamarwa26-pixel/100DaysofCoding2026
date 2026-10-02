package latihanngoding;
import java.util.Scanner;

public class Latihanngoding {
    public static void main(String[] args) {
        Scanner marwa = new Scanner(System.in);

        System.out.print("Masukkan nilai 1 (true/false) \t: ");
        boolean nilai1 = marwa.nextBoolean();

        System.out.print("Masukkan nilai 2 (true/false) \t: ");
        boolean nilai2 = marwa.nextBoolean();

        System.out.println("\n--- Hasil ---");
        System.out.println(nilai1 + " && " + nilai2 + " = " + (nilai1 && nilai2));
        System.out.println(nilai1 + " || " + nilai2 + " = " + (nilai1 || nilai2));
        System.out.println("! " + nilai1 + " = " + (!nilai1));
        
        marwa.close();
    }
                                    }
