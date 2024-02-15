/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.macaddressfinder;

import java.net.NetworkInterface;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.Enumeration;
import java.net.InetAddress;

/**
 *
 * @author lolbo
 */
public class PhysicalAddress {

    static String format = "%02x";//To get 2 cahr output

    private static String[] getPhysicalAddress() throws Exception {

        try {
            Set<String> macs = new LinkedHashSet<String>();

            Enumeration<NetworkInterface> nis = NetworkInterface.getNetworkInterfaces();

            while (nis.hasMoreElements()) {
                NetworkInterface ni = nis.nextElement();
            
            //Physical Address (MAC - Medium Access Control)
                byte mac[] = ni.getHardwareAddress();
                if (mac != null) {
                    final StringBuilder macAddress = new StringBuilder();
                    for (int i = 0; i < mac.length; i++) {
                        macAddress.append(String.format("%s" + format, (i == 0) ? "" : ":", mac[i]));
                        //macAddress.append(String.format(format+"%s",mac[i], (i < mac.length - 1) ? ":" : ""));
                    }
                    System.out.println(macAddress.toString());
                    macs.add(macAddress.toString());
                }
                return macs.toArray(new String[0]);
            }
            
        } catch (Exception ex) {
            System.err.println("Exception: " + ex.getMessage());
            ex.printStackTrace();
        }
        return new String[0];
    }
    
    
    public static void main(String[] args) throws Exception{
        //Printing out the Host name and IP address of the local system.
        InetAddress localHost = InetAddress.getLocalHost();//gets local host
        
        System.out.println("Host/System Name: " + localHost.getHostName());
        
        System.out.println("Host/System Address: " + localHost.getHostAddress());
        
        
        String macs2[] = getPhysicalAddress();
        //Create a for loop here and printing out MAC addresses
        for (String mac : macs2){
            System.out.println("MacAddress = " + mac);
        }
        
        
    }
}
