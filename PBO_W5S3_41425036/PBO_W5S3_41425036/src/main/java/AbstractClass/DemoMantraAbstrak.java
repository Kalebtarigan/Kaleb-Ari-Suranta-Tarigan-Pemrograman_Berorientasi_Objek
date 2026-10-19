/*
Nama          : Kaleb Ari Suranta Tarigan
NIM           : 41425036
Program Studi : D-IV Teknologi Rekayasa Perangkat Lunak*/


package AbstractClass;

import java.util.*;

abstract class MantraAbstrak {
    private String nama;

    public MantraAbstrak(String nama) {
        this.nama = nama;
    }

    // Abstract method: harus diimplementasikan oleh subclass
    public abstract void efek();

    // Method konkret
    public void ucapkan() {
        System.out.println("Mengucapkan mantra: " + nama);
    }
}

class Expelliarmus extends MantraAbstrak {
    public Expelliarmus() {
        super("Expelliarmus");
    }

    @Override
    public void efek() {
        System.out.println("Efek: Melucuti senjata lawan.");
    }
}

class ExpectoPatronum extends MantraAbstrak {
    public ExpectoPatronum() {
        super("Expecto Patronum");
    }

    @Override
    public void efek() {
        System.out.println("Efek: Memanggil Patronus untuk melawan Dementor.");
    }
}

public class DemoMantraAbstrak {
    public static void main(String[] args) {
        MantraAbstrak mantra1 = new Expelliarmus();
        MantraAbstrak mantra2 = new ExpectoPatronum();

        mantra1.ucapkan();
        mantra1.efek();

        mantra2.ucapkan();
        mantra2.efek();
    }
}

/*
1.Maka akan menghasilkan error. Abstract class punya method abstrak (efek()) yang belum punya isi, jadi objeknya belum lengkap dan tidak boleh dibuat. 
Yang bisa dibuat hanya subclass konkret yang sudah mengimplementasikan efek(), seperti Expelliarmus, ExpectoPatronum, dan Lumos
2. Keuntungannya ialah :
1. Kontrak wajib: semua subclass harus mengimplementasikan efek(). Kalau lupa, compiler menolak.
2. Kode bersama: atribut nama dan method konkret ucapkan() cukup ditulis sekali di induk, tidak diulang di tiap mantra.
3. Mendukung polymorphism: semua mantra bisa diperlakukan sebagai MantraAbstrak.
4. Mencegah objek yang tidak masuk akal: “mantra” secara umum tidak punya efek spesifik, jadi memang tidak boleh dibuat objeknya.
*/