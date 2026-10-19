/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pbo_w01s03_41425036;

/**
 *
 * @author ASUS
 */
// Test driver program for the Circle class
public class TestCircle {   // Save as "TestCircle.java"
    public static void main(String[] args) {   // Execution entry point
        // Construct an instance of the Circle class called c1
        Circle c1 = new Circle(2.0, "blue");// Use 3rd constructor
        c1.radius = 10.0;
        System.out.println("Radius is " + c1.getRadius()   // use dot operator to invoke member methods
            + " Color is " + c1.getColor()
            + " Area is " + c1.getArea());

        // Construct another instance of the Circle class called c2
        Circle c2 = new Circle(2.0);           // Use 2nd constructor
        System.out.println("Radius is " + c2.getRadius()
            + " Color is " + c2.getColor()
            + " Area is " + c2.getArea());

        // Construct yet another instance of the Circle class called c3
        Circle c3 = new Circle();              // Use 1st constructor
        System.out.println("Radius is " + c3.getRadius()
            + " Color is " + c3.getColor()
            + " Area is " + c3.getArea());
    }
    c1.Radius=10;
}