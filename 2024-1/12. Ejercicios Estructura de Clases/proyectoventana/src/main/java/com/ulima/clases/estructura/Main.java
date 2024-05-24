package com.ulima.clases.estructura;

public class Main {
    public static void main(String[] args) {
        System.out.println("Calculando el área de la pared con 2 ventanas circulares de diferente tamaño");

        Cuadrado pared = new Cuadrado(4);

        Circulo ventana1 = new Circulo(1);
        Circulo ventana2 = new Circulo(1.5d);

        double areaPared = pared.getArea();
        double areaVentana1 = ventana1.getArea();
        double areaVentana2 = ventana2.getArea();

        double areaFinal = areaPared - (areaVentana1 + areaVentana2);

        System.out.println("El área pintada de la pared es: " + areaFinal);

        System.out.println("Agregando una puerta: ");

        Rectangulo puerta = new Rectangulo(1,2);

        double areaPuerta = puerta.getArea();

        double areaParedConPuerta = areaFinal - areaPuerta;

        System.out.println("El área pintada de la pared con la puerta es: " + areaParedConPuerta);
    }
}