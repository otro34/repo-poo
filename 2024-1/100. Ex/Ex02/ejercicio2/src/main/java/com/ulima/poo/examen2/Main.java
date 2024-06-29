package com.ulima.poo.examen2;

public class Main {
    public static void main(String[] args) {
        
        //Definimos el mapa
        Cuadrado mapa = new Cuadrado(30);

        //base
        Cuadrado base = new Cuadrado (5);
        //torre
        Circulo torre = new Circulo(1.5d);

        double areaTotal = mapa.getArea();

        double areaBases = 2 * base.getArea();

        double areaTorres = 6 * torre.getArea();

        double areaSinVisibilidad = areaTotal - areaBases - areaTorres;

        System.out.println("Area Fog of War: " + areaSinVisibilidad);
        
    }
}