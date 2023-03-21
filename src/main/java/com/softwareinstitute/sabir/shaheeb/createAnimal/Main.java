package com.softwareinstitute.sabir.shaheeb.createAnimal;

import com.softwareinstitute.sabir.shaheeb.animals.*;
import com.softwareinstitute.sabir.shaheeb.exceptions.ThrowUpExceptions;


public class Main {
    public static void main(String[] args) {

        Cat whiskers = new Cat();
        Bat flyer = new Bat();

        System.out.println(whiskers.toString() + flyer);
        try {
            whiskers.eat( "milk");
            System.out.println("This is the try block");
        } catch (ThrowUpExceptions tue) {
            System.out.println("This is the main block");
        }
        finally {
            System.out.println("This is the finally block");
        }

    }
}