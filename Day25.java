package latihanngoding;
import java.util.Scanner;

public class Latihanngoding {
    public static void main(String[] args) {
        Scanner marwa = new Scanner(System.in);

        System.out.println("Masukkan Jari-jari Lingkaran :");
        double a = marwa.nextDouble();

        // Rumus luas = phi * r * r
        double phi = 3.14;
        double luas = phi * a * a;

        System.out.println("Luas Lingkarannya Adalah : " + luas);

        marwa.close();
    }
          }
