/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.simple.client.server;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

/**
 *
 * @author lolbo
 */
public class SocketClientExample {
    
    public static void main(String[] args) throws UnknownHostException, IOException, ClassNotFoundException, InterruptedException{
        
        //get the local host IP address, if server is running on some other IPn you need to use that
        
        InetAddress host = InetAddress.getLocalHost();
        
        Socket socket = null;
        ObjectOutputStream oos = null;
        ObjectInputStream ois = null;
        
        for (int i=0; i<5; i++){
            //establish socket connection to the server
            socket = new Socket(host.getHostName(), 9876);
            //write to socket using object outputstream
            oos = new ObjectOutputStream(socket.getOutputStream());
            System.out.println("Sending request tot Socket Server");
            if(i==4){
                oos.writeObject("exit");
                
            } else {
                oos.writeObject("" + i);
                //read the server response message using input stream 
                ois = new ObjectInputStream(socket.getInputStream());
                String message = (String) ois.readObject();
                System.out.println("Message: " + message);
                //close resources
                ois.close();
                oos.close();
            }
        }
        
    }
}
