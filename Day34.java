import java.util.Scanner;

public class cullang {
    public static void main(String[] args) {
    Scanner cullang = new Scanner(System.in);
    
    System.out.print("Masukkan Nilai :");

    int nilai = cullang.nextInt();

    if (nilai >= 90 ) {
        System.out.println("A - Nilai Memuaskan");
    }else if (nilai >= 75){
        System.out.println("B - Lulus");
    }else if (nilai >= 60){
        System.out.println("C - Cukup");
    }else {
        System.out.println("D - Tidak Lulus/Gagal");
    }
    
    }
                                  }
