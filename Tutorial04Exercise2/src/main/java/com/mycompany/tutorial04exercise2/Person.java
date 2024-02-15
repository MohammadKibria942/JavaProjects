/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tutorial04exercise2;

/**
 *
 * @author lolbo
 */
public class Person {

    protected String myName; // name of the person
    protected int myAge; // person’s age
    protected String myGender; // “M” for male, “F” for female

    public Person(String name, int age, String gender) {
        myName = name;
        myAge = age;
        myGender = gender;
    }
    
    public String getName(){
        return myName;
    }
    
    public int getAge(){
        return myAge;
    }
    
    public String gender(){
        return myGender;
    }
    
    public void setName(String name){
        this.myName = name;
    }
    
    public void setAge(int age){
        this.myAge = age;
    }
    
    public void setGender(String gender){
        this.myGender = gender;
    }
    
    public String toString() {
        return myName + ", age: "  + myAge + ", gender: " + myGender;
    }
}
