package com.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        
        int angka1;
        int angka2;
        int hasil;
        
        System.out.println("=== PROGRAM PENJUMLAHAN SEDERHANA ===");
        
        System.out.print("Masukkan angka pertama: ");
        angka1 = input.nextInt();
        
        System.out.print("Masukkan angka kedua: ");
        angka2 = input.nextInt();
        
        hasil = angka1 + angka2;
        
        System.out.println("-------------------------------------");
        System.out.println("Hasil: " + angka1 + " + " + angka2 + " = " + hasil);
        System.out.println("-------------------------------------");
        
        input.close();
    }
  }
