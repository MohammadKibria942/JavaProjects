/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.helloserver;

import java.io.*;
import java.net.*;

/**
 *
 * @author lolbo
 */
public class MyServer {
    
    public static void main(String[] args){
        
        try{
            //Create a server socket using port number 6666
            ServerSocket ss = new ServerSocket(6666);
            Socket s = ss.accept();//establishes connection
            
            //create inputstream to get the message for the client as an input
            
            DataInputStream dis = new DataInputStream(s.getInputStream());
            
            String str = (String) dis.readUTF();
            System.out.println("message= " + str);
            
            //close server connection
            ss.close();
        } catch (Exception e){ 
            System.out.println(e);
        }
    }
}
