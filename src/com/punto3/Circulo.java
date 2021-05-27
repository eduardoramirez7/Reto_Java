package com.punto3;

import java.util.Scanner;

public class Circulo {

    public static final double PI = 3.1416;

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.print("Digite el radio del círculo: ");
        String radioC = s.next();
        double radio = Double.parseDouble(radioC);
        calcularArea(radio);

    }

    public static void calcularArea(Double valor){
        double area = PI * Math.pow(valor, 2);
        System.out.println("El área del círculo es: " + area + " metros cuadrados");
    }

}
