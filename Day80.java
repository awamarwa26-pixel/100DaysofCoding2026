package Day80;
import java.util.Scanner;

public class Day80 {
    public static void main(String[] args) {
        Scanner marwa = new Scanner(System.in);

        String[] buah = {"Apel", "Mangga", "Jeruk", "Pisang", "Anggur"};

        System.out.println("Daftar buah:");
        for (int i = 0; i < 5; i++) {
            System.out.println("Indeks " + i + " = " + buah[i]);
        }

        System.out.print("\nMasukkan indeks yang mau dilihat (0-4): ");
        int index = marwa.nextInt();

        System.out.println("Buah di indeks " + index + " adalah " + buah[index]);

        marwa.close();
    }
}
