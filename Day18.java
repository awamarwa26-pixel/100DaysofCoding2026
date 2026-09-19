package com.example;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        
        Scanner marwa = new Scanner(System.in);
        
        // Konversi Otomatis (Dari Tipe Data Kecil ke Besar). 
        byte a  = marwa.nextByte();
        short b = a;
        int c = b;
        long d = c;
        float e = d;
        double f = e;
        

        System.out.println("byte ke short \t: " + b);
        System.out.println("short ke int \t: " + c);
        System.out.println("int ke long \t: " + d);
        System.out.println("long ke float \t: " + e);
        System.out.println("float ke double \t: " + f);
        
    }
}
