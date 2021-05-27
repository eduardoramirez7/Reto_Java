package com.punto11;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner capture = new Scanner(System.in);
        Frase fr = new Frase();
        System.out.print("Escriba una frase: ");
        String frase = capture.nextLine();
        frase = frase.toLowerCase();
        fr.contarVocales(frase);
    }
}
