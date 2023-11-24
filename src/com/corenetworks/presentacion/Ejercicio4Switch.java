package com.corenetworks.presentacion;

public class Ejercicio4Switch {
    public static void main(String[] args) {
       /* Ejercicio 4
        Con una letra que contiene la variable estado decir el estado civil de la persona*/

        char estado = 's';

        switch (estado) {
            case 's':
                System.out.println("Soltero");
                break;

            case 'd':
                System.out.println("Divorciado");
                break;

            case 'v':
                System.out.println("Viudo");
                break;

            case 'c':
                System.out.println("Casado");
                break;
            default:
                System.out.println("El valor es invalido");
        }

    }
}