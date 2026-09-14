package com.example;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
     // SOAL 1   
       //SEBELUM UPDATE
        byte a = 3;
        int b = 10;
        float c = 5.5f;
        double d = 10.5;
        
        System.out.println("SEBELUM UPDATE");
        System.out.println("Byte   : " + a);
        System.out.println("Int    : " + b);
        System.out.println("Float  : " + c);
        System.out.println("Double : " + d);

        //SETELAH UPDATE
        a = 4;
        b = 20;
        c = 6.5f;
        d = 20.5;
        
        System.out.println("\nSETELAH UPDATE");
        System.out.println("Byte   : " + a);
        System.out.println("Int    : " + b);
        System.out.println("Float  : " + c);
        System.out.println("Double : " + d);
        
        
     //SOAL 2
        String nama2 = "Marwa";
        byte umur2 = 18;
        int tm = 2026;
        short jsks = 20;
        long nim = 0226327; // hati2: angka 0 di depan = oktal. mending 226327
        double tb = 155.5;
        float ipk = 3.94f;
        char kls = 'D';
        boolean sa = true;
        
        System.out.println("\n======== SOAL 2 ========");
        System.out.println("Nama         : " + nama2);
        System.out.println("Umur         : " + umur2);
        System.out.println("Tahun Masuk  : " + tm);
        System.out.println("Jumlah SKS   : " + jsks);
        System.out.println("NIM          : " + nim);
        System.out.println("Tinggi Badan : " + tb);
        System.out.println("IPK          : " + ipk);
        System.out.println("Kelas        : " + kls);
        System.out.println("Status Aktif : " + sa);

        
     // SOAL 3
        
        Scanner input = new Scanner(System.in);
        
        String nama3;        // ganti nama biar gak tabrakan
        int umur3;           
        int tanggalLahir;    // ini yang kurang
        int bulanLahir;     
        long tahunLahir;    
        double beratBadan;  
        float tinggiBadan; 
        char kelas;         
        boolean status;    

       
        System.out.println("\n======== INPUT BIODATA ========");
        System.out.print("Nama: ");
        nama3 = input.nextLine();

        System.out.print("Umur: ");
        umur3 = input.nextInt();

        System.out.print("Tanggal lahir: ");
        tanggalLahir = input.nextInt();

        System.out.print("Bulan lahir: ");
        bulanLahir = input.nextInt();

        System.out.print("Tahun lahir: ");
        tahunLahir = input.nextLong();

        System.out.print("Berat badan: ");
        beratBadan = input.nextDouble();

        System.out.print("Tinggi badan: ");
        tinggiBadan = input.nextFloat();

        input.nextLine(); // buang enter
        System.out.print("Kelas: ");
        kelas = input.nextLine().charAt(0);

        System.out.print("Status aktif mahasiswa: ");
        status = input.nextBoolean();

        // OUTPUT
        System.out.println("\n======== BIODATA ========");
        System.out.println("Nama           : " + nama3);
        System.out.println("Umur           : " + umur3);
        System.out.println("Tanggal lahir  : " + tanggalLahir + " " + bulanLahir + " " + tahunLahir);
        System.out.println("Berat badan    : " + beratBadan);
        System.out.println("Tinggi badan   : " + tinggiBadan);
        System.out.println("Kelas          : " + kelas);
        System.out.println("Status mahasiswa: " + status);

        input.close();
    }
          }
