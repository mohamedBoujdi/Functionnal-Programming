package org.example.FunctionnalInterfaces.FunInterfaces;

public class NotationFunctionnalInterface {

    MyFunInterface<String> myFunInterface = () -> "Hello World";
    public static void main(String[] args) {
        MyFunInterface<String> myFunInterface = () -> "Hello World";
        System.out.println(myFunInterface.call());

    }

}
