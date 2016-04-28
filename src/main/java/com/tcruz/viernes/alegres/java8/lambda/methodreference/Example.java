package com.tcruz.viernes.alegres.java8.lambda.methodreference;

import com.tcruz.viernes.alegres.java8.lambda.ClassConsumer;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.OptionalDouble;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Example {

    public static void main(String[] args) {

        List<String> palavras = Arrays.asList("rodrigo", "paulo", "tulio");

        //Sem utilizar o methodreference
        palavras.forEach((palavra) -> System.out.println(palavra));
        
        //Super cool loop
        palavras.forEach(System.out::println);;

    }
}
