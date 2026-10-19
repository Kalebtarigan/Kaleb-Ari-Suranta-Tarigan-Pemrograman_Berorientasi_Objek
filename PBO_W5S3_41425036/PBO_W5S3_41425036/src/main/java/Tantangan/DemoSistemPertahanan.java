package Tantangan;

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

import java.util.ArrayList;
import java.util.List;

// 1. Abstract Class MantraPerhitungan
abstract class MantraPerlindungan {
    private String namaMantra;

    public MantraPerlindungan(String namaMantra) {
        this.namaMantra = namaMantra;
    }

    public String getNamaMantra() {
        return namaMantra;
    }

    // Method abstrak
    public abstract void aktifkan();
    public abstract void nonaktifkan();
}

// 2. Kelas Konkret: Protego
class Protego extends MantraPerlindungan {
    public Protego() {
        super("Protego");
    }

    @Override
    public void aktifkan() {
        System.out.println("Perisai Protego terbentuk!");
    }

    @Override
    public void nonaktifkan() {
        System.out.println("Perisai Protego menghilang.");
    }
}

// Kelas Konkret: Fidelius
class Fidelius extends MantraPerlindungan {
    private String secretKeeper;

    public Fidelius(String secretKeeper) {
        super("Fidelius");
        this.secretKeeper = secretKeeper;
    }

    @Override
    public void aktifkan() {
        System.out.println("Mantra Fidelius diaktifkan! Secret Keeper: " + secretKeeper);
    }

    @Override
    public void nonaktifkan() {
        System.out.println("Mantra Fidelius dinonaktifkan.");
    }
}

// Kelas Konkret: MantraAntiApparition
class MantraAntiApparition extends MantraPerlindungan {
    private String area;

    public MantraAntiApparition(String area) {
        super("Anti-Apparition");
        this.area = area;
    }

    @Override
    public void aktifkan() {
        System.out.println("Mantra Anti-Apparition aktif! Mencegah apparition di area " + area + ".");
    }

    @Override
    public void nonaktifkan() {
        System.out.println("Mantra Anti-Apparition di area " + area + " dinonaktifkan.");
    }
}

// 3. Kelas SistemPertahanan
class SistemPertahanan {
    private List<MantraPerlindungan> daftarMantra;

    public SistemPertahanan() {
        this.daftarMantra = new ArrayList<>();
    }

    public void tambahMantra(MantraPerlindungan mantra) {
        daftarMantra.add(mantra);
        System.out.println("Mantra " + mantra.getNamaMantra() + " berhasil ditambahkan ke Sistem Pertahanan.");
    }

    public void aktifkanSemuaMantra() {
        System.out.println("\n=== MENGAKTIFKAN SEMUA MANTRA PERLINDUNGAN ===");
        for (MantraPerlindungan mantra : daftarMantra) {
            mantra.aktifkan();
        }
    }

    public void nonaktifkanSemuaMantra() {
        System.out.println("\n=== MENONAKTIFKAN SEMUA MANTRA PERLINDUNGAN ===");
        for (MantraPerlindungan mantra : daftarMantra) {
            mantra.nonaktifkan();
        }
    }
}

// 4. Kelas Utama Demo / Driver Class
public class DemoSistemPertahanan {
    public static void main(String[] args) {
        // Inisialisasi Sistem Pertahanan
        SistemPertahanan hogwartsDefense = new SistemPertahanan();

        // Membuat objek mantra
        MantraPerlindungan protego = new Protego();
        MantraPerlindungan fidelius = new Fidelius("Albus Dumbledore");
        MantraPerlindungan antiApparition = new MantraAntiApparition("Seluruh Area Hogwarts");

        // Menambahkan mantra ke sistem pertahanan
        hogwartsDefense.tambahMantra(protego);
        hogwartsDefense.tambahMantra(fidelius);
        hogwartsDefense.tambahMantra(antiApparition);

        // Demonstrasi mengaktifkan dan menonaktifkan semua mantra
        hogwartsDefense.aktifkanSemuaMantra();
        hogwartsDefense.nonaktifkanSemuaMantra();
    }
}