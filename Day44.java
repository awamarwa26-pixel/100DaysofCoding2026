package latihanngoding;
import java.util.Scanner;

public class Day44 {
    public static void main(String[] args) {
        Scanner marwa = new Scanner(System.in);
        
        System.out.print("Masukkan nilai (0-100): ");
        int nilai = marwa.nextInt();
        
        char predikat;
        
        if (nilai >= 90) {
            predikat = 'A';
        } else if (nilai >= 80) {
            predikat = 'B';
        } else if (nilai >= 70) {
            predikat = 'C';
        } else if (nilai >= 60) {
            predikat = 'D';
        } else {
            predikat = 'E';
        }
        
        System.out.println("Nilai " + nilai + " = Predikat " + predikat);
        
        marwa.close();
    }
                                    }
