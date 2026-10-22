import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Mau cetak sampai angka berapa? ");
        int n = input.nextInt();

        // for(inisialisasi; kondisi; perubahan)
        for (int i = 1; i <= n; i++) {
            System.out.println("Perulangan ke-" + i);
        }

        input.close();
    }
}
