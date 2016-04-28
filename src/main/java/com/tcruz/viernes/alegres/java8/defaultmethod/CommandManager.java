package com.tcruz.viernes.alegres.java8.defaultmethod;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CommandManager {

    public static void main(String[] args) {

        List<GDSCommand> gdsCommandList = new ArrayList<>();

        gdsCommandList.add(new IpsumCommand("Ipsum bleh bleh"));
        gdsCommandList.add(new LoremCommand("Lorem bleh bleh"));

        //Foreach old school Java 1.5
        for (GDSCommand gdsCommand: gdsCommandList) {
            System.out.println(gdsCommand.generateCommand());
        }

        /*//Neste caso queremos validar se o comando criado é um comando válido
        for (GDSCommand gdsCommand: gdsCommandList) {
            String generateCommand = gdsCommand.generateCommand();
            if (gdsCommand.validate()){
                System.out.println(generateCommand +" eh valido");
            }else{
                System.out.println(generateCommand +" eh invalido");
            }
        }*/
    }
}
