import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan angka: ");
        int angka = input.nextInt();

        // Rumus ternary: kondisi ? benar : salah
        String hasil = (angka % 2 == 0) ? "Genap" : "Ganjil";

        System.out.println(angka + " adalah bilangan " + hasil);

        input.close();
    }
}
