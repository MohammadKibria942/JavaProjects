/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.findipurl;

import java.net.Inet4Address;
import java.net.InetAddress;
import java.net.MalformedURLException;
import java.net.UnknownHostException;
import java.net.URL;



/**
 *
 * @author lolbo
 */
public class FindIPURL {

    public static void main(String[] args) throws UnknownHostException {
        //The URL for which IP addreess needs to be fetched
        String s = "https://www.google.com";
        
        //A block for error catching
        try{
            //Fetch IP address by getByName() and getHost()
            InetAddress ip = InetAddress.getByName(new URL(s).getHost());
        
            //Print the Ip address
            System.out.println("Public IP Address of: " + ip);

    } catch (MalformedURLException e){
                //It means the URL is invalid
                System.out.println("Invalid URL");
            }
    }
}
