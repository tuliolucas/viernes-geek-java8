package com.tcruz.viernes.alegres.java8.defaultmethod;

/**
 * Global Distribution System (GDS) são sistemas cuja função é a intermediação eletrônica
 * entre as agências de viagens e as companhias aéreas, hotéis, locadoras de veículos, operadoras, etc.
 * Exemplo: Sabre e Amadeus :)
**/
public interface GDSCommand {

    public String generateCommand();

    /*default String addFinalizador() {
        return generateCommand().concat("Fim");
    }*/

}
