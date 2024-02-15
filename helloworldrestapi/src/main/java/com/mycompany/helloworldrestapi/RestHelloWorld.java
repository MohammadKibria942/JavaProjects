/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.helloworldrestapi;

import java.util.ArrayList;
import java.util.List;
import javax.ws.rs.GET; 
import javax.ws.rs.Path; 
import javax.ws.rs.Produces; 
import javax.ws.rs.ext.Provider;

//@Provider tells teh server taht this is a rest calss
@Provider

public class RestHelloWorld {
    //define the path for this class: [server]/rest/examples/examples
    @Path("helloWorld")

    //answer only to a http get request
    @GET
    public String hello(){//return a simple string 
        return "hello world"; //String to be returned   
    }
    @Path("helloJSON")
    @GET
    @Produces("application/json")
    
    //Create a list and ad two messages that will be displayed after invoking ht GET request
    public List<String> helloJSONList(){
        List<String>jsonList = new ArrayList<String>();
        jsonList.add("Hello World");
        jsonList.add("Client Server Architecture");
        
        return jsonList;
    }
}
