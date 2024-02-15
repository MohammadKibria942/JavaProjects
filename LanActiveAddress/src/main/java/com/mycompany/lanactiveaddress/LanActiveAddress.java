/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.lanactiveaddress;

import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.SocketException;
import java.util.Enumeration;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author lolbo
 */
public class LanActiveAddress {
    public static void main(String[] args) {
    try {
        Enumeration nis = NetworkInterface.getNetworkInterfaces();
        while(nis.hasMoreElements())
        {
            NetworkInterface ni = (NetworkInterface) nis.nextElement();
            Enumeration ias = ni.getInetAddresses();
            while (ias.hasMoreElements())
            {
                InetAddress ia = (InetAddress) ias.nextElement();
                System.out.println(ia.getHostAddress());
            }

        }
    } catch (SocketException ex) {
        Logger.getLogger(LanActiveAddress.class.getName()).log(Level.SEVERE, null, ex);
    }
}
}
