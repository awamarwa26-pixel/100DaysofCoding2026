import java.util.Scanner;

public class dowhile {
    public static void main(String[] args) {
        

        Scanner marwa = new Scanner(System.in);


        int pilih;

        do { 
        System.out.println("1. Cek Ganjil Genap");
        System.out.println("2. Keluar");
        System.out.print("Pilih :");
        pilih = marwa.nextInt();


        if (pilih == 1){
            System.out.print("Masukkan Angka :");
            int angka = marwa.nextInt();
            System.out.println((angka % 2 ==0) ?"Genap" : "Ganjil");
        }else if (pilih ==2){
            System.out.println("Program Selesai. Bye!");
        }else {
            System.out.println("Pilihan Tidak Valid!");
        }
        } while (pilih !=2);
    }
}
