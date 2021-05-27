package com.punto8;

public class Dia {
    public void esDiaLaboral(String dia){
        switch(dia){
            case "lunes":
                System.out.println("Lunes es dia laboral");
                break;
            case "martes":
                System.out.println("Martes es dia laboral");
                break;
            case "miercoles":
                System.out.println("Miércoles es dia laboral");
                break;
            case "jueves":
                System.out.println("Jueves es dia laboral");
                break;
            case "viernes":
                System.out.println("Viernes es dia laboral");
                break;
            case "sabado":
                System.out.println("Sábado es dia laboral");
                break;
            case "domingo":
                System.out.println("Domingo es dia NO laboral");
                break;
            default:
                System.out.println("El día no existe");
        }
    }
}
