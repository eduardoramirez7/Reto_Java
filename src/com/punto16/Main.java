package com.punto16;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ArrayList<Persona> personas = new ArrayList() ;
        String nombre;
        String sexo ="";
        int edad;
        double peso;
        double altura;

        Scanner s = new Scanner(System.in);

        System.out.println("\nREGISTRO DE PERSONAS DE PERSONAS");
        System.out.println("_________________________________________________");
        System.out.print("Nombre: ");
        nombre = s.nextLine();
        System.out.print("Sexo (H o M): ");
        sexo = s.nextLine();
        System.out.print("Edad: ");
        edad = s.nextInt();
        System.out.print("Peso (Kg): ");
        peso = s.nextDouble();
        System.out.print("Altura (m): ");
        altura = s.nextDouble();
        System.out.println("_________________________________________________");

        Persona persona1 = new Persona(nombre, edad, sexo, peso, altura);
        personas.add(persona1);
        Persona persona2 = new Persona(nombre, edad, sexo);
        personas.add(persona2);
        Persona persona3 = new Persona();

        persona3.setNombre(nombre);
        persona3.setEdad(edad);
        sexo = persona3.comprobarSexo(sexo);
        persona3.setSexo(sexo);
        persona3.setPeso(peso);
        persona3.setAltura(altura);
        personas.add(persona3);

        System.out.println("\nLISTADO DE PERSONAS");
        System.out.println("_____________________________________");
        for(int i = 0; i < personas.size(); i ++){
            System.out.println((i + 1)+". Persona");
            System.out.println("_____________________________________");
            System.out.println(personas.get(i).toString());
            System.out.println("IMC: " + mensajeIMC(personas.get(i).calcularIMC()));
            System.out.println(mensajeMayorEdad(personas.get(i).esMayorDeEdad()) + "\n");
            System.out.println("_____________________________________");
        }
    }

    private static String mensajeIMC(int peso) {
        String mensaje = "";
        switch (peso){
            case -1:
                mensaje = "La persona está en su peso ideal";
                break;
            case 0:
                mensaje =  "La persona está por debajo de su peso ideal";
                break;
            case 1:
                mensaje = "La persona está en sobrepeso";
                break;
            default:
                mensaje = "No es posible calcular IMC";
        }
        return mensaje;
    }

    private static String mensajeMayorEdad(boolean esMayorDeEdad) {
        String mensaje = "";
        if(esMayorDeEdad){
            mensaje = "Es mayor de edad";
        }
        else{
            mensaje = "Es menor de edad";
        }
        return mensaje;
    }

}
