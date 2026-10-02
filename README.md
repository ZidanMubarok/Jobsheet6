# Jobsheet 6: Percabangan Bersarang (Nested IF)

Dokumen ini berisi panduan, dasar teori, serta contoh implementasi untuk **Jobsheet 6** mengenai struktur percabangan bertingkat (*Nested IF*).

---

## 📌 Tujuan Praktikum
1. Memahami konsep dan alur logika dari percabangan bersarang (*Nested IF*).
2. Mampu merancang alur keputusan yang memiliki evaluasi kondisi bertingkat.
3. Mengimplementasikan *Nested IF* dalam menyelesaikan kasus pemrograman riil.

---

## 📚 Dasar Teori

### Apa itu Nested IF?
**Nested IF** (Percabangan Bersarang) adalah struktur kontrol di mana sebuah pernyataan `if` berada di dalam blok `if` atau `else` yang lain. 

Struktur ini digunakan ketika suatu kondisi turunan hanya perlu diperiksa **apabila kondisi utama sebelumnya telah terpenuhi (`true`)**.

### Sintaks Umum (C / C++ / Java)

```cpp
if (kondisi_utama) {
    // Dieksekusi jika kondisi_utama bernilai TRUE
    
    if (kondisi_turunan) {
        // Dieksekusi jika kondisi_utama TRUE DAN kondisi_turunan TRUE
    } else {
        // Dieksekusi jika kondisi_utama TRUE TETAPI kondisi_turunan FALSE
    }

} else {
    // Dieksekusi jika kondisi_utama bernilai FALSE
}
