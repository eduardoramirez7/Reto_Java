package com.punto13;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Dia {

    public void calcularFechayHoraActual(){
        LocalDate ld = LocalDate.now();
        LocalTime lt = LocalTime.now();
        DateTimeFormatter fld = DateTimeFormatter.ofPattern("YYYY/MM/dd");
        DateTimeFormatter flt = DateTimeFormatter.ofPattern("HH:mm:ss");
        System.out.println("Fecha y Hora actual\n("+ld.format(fld)+") ("+lt.format(flt)+")");
    }
}
