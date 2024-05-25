package com.poo.clases.arreglosdeobjetos;

public class Main {
    public static void main(String[] args) {
        Persona persona1 = new Persona("Juan", "Acevedo", "00099933");
        Persona persona2 = new Persona("Edgar", "Sanchez", "11223344");
        Persona persona3 = new Persona("Luis", "Gomez", "99887744");

        //Persona[] personas = { persona1, persona2, persona3 };

        Persona[] personas = new Persona[3];

        personas[0] = persona1;
        personas[1] = persona2;
        personas[2] = persona3;

        for (Persona persona : personas) {
            System.out.println(persona.toString());
            System.out.println();
        }
    }
}