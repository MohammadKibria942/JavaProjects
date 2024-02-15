/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.downloadweb;

import java.io.*;

import java.net.URL;
import java.net.MalformedURLException;
/**
 *
 * @author lolbo
 */
public class DownloadWeb {
    
    public static void DownloadWebPage(String webPage){
        
        try{
            //Create URL object
            URL url = new URL(webPage);
            
            BufferedReader readbf = new BufferedReader(new InputStreamReader(url.openStream()));
            
            BufferedWriter writer = new BufferedWriter(new FileWriter("Download.html"));
            
            String line;
            
            while((line = readbf.readLine()) != null){
                writer.write(line);
            }
            
            readbf.close();
            writer.close();
            
            System.out.println("Successfuly donwloaded");
        }
        catch(MalformedURLException e){
            System.out.println("Malformed URL Exception raised");
            
        }catch(IOException ex){
            System.out.println("IO Exception happened");
        }
    }

    public static void main(String[] args) {
        String url = "https://www.westmisnter.ac.uk";
        DownloadWebPage(url);
    }
}
