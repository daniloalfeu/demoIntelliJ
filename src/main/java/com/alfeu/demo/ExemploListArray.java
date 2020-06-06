package com.alfeu.demo;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ExemploListArray {

    public static void main(String[] args) {
        List<String> nomes= new ArrayList<>();

        nomes.add("Danilo");
        nomes.add("Kelli");
        nomes.add("Tania");
        nomes.add("Anderson");
        nomes.add("Jurema");
        nomes.add("Flopito");
        nomes.add("Ferrugem");
        nomes.add("Pequeno");

        System.out.println(nomes);
        nomes.set(3, "Biubiu");

        Collections.sort(nomes);
        System.out.println(nomes);

        nomes.remove(6);
        System.out.println(nomes);
        nomes.remove("Ferrugem");
        System.out.println(nomes);

        String nome = nomes.get(5);
        System.out.println(nome);

        int posicao = nomes.indexOf("Tania");
        System.out.println(posicao);
        int tamanho = nomes.size();
        System.out.println(tamanho);

        boolean temFlopito = nomes.contains("Flopito");
        System.out.println(temFlopito);
        boolean temKelli = nomes.contains("Kelli");
        System.out.println(temKelli);
        boolean temJoao = nomes.contains("João");
        System.out.println(temJoao);

        for (String nomeDoItem: nomes) {

            System.out.println("------->" +nomeDoItem);
        }
        Iterator<String> iterator = nomes.iterator();
        while (iterator.hasNext()){
            System.out.println( "---->" +iterator.next());

        }







    }
}
