/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test;
import java.util.Scanner;
/**^
 *
 * @author lolbo
 */
public class Question5 {
    public static void main (String[]args){
        int length;
        int height;
        int width;
        int volume;
        
        
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the length of the box: ");
        length = input.nextInt();
        System.out.println("Enter the height of the box: ");
        height = input.nextInt();
        System.out.println("Enter the width of the box: ");
        width = input.nextInt();
        
        volume = length * height * width;
        
        System.out.println("The volume of your box is: " + volume);
    }
}
