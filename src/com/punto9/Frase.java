package com.punto9;

import java.util.Scanner;

public class Frase {

    public void cambiarLetras(String frase){
        System.out.println("\nFrase inicial: "+frase);
        frase = frase.replace('a', 'e');
        frase = frase.concat(solicitarFrase());
        System.out.println("Nueva frase es: " + frase);
    }
    public String solicitarFrase(){
        Scanner s = new Scanner(System.in);
        System.out.print("Escriba su frase adicional: ");
        String frase = s.nextLine();
        return frase;
    }
}
