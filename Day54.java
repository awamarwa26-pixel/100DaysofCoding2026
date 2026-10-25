import java.util.Scanner;

public class InputNamaUmur {
    public static void main(String[] args) {
        Scanner marwa = new Scanner(System.in);

        System.out.print("Masukkan nama: ");
        String nama = marwa.nextLine();

        System.out.print("Masukkan umur: ");
        int umur = marwa.nextInt();

        System.out.println("\nHalo " + nama + ", umur kamu " + umur + " tahun.");

        marwa.close();
    }
}
