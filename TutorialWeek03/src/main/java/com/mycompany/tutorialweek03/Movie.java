/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tutorialweek03;

/**
 *
 * @author lolbo
 */
public class Movie {
    private String title;
    private String category;
    private int numberOfAwards;
    private Director director;
    
    public Movie(String title, String category, Director director){
        this.title = title;
        this.category = category;
        this.director = director;
    }
    
    public String getTitle(){
        return title;
    }
    
    public String getCategory(){
        return category;
    }
    
    public Director getDirector(){
        return director;
    }
    
    public void setNumAwards(int numAwards){
        this.numberOfAwards = numAwards;
    }
    
    public int getNumAwards(){
        return numberOfAwards;
    }
    
    public String toString(){
        return "Movie[Title: " + title + ", Category:" + category +
                "Director Name: " + director.getName() + ", Surname: " + 
                director.getSurname() + ", Awards: " + numberOfAwards + "]";
    }
}
