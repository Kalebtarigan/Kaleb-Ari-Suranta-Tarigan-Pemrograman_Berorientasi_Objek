/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package id.ac.del.rental;

/**
 *
 * @author ASUS
 */

public class MemberDiscount implements Discountable {
    @Override
    public double calculateDiscount(double amount) {
        return amount * 0.10;
    }
}
