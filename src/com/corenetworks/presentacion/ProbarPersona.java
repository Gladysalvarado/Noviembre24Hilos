package com.corenetworks.presentacion;

import com.corenetworks.modelo.PersonaEj3;

public class ProbarPersona {
    public static void main(String[] args) {
        PersonaEj3 p1 = new PersonaEj3(33);

        System.out.println("Edad en dias -> " + p1.CalculaEdadDias());
        System.out.println("Edad en segundos -> " + p1.CalculaEdadSegundos());
    }
    }

