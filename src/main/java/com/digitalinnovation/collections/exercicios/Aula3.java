package com.digitalinnovation.collections.exercicios;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Aula3 {
    
    public static void main(String[] args){

        Set<Integer> hashSet = new HashSet<>();
        LinkedHashSet<Integer> linkedHashSet = new LinkedHashSet<>();
        TreeSet<Integer> treeSet = new TreeSet<>();

        hashSet.add(14);
        hashSet.add(4);
        hashSet.add(3);
        hashSet.add(20);
        hashSet.add(16);
        hashSet.add(1);
        hashSet.add(10);

        linkedHashSet.add(14);
        linkedHashSet.add(4);
        linkedHashSet.add(3);
        linkedHashSet.add(20);
        linkedHashSet.add(16);
        linkedHashSet.add(1);
        linkedHashSet.add(10);

       treeSet.add(14);
       treeSet.add(4);
       treeSet.add(3);
       treeSet.add(20);
       treeSet.add(16);
       treeSet.add(1);
       treeSet.add(10);

       //HashSet ordena para ter uma melhor performace
       System.out.println(hashSet);

       //LinkedHashSet ordena por ordem de inserção
       System.out.println(linkedHashSet);

       //TreeSet ordena sequenciamente os dados
       System.out.println(treeSet);

       //Acrescentando elementos (não permitem elementos repetidos)
       hashSet.add(40);
       hashSet.add(40);
       hashSet.add(22);
       hashSet.add(100);
       linkedHashSet.add(40);
       linkedHashSet.add(40);
       linkedHashSet.add(22);
       treeSet.add(40);
       treeSet.add(40);

       System.out.println(hashSet);
       System.out.println(linkedHashSet);
       System.out.println(treeSet);

       //Tamanho
       System.out.println(hashSet.size());
       System.out.println(linkedHashSet.size());
       System.out.println(treeSet.size());
       
    }
}
