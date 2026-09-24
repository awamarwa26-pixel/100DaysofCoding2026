import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner marwa = new Scanner(System.in);

        System.out.print("Masukkan sisi persegi: ");
        int sisi = marwa.nextInt();

        int luas = sisi * sisi;

        System.out.println("Luas persegi = " + luas);

        marwa.close();
    }
    }
