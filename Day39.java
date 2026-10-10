package latihanngoding;
import java.util.Scanner;

public class Latihanngoding {
    public static void main(String[] args){
        Scanner marwa = new Scanner(System.in);
        
        System.out.print("Masukkan angka pertama: ");
        int angka1 = marwa.nextInt();
        
        System.out.print("Masukkan operator (+, -, *, /): ");
        char operator = marwa.next().charAt(0);
        
        System.out.print("Masukkan angka kedua: ");
        int angka2 = marwa.nextInt();
        
        int hasil = 0;
        
        if (operator == '+') {
            hasil = angka1 + angka2;
        } else if (operator == '-') {
            hasil = angka1 - angka2;
        } else if (operator == '*') {
            hasil = angka1 * angka2;
        } else if (operator == '/') {
            if (angka2 != 0) {
                hasil = angka1 / angka2;
            } else {
                System.out.println("Tidak bisa dibagi 0!");
                return;
            }
        } else {
            System.out.println("Operator tidak valid!");
            return;
        }
        
        System.out.println("Hasil: " + angka1 + " " + operator + " " + angka2 + " = " + hasil);
        marwa.close();
    }
                                    }
