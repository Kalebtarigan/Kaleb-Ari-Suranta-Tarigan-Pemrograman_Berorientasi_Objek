/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package id.ac.del.test;

import id.ac.del.rental.CorporateDiscount;
import id.ac.del.rental.Discountable;
import id.ac.del.rental.FlashSaleDiscount;
import id.ac.del.rental.MemberDiscount;
import id.ac.del.rental.VehicleRental;

/**
 *
 * @author ASUS
 */

public class TestRental {
    public static void main(String[] args) {
        // Membuat instance dengan attribut yang sudah ditentukan dalam class
        VehicleRental v = new VehicleRental("BK 1234 DEL", 250000);

        //Megubah nomor plate dan hari rental
        // Data tidak valid sekarang ditolak oleh setter
        v.setPlateNumber("");     // ditolak: plat kosong
        v.setRentalDays(-7);      // ditolak: hari negatif

        // Data valid
        v.setRentalDays(7);

        // Tipe referensi adalah interface, objeknya bisa diganti-ganti (polimorfisme)
        Discountable member = new MemberDiscount();
        
        Discountable flash = new FlashSaleDiscount();
        Discountable corporate = new CorporateDiscount();

        System.out.println("Tanpa diskon   : Rp" + v.getTotalCost(null));
        System.out.println("Member (10%)   : Rp" + v.getTotalCost(member));
        System.out.println("Flash Sale(25%): Rp" + v.getTotalCost(flash));
        System.out.println("Corporate (15%): Rp" + v.getTotalCost(corporate));
    }
}

/*SOAL*/

/*
Nama          : Kaleb Ari Suranta Tarigan
NIM           : 41425036
Program Studi : D-IV Teknologi Rekayasa Perangkat Lunak*/
/*
1) Analisis kompilasi dan hak akses
   i) Yang error compile: Baris B dan Baris C.
      - Baris A (plateNumber, public)           : lolos, public bisa diakses dari package mana pun.
      - Baris B (rentalRatePerDay, protected)   : ERROR. protected cuma bisa diakses dari package yang sama
                                                  atau dari subclass. TestRental ada di id.ac.del.test dan
                                                  bukan subclass VehicleRental.
      - Baris C (discountRate, tanpa modifier)  : ERROR. tanpa modifier (default) cuma bisa diakses dari
                                                  package yang sama (id.ac.del.rental).
      - Baris D (setRentalDays, public method)  : lolos, method-nya public.
      - rentalDays (private) cuma bisa diakses dari dalam class VehicleRental sendiri.

2. Kelemahan integritas data
   i) setRentalDays cuma ngisi nilai tanpa dicek, jadi -7 atau 0 tetap masuk. Walaupun atributnya private
      dan lewat setter, tanpa validasi itu sama aja kayak public. Baris A juga bolong karena plateNumber
      public, jadi plat kosong ("") bisa dimasukin dari luar.
  ii) Total biaya bisa minus karena rentalDays bisa minus (250000 x -7 = -1.750.000). Tarif per hari
      dan discountRate juga bisa diisi nilai gak masuk akal (tarif minus, diskon lebih dari 100%).
      Perbaikan: semua atribut dijadikan private, tambah getter, validasi di constructor dan setter
      (plat gak boleh kosong, tarif > 0, lama sewa minimal 1 hari), dan di getTotalCost potongan dijaga
      supaya gak minus dan gak melebihi subtotal. Kode lengkapnya ada di package id.ac.del.rental.

3. Penerapan interface
   i) Interface Discountable punya satu method: double calculateDiscount(double amount).
      Dibikin 3 class: MemberDiscount (10%), FlashSaleDiscount (25%, maks Rp150.000), CorporateDiscount (15%).
  ii) getTotalCost(Discountable discount) di VehicleRental menghitung subtotal, lalu minta objek diskon
      yang dikirim dari TestRental buat ngitung potongan. VehicleRental gak perlu tahu jenis diskonnya,
      jadi nambah jenis diskon baru gak perlu ngubah VehicleRental.

*/