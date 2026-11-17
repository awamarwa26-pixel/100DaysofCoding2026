import java.util.Scanner;

public class Day77 {
    public static void main(String[] args) {
        Scanner marwa = new Scanner (System.in);

        System.out.print("Masukkan Nama : ");
        String nama = marwa.nextLine();

        String namarapi = nama.trim();
        String namabesar = namarapi.toUpperCase();
        String namakecil = namarapi.toLowerCase();

        System.out.println( "Nama Rapi : " + namarapi);
        System.out.println("Panjang Nama : " + namarapi.length());
        System.out.println("Huruf Pertama : " + namarapi.charAt(0));
        System.out.println("Huruf Besar : " + namabesar);
        System.out.println("Huruf Kecil : " + namakecil);
        System.out.println("3 Huruf Pertama : " + namarapi.substring(0, 3));
        System.out.println("Mengandung wa : " + namarapi.toLowerCase().contains("wa"));
        System.out.println("Ganti A jadi O : " + namarapi.replace("a", "o"));
        System.out.println("Sama Dengan Marwa : " + namarapi.equalsIgnoreCase("Marwa"));
        System.out.println("Kosong Atau Tidak : " + namarapi.isEmpty());


    

    }
}
