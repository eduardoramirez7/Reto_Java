package com.punto8;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Dia dia  = new Dia();
        System.out.print("Escriba un día de la semana: ");
        String diaSemana = s.next();
        diaSemana = diaSemana.toLowerCase();
        dia.esDiaLaboral(diaSemana);
    }
}
