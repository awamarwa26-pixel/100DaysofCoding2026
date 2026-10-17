import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("=== MENU MAKANAN ===");
        System.out.println("1. Ayam Geprek - Rp 15.000");
        System.out.println("2. Nasi Goreng - Rp 12.000");
        System.out.println("3. Mie Gacoan - Rp 13.000");
        System.out.print("Pilih menu (1-3): ");
        int menu = input.nextInt();
        
        System.out.print("Jumlah porsi: ");
        int jumlah = input.nextInt();
        int total = 0;

        switch (menu) {
            case 1: total = 15000 * jumlah; System.out.println("Total Ayam Geprek " + jumlah + " porsi = Rp " + total); break;
            case 2: total = 12000 * jumlah; System.out.println("Total Nasi Goreng " + jumlah + " porsi = Rp " + total); break;
            case 3: total = 13000 * jumlah; System.out.println("Total Mie Gacoan " + jumlah + " porsi = Rp " + total); break;
            default: System.out.println("Menu tidak tersedia!"); break;
        }
        input.close();
    }
}
