import java.util.Scanner;

public class Day78 {
    public static void main(String[] args) {
        Scanner marwa = new Scanner (System.in);

        System.out.println("=== Buat Akun === ");

        System.out.print("Buat Username : ");
        String userDaftar = marwa.nextLine();

        System.out.print("Buat Password : ");
        String passDaftar = marwa.nextLine();

        System.out.println("\nAkun Berhasil Dibuat, Silahkan Login");
        System.out.println("=== Login ===");

        while (true) {
            System.out.print("Username : ");
            String userLogin = marwa.nextLine();
            System.out.print("Password : ");
            String passLogin = marwa.nextLine();

            if (userLogin.equals(userDaftar) && passLogin.equals(passDaftar)) {
                System.out.println("Login Berhasil, Selamat Datang " + userLogin);
                break;
            } else {
                System.out.println("Username atau Password Salah, Coba Lagi\n");
            }
        }
    }
}
