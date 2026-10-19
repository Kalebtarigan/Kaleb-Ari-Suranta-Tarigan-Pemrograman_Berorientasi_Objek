/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ASUS
 */

class MesinTarif {
    private String kotaAsal;
    
    public MesinTarif (String kotaAsal){
        this.kotaAsal = kotaAsal;
    }
    
    public double hitungOngkir(double beratKg){
        return beratKg * 10000;
    }
    
    public double hitungOngkir(double beratkg, double nilaiBarang){
        double biayaAsuransi =  nilaiBarang * 0,01;
        return (beratKg * 10000) + biayaAsuransi;
    }
    
    public double  hitungOngkir(double beratKg, boolean isExpress){
        double total =  beratKg * 10000;
        if (isExpress){
            total += 20000;
        }
        return total;
    }
}
public class SimulasiOverloading {
    public static void main(String[] args) {
        MesinTarif tarif = new MesinTarif("Medan");
        
        System.out.println("=== INI  METHOD OVERLOADING ===");
        System.out.println("Ongkir Biasa (2.0 Kg)          : Rp " + tarif.hitungOngkir(2.0));
        System.out.println("Ongkir + Asuransi (Barang sJt) : Rp " + tarif.hitungOngkir(2.0, 5000000.0));
        System.out.println("Ongkir Express (2.0 Kg)        : Rp " + tarif.hitungOngkir(2.0, true));
    }
    
}

/* 
1. Compiler memeriksa signature method, yaitu nama method, jumlah parameter, dan tipe parameter. 
Pada hitungOngkir(2.0), hitungOngkir(2.0, 5000000.0), dan hitungOngkir(2.0, true), daftar argumennya sudah pasti dari kode sumber (double; double, double; double, boolean).
Jadi compiler bisa memilih method yang cocok sebelum program berjalan.
2. Return type bukan bagian dari signature. Method baru itu punya nama dan parameter yang sama persis dengan double hitungOngkir(double). Saat dipanggil hitungOngkir(2.0), compiler tidak bisa menentukan mana yang dimaksud, sehingga dianggap duplikat.
*/
