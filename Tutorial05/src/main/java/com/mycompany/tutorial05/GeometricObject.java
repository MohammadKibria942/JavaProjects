/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tutorial05;

/**
 *
 * @author lolbo
 */
public abstract class GeometricObject {
    
    protected boolean filled;
    protected String colour;
    
    public GeometricObject(boolean filled, String colour){
        this.filled = filled;
        this.colour = colour;
    }
    
    public void setColour(String colour){
        this.colour = colour;
    }
    
    public String getColour(){
        return colour;
    }
    
}
