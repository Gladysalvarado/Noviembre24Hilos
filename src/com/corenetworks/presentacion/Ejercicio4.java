package com.corenetworks.presentacion;

import java.util.Scanner;

public class Ejercicio4 {
    /*Devolver si un número es par o impar*/
    public static void main(String[] args) {
        int stop = 0;
        int entrada= 0;
        //instancia
        Scanner teclado = new Scanner(System.in);
        String par = "Es Par";
        String impar = "Es Impar";
        while (true){
            entrada = teclado .nextInt();
            if (entrada%2==0){
                System.out.println(par);
            }if (entrada%2!=0){
                System.out.println(impar);
            }if (entrada==0){
                break;
            }
        }
        System.out.println("se finalizo el programa con éxito");



    }
}
