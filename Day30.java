package latihanngoding;
import java.util.Scanner;

public class Latihanngoding {
    public static void main(String[] args) {
        Scanner marwa = new Scanner(System.in);

        System.out.print("Masukkan Angka pertama \t: ");
        int angka1 = marwa.nextInt();

        System.out.print("Masukkan Angka kedua \t: ");
        int angka2 = marwa.nextInt();

        System.out.println(angka1 + " <= " + angka2 + " = " + (angka1 <= angka2));
        System.out.println(angka1 + " >= " + angka2 + " = " + (angka1 >= angka2));
        
        marwa.close();
    }
          }
