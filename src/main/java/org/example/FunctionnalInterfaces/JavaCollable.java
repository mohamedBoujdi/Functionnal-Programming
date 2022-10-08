package org.example.FunctionnalInterfaces;

import java.util.concurrent.Callable;

public class JavaCollable {
    public static void main(String[] args) {
        //Callable interface example
        //Callable is a functional interface that represents a function that accepts no arguments and returns a result
        Callable<String> c = () -> "Hello World";
        try {
            System.out.println(c.call());
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
