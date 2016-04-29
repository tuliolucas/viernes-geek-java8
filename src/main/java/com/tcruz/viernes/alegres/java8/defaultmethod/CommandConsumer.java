package com.tcruz.viernes.alegres.java8.defaultmethod;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CommandConsumer {

    public static void main(String[] args) {

        List<GDSCommand> gdsCommandList = new ArrayList<>();

        gdsCommandList.add(new IpsumCommand("bleh bleh"));
        gdsCommandList.add(new LoremCommand("bleh bleh"));

        //Foreach bem old school -  Java 1.5
        for (GDSCommand gdsCommand: gdsCommandList) {
            System.out.println(gdsCommand.generateCommand());
        }

        /*System.out.println("---");

        //Neste caso queremos validar se o comando criado é um comando válido
        for (GDSCommand gdsCommand: gdsCommandList) {
            System.out.println(gdsCommand.addFinalizador());
        }*/
    }
}
