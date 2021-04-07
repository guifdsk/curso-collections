package com.digitalinnovation.collections.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ExemploList {
    
    public static void main(String[] args){

        List<String> nomes = new ArrayList<>();

        nomes.add("Carlos");
        nomes.add("Pedro");
        nomes.add("Juliana");
        nomes.add("Anderson");
        nomes.add("Maria");
        nomes.add("João");

        System.out.println(nomes);

       //adiciona o nome Larissa no índice 2 do array
        nomes.set(2, "Larissa");
        System.out.println(nomes);

        //ordena os itens do array em ordem alfabética
        Collections.sort(nomes);
        System.out.println(nomes);

        nomes.set(2, "Wesley");
        System.out.println(nomes);

        //remove um elemento da lista pelo índice
        nomes.remove(4);
        System.out.println(nomes);

        //remove um objeto da lista
        nomes.remove("Wesley");
        System.out.println(nomes);

        //pega um elemento da lista pela índice
        String nome = nomes.get(3);
        System.out.println(nome);

        //retorna a posição index do elemento na lista
        int posicao = nomes.indexOf("Carlos");
        System.out.println(posicao);

        //caso o elemento não seja encontrado, retorna o valor -1
        posicao = nomes.indexOf("Guilherme");
        System.out.println(posicao);

        //pega o tamanho da lista
        int tamanho = nomes.size();
        System.out.println(tamanho);

        nomes.remove("Larissa");
        tamanho = nomes.size();
        System.out.println(tamanho);

        //verifica se existe um elemento na lista retornando true ou false
        boolean temAnderson = nomes.contains("Anderson");
        System.out.println(temAnderson);
        boolean temFernando = nomes.contains("Fernando");
        System.out.println(temFernando);

        //limpa a lista
        nomes.clear();
        System.out.println(nomes);

        //a resposta que antes era true, agora é false pois a lista está vazia
        temAnderson = nomes.contains("Anderson");
        System.out.println(temAnderson);

        //retorna se a lista está vazia ou não
        boolean listaEstaVazia = nomes.isEmpty();
        System.out.println(listaEstaVazia);

        //------------------------------------------------------------

        nomes.add("Mario");
        nomes.add("Pedro");
        nomes.add("Juliana");
        nomes.add("Anieli");
        nomes.add("Maria");
        nomes.add("João");

        for (String nomeDoItem: nomes){
            System.out.print(nomeDoItem + " ");
        }

        System.out.println(" ");

        //Serve para percorrer um container (uma coleção de elementos)
        Iterator<String> iterator = nomes.iterator();
        while (iterator.hasNext()){
            System.out.print(iterator.next() + " ");
        }

    }
}
