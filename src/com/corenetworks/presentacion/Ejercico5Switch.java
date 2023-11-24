package com.corenetworks.presentacion;

public class Ejercico5Switch {
    public static void main(String[] args) {
        String resultado="";
        char num ='v';
        switch (num){
            case'I','i':
                resultado="uno";
                break;
            case'V','v':
                resultado= "Cinco";
                break;
            case'X','x':
                System.out.println("Diez");

                break;

            case'L','l':
                System.out.println("Cien");

                break;
            case'C','c':
                System.out.println("Quinientos");
                break;
            case'D','d':
                System.out.println("Mil");
                break;
            case'W','w':
                System.out.println("diezMil");
                break;

        }
    }
}
