package com.corenetworks.presentacion;

import java.time.LocalDate;

public class EjercicioLocalDate3 {
    public static void main(String[] args) {
        //Restar 3 meses a la fecha de final de curso 22 de marzo de 2024
        System.out.println(LocalDate.of(2024,3,15).minusMonths(3));
    }
}
