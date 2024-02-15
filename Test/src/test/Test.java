/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package test;
import java.util.Scanner;

/**
 *
 * @author lolbo
 */
public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int Mark1;
        int Mark2;
        int Mark3;
        int average;
        
        
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your first mark: ");
        Mark1 = input.nextInt();
        System.out.println("Enter second mark: ");
        Mark2 = input.nextInt();
        System.out.println("Enter your third mark: ");
        Mark3 = input.nextInt();
        
        average = (Mark1 + Mark2 + Mark3) / 3;
        System.out.println("Average is: " + average);
        
        
        
    }
    
}
