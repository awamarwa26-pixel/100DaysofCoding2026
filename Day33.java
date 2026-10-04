import java.util.Scanner;

public class marwa33 {
    public static void main(String[] args) {
        
        Scanner marwa = new Scanner(System.in);

        // Input umur pengguna
        System.out.print("Masukkan umur anda : ");
        int usia = marwa.nextInt();

        // Seleksi kondisi umur
        if (usia >= 18) {
            System.out.println("Status : Anda sudah dewasa");
        } else {
            // Jika usia dibawah 18 tahun
            System.out.println("Status : Anda masih di bawah umur");
        }

        // Struktur percabangan if-else
        marwa.close();
    }
  }
