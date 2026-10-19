/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ASUS
 */
public class OperatorJava {
    public static void main (String [] args){
        // Contoh penggunaan operator 
        int sum = 3 + 4 ;
        int diff = 10 - 3;
        int prod = 7 * 3;
        double q = 20.0 / 3;
        int r = 7 % 3;
        
        int x = 10;
        x += 5;
        
        //Dampak tipe data:
        double d = 10.0/3;
        int i = 10/3
                
        //Pada ekspresi campuran tipe lebih kecil dipromosikan 
         double p = Math.pow(2, 3);
         double s = Math.sqrt(64);
        
        int a = 5; //true 
        
        //Operator: && (AND)|| (OR) ! (NOT)
        boolean ok = (a  == 5); //true 
        boolean r1 = (5 > 3) &&  (7 < 10); //true 
        boolean r2 = (5 < 3) || (7 < 10); //true 
        boolean r3 = !(5 > 3); //false
        
        //Operator: Bitwise
        int and = 5 & 3;
        int or = 5 | 3;
        int xor = 5 ^ 3;
      
    }
}
