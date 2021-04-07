package com.digitalinnovation.collections.exercicios;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Aula1 {

    public static void main(String[] args){

        List<String> nomes = new ArrayList<>();

        //Adiciona 5 nomes
        nomes.add("Juliana");
        nomes.add("Pedro");
        nomes.add("Carlos");
        nomes.add("Larissa");
        nomes.add("João");

        //Navega na lista
        for (String nome : nomes) {
            System.out.print(nome + " ");
        }
        System.out.println(" ");

        //Substitui o nome Carlos por Roberto
        nomes.set(2, "Roberto");

        //Retorna o nome da posição 1
        System.out.println(nomes.get(0));

        //Remove o nome da posição 4
        nomes.remove(3);

        //Remove o nome João
        nomes.remove("João");

        //Retorna a quantidade de itens da lista
        System.out.println(nomes.size());

        //Verifica se o nome Juliana existe na lista
        boolean verificaNome = nomes.contains("Juliano");
        System.out.println(verificaNome);

        //Criar uma nova lista
        List<String> listaNomes = new ArrayList<>();

        //Adicionar 2 nomes
        listaNomes.add("Ismael");
        listaNomes.add("Rodrigo");

        //Adicionar segunda lista na primeira
        nomes.addAll(listaNomes);

        //Ordenar lista em ordem alfabética
        Collections.sort(nomes);

        for (String nome : nomes) {
            System.out.print(nome + " ");
        }

    }
    
}
