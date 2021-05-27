package com.punto17;

import java.util.Scanner;

public class Main {


    private static final String [] LetrasConsumoEnergetico = {"A", "B", "C", "D", "E", "F"};

    public static void main(String[] args) {


        Electrodomestico elec1 = new Electrodomestico(20,20);
        elec1.comprobarConsumoEnergetico('C');
        elec1.precioFinalElectrodomestico();

        Lavadora lav = new Lavadora(100,30, 10);
        System.out.println("Precio Total Lavadora: "+lav.precioFinal());

        Television tv = new Television(100,"blanco","B",20,40,true);
        System.out.println("Precio Total Televisor"+tv.precioFinal());

    }

}
