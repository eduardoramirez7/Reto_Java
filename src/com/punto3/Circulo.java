package com.punto3;

public class Circulo {

    private static double PI = Math.PI;

    public static void calcularArea(String radioC){
        double radio = Double.parseDouble(radioC);
        double area = PI * Math.pow(radio, 2);
        System.out.println("El área del círculo es: " + area + " metros cuadrados");
    }

}
