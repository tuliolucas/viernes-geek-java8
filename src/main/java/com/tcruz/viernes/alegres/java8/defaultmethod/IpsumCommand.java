package com.tcruz.viernes.alegres.java8.defaultmethod;

public class IpsumCommand implements GDSCommand{

    public static final String IPSUM_PREFIX = "Ipsum ";
    private String externalParam;

    public IpsumCommand(String externalParam){
        this.externalParam = externalParam;
    }

    @Override
    public String generateCommand() {
        return IPSUM_PREFIX.concat(externalParam);
    }

}
