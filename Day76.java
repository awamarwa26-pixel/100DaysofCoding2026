package Day76;
import java.util.Scanner;

public class Day76 {
    public static void main(String[] args) {
        Scanner marwa = new Scanner(System.in);

        System.out.print("Masukkan kalimat: ");
        String kalimat = marwa.nextLine();

        System.out.println("Hasil trim: " + kalimat.trim());
        System.out.println("Potongan dari huruf ke 0 sampai 5: " + kalimat.trim().substring(0, 5));
        System.out.println("Ganti a jadi o: " + kalimat.trim().replace("a", "o"));

        marwa.close();
    }
}
