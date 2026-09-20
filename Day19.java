package com.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner marwa = new Scanner(System.in);

        System.out.print("Masukkan angka desimal (double): ");
        double a = marwa.nextDouble();

        // Konversi manual/paksa
        float b = (float) a; // double ke float
        long c = (long) b;   // float ke long
        int d = (int) c;     // long ke int
        byte e = (byte) d;   // int ke byte

        System.out.println("Nilai double awal \t: " + a);
        System.out.println("Ke float \t\t: " + b);
        System.out.println("Ke long \t\t: " + c);
        System.out.println("Ke int \t\t\t: " + d);
        System.out.println("Ke byte \t\t: " + e);

        marwa.close();
    }
          }
