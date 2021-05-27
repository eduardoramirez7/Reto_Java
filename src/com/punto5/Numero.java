package com.punto5;

public class Numero {

    public void verificarParImpar(int numero){
        while(numero <= 100){
            if ((numero%2) == 0)
                System.out.println(numero+" es par");
            else
                System.out.println(numero+" es impar");
            numero += 1;
        }
    }

}
