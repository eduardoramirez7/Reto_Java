package com.punto11;

public class Frase {

    public void contarVocales(String frase){

        int totalVocales = frase.replaceAll("[^aeiou]","").length();
        System.out.println("La longitud de la frase es " + frase.length()
                + " y la cantidad de vocales que tiene es: " + totalVocales);
    }
}
