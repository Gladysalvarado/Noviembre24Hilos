package com.corenetworks.presentacion;

import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class EjercicioLocalDate4 {
    public static void main(String[] args) {
        //Calcular los dias desde el inicio del curso
        Period diasEstudiados = Period.between(LocalDate.of(2023,10,9),LocalDate.now());
        System.out.println(diasEstudiados.getDays());
        long diasTranscurridos = ChronoUnit.DAYS.between(LocalDate.of(2023,10,9), LocalDate.now());
        System.out.println("Dias transcurridos "+diasTranscurridos);

        //Duración del curso
        System.out.println(Period.between(LocalDate.of(2024,3,15),LocalDate.of(2023,10,9)));
    }
}


