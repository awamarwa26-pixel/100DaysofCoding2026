package latihanngoding;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner marwa = new Scanner(System.in);

        System.out.print("Masukkan Nilai \t\t:");
        int nilai = marwa.nextInt();

        System.out.print("Masukkan Kehadiran :");
        int hadir = marwa.nextInt();

        if (nilai >= 60) {
            // if di dalam if = Nested if
            if (hadir >= 75) {
                System.out.println("LULUS - Nilai Cukup Dan Rajin Hadir");
            } else {
                System.out.println("TIDAK LULUS - Nilai Cukup Tapi Jarang Hadir");
            }
        } else {
            System.out.println("TIDAK LULUS - Nilai Kurang");
        }

        marwa.close();
    }
                                    }
