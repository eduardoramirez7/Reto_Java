package com.punto2;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Ingrese primer numero: ");
        int numero1 = s.nextInt();
        System.out.print("Ingrese segundo numero: ");
        int numero2 = s.nextInt();
        Numero numero = new Numero();
        numero.comparacionNumeros(numero1,numero2);
    }



}
