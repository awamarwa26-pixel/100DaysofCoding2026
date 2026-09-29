import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner marwa = new Scanner(System.in);
        
        System.out.print("Masukkan angka pertama: ");
        int angka1 = marwa.nextInt();
        
        System.out.print("Masukkan angka kedua: ");
        int angka2 = marwa.nextInt();

        // Operator Perbandingan
        System.out.println("Apakah sama? " + (angka1 == angka2));
        System.out.println("Apakah tidak sama? " + (angka1 != angka2));
        
        marwa.close();
    }
                                    }
