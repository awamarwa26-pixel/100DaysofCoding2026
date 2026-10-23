import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Mau cetak sampai angka berapa? ");
        int n = input.nextInt();

        int i = 1; // 1. Inisialisasi di luar
        while (i <= n) { // 2. Kondisi
            System.out.println("Perulangan ke-" + i);
            i++; // 3. Perubahan / increment
        }

        input.close();
    }
}
