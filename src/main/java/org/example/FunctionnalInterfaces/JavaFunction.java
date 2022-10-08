package org.example.FunctionnalInterfaces;

import java.util.function.Function;
import java.util.stream.Stream;

public class JavaFunction {
    public static void main(String[] args) {
        // Function is a functional interface that represents
        // a function that accepts one argument and produces a result
        //many built-in functional interfaces in the Java API are based on the Function interface
        Function<String,Integer> f = (s) -> {
            return s.length();
        };
       // System.out.println(f.apply("Hello World"));
        //Function chaining example
        //Function chaining is a technique to combine multiple functions into a single function
        Function<String, Integer> f1 = (s) -> s.length();
        Function<Integer, Integer> f2 = (i) -> i * 2;
        //System.out.println(f1.andThen(f2).apply("Hello World"));
        //Function identity example
        Function<String, String> f3 = Function.identity();
        System.out.println(f3.apply("Hello World"));
        //Function example with Stream API
        Stream.of("one", "two", "three", "four")
                .filter((e) -> e.length() > 2)
                .map(String::toUpperCase)
                .forEach(System.out::println);

    }
}
