package com.digitalinnovation.collections.exercicios;

import java.util.TreeMap;

public class Aula4 {

    public static void main(String[] args) {

        TreeMap<String, String> estadosDoBrasil = new TreeMap<>();

        // Adicionar Estados do Brasil
        estadosDoBrasil.put("AC", "Acre");
        estadosDoBrasil.put("AL", "Alagoas");
        estadosDoBrasil.put("AP", "Amapá");
        estadosDoBrasil.put("AM", "Amazonas");
        estadosDoBrasil.put("BA", "Bahia");
        estadosDoBrasil.put("CE", "Ceatá");
        estadosDoBrasil.put("ES", "Espírito Santo");
        estadosDoBrasil.put("GO", "Goias");
        estadosDoBrasil.put("MA", "Maranhão");
        estadosDoBrasil.put("MT", "Mato Grosso");
        estadosDoBrasil.put("MS", "Mato Grosso do Sul");
        estadosDoBrasil.put("MG", "Minas Gerais");
        estadosDoBrasil.put("PA", "Pará");
        estadosDoBrasil.put("PB", "Paraíba");
        estadosDoBrasil.put("PR", "Paraná");
        estadosDoBrasil.put("PE", "Pernambuco");
        estadosDoBrasil.put("PI", "Piauí");
        estadosDoBrasil.put("RJ", "Rio de Janeiro");
        estadosDoBrasil.put("RN", "Rio Grande do Norte");
        estadosDoBrasil.put("RS", "Rio Grande do Sul");
        estadosDoBrasil.put("RO", "Rondônia");
        estadosDoBrasil.put("RR", "Roraima");
        estadosDoBrasil.put("SC", "Santa Catarina");
        estadosDoBrasil.put("SP", "São Paulo");
        estadosDoBrasil.put("SE", "Sergipe");
        estadosDoBrasil.put("TO", "Tocantins");

        // Remove Estado de Minas Gerais
        estadosDoBrasil.remove("MG");

        // Adicione Distrito Federal
        estadosDoBrasil.put("DF", "Distrito Federal");

        // Verifique o tamanho do Map
        System.out.println(estadosDoBrasil.size());

        // Remove o Estado do Mato Grosso usando o nome
        String retiraEstado = "Mato Grosso";
        for (String estados : estadosDoBrasil.keySet()) {
            if (estadosDoBrasil.get(estados) == retiraEstado) {
                retiraEstado = estados;
            }
        }
        estadosDoBrasil.remove(retiraEstado);

        //Listar Estados pelo nome e pela sigla
        for (String estados : estadosDoBrasil.keySet()) {
            System.out.println(estadosDoBrasil.get(estados) + " - " + estados);
        }

    }

}
