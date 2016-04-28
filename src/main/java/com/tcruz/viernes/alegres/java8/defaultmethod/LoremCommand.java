package com.tcruz.viernes.alegres.java8.defaultmethod;

public class LoremCommand implements GDSCommand{

    private String externalParam;

    public LoremCommand(String externalParam){
        this.externalParam = externalParam;
    }

    @Override
    public String generateCommand() {
        return externalParam;
    }

    /*public String getPattern(){
        return "Lorem\\s(.*)";
    };*/

}
