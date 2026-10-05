package H6;

import java.util.Scanner;
// Syarat : 
// 1. Diskon dasar buku kamus=(8+(30 mod 5))%=8%;
// berlaku jika jumlah kamus yang dibeli lebih dari(2+(30 mod 2))=2 buah,
// tambahan diskon tetap 2%
// 2. Diskon dasar buku novel=(5+(30 mod 4))%=7%;
// tambahan diskon 2%jika novel lebih dari(3+(30 mod 2))=3 buah,
// atau tambahan 1%jika jumlah novel kurang dari atau sama dengan batas tersebut
// 3. Diskon buku selain kamus/novel=(3+(30 mod 4))%=5%;
// berlaku jika jumlah buku jenis tsb lebih dari(3+(30 mod 2))=3 buah

public class Tugas1DiskonBuku30 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String jenisBuku;
        int jmlBuku;
        double diskon, jmlDiskon;
        System.out.print("Jenis buku apa yang anda beli ? (kamus/novel/lainnya): ");
        jenisBuku = input.next();
        System.out.print("Berapa jumlah buku yang anda beli ? : ");
        jmlBuku = input.nextInt();
        if (jenisBuku.toLowerCase().equalsIgnoreCase("kamus")) {
            if (jmlBuku > 2) {
                jmlDiskon = +0.1;
            } else {
                jmlDiskon = +0.08;
            }
        } else if (jenisBuku.toLowerCase().equalsIgnoreCase("novel")) {
            if (jmlBuku > 3) {
                jmlDiskon = +0.09;
            } else {
                jmlDiskon = +0.08;
            }
        } else {
            if (jmlBuku > 3) {
                jmlDiskon = +0.05;
            } else {
                jmlDiskon = 0.0;
            }
        }

        double persenDiskon = jmlDiskon * 100;
        System.out.println("Jumlah diskon anda dengan pembelian :");
        System.out.println("1. Jenis Buku  = " + jenisBuku);
        System.out.println("2. Jumlah Buku = " + jmlBuku);
        System.out.println("Adalah :  " + persenDiskon + "%");
    }
}
