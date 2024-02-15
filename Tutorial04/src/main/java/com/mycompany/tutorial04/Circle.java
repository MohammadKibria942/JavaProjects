/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tutorial04;

/**
 *
 * @author lolbo
 */
public class Circle {

    //private instance varaibles, not accessible from outside the class
    private String colour;
    private double radius;

    //default constructor with no arguments
    public Circle() {
        radius = 1;
        colour = "Blue";
    }

    //second constructor takes as argument the radius but has default colour
    public Circle(double r) {
        radius = r;
        colour = "Blue";
    }
    
    //thrid constructor
    public Circle(double a, String c){
        radius = a;
        colour = c;
    }
    
    //public method to retrieve the radius
    public double getRadius() {
        return radius;
    }

    //public method to retrieve the area
    public double getArea() {
        return radius * radius * Math.PI;
    }
    
    public String getColour(){
        return colour;
    }
}