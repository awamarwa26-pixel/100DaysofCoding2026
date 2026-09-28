import java.util.Scanner;
public class Main {
    
    public static void main(String[] args) {
        Scanner marwa = new Scanner (System.in);
        
        System.out.print("Masukkan Angka :");
        int angka = marwa.nextInt();
        
        angka++; //Tambah 1
        System.out.println("Setelah ++ :" + angka);
        
        angka--; //Kurang 1
        System.out.println("Setelah -- :" + angka);
    }
    
  }
