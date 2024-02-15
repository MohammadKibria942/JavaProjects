/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.simpletesttwo;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author lolbo
 */
public class SimpleClient {
    
    SimpleCalculatorServer server = new SimpleCalculatorServer();

    public static void main(String[] args) {
        SimpleClient simpleClient = new SimpleClient();
        simpleClient.executeTest();
    }
    
    private void executeTest(){
        System.out.println("[CLIENT] - Testing is the server is connected...");
        
        if(server.isServerConnected()){
            System.out.println("[CLIENT] - The server is connected, the test can proceed...");
            
            
            
            int x = 2;
            int y = 3;
            
            System.out.println("[CLIENT] - Asking the server what is the sum of " + x + " and " + y);
            
            int z = server.addIntegerNumbers(x,y);
            
            System.out.println("[CLIENT] - The server has replied that the sum of " + x + " and " + y + " is " + z);
            
            if(z == x+y){
                System.out.println("[CLIENT] - The server has returned the correct answer");
            }
            else{
                System.out.println("[CLIENT] - The server has returned the WRONG answer");
            }
            
            
            
            
            
            
            
            x = 4;
            y = 3;
            
            System.out.println("[CLIENT] - Asking the server what is the ratio of " + x + " and " + y);
            
            try{
                
                System.out.println("[CLIENT] - The server says that " + x + " / " + y + " is " + server.divideIntegerNumbers(x,y));
                z = server.divideIntegerNumbers(x, y);
                
            } catch (Exception ex){
                
                System.out.println("[CLIENT] - Exception caught!");
                Logger.getLogger(SimpleClient.class.getName()).log(Level.SEVERE, null, ex);
                
            }
            
            System.out.println("[CLIENT] - The server has replied that the ratio of " + x + " and " + y + " is " + z);
            
            if(z==x/y){
                System.out.println("[CLIENT] - The server has returned the correct answer");
            }
            else{
                System.out.println("[CLIENT] - The server has returned the WRONG answer");
            }
            
            
            
            
            
            
            x = 10;
            y = 5;
            
            System.out.println("[CLIENT] - Asking the server what is " + x + " - " + y);
            
            z = server.subtractIntegerNumbers(x,y);
            
            System.out.println("[CLIENT] - The server has replied that " + x + " - " + y + " is " + z);
            
            if(z == x-y){
                System.out.println("[CLIENT] - The server has returned the correct answer");
            }
            else{
                System.out.println("[CLIENT] - The server has returned the WRONG answer");
            }
            
            
            
            
            
            
            
            
            
            
            
            x = 9;
            y = 4;
            
            System.out.println("[CLIENT] - Asking the server what is " + x + " x " + y);
            
            z = server.multiplyIntegerNumbers(x,y);
            
            System.out.println("[CLIENT] - The server has replied that " + x + " x " + y + " is " + z);
            
            if(z == x*y){
                System.out.println("[CLIENT] - The server has returned the correct answer");
            }
            else{
                System.out.println("[CLIENT] - The server has returned the WRONG answer");
            }
            
            
            
        }
        else{
            System.out.println("[CLIENT] - The server is NOT connected, the test has failed.");
        }
        
    }
}
