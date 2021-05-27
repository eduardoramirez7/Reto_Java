package com.punto3;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Circulo circulo = new Circulo();
        Scanner s = new Scanner(System.in);
        System.out.print("Digite el radio del círculo: ");
        String radioC = s.next();
        circulo.calcularArea(radioC);
    }
}
