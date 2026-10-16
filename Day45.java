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

        switch (menu) {
            case 1:
                System.out.println("Kamu pesan Ayam Geprek. Pesanan segera dibuat!");
                break;
            case 2:
                System.out.println("Kamu pesan Nasi Goreng. Pesanan segera dibuat!");
                break;
            case 3:
                System.out.println("Kamu pesan Mie Gacoan. Pesanan segera dibuat!");
                break;
            default:
                System.out.println("Menu tidak tersedia!");
                break;
        }
        input.close();
    }
}
