/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tutorialweek03;

/**
 *
 * @author lolbo
 */
public class Director{
    private String name;
    private String surname;
    private int numDirectedMovie;
    private Date dob;
    
    public Director(String name, String surname){
        this.name = name;
        this.surname = surname;
    }
    
    public String getName(){
        return name;
    }
    
    public String getSurname(){
        return surname;
    }
    
    public Date getDoB(){
        return dob;
    }
    
    public int getNumberOfMovie(){
        return numDirectedMovie;
    }
    
    public void setDoB(Date dob){
        this.dob  = dob;
    }
    
    public void setNumberOfMovie(int nMovie){
        numDirectedMovie = nMovie;
    }
    
    @Override
    public String toString(){
        return "[Director Name: " + name + ", Surname: " + surname +
                ", dob" + dob + ", Number of Movies: " + numDirectedMovie + "]";
    }
}
