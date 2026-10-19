/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package B.Latihan1B;

import B.Latihan1B.StudentGrade;

/**
 *
 * @author ASUS
 */

public class Main {
    public static void main(String[] args) {
        // Membuat data mahasiswa (NIM dan Nama tidak bisa diubah lagi)
        StudentGrade mhs = new StudentGrade("41425036", "Kaleb Tarigan");

        mhs.setNilaiKuis(110.0); // ditolak, di luar rentang
        mhs.setNilaiKuis(85.0);  // diterima
        mhs.setNilaiUTS(90.0);   // diterima

        mhs.cetakLaporan();      // cetak kartu hasil studi
    }
}
