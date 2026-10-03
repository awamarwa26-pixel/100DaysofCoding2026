package latihanngoding;
import java.util.Scanner;

public class Latihanngoding {
    public static void main(String[] args) {
        Scanner marwa = new Scanner(System.in);

        System.out.print("Masukkan angka pertama : ");
        int a = marwa.nextInt();
        
        System.out.print("Masukkan angka kedua : ");
        int b = marwa.nextInt();

        System.out.println("\n--- HASIL KOMBINASI OPERATOR ---");
        
        // 1. Aritmatika
        System.out.println("Aritmatika (a + b) = " + (a + b));
        
        // 2. Perbandingan
        System.out.println("Perbandingan (a > b) = " + (a > b));
        
        // 3. Logika (kombinasi)
        boolean hasilLogika = (a > 5) && (b < 10);
        System.out.println("Logika (a>5 && b<10) = " + hasilLogika);
        
        // 4. Kombinasi SEMUA (aritmatika + perbandingan + logika)
        boolean kombinasi = ((a + b) > 10) && (a != b);
        System.out.println("Kombinasi ((a+b)>10 && a!=b) = " + kombinasi);

        marwa.close();
    }
                                    }
