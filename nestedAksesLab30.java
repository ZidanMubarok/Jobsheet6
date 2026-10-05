package H6;

import java.util.Scanner;

public class nestedAksesLab30 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean mahasiswaAktif, sedangDisanksi, punyaIzinDosen, asistenLab;
        System.out.print("Apakah anda seorang mahasiswa aktif? (true/false) : ");
        mahasiswaAktif = sc.nextBoolean();
        System.out.print("Apakah anda sedang disanksi ? (true/false)        : ");
        sedangDisanksi = sc.nextBoolean();
        System.out.print("Apakah anda punya izin dosen ? (true/false)       : ");
        punyaIzinDosen = sc.nextBoolean();
        System.out.print("Apakah anda seorang asisten Lab ? (true/false)    : ");
        asistenLab = sc.nextBoolean();
        if (mahasiswaAktif && !sedangDisanksi) {
            if (punyaIzinDosen || asistenLab) {
                System.out.println("Akses Laboratorimu diberikan !");
            } else {
                System.out.println("Akses ditolak membutuhkan izin dosen atau asisten lab !");
            }
        } else {
            System.out.println("Akses ditolak: status mahasiswa tidak memnuhi syarat ");
        }
    }
}
