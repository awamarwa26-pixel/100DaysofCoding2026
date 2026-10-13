package latihanngoding;
import java.util.Scanner;
public class Day42 {
    public static void main(String[]args){
        Scanner marwa = new Scanner(System.in);
        
        System.out.print("Masukkan Gaji Pokok :");
        int gajipokok = marwa.nextInt();
        
        System.out.print("Masukkan Tunjangan :");
        int tunjangan = marwa.nextInt();
        
        System.out.print("Masukkan Potongan Gaji :");
        int potongangaji = marwa.nextInt();
        
        int gajikotor = gajipokok + tunjangan;
        double pajak = 0;
        
        if (gajikotor > 500000) {
            pajak = gajikotor * 0.10;
        } else {
            pajak =0;
        }
        
        double gajibersih = gajikotor - potongangaji - pajak;
        
        System.out.println("Gaji Kotor :" + gajikotor);
        System.out.println("Pajak :" + pajak);
        System.out.println("Gaji Bersih :" + gajibersih);
        
        marwa.close();
    }
}
