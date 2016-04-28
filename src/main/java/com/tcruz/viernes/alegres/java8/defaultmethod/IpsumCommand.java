package com.tcruz.viernes.alegres.java8.defaultmethod;

import lombok.AllArgsConstructor;

public class IpsumCommand implements GDSCommand{

    private String externalParam;

    public IpsumCommand(String externalParam){
        this.externalParam = externalParam;
    }

    @Override
    public String generateCommand() {
        return externalParam;
    }

    /*public String getPattern(){
        return "Ipsum\\s(.*)";
    };*/
}
