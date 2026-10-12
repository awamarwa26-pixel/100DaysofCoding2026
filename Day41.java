package latihanngoding;
import java.util.Scanner;
public class Day41 {
    public static void main(String[] args){
    Scanner marwa = new Scanner(System.in);
    
        System.out.print("Masukkan Suhu Ruangan (°C) :");
        int suhu = marwa.nextInt();
        
         if (suhu < 18) {
            System.out.println("Suhu: " + suhu + "°C -> Ruangan DINGIN");
        } else if (suhu >= 18 && suhu <= 24) {
            System.out.println("Suhu: " + suhu + "°C -> Ruangan SEJUK / NORMAL");
        } else if (suhu >= 25 && suhu <= 30) {
            System.out.println("Suhu: " + suhu + "°C -> Ruangan HANGAT");
        } else {
            System.out.println("Suhu: " + suhu + "°C -> Ruangan PANAS");
        }
}
          }
