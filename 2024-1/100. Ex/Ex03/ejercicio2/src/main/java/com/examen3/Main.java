package com.examen3;

public class Main {
    public static void main(String[] args) {
        Aeronave avion = new Avion("Concorde", "Boeing", 2500, 300, 100);
        Aeronave helicoptero = new Helicoptero("Tucan", "Airbus", 1800, 400, 150, 30);
        Aeronave planeador = new Planeador("Pajarito", "AirToy", 600, 80);

        double recorrido1 = 2000;
        double recorrido2 = 2000;
        double recorrido3 = 2000;

        int ronda = 0;

        while (recorrido1 > 0 && recorrido2 > 0 && recorrido3 > 0) {

            ronda++;

            System.out.println("Ronda " + ronda);

            recorrido1 -= avion.getVelocidadDeVuelo();
            recorrido2 -= helicoptero.getVelocidadDeVuelo();
            recorrido3 -= planeador.getVelocidadDeVuelo();

            System.out.println("\nRecorrido del avion: " + recorrido1);
            System.out.println("\nRecorrido del helicóptero: " + recorrido2);
            System.out.println("\nRecorrido del planeador: " + recorrido3);
        }

        if (recorrido1 <= 0)
            System.out.println("\nEl avion ha ganado!");
        else if (recorrido2 <= 0)
            System.out.println("\nEl helicóptero ha ganado!");
        else
            System.out.println("\nEl planeador ha ganado!");

    }
}