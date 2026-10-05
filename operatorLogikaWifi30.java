package H6;

import java.util.Scanner;

public class operatorLogikaWifi30 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean mahasiswa, dosen, akunDiblokir;
        System.out.print("apakah pengguna mahasiswa ?   (true/false): ");
        mahasiswa = sc.nextBoolean();
        System.out.print("apakah pengguna dosen?        (true/false): ");
        dosen = sc.nextBoolean();
        System.out.print("apakah akun sedang diblokir ? (true/false): ");
        akunDiblokir = sc.nextBoolean();

        // Struktur pemilihan untuk menentukan akses wifi
        if (mahasiswa && dosen && !akunDiblokir) {
            System.out.println("Akses wifi diberikan !");
        } else {
            System.out.println("Akses wifi ditolak  !");
        }
    }
}
