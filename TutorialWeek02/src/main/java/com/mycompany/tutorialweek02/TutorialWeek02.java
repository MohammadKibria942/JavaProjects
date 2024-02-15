/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.tutorialweek02;

/**
 *
 * @author lolbo
 */
public class TutorialWeek02 {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        
        Person p = new Person("Ben");
        p.setSurname("White");
        p.setAge(25);
        p.displayName();
        p.getSurname();
        p.getAge();
        
        Person p2 = new Person("Yusef");
        p2.setSurname("Kibria");
        p2.setAge(19);
        p2.displayName();
        p2.getSurname();
        p2.getAge();
        
        Person p3 = new Person("Bob");
        p3.setSurname("Smith");
        p3.setAge(100);
        p3.displayName();
        p3.getSurname();
        p3.getAge();
    }
}
