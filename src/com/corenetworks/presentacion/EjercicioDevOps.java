package com.corenetworks.presentacion;

public class EjercicioDevOps {
    public static void main(String[] args) {
        /*Mostrar el numero de caracteres del texto anterior
        Mostrar la posicion de la primera palabra DevOps
        Mostrar la posicion de la ultima palabra menos
        Mostrar el texto en mayuscula
        Mostrar el texto en minúscula
        Extraer la primera palabra trabajo*/

                String frase="DevOps es un marco de trabajo y una filosofía en\n" +
                        "        constante evolución que promueve un mejor desarrollo\n" +
                        "       de aplicaciones en menos tiempo y la rápida publicación de nuevas\n" +
                        "        o revisadas funciones de software o productos para los clientes";
        System.out.println(frase.length());
        System.out.println(frase.indexOf("DevOps"));
        System.out.println(frase.indexOf("menos"));
        System.out.println(frase.toUpperCase());
        System.out.println(frase.toLowerCase());
        System.out.println(frase.indexOf("trabajo"));



    }
}
