package com.punto2;

import java.util.Scanner;

public class CompararNumeros {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Ingrese primer numero: ");
        int numero1 = s.nextInt();
        System.out.print("Ingrese segundo numero: ");
        int numero2 = s.nextInt();
        comparacionNumeros(numero1,numero2);
    }

    public static void comparacionNumeros(int numero1, int numero2){
        if (numero1>numero2){
            System.out.println(numero1+" es mayor que "+numero2);
        }else if(numero2>numero1){
            System.out.println(numero2+" es mayor que "+numero1);
        }else{
            System.out.println("Los numeros son iguales");
        }
    }

}
