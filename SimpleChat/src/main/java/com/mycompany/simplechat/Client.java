/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.simplechat;

import java.io.IOException;
import java.io.InputStream;
import java.io.PrintStream;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

/**
 *
 * @author lolbo
 */
public class Client {
    // create private instance variables
    private String host;
    private int port;
    private String nickname;
    
    //create class constructors
    public Client(String host, int port){
        this.host = host;
        this.port = port;
    }
    
    //create a method called run as follows
    
    public void run() throws UnknownHostException, IOException{
        //create a socket to connect client to server and print a message to say sucesfullyt connected
        Socket client = new Socket(host, port);
        System.out.println("Successfully connected to Server");
        
        //create a new thread for server messages handling
        new Thread(new ReceivedMessagesHandler(client.getInputStream())).start();
        
        //create a scanner and ask for a nickname
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a nickname");
        nickname = sc.nextLine();
        
        //read messages from keyboard and send to server using PrintStream. You need to specify, while the user continue to discuss the connection is held. Other wise, close the PrintStream and scanner and finally the connection
        System.out.println("Send Messages: ");
        PrintStream output = new PrintStream(client.getOutputStream());
        while(sc.hasNextLine()){
            output.println(nickname + ": " + sc.nextLine());
        }
        
        output.close();
        sc.close();
        client.close();
    }
}

class ReceivedMessagesHandler implements Runnable{
    
    private InputStream server;
    
    public ReceivedMessagesHandler(InputStream server){
        this.server = server;
    }

    @Override
    public void run() {
        //recieve server messagfes and print out to screen
        Scanner s = new Scanner(server);
        while(s.hasNextLine()){
            System.out.println(s.nextLine());
        }
        s.close();
    }
}
