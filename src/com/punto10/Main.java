package com.punto10;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Frase fr = new Frase();
        Scanner s = new Scanner(System.in);
        System.out.print("Escriba una frase: ");
        String frase = s.nextLine();
        fr.eliminarEspacios(frase);
    }
}
