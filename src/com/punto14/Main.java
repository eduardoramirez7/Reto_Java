package com.punto14;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        Numero num = new Numero();

        System.out.print("Digite el numero inicial: ");
        int numero = s.nextInt();
        num.incrementarNumero(numero);

    }
}
