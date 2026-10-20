import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan nilai: ");
        int nilai = input.nextInt();

        // Ternary Operator
        String hasil = (nilai >= 60) ? "Lulus" : "Tidak Lulus";

        System.out.println("Status: " + hasil);
        
        input.close();
    }
}
