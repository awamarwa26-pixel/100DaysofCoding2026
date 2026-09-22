import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        System.out.print("masukkan angka : ");
        String a = s.nextLine();
        int angka = Integer.parseInt(a);
        System.out.print("masukkan pecahan : ");
        String b = s.nextLine();
        double pecahan = Double.parseDouble(b);
        System.out.print("masukkan benar/salah : ");
        String c = s.nextLine();
        boolean benar = Boolean.parseBoolean(c);
        System.out.print("masukkan huruf : ");
        String d = s.nextLine();
        char huruf = d.charAt(0);

        System.out.println("int : " + angka);
        System.out.println("double : " + pecahan);
        System.out.println("boolean : " + benar);
        System.out.println("char : " + huruf);
    }
          }
