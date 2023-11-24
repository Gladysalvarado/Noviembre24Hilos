package com.corenetworks.presentacion;

import java.util.Scanner;

public class Ejercicio6 {
   /* Comparar tres números y decir cuál es el mayo*/
    public static void main(String[] args) {
        int num1 = 7;
        int num2 = 5;
        int num3 = 6;
        int mayor = num1;
        if (num1 > num2 && num1 > num3) {
            System.out.println("El mayor es " + num1);
        } else if (num2 > num1 && num2 > num3) {
            System.out.println("El mayor es " + num2);
        } else {
            System.out.println("El mayor es " + num3);
        }





    }
}