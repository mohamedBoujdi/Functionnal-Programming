package org.example.FunctionnalInterfaces;

import java.util.Arrays;
import java.util.Collection;
import java.util.stream.Stream;

public class JavaStreamAPI {
    //Stream API is a new feature added in Java 8
    //Stream API is used to process collections of objects
    //Stream API is used to perform filter/map/reduce like operations with the collection of objects
    //Stream API is used to generate sequence of objects
    //Stream API is used to perform parallel processing(is a technique to speed up
    // the execution by multiple tasks simultaneously) on collections
    //Stream API is used to iterate through the collection
    //Stream API is used to perform lazy evaluation (is a technique to delay the evaluation of an expression until its value is needed)
    public static void main(String[] args) {

        //Stream API example with filter (is a intermediate operation that returns a stream consisting of the elements of this stream that match the given predicate)

        //Stream API example with map (map is used to convert one type of object into another type)
        System.out.println("map example");
        Stream.of("1", "2", "3", "4", "5", "6")
                .map(Integer::parseInt)
                .forEach(System.out::println);
        //Stream API example with sorted (is a terminal operation )
        System.out.println("Sorted Stream");
        Stream.of("one", "two", "three", "four")
                .sorted((e1, e2) -> e1.compareTo(e2))
                .forEach(e -> System.out.println("e = " + e));
        //Stream API example with limit (is a method to limit the number of elements in a stream)
        System.out.println("Stream API example with limit");
        Stream.of("one", "two", "three", "four")
                .limit(2)
                .forEach(e -> System.out.println("e = " + e));
        //Stream API example with skip (is a method to skip the first n elements in a stream)
        Stream.of("one", "two", "three", "four")
                .skip(2)
                .forEach(e -> System.out.println("e = " + e));
        //Stream API example with count (is a terminal operation )
        System.out.println("filter stream example");
        long count = Stream.of("one", "two", "three", "four")
                .filter(e -> e.length() > 3)
                .count();
        //Stream API example with reduce
        //reduce is a terminal operation that can be used to reduce the elements of a stream to a single value
        System.out.println("reduce stream example");
        Stream.of("one", "two", "three", "four")
                .reduce((s1, s2) -> s1 + "-" + s2)
                .ifPresent(System.out::println);
        //Stream API example with parallel processing
        System.out.println("Parallel processing");
        Stream.of("one", "two", "three", "four")
                .parallel()
                .filter(e -> e.length() > 3)
                .forEach(System.out::println);
        //Stream API example with sequential processing
        System.out.println("Sequential processing");
        Stream.of("one", "two", "three", "four")
                .parallel()
                .filter(e -> e.length() > 3)
                .sequential()
                .forEach(System.out::println);
        //Stream API example with peek (is a intermediate operation that returns a stream consisting of the elements of this stream)
        System.out.println("peek stream example");
        Stream.of("one", "two", "three", "four")
                .peek(e -> System.out.println("peeked " + e))
                .forEach(System.out::println);
        //Stream API example with findFirst (is a terminal operation that returns the first element of this stream)
        System.out.println("findFirst stream example");
        Stream.of("one", "two", "three", "four")
                .findFirst()
                .ifPresent(System.out::println);
        //Stream API example with findAny (is a terminal operation that returns an Optional describing some element of the stream)
        System.out.println("findAny stream example");
        Stream.of("one", "two", "three", "four")
                .findAny()
                .ifPresent(System.out::println);
        //Stream API example with allMatch (is a terminal operation that returns true if all elements of the stream match the provided predicate)
        System.out.println("allMatch stream example");
        boolean allMatch = Stream.of("one", "two", "three", "four")
                .allMatch(e -> e.length() > 3);
        System.out.println("allMatch = " + allMatch);
        //Stream API example with anyMatch (is a terminal operation that returns true if any elements of the stream match the provided predicate)
        System.out.println("anyMatch stream example");
        boolean anyMatch = Stream.of("one", "two", "three", "four")
                .anyMatch(e -> e.length() > 3);
        System.out.println("anyMatch = " + anyMatch);
        //Stream API example with noneMatch (is a terminal operation that returns true if no elements of the stream match the provided predicate)
        System.out.println("noneMatch stream example");
        boolean noneMatch = Stream.of("one", "two", "three", "four")
                .noneMatch(e -> e.length() > 3);
        System.out.println("noneMatch = " + noneMatch);
        //Stream API example with forEach (is a terminal operation that performs an action for each element of this stream)
        System.out.println("forEach stream example");
        Stream.of("one", "two", "three", "four")
                .forEach(e -> System.out.println("e = " + e));
        //Stream API example with toArray (is a terminal operation that returns an array containing the elements of this stream)
        System.out.println("toArray stream example");
        Object[] objects = Stream.of("one", "two", "three", "four")
                .toArray();
        for (Object object : objects) {
            System.out.println("object = " + object);
        }
        //Stream API example with collect (is a terminal operation that returns a result of the reduction operation)
        System.out.println("collect stream example");
        String collect = Stream.of("one", "two", "three", "four")
                .collect(StringBuilder::new, StringBuilder::append, StringBuilder::append)
                .toString();
        System.out.println("collect = " + collect);
        //Stream API example with min (is a terminal operation that returns the minimum element of this stream according to the provided Comparator)
        System.out.println("min stream example");
        Stream.of("one", "two", "three", "four")
                .min((s1, s2) -> s1.compareTo(s2))
                .ifPresent(System.out::println);
        //Stream API example with max (is a terminal operation that returns the maximum element of this stream according to the provided Comparator)
        System.out.println("max stream example");
        Stream.of("one", "two", "three", "four")
                .max((s1, s2) -> s1.compareTo(s2))
                .ifPresent(System.out::println);
        //Stream API example with flatMap (is a intermediate operation that returns a stream consisting
        // of the results of replacing each element of this stream with the contents of a mapped stream
        // produced by applying the provided mapping function to each element)
        System.out.println("flatMap stream example");
        Stream.of(Arrays.asList(1, 2), Arrays.asList(3, 4))
                .flatMap(Collection::stream)
                .forEach(System.out::println);
        //Stream API example with distinct (is a intermediate operation that returns a stream consisting
        // of the distinct elements (according to Object.equals(Object)) of this stream)
        System.out.println("distinct stream example");
        Stream.of("one", "two", "three", "four", "one")
                .distinct()
                .forEach(System.out::println);

    }
}
