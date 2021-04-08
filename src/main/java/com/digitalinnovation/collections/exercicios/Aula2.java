package com.digitalinnovation.collections.exercicios;

import java.util.LinkedList;
import java.util.Queue;

public class Aula2 {

    public static void main(String[] args) {

        Queue<String> filaDeEspera = new LinkedList<>();

        // Adicione 5 nomes
        filaDeEspera.add("Juliana");
        filaDeEspera.add("Pedro");
        filaDeEspera.add("Carlos");
        filaDeEspera.add("João");

        // Exiba a lista
        System.out.println(filaDeEspera);

        // Retorne o primeiro elemento da lista sem retira-lo
        System.out.println(filaDeEspera.peek());
        System.out.println(filaDeEspera);

        // Retorne o primeiro elemento da lista e retire-o
        System.out.println(filaDeEspera.poll());
        System.out.println(filaDeEspera);

        // Adicione um novo elemento na lista
        filaDeEspera.add("Daniel");
        System.out.println(filaDeEspera);

        // Retorne o tamanho da lista
        System.out.println(filaDeEspera.size());

        // Verifique se a lista esta vazia
        System.out.println(filaDeEspera.isEmpty());

        // Verifique se o nome Carlos esta na lista
        System.out.println(filaDeEspera.contains("Carlos"));

        // Converta a lista em String e retire os colchetes
        String texto = filaDeEspera.toString();
        String regex = "\\[|\\]";
        System.out.println(texto.replaceAll(regex, ""));

        // Crie uma maneira de listar os nomes da String gerada
        texto = texto.replaceAll(regex, "");
        String[] nome = texto.split(", ");

        for (String lista : nome) {
            System.out.println(lista);
        }

    }

}
