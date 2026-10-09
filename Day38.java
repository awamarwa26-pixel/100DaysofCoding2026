import java.util.Scanner;

public class MenuMakanan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("=== MENU MAKANAN ===");
        System.out.println("1. Nasi Goreng - Rp 15.000");
        System.out.println("2. Mie Goreng - Rp 12.000");
        System.out.println("3. Ayam Bakar - Rp 20.000");
        System.out.print("Pilih menu (1-3): ");
        
        int pilih = input.nextInt();
        
        if (pilih == 1) {
            System.out.println("Anda memilih Nasi Goreng");
        } else if (pilih == 2) {
            System.out.println("Anda memilih Mie Goreng");
        } else if (pilih == 3) {
            System.out.println("Anda memilih Ayam Bakar");
        } else {
            System.out.println("Pilihan tidak valid!");
        }
        input.close();
    }
}
