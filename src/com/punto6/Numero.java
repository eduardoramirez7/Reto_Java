package com.punto6;

public class Numero {
    public void verificarParImpar(int numero) {
        for (int i=1; i<=numero;i++) {
            if ((i % 2) == 0)
                System.out.println(i+ " es par");
            else
                System.out.println(i + " es impar");
        }
    }
}
