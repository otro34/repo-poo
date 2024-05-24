package com.ulima.poo.clasesconarreglos;

public class Main {
    public static void main(String[] args) {
        Tienda tienda = new Tienda(15);

        tienda.definirStockProductos();

        tienda.mostrarStockProductos();

        tienda.mostrarProductosConStockMayorA50();
    }
}