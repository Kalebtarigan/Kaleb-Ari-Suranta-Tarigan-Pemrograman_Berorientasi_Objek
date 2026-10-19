/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package id.ac.del.rental;

/**
 *
 * @author ASUS
 */
public interface Discountable {
    // Mengembalikan NOMINAL potongan (bukan harga akhir)
    double calculateDiscount(double amount);
}