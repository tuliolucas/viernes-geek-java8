package com.tcruz.viernes.alegres.java8.lambda.parallelism;

 
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.Consumer;
import java.util.function.IntConsumer;
import java.util.function.Function;
import java.util.function.BinaryOperator;
import java.util.Comparator;
import java.util.function.UnaryOperator;
import java.util.function.Predicate;
import java.util.GregorianCalendar;
import java.util.Collection;
import java.util.Collections;
import java.lang.Iterable;
import java.util.function.Supplier;
import java.util.Set;
import java.util.Map;
import java.util.HashSet;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.time.chrono.IsoChronology;
import java.lang.Number;
import java.util.stream.*;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.concurrent.ConcurrentMap;

public class ParallelismExamples {

    public static void main(String... args) {
        
        // Create sample data
        List<Person> roster = Person.createRoster();
    
        System.out.println("Contents of roster:");

        roster
            .stream()
            .forEach(p -> p.printPerson());
        System.out.println();
        
        // 1. Average age of male members in parallel
        double average = roster
            .parallelStream()
            .filter(p -> p.getGender() == Person.Sex.MALE)
            .mapToInt(Person::getAge)
            .average()
            .getAsDouble();
            
        System.out.println("Average age of male members in parallel: " +
            average);
        
        // 2. Concurrent reduction example
        ConcurrentMap<Person.Sex, List<Person>>
            byGenderParallel =
            roster
                .parallelStream()
                .collect(Collectors.groupingByConcurrent(Person::getGender));

        List<Map.Entry<Person.Sex, List<Person>>>
            byGenderList = 
            new ArrayList<>(byGenderParallel.entrySet());
            
        System.out.println("Group members by gender:");    
        byGenderList
            .stream()
            .forEach(e -> {
                System.out.println("    Gender: " + e.getKey());
                e.getValue()
                    .stream()
                    .map(Person::getName)
                    .forEach(name -> System.out.println("      " + name)); });
  
        // 3. Examples of ordering and parallelism
        System.out.println("Examples of ordering and parallelism:");
        Integer[] intArray = {1, 2, 3, 4, 5, 6, 7, 8 };
        List<Integer> listOfIntegers = new ArrayList<>(Arrays.asList(intArray));

        System.out.println("listOfIntegers:");
        listOfIntegers
            .stream()
            .forEach(e -> System.out.print(e + " "));
        System.out.println("");
        
        System.out.println("listOfIntegers sorted in reverse order:");
        Comparator<Integer> normal = Integer::compare;
        Comparator<Integer> reversed = normal.reversed(); 
        Collections.sort(listOfIntegers, reversed);             
        listOfIntegers
            .stream()
            .forEach(e -> System.out.print(e + " "));
        System.out.println("");
     
        System.out.println("Parallel stream");
        listOfIntegers
            .parallelStream()
            .forEach(e -> System.out.print(e + " "));
        System.out.println("");
    
        System.out.println("Another parallel stream:");
        listOfIntegers
            .parallelStream() 
            .forEach(e -> System.out.print(e + " "));
        System.out.println("");
     
        System.out.println("With forEachOrdered:");
        listOfIntegers
            .parallelStream()
            .forEachOrdered(e -> System.out.print(e + " "));
        System.out.println("");

    }
}

