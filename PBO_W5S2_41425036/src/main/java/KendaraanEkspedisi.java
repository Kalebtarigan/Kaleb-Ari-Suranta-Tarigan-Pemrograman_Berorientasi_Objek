/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ASUS
 */
abstract class KendaraanEkspedisi {
    protected String noPolisi;
    protected int kapasitasKg;
    
    public KendaraanEkspedisi(String noPolisi, int kapasitasKg){
        this.noPolisi = noPolisi;
        this.kapasitasKg = kapasitasKg;
    }
    
    public void infoKendaraan(){
        System.out.println("Plat Nomor: "  + noPolisi + " | Daya Angkut: " + kapasitasKg + "Kg");
    }
    
    public abstract void angkutBarang (String namaBarang);
    }

class TrukBox extends KendaraanEkspedisi {
    public TrukBox(String noPolisi, int kapasitasKg){
        super(noPolisi, kapasitasKg);
    }
    
    @Override
    public void angkutBarang (String namaBarang){
        System.out.println("Trukk [" + noPolisi + "] memuat '" + namaBarang + 
                "' ke dalam kontainer tertutup pendingin.");
    }
}

class MobilVan extends KendaraanEkspedisi{
    public MobilVan(String noPolisi, int kapasitasKg){
        super(noPolisi, kapasitasKg);
    }
    
    @Override
    public void angkutBarang(String namaBarang){
        System.out.println("Mobil Van [" + noPolisi + "] memuat '" + namaBarang +
                "' di bagasi belakang untuk distribusi kota.");
    }
}

public class SimulasiAbstraksi {
    public static void main(String[] args) {
        System.out.println("=== INI ABSTRACT CLASS ===");

        // PERCOBAAN 1: Menguji larangan instansiasi langsung abstract class
        //KendaraanEkspedisi k = new KendaraanEkspedisi("BK 1234 DEL", 100);

        // PERCOBAAN 2: Instansiasi dari subclass konkret
        TrukBox fuso = new TrukBox("B 9081 TXT", 5000);
        fuso.infoKendaraan();
        fuso.angkutBarang("20 Unit Kulkas");

        System.out.println("----------------------------------------");

        MobilVan grandmax = new MobilVan("B 1122 KAA", 800);
        grandmax.infoKendaraan();
        grandmax.angkutBarang("50 Kotak Sepatu");
    }
}

/*
Eksperimen 1:

SimulasiAbstraksi.java:13: error: KendaraanEkspedisi is abstract; cannot be instantiated
Sesuai Kotak Insight Konsep, "Kendaraan Ekspedisi" hanyalah konsep atau blueprint yang bentuk fisiknya belum jelas, seperti dealer yang menolak pesanan "1 unit Kendaraan Ekspedisi". 
Java menolak new pada abstract class karena objek yang dibuat akan punya method angkutBarang() tanpa isi.

Eksperimen 2: MotorKurir extends KendaraanEkspedisi tanpa angkutBarang() menghasilkan:
MotorKurir.java:10: error: MotorKurir is not abstract and does not override abstract method angkutBarang(String) in KendaraanEkspedisi
Dua opsi perbaikan yang biasanya ditawarkan IDE:
Implement all abstract methods: IDE membuatkan kerangka angkutBarang(String) di MotorKurir.
Make class 'MotorKurir' abstract: kelasnya dijadikan abstract, sehingga tidak wajib mengimplementasikan method tersebut, tapi juga tidak bisa di-new.*/

