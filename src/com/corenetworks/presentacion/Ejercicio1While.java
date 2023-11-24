package com.corenetworks.presentacion;

public class Ejercicio1While {
    public static void main(String[] args) {
       /* Ejercicio 1:
        Calcular el factorial de 25*/
        long factorial=1;
        int numero = 25;
        int i= 1;
        while ( i <= numero) {
            factorial = factorial * i;
            i++;
        }
        System.out.println(" El factorial de 25 es  " + factorial);


    }
}
