package com.corenetworks.presentacion;

import java.util.Scanner;

public class Ejercicio5 {
    /*Comparar dos números y decir cuál es el mayor*/
    public static void main(String[] args) {
        int num1 = 18;
        int num2 = 8;
        if(num1>num2){
            System.out.println("El num1 es mayor al num2");
        }else if(num1 == num2){
            System.out.println("son iguales");
        }else{
            System.out.println("El num2 es mayor al num1");
        }
    }
}