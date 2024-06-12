package com.ulima.poo.salarioempleados;

public class Main {
    public static void main(String[] args) {
        Empleado empleado1 = new Empleado("001", "Juan Perez", 140, 80);
        Empleado empleado2 = new Empleado("002", "Luis Perez", 140, 80);
        Empleado empleado3 = new Empleado("003", "Hugo Perez", 60, 80);
        Empleado empleado4 = new Empleado("004", "Paco Perez", 35, 80);
        Empleado empleado5 = new Empleado("005", "Donald Perez", 70, 80);
        Empleado empleado6 = new Empleado("006", "Tio Rico Perez", 35, 80);
        Empleado empleado7 = new Empleado("007", "Pancracio Perez", 55, 80);
        Empleado empleado8 = new Empleado("008", "Edilberto Perez", 66, 80);
        Empleado empleado9 = new Empleado("009", "Julio Perez", 77, 80);
        Empleado empleado10 = new Empleado("010", "Ignacio Perez", 42, 80);
        Empleado empleado11 = new Empleado("011", "Luigi Perez", 43, 80);

        GestionEmpleado gestion = new GestionEmpleado();

        gestion.agregar(empleado1);
        gestion.agregar(empleado2);
        gestion.agregar(empleado3);
        gestion.agregar(empleado4);
        gestion.agregar(empleado5);
        gestion.agregar(empleado6);
        gestion.agregar(empleado7);
        gestion.agregar(empleado8);
        gestion.agregar(empleado9);
        gestion.agregar(empleado10);
        gestion.agregar(empleado11);

        gestion.imprimirMayorSalario();



    }
}