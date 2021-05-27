package com.punto2;

public class Numero {

    public void comparacionNumeros(int numero1, int numero2){
        if (numero1>numero2){
            System.out.println(numero1+" es mayor que "+numero2);
        }else if(numero2>numero1){
            System.out.println(numero2+" es mayor que "+numero1);
        }else{
            System.out.println("Los numeros son iguales");
        }
    }

}
