package com.corenetworks.presentacion;

import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {
    /*Ejercicio 8
   /* Ver si un número es par y múltiplo de 3 y que saque mensajes del tipo:
    Es par y múltiplo de 3
    Es impar y múltiplo de 3
    Identificadores, palabras claves y tipos
    Página 4/7
    No es múltiplo de 3 pero es par
    No es ni par ni múltiplo de 3*/

        Scanner tecladoEntrada = new Scanner(System.in);
        int num1 = 0;
        int num2 = 0;
        num1 = tecladoEntrada.nextInt();
        num2 = tecladoEntrada.nextInt();
        if (num1 % num2 ==0 || num2 % num1 == 0){
            System.out.println("Los numeros son multiplos");
        }else{
            System.out.println("Los numeros no son multiplos");
        }
        tecladoEntrada.close();
    }
}


