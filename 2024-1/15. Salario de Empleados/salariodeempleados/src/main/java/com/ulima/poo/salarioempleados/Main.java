package com.ulima.poo.salarioempleados;

public class Main {
    public static void main(String[] args) {
        Empleado empleado1 = new Empleado("001", "Juan Perez", 140, 80);
        Empleado empleado2 = new Empleado("002", "Santiago Perez", 39, 80);

        System.out.println(empleado1.toString());
        System.out.println(empleado2.toString());
    }
}