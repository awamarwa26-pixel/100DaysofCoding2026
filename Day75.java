package Day75;
import java.util.Scanner;

public class Day75 {
    public static void main(String[] args) {
        Scanner marwa = new Scanner(System.in);

        System.out.print("Masukkan nama: ");
        String nama = marwa.nextLine();

        System.out.println("Sama dengan Marwa: " + nama.equals("Marwa"));
        System.out.println("Sama dengan marwa tanpa peduli besar kecil: " + nama.equalsIgnoreCase("marwa"));
        System.out.println("Mengandung wa: " + nama.contains("wa"));
        System.out.println("Kosong atau tidak: " + nama.isEmpty());

        marwa.close();
    }
}
