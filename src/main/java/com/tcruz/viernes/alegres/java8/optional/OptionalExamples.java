package com.tcruz.viernes.alegres.java8.optional;

import java.util.Optional;

public class OptionalExamples {

    public static void main(String[] args) {

        // if the value is not present
        Optional<Car> carOptionalEmpty = Optional.empty();
        carOptionalEmpty
                    .filter( x -> "250".equals( x.getPrice() ) )
                    .ifPresent( x -> System.out.println( x.getPrice() + " is ok!" ) );

        // if the value does not pass the filter
        Optional<Car> carOptionalExpensive = Optional.of( new Car( "3333" ) );
        carOptionalExpensive
                    .filter( x -> "250".equals( x.getPrice() ) )
                    .ifPresent( x -> System.out.println( x.getPrice() + " is ok!" ) );

        // if the value is present and does pass the filter
        Optional<Car> carOptionalOk = Optional.of( new Car( "250" ) );
        carOptionalOk
                    .filter( x -> "250".equals( x.getPrice() ) )
                    .ifPresent( x -> System.out.println( x.getPrice() + " is ok!" ) );
    }
}
