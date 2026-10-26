import java.util.Scanner;

public class Day55 { // tadinya double public public
    public static void main(String[] args) {
        Scanner marwa = new Scanner(System.in);

        System.out.print("Mau Sampai Berapa? : ");
        int batas = marwa.nextInt();

        for(int i = 1; i <= batas; i++) {
            // CONTINUE : Lewati jika kelipatan 4
            if(i % 4 == 0) {
                System.out.println(i + " -> skip (Continue)");
                continue;
            }

            // BREAK : berhenti total kalau sudah 15
            if (i == 15){
                System.out.println(i + " -> stop (Break)");
                break;
            }

            System.out.println("Cetak Angka : " + i);
        }

        System.out.println("Loop selesai");
        marwa.close(); // tadinya input.close() padahal variabelnya marwa
        return; // RETURN: akhiri method main
    }
}
