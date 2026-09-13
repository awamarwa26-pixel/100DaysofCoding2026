package com.example;

        import java.util.Scanner; // wajib import dulu

public class Main {
    public static void main(String[] args) {
        // 1. Buat objek Scanner
        Scanner input = new Scanner(System.in);

        // 2. Deklarasi variabel
        String nama, alamat, jurusan;
        int umur;
        
        // 3. Input Data
        System.out.println("=== INPUT BIODATA ===");
        System.out.print("Masukkan Nama    : ");
        nama = input.nextLine(); // untuk input teks + spasi

        System.out.print("Masukkan Umur    : ");
        umur = input.nextInt(); // untuk input angka
        input.nextLine(); // buat "buang enter" setelah nextInt

        System.out.print("Masukkan Alamat  : ");
        alamat = input.nextLine();

        System.out.print("Masukkan Jurusan : ");
        jurusan = input.nextLine();

        // 4. Output / Cetak Biodata
        System.out.println("\n=== HASIL BIODATA ===");
        System.out.println("Nama    : " + nama);
        System.out.println("Umur    : " + umur + " tahun");
        System.out.println("Alamat  : " + alamat);
        System.out.println("Jurusan : " + jurusan);

        // 5. Tutup Scanner
        input.close();
    }
  }
