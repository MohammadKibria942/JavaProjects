/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tutorialweek03;

/**
 *
 * @author lolbo
 */
public class Date {
    private int day;
    private int month;
    private int year;
    
    public Date(int day, int month, int year){
        this.day = day;
        this.month = month;
        this.year = year;
    }
    
    public void setDay(int day){
        this.day = day;
    }
    
    public void setMonth(int month){
        this.month = month;
    }
    
    public void setYear(int year){
        this.year = year;
    }
    
    public void setDate(int day, int month, int year){
        
    }
    
    public int getDay(){
        return day;
    }
    
    public int getMonth(){
        return month;
    }
    
    public int getYear(){
        return year;
    }
    
    public String getDate(){
        return String.format("%02d/%02d/%04d", day, month, year);
    }
    
    public String toString(){
        return "Date [day = " + day + ", month = " + month + ", year = " + year + "]";
    }
}
