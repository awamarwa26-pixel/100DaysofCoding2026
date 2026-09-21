package com.example;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner marwa = new Scanner(System.in);

        System.out.println("=== KONVERSI PRIMITIF KE STRING ===");

        // --- 1. Konversi int ke String ---
        System.out.print("\nMasukkan angka bulat (int): ");
        int angkaInt = marwa.nextInt();
        String hasilInt = Integer.toString(angkaInt);

        System.out.println("Sebelum diubah (int)    : " + angkaInt + " -> tipe: int");
        System.out.println("Setelah diubah (String) : " + hasilInt + " -> tipe: String");

        // --- 2. Konversi double ke String ---
        System.out.print("\nMasukkan angka desimal (double): ");
        double angkaDouble = marwa.nextDouble();
        String hasilDouble = Double.toString(angkaDouble);

        System.out.println("Sebelum diubah (double) : " + angkaDouble + " -> tipe: double");
        System.out.println("Setelah diubah (String) : " + hasilDouble + " -> tipe: String");

        marwa.close();
        System.out.println("\n=== Program Selesai ===");
    }
}
