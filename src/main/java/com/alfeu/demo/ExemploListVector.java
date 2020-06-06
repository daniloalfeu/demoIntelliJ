package com.alfeu.demo;

import org.springframework.boot.security.reactive.ApplicationContextServerWebExchangeMatcher;

import java.util.List;
import java.util.Vector;

public class ExemploListVector {
    public static void main(String[] args) {
        List<String> esportes = new Vector<>();

        // adicionar 4 esportes
        esportes.add("Futebol");
        esportes.add("Handebol");
        esportes.add("Volei");
        esportes.add("skate");

        System.out.println(esportes);

        //alterar o valor da posicação 2 do vetor
        esportes.set(2, "remo");
        System.out.println(esportes);

        // remover o esporte skate
        esportes.remove( "skate");

        System.out.println(esportes.get(2));

        for (String esporte: esportes){
            System.out.println(esporte);
        }


    }
}
