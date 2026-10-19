/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ASUS
 */
public class VariabelTipeData {
    int speed = 60;
    static int jumlahMahasiswa = 30;
    public void setNama(String nama){
     this.nama = nama;
    }
    
    public void hitung () {
        int count = 0;
        System.out.println("Local count: " + count);
    }
    
    public static void main(String [] args){
        int umur = 20;
        double gaji = 3500000.50;
        boolean lulus = true;
        String nama = "Budi";
        
        System.out.println("Nama: " + nama);
        System.out.println("Umur: " + umur);
        System.out.println("gaji: " + gaji);
        System.out.println("Lulus: " + lulus);
        System.out.println("Jumlah Mahasiswa (static): " + jumlahMahasiswa);
        
        String namaMahasiswa = "Budi";
        String s1 = "Hello";
        String s2 = new String("Java");
        
        int[] arr = {1, 2, 3};
        double [] arr2 = {1.2, 2.2};     
    }
}

class Demo {
    int a, b;
    Demo(int a, int b) {
        this.a = a;
        this.b = b;}
    int addition(){
        return a + b;
    }
}

interface Operasi {
    int tambah(int a, int b);
}

class Kalkulator implements Operasi{
public int tambah(int a, int b){
return a + b;
}

