package com.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner marwa = new Scanner(System.in);

        System.out.print("Masukkan angka pertama: ");
        int a = marwa.nextInt();

        System.out.println("Nilai awal a = " + a);

        a += 5; // sama dengan a = a + 5
        System.out.println("Setelah a += 5 \t: " + a);

        a -= 3; // sama dengan a = a - 3
        System.out.println("Setelah a -= 3 \t: " + a);

        a *= 2; // sama dengan a = a * 2
        System.out.println("Setelah a *= 2 \t: " + a);

        a /= 2; // sama dengan a = a / 2
        System.out.println("Setelah a /= 2 \t: " + a);

        a %= 3; // sama dengan a = a % 3
        System.out.println("Setelah a %= 3 \t: " + a);

        marwa.close();
    }
          }
