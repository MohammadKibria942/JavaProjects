/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tutorialweek02;

/**
 *
 * @author lolbo
 */
public class Person {
    
    private String name;
    private String surname;
    private int age;
    
//    Constructor - Create a new instance of Person
    public Person(String n){
        name = n;
    }
    
    public void setSurname(String s){
        surname = s;
    }
    
    public void setAge(int a){
        age = a;
    }
    
    // display the name
    public void displayName(){
        System.out.println(name);
    }
    
    public String getSurname(){
        return surname;
    }
    
    public int getAge(){
        return age;
    }
    
}
