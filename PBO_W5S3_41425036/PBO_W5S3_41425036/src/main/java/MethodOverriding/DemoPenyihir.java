package MethodOverriding;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ASUS
 */

/*
Nama          : Kaleb Ari Suranta Tarigan
NIM           : 41425036
Program Studi : D-IV Teknologi Rekayasa Perangkat Lunak*/

import java.util.*;

class Penyihir {
    public void ucapkanMantra() {
        System.out.println("Mengucapkan mantra dengan cara biasa.");
    }
}

class HarryPotter extends Penyihir {
    @Override
    public void ucapkanMantra() {
        System.out.println("Harry Potter mengucapkan mantra dengan tongkatnya yang unik.");
    }
}

class Hermione extends Penyihir {
    @Override
    public void ucapkanMantra() {
        System.out.println("Hermione mengucapkan mantra dengan tepat dan percaya diri.");
    }
}

public class DemoPenyihir {
    public static void main(String[] args) {
        Penyihir penyihir1 = new HarryPotter();
        Penyihir penyihir2 = new Hermione();

        penyihir1.ucapkanMantra(); // Output: Harry Potter mengucapkan mantra dengan tongkatnya yang unik.
        penyihir2.ucapkanMantra(); // Output: Hermione mengucapkan mantra dengan tepat dan percaya diri.
    }
}

/*
1. Kode tetap berjalan, dan overriding tetap terjadi selama signature-nya sama persis dengan method di superclass
Jika tanpa override java menganggapnya method baru. Saat dipanggil lewat referensi
Penyihir, yang jalan tetap versi induk tanpa error
2.Beberapa keuntungannya, yakni :
1. tipe referensi Penyihir bisa menunjuk ke HarryPotter, Hermione, atau RonWeasley. Method yang dijalankan mengikuti 
objek aslinya saat runtime (dynamic dispatch).
2. Penyihir baru bisa ditambah tanpa mengubah kode yang memanggilnya.
3. Kode pemanggil jadi seragam: tidak perlu if/switch untuk mengecek jenis penyihir. */