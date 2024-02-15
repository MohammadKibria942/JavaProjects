/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.simpletesttwo;

/**
 *
 * @author lolbo
 */
public class SimpleCalculatorServer {
    
    public boolean isServerConnected(){
        System.out.println("[SERVER] - Connection is being tested...");
        
        return true;
    }
    
    public int addIntegerNumbers(int a, int b){
        System.out.println("[SERVER - Adding " + a + " and " + b);
        return a+b;
    }
    
    public int divideIntegerNumbers(int a, int b) throws Exception{
        
        if (b ==0){
            throw new Exception();
        }
        
        if (b==0 && a ==0){
            throw new Exception();
        }
        System.out.println("[SERVER - Dividing " + a + " and " + b);
        return a/b;
        
//        Task 23
//        return (double) a / (double) b;
//        
    }
    
    public int subtractIntegerNumbers(int a, int b){
        System.out.println("[SERVER - Subtracting " + a + " from " + b);
        return a-b;
    }
    
    public int multiplyIntegerNumbers(int a, int b){
        System.out.println("[SERVER - Multiplying " + a + " and " + b);
        return a*b;
    }
}
