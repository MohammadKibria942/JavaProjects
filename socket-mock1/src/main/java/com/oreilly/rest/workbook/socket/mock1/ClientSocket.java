/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.oreilly.rest.workbook.socket.mock1;

//import resources - 2 marks
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;
import java.net.URL;


public class ClientSocket {
  public void run() {
	try {
		int serverPort = 4020;
		//get the address of the local host - 2 marks
                InetAddress host = InetAddress.getLocalHost(); 
		
                //print the server port number - 1 marks
                System.out.println(serverPort); 

		
                //create Socket including host and serverPort - 2 marks
                Socket socket = new Socket(host, serverPort); 
		
		System.out.println("Just connected to " + socket.getRemoteSocketAddress()); 
		
                //use print writer to get the output stream using the socket - 3 marks
                PrintWriter toServer = new PrintWriter(socket.getOutputStream(),true);
		
                //use the buffer reader to the input stream using the socket - 3 marks
                BufferedReader fromServer = new BufferedReader(new InputStreamReader(socket.getInputStream()));
		toServer.println("Hello from " + socket.getLocalSocketAddress()); 
		String line = fromServer.readLine();
		System.out.println("Client received: " + line + " from Server");
		
                //close all resources and the connection - 3 marks
                fromServer.close();
		toServer.close();
		socket.close();
	}
	//catching unknown host exception - 1 mark
        catch(UnknownHostException ex) {
            
		ex.printStackTrace();
	}
	//catch input/output exception - 1 mark
        catch(IOException e){
		e.printStackTrace();
	}
  }
	
  public static void main(String[] args) {
		
        //create a new instance of the ClientSocket class and invoke run() method - 3 marks     
        ClientSocket client = new ClientSocket();
        client.run();
  }
}