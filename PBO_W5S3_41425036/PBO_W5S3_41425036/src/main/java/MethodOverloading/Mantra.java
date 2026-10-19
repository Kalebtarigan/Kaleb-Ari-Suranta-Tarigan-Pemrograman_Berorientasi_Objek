package MethodOverloading;

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

public class Mantra {
    // Method ucapkan() dengan satu parameter
    public void ucapkan(String namaMantra) {
        System.out.println("Mengucapkan mantra: " + namaMantra);
    }
    
    // Overload: method ucapkan() dengan dua parameter
    public void ucapkan(String namaMantra, int kekuatan) {
        System.out.println("Mengucapkan mantra " + namaMantra + " dengan kekuatan " + kekuatan);
        if (kekuatan > 10) {
            System.out.println("Efek: Lawan terlempar!");
        } else {
            System.out.println("Efek: Senjata terlepas.");
        }
    }
    
    // Overload: method ucapkan() dengan tiga parameter
    public void ucapkan(String namaMantra, int kekuatan, String target) {
        // Perbaikan: Spasi ganda dihapus
        System.out.println("Mengucapkan mantra: " + namaMantra + " dengan kekuatan " + kekuatan + " pada " + target);
        if (kekuatan > 10) {
            // Perbaikan: Ditambahkan titik dua dan spasi setelah Efek
            System.out.println("Efek: " + target + " terlempar!");
        } else {
            System.out.println("Efek: Senjata " + target + " terlepas.");
        }
    }
    
    public static void main(String[] args) {
        Mantra mantra = new Mantra();
        mantra.ucapkan("Expelliarmus");
        mantra.ucapkan("Expelliarmus", 5);
        mantra.ucapkan("Expelliarmus", 15, "Voldemort");
    }
}

/*Pertanyaan*/
/*
1. Pemanggilan mantra.ucapkan("Expelliarmus", 5); jadi error karena Setelah method (String, int) dihapus, tidak ada overload yang cocok dengan argumen ("Expelliarmus", 5). Method overload lain tetap berjalan normal.
2. Bisa. Signature (int, String) berbeda dari (String, int), jadi dianggap method yang berbeda dan kode tetap lolos kompilasi. Perbedaan yang sah harus ada di daftar tipe parameter: jumlah, tipe, atau urutan.
Hanya mengganti nama parameter atau return type tidak cukup, dan itu akan jadi error “already defined”
*/