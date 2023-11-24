package com.corenetworks.presentacion;

public class Ejercicio7Bucle {
    public static void main(String[] args) {
        /*Ejercicio 7.
        Hallar todas las tablas de multiplicar con for anidados*/
        for (int i = 1; i<=10; i++){
            System.out.println("tabla de multiplicar del : "+i);
            for (int y= 1; y<=10; y++){
                System.out.println(i+" * " +y+ " = "+ i*y);
            }
        }

    }
}
