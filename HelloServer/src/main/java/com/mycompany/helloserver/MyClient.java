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
public class MyClient {
    
    public static void main (String[] args){
        
        try{
            //Create a socket with two parameters; hostname and port number
            Socket s = new Socket("localhost", 6666);
            
            //Output stream to sendout the message to the server
            DataOutputStream dout = new DataOutputStream(s.getOutputStream());
            
            //Writes a string to the underlying output stream using modified UTF-8 encoding
            dout.writeUTF("Hello server");
            
            //Flush the characters from the buffered writer stream
            dout.flush();
            
            dout.close();
            //close the connecteion
            s.close();
            
        } catch (Exception e){
            System.out.println(e);
        }
    }
}
