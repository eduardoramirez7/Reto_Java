package com.punto12;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        Palabra palabra = new Palabra();
        String palabra1;
        String palabra2;

        System.out.print("Escriba la primera palabra: ");
        palabra1 = s.nextLine();
        System.out.print("Escriba la segunda palabra: ");
        palabra2 = s.nextLine();
        palabra.validarPalabrasIguales(palabra1,palabra2);

    }
}
