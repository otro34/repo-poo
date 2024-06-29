package com.examen3;

public class Main {
    public static void main(String[] args) {
        Producto prd1 = new CD("Pink", "Mizzundastood", "2000-09-09", 15, 10, false);
        Producto prd2 = new CD("The Beatles", "Yellow Submarine", "1969-09-09", 15, 10, false);
        Producto prd3 = new CD("Backstreet Boys", "Millenium", "2000-010-09", 15, 10, false);

        Producto prd4 = new Vinilo("Abba", "Voyage", "2023-01-01", 50, 20, VelocidadVinilo.TREINTA_Y_TRES);
        Producto prd5 = new Vinilo("Abba", "Super Trooper", "1979-01-01", 50, 20, VelocidadVinilo.TREINTA_Y_TRES);
        Producto prd6 = new Vinilo("Bon Jovi", "Always", "1979-01-01", 50, 20, VelocidadVinilo.TREINTA_Y_TRES);

        TiendaDeMusica tienda = new TiendaDeMusica();

        tienda.agregar(prd1);
        tienda.agregar(prd2);
        tienda.agregar(prd3);
        tienda.agregar(prd4);
        tienda.agregar(prd5);
        tienda.agregar(prd6);

        tienda.imprimirProductos();

    }
}