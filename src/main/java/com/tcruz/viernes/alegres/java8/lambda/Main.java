package com.tcruz.viernes.alegres.java8.lambda;

public class Main {

    public static void main(String[] args) {
        ClassConsumer classConsumer = new ClassConsumer();
        System.out.println(classConsumer.consume(() -> "Bleh bleh"));
    }
}
