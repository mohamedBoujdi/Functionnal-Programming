package org.example.FunctionnalInterfaces;

import java.util.Optional;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class JavaConsumering {
    public static void main(String[] args) {
        // why we need consumer interface   ??
        // Consumer is a functional interface that represents
        // an operation that accepts a single input argument and returns no result
        // Consumer is a functional interface and can therefore be used as
        // the assignment target for a lambda expression or method reference
        // Consumer is a generic type and can be parameterized with any type
        // Consumer is used in the Java Stream API to perform an operation on each element in a stream
        // Consumer is used in the Java Optional class to perform an operation if a value is present

        Consumer<String> c = (s) -> System.out.println(s);
        c.accept("Hello World");
        //optional consumer
        Optional<String> optional = Optional.of("Hello");
        optional.ifPresent(s -> System.out.println(s));

        //Stream API    forEach() method    Consumer interface  example
        Stream.of("one", "two", "three", "four")
                .filter(e -> e.length() > 3)
                .forEach(e -> System.out.println("e = " + e));

        BiConsumer<String, String> biConsumer = (s1, s2) -> {
            System.out.println(s1 + s2);
        };
        biConsumer.accept("Hello", "World");
    }

}
