package com.punto15;

import java.util.Scanner;

public class Menu {

    public void menuOpciones(){

        Scanner s = new Scanner(System.in);
        int opcion = 0;

        do{
            System.out.println("\n****** GESTIÓN CINEMATOGRÁFICA ******");
            System.out.println("1-NUEVO ACTOR");
            System.out.println("2-BUSCAR ACTOR");
            System.out.println("3-ELIMINAR ACTOR");
            System.out.println("4-MODIFICAR ACTOR");
            System.out.println("5-VER TODOS LOS ACTORES");
            System.out.println("6-VER PELÍCULAS DE LOS ACTORES");
            System.out.println("7-VER CATEGORÍA DE LAS PELÍCULAS DE LOS ACTORES");
            System.out.println("8-SALIR");
            System.out.println("Digite la opción que desea: ");
            opcion = s.nextInt();

            switch (opcion){
                case 8:
                    break;
                default:
                    if(opcion > 8)
                        System.out.println("OPCIÓN INCORRECTA");
            }
        }while(opcion != 8);
    }
}
