package com.punto12;

public class Palabra {

    public void validarPalabrasIguales(String palabra1, String palabra2){
        if(palabra1.equals(palabra2))
            System.out.println("Las primer palabra ("+palabra1+") y la segunda palabra ("+palabra2+") son iguales");
        else if(palabra1.length() > palabra2.length())
                System.out.println("Las palabra ("+palabra1+") es mayor en longitud a la palabra ("+palabra2+")");
        else
            System.out.println("Las palabra ("+palabra2+") es mayor en longitud a la palabra ("+palabra1+")");
    }
}
