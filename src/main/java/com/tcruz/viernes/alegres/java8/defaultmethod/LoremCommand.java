package com.tcruz.viernes.alegres.java8.defaultmethod;

public class LoremCommand implements GDSCommand{

    public static final String LOREM_PREFIX = "Lorem ";

    private String externalParam;

    public LoremCommand(String externalParam){
        this.externalParam = externalParam;
    }

    @Override
    public String generateCommand() {

        //Doing something
        return LOREM_PREFIX.concat(externalParam);
    }

}
