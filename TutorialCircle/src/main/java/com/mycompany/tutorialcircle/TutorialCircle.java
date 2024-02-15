/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.tutorialcircle;

/**
 *
 * @author lolbo
 */
public class TutorialCircle {

    public static void main(String[] args) {
        Circle circle1 = new Circle();

        System.out.println("The circle has a radius of " + circle1.getRadius() + " and the area of "
                + circle1.getArea());

        
        Circle circle2 = new Circle(8);
        System.out.println("The circle has a radius of " + circle2.getRadius() + " and the area of "
                + circle2.getArea());
        
        
        Circle circle3 = new Circle(10, "Green");
        System.out.println("The circle has a radius of " + circle3.getRadius() + " and the area of "
                + circle3.getArea() + " the colour is "  + circle3.getColour());
    }
}
