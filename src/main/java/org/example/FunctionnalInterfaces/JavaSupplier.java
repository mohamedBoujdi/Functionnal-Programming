package org.example.FunctionnalInterfaces;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.function.Supplier;

public class JavaSupplier {

    private static final DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

    public static void main(String[] args) {

        //Supplier is a functional interface that returns a value of any type
        //It has a single method called get() that returns a value of type T
        //The Supplier interface is defined in the java.util.function package
        //The Supplier interface is used when we need to generate or supply values without taking any input
        //The Supplier interface is a functional interface and can therefore be used as the assignment target for a lambda expression or method reference
        //The Supplier interface is also a generic type and can be parameterized with any type
        //The Supplier interface is used in the Java Stream API to supply a new value for each element in a stream
        //The Supplier interface is used in the Java Optional class to supply a default value if a value is not present


        Supplier<LocalDateTime> s = () -> LocalDateTime.now();
        LocalDateTime time = s.get();

       // System.out.println(time);

        Supplier<String> s1 = () -> dtf.format(LocalDateTime.now());
        String time2 = s1.get();

        //System.out.println(time2);
         // random characters from a string using Supplier  interface
        Supplier<String> stringSupplier = () -> {
            String chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
            String random = "";
            for (int i = 0; i < 5; i++) {
                random += chars.charAt((int) (Math.random() * 26));
            }
            return random;
        };
        //example of using Supplier in Java Stream API
        Supplier<String> s2 = () -> {
            String otp = "";
            for (int i = 0; i < 6; i++) {
                otp = otp + (int) (Math.random() * 10);
            }
            return otp+s.get().hashCode()+stringSupplier.get();
        };
        System.out.println(s2.get());

    }

}