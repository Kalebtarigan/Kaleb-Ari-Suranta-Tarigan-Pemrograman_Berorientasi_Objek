package PolymorphismDanAbstractClass;

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

abstract class Mantra {
    private String nama;

    public Mantra(String nama) {
        this.nama = nama;
    }

    public String getNama() {
        return nama;
    }

    // Abstract method untuk efek mantra
    public abstract void efek();
}

class Expelliarmus extends Mantra {
    public Expelliarmus() {
        super("Expelliarmus");
    }

    @Override
    public void efek() {
        System.out.println("Melucuti senjata lawan!");
    }
}

class ExpectoPatronum extends Mantra {
    public ExpectoPatronum() {
        super("Expecto Patronum");
    }

    @Override
    public void efek() {
        System.out.println("Memanggil Patronus!");
    }
}

class Lumos extends Mantra {
    public Lumos() {
        super("Lumos");
    }

    @Override
    public void efek() {
        System.out.println("Menerangi ujung tongkat!");
    }
}

class Penyihir {
    private String nama;
    private List<Mantra> mantraList;

    public Penyihir(String nama) {
        this.nama = nama;
        this.mantraList = new ArrayList<>();
    }

    public void belajarMantra(Mantra mantra) {
        mantraList.add(mantra);
        System.out.println(nama + " belajar mantra: " + mantra.getNama());
    }

    public void ucapkanMantra(String namaMantra) {
        for (Mantra mantra : mantraList) {
            if (mantra.getNama().equals(namaMantra)) {
                System.out.println(nama + " mengucapkan: " + mantra.getNama());
                mantra.efek();
                return;
            }
        }
        System.out.println(nama + " belum belajar mantra " + namaMantra);
    }
}

public class DuniaSihir {
    public static void main(String[] args) {
        Penyihir harry = new Penyihir("Harry Potter");
        Mantra expelliarmus = new Expelliarmus();
        Mantra expectoPatronum = new ExpectoPatronum();

        harry.belajarMantra(expelliarmus);
        harry.belajarMantra(expectoPatronum);

        harry.ucapkanMantra("Expelliarmus");
        harry.ucapkanMantra("Expecto Patronum");
        harry.ucapkanMantra("Lumos"); // Harry belum belajar Lumos

        // Tambahkan mantra Lumos dan coba lagi
        Mantra lumos = new Lumos();
        harry.belajarMantra(lumos);
        harry.ucapkanMantra("Lumos");
    }
}

/*
1. ntra (abstract class) menetapkan kontrak bahwa setiap mantra punya efek().
Penyihir menyimpan mantra dalam List<Mantra> dan hanya mengenal tipe Mantra. 
Saat mantra.efek() dipanggil, Java menjalankan efek() milik objek aslinya: 
Expelliarmus mencetak “Melucuti senjata lawan!”, Lumos mencetak “Menerangi ujung tongkat!”, 
dan seterusnya. Jadi abstract class menjamin semua mantra punya efek(), 
dan polymorphism memilih versi yang tepat saat program berjalan.
2. Mudah. Cukup buat class baru yang extends Mantra dan implementasikan efek(),
lalu panggil harry.belajarMantra(new MantraBaru()). Kelas Penyihir tidak perlu 
disentuh karena hanya bergantung pada abstraksi Mantra, bukan pada mantra-mantra konkretnya. 
Ini penerapan prinsip Open/Closed: terbuka untuk perluasan, tertutup untuk modifikasi.
Contohnya Lumos, yang bisa ditambahkan di tengah program tanpa ada perubahan di Penyihir
*/