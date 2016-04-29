package com.tcruz.viernes.alegres.java8.lambda.stream;

import com.tcruz.viernes.alegres.java8.lambda.ClassConsumer;

import java.util.*;
import java.util.stream.Stream;

public class Example {

    public static void main(String[] args) {

        List<String> palavras = Arrays.asList("Carla", "Bruna", "Tulio","Nomegrandepracacete","OutroGrande");

        palavras.stream()
                .map((palavra) -> palavra.concat(":").concat(String.valueOf(palavra.length())))
                .forEach(System.out::println);

        System.out.println("-----");

        palavras.stream()
                .filter(s -> s.length() < 6)
                .forEach(System.out::println);

        OptionalDouble media = palavras.stream()
                .mapToInt(String::length)
                .average();

        System.out.println(media.orElse(0));


        String s = Optional.ofNullable("").orElse("String nula");
    }
}
