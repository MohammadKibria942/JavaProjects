/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.simplechat;

import java.io.IOException;
import java.io.InputStream;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.util.ArrayList;
import java.util.List;
import java.net.InetAddress;
import java.net.Socket;
import java.util.Scanner;

/**
 *
 * @author lolbo
 */
public class Server {
    //create instance variables
    private int port;
    private List<PrintStream> clients;
    private ServerSocket server;
    
    public static void main(String[] args) throws IOException{
        new Server(12345).run();
    }
    
    public Server(int port){
        this.port = port;
        this.clients = new ArrayList<PrintStream>();
    }
    
    public void run() throws IOException{
        server = new ServerSocket(port){
            protected void finalize() throws IOException{
                this.close();
            }
        };
        System.out.println("Port 12345 is now open");
        
        while(true){
            //accept client connection and get the host address
            Socket client = server.accept();
            System.out.println("Connection established with client" + client.getInetAddress().getHostAddress());
            
            //add client message to he list using prinstream
            this.clients.add(new PrintStream(client.getOutputStream()));
            
            //create a new thread for client handling
            new Thread(new ClientHandler(this, client.getInputStream())).start();
        }
    }
    
    void broadcastMessages(String msg){
        for(PrintStream client : this.clients){
            client.println(msg);
        }
    }
}
//Create ClassHandler class inside the Server class to implement Runnable. Then, create two private variables called server(Using type Server), and client(Using type InputStream). Finally, create a constructor.

class ClientHandler implements Runnable {

	private Server server;
	private InputStream client;

	public ClientHandler(Server server, InputStream client) {
		this.server = server;
		this.client = client;
	}

    @Override
    public void run() {
       String message;
		
		// when there is a new message, broadcast to all
		Scanner sc = new Scanner(this.client);
		while (sc.hasNextLine()) {
			message = sc.nextLine();
			server.broadcastMessages(message);
		}
		//Close the connection // TASK-3.6
                sc.close();
	}
        
}

