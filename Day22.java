import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner marwa = new Scanner(System.in);

        System.out.print("Masukkan nilai a: ");
        int a = marwa.nextInt();

        System.out.print("Masukkan nilai b: ");
        int b = marwa.nextInt();

        System.out.println("Sebelum ditukar: a = " + a + ", b = " + b);

        // Proses tukar pakai variabel bantuan
        int temp = a;
        a = b;
        b = temp;

        System.out.println("Sesudah ditukar: a = " + a + ", b = " + b);

        marwa.close();
    }
}
