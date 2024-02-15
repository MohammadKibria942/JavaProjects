/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tutorial04;

/**
 *
 * @author lolbo
 */
public class Cylinder extends Circle{

    private double height; // Constructor with default color, radius and height


    public Cylinder() {
        super();
        height = 1.0;
    }
// Constructor with default radius, color but given height

    public Cylinder(double height) {
        super();
        this.height = height;
    }
// Constructor with default color, but given radius, height

    public Cylinder(double radius, double height) {
        super(radius);
        this.height = height;
    }
// A public method for retrieving the height

    public double getHeight() {
        return height;
    }
// A public method for computing the volume of cylinder
// use superclass method getArea() to get the base area

    public double getVolume() {
        double volume = getArea() * height;
        return volume;
    }
    
    @Override
    public double getArea(){
       double volume = 2 * Math.PI * this.getRadius() * height + 2 * super.getArea();
       return volume;
   }
}
