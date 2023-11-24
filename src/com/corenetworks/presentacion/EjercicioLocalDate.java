package com.corenetworks.presentacion;

import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class EjercicioLocalDate {
    public static void main(String[] args) {
        //Calcular la edad de una persona que nació el 3 de septiembre 1998*/
        //Calcular la edad de una persona que nació el 3 de septiembre 1998
        Period edadP = Period.between(LocalDate.of(1998,9,3),LocalDate.now());
        System.out.println("Edad"+edadP.getYears());
        long edad = ChronoUnit.YEARS.between(LocalDate.of(1998,9,3),LocalDate.now());
        System.out.println("Edad " + edad);





    }
}
