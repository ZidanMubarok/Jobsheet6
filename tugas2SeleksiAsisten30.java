package H6;

import java.util.Scanner;

// --- Modifikasi nilai parameter unik per Mahasiswa ---
// Syarat minimal nilai Dasar 
// P = Absen = 30
// Pemrograman=75+(30 mod 11) = 83 →gantikan angka 80 pada narasi soal
// Syarat minimal nilai wawancara = 70 + (30 mod 11) = 78 → gantikan angka 75 pada narasi soal
public class tugas2SeleksiAsisten30 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean isAktif, isSanksi, isSertifikatPemrogaman;
        double nilaiDasarPemrogaman, nilaiWawancara;
        System.out.print("Apakah anda mahasiswa aktif? (true/false)                 : ");
        isAktif = sc.nextBoolean();
        System.out.print("Apakah anda mendpat sanksi akademik? (true/false)         : ");
        isSanksi = sc.nextBoolean();
        System.out.print("Berapa nilai Dasar Pemrogaman anda ? (0-100)              : ");
        nilaiDasarPemrogaman = sc.nextDouble();
        System.out.print("Apakah anda memiliki sertifikat kompetensi? (true/false)   : ");
        isSertifikatPemrogaman = sc.nextBoolean();
        System.out.print("Berapa nilai wawancara anda ?(0-100)                      : ");
        nilaiWawancara = sc.nextDouble();
        if (isAktif && !isSanksi) {
            if (isSertifikatPemrogaman || nilaiDasarPemrogaman >= 83) {
                if (nilaiWawancara >= 78) {
                    System.out.println("Selamat anda lulus seleksi");
                    System.out.println("Dan diterima sebagai asisten");
                } else {
                    System.out.println("Anda tidak lulus tes wawancara di karenakan nilai anda kurang dari 83.");
                }
            } else {
                System.out.println("Anda tida dapat mengikuti tes wawancara dikarenakan :");
                System.out.println(
                        "Nilai dasar pemrogaman anda min 83 atau anda memiliki sertifikat kompetensi pemrogaman");
            }
        } else {
            System.out.println("Anda tidak dapat mengikuti seleksi karena : ");
            System.out.println("Status mahasiswa anda harus aktif Dan tidak sedang disamksi");
        }
    }
}
