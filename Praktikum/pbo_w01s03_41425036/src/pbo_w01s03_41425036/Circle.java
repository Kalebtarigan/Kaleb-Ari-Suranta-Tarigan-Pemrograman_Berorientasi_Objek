/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pbo_w01s03_41425036;

/**
 *
 * @author ASUS
 */
// Define the Circle class
public class Circle {   // Save as "Circle.java"
    // Private variables
    public double radius;
    public String color;

    // Constructors (overloaded)
    public Circle() {                       // 1st Constructor
        radius = 1.0;
        color = "red";
    }
    public Circle(double r) {               // 2nd Constructor
        radius = r;
        color = "red";
    }
    public Circle(double r, String c) {     // 3rd Constructor
        radius = r;
        color = c;
    }

    // Public methods
    public double getRadius() {
        return radius;
    }
    public String getColor() {
        return color;
    }
    public double getArea() {
        return radius*radius*Math.PI;
    }
}