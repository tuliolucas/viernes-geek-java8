package com.tcruz.viernes.alegres.java8.lambda;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class LambdaExample {

    public static void main(String[] args) {

        ClassConsumer classConsumer = new ClassConsumer();

        /**
         * Exemplo 1
        **/
        System.out.println(classConsumer.consume(() -> "Bleh bleh"));

        /**
         * Neste exemplo 2 temos três conceitos juntos:
         *  1) Default method
         *  2) Functional interface
         *  3) Lambdas8
        **/
        List<String> palavras = Arrays.asList("julio", "paulo", "tulio");

        //Modo Antigo
        Comparator<String> comparator = new Comparator<String>() {
            public int compare(String s1, String s2) {
                return Integer.compare(s1.length(), s2.length());
            }
        };
        palavras.sort(comparator);

        //Já no modo Java 8 de ser
        palavras.sort((s1, s2) -> Integer.compare(s1.length(), s2.length()));

        /**
         * Exemplo 3
        **/

        //Modo antigo
        new Thread(new Runnable(){
            public void run(){
                System.out.println("Thread rodando...");
            }

        }).start();

        //Já no modo Java 8 de ser
        new Thread(() -> System.out.println("Thread rodando...")).start();


    }
}
