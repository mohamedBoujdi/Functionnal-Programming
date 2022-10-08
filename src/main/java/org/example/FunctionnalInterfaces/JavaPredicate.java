package org.example.FunctionnalInterfaces;

import java.util.function.Predicate;

public class JavaPredicate {
    public static void main(String[] args) {
        // Predicate is a functional interface that represents a boolean-valued function of one argument
        // Predicate is a functional interface and can therefore be used as
        // the assignment target for a lambda expression or method reference
        // Predicate is a generic type and can be parameterized with any type
        // Predicate is used in the Java Stream API to filter elements in a stream
        // Predicate is used in the Java Optional class to filter values in an Optional instance
        // Predicate is used in the Java Collection API to filter elements in a collection
        // Predicate is used in the Java Map API to filter entries in a map
        //Predicate and conditional operators
        Predicate<Integer> p1 = (i) -> i > 10;
        Predicate<String> p2 = (s) -> s.length() > 5;
        Predicate<Object> p3 = (o) -> o != null;
        //Predicate vs Lambda expression
        //Lambda expression is a short block of code which takes in parameters and returns a value
        //Lambda expression is used to provide the implementation of an interface which has functional interface
        //Lambda expression is used to provide the implementation of a method
        if (p1.or((a) -> a < 5).test(4)) {
            System.out.println(": true");
        } else {
            System.out.println(": false");
        }
        p1.and((a)->a<5).test(6);

    }
}
