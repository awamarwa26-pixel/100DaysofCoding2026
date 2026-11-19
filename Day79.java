import java.util.Scanner;

public class Day79 {
    public static void main(String[] args) {
        Scanner marwa = new Scanner (System.in);

        String[] buah = new String[3];

        for (int i = 0; i < 3; i++) {
            System.out.print("Masukkan buah ke-" + (i + 1) + ": ");
            buah[i] = marwa.nextLine();
        }

        System.out.println("\nBuah yang kamu masukkan:");
        for (int i = 0; i < 3; i++) {
            System.out.println((i + 1) + ". " + buah[i]);
        }

        
    }
}
