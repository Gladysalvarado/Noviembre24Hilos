package com.corenetworks.presentacion;

public class Ejercicio1Switch {
    public static void main(String[] args) {
       /* Ejercicio 1
        Con un número del 1 al 7 decir a que día de la semana corresponde.*/
        int numero = 8;
        switch (numero) {
            case 1:
                System.out.println("Lunes");
                break;
            case 2:
                System.out.println("Martes");
                break;
            case 3:
                System.out.println("Miercoles");
                break;
            case 4:
                System.out.println("Jueves");
                break;
            case 5:
                System.out.println("Viernes");
                break;
            case 6:
                System.out.println("Sábado");
                break;
            case 7:
                System.out.println("Domingo");
                break;
            default:
                System.out.println("Valor invalido");
        }
    }
}

