package H6;

import java.util.Scanner;

// --- Rumus Modifikasi unik per Mahasiswa ---
// Absen 30 = P
// Syarat minimal log bimbingan Pembimbing 1 = 6 + (30 mod 5) = 6 → gantikan angka 8 pada
// Syarat minimal log bimbingan Pembimbing 2 = 3 + (30 mod 3) = 3 → gantikan angka 4 pada 
public class nestedUjianSkripsi30 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String pesan;
        System.out.print("Apakah mahasiswa sudah bebas kompen? (Ya/Tidak): ");
        String bebasKompen = sc.nextLine().trim();
        System.out.print("Masukkan jumlah log bimbingan pembimbing 1: ");
        int bimbinganP1 = sc.nextInt();
        System.out.print("Masukkan jumlah log bimbingan pembimbing 2: ");
        int bimbinganP2 = sc.nextInt();
        if (bebasKompen.equalsIgnoreCase("Ya")) {
            // Sebelumnya angka 8 diganti 6 dan angka 4 diganti 3
            if (bimbinganP1 >= 6 && bimbinganP2 >= 3) {
                pesan = "Bimbingan syarat terpenuhi. Mahasiswa boleh mendaftar ujian skripsi";
            } else if (bimbinganP1 < 6 && bimbinganP2 < 3) {
                pesan = "Gagal! Log bimbingan P1 kurang dari 6 kali dan P2 kurang dari 3 kali";
            } else if (bimbinganP1 < 6) {
                pesan = "Gagal! Log bimbingan P1 belum mencapai 6 kali ";
            } else {
                pesan = "Gagal ! Log bimbingan P2 belum mencapai 3 kali ";
            }
        } else if (bebasKompen.equalsIgnoreCase("Tidak")) {
            pesan = "Gagal ! Mahasiswa masih memiliki tanggungan kompen";
        } else {
            pesan = "Nilai yang anda masukkan tidak valid !";
        }
        System.out.println(pesan);
    }
}
