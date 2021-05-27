package com.punto7;

import java.util.Scanner;

public class Numero {
    public void calacularMayorIgualaCero(){
        Scanner s = new Scanner(System.in);
        int num;
        do {
            System.out.print("Digite un número: ");
            num = s.nextInt();
        }while(num < 0);

        System.out.println("El número "+num+" es mayor o igual a cero");
    }
}
