import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner marwa = new Scanner(System.in);

        System.out.print("Masukkan panjang: ");
        double panjang = marwa.nextDouble();

        System.out.print("Masukkan lebar: ");
        double lebar = marwa.nextDouble();

        double luas = panjang * lebar;

        System.out.println("Luas Persegi Panjang = " + luas);

        marwa.close();
    }
                           }
