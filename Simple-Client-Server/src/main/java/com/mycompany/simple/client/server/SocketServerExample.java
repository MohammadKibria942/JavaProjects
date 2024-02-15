/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.simple.client.server;
import java.io.IOException; 
import java.io.ObjectInputStream; 
import java.io.ObjectOutputStream; 
import java.lang.ClassNotFoundException; 
import java.net.ServerSocket; 
import java.net.Socket;

/**
 *
 * @author lolbo
 */
public class SocketServerExample {
    
    //static ServerSocket variable - TASK 2.a
    private static ServerSocket server;
    //socket server port on which it will listen
    private static int port = 9876;
    
    public static void main(String args[]) throws IOException, ClassNotFoundException{
        //create the socket server object using the port // TASK 2.c
        server = new ServerSocket(port);
        
        //keep listens indefinitely until receives 'exit' call or program terminates.
        
        while(true){
            System.out.println("Waiting for the client request");
            //creating socket and waiting for client connection // TASK 2.e
            Socket socket = server.accept();
            //read from socket to ObjectInputStream object. You will need to replace dots with your codes. Please note, the coding exam follow this structure.
            ObjectInputStream ois = new ObjectInputStream(socket.getInputStream());
            //convert ObjectInputStream object to String
            String message = (String) ois.readObject();
            System.out.println("Message received: " + message);
            //create ObjectOutputStream object
            ObjectOutputStream oos = new ObjectOutputStream(socket.getOutputStream());
            //write object to socket
            oos.writeObject("Hi Client" + message);
            //close resources and socket
            ois.close();
            oos.close();
            socket.close();
            //terminate the server if client sends exit request
            if (message.equalsIgnoreCase("exit")) break;
        }
        System.out.println("Shutting down Socket Server");
        //close the ServerScoket
        server.close();
    }
}
