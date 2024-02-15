/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tutorial04exercise2;

/**
 *
 * @author lolbo
 */
public class Student extends Person{
    
    private int idNumber;
    private double fee;
    private int grade;
    
    public Student(String name, int age, String gender, int idNum) {
        super(name, age, gender);
        this.myName = name;
        this.myAge = age;
        this.myGender = gender;
        idNumber = idNum;
    }
    
    public void setIdNumber(int idNum){
        this.idNumber = idNum;
    }
    
    public void setFee(double fee){
        this.fee = fee;
    }
    
    public void setGrade(int grade){
        this.grade = grade;
    }
    
    public int getGrade(){
        return grade;
    }
    
    public double getFee(){
        return fee;
    }
    
    public int getIdNumber(){
        return idNumber;
    }
    
    
}
