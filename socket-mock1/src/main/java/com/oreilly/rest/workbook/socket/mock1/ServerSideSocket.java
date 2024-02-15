/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.oreilly.rest.workbook.socket.mock1;

//import resources - 2 marks

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.UnknownHostException;


public class ServerSideSocket { 
  public void run() {
	try {
		int serverPort = 4020;
		//create a Server Socket and pass the serverPort as its parameter - 2 marks
                ServerSocket serverSocket = new ServerSocket(serverPort);
		while(true) {
			
                        //print a message like "Waiting for client on port" + invoking getLocalPort() method using the Server Socket - 2 marks
                        System.out.println("Waiting for client on port" + serverSocket.getLocalPort() + "..."); 

			//Accept the connection request from the client - 2 marks
                        Socket server = serverSocket.accept();
			System.out.println("Just connected to " + server.getRemoteSocketAddress()); 

			//get output stream using the server object - you can use PrintWriter - 2 marks
                        PrintWriter toClient = new PrintWriter(server.getOutputStream(),true);
			
                        //get input stream using the server object - you can use BufferReader - 3 marks
                        BufferedReader fromClient =new BufferedReader(new InputStreamReader(server.getInputStream()));
			String line = fromClient.readLine();
			System.out.println("Server received: " + line); 
			toClient.println("Thank you for connecting to " + server.getLocalSocketAddress() + "\nGoodbye!"); 
		}
	}
	//cattch an exception for an unknown host - 1 mark
        catch(UnknownHostException ex) {
		ex.printStackTrace();
	}
	//catch an exception for input/output operations - 1 mark
        catch(IOException e){
		e.printStackTrace();
	}
  }
	
  public static void main(String[] args) {
		
                //create a new instance of the class and then invoke the method inside it - 2 marks
                ServerSideSocket srv = new ServerSideSocket();
		srv.run();
  }
}