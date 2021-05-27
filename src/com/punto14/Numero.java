package com.punto14;

public class Numero {

    public void incrementarNumero(int numero){
        System.out.println("Incremento de numeros de 2 en 2");
        for(int i = numero; i <= 1000; i = (i + 2)){
            System.out.println(i);
        }
    }
}
