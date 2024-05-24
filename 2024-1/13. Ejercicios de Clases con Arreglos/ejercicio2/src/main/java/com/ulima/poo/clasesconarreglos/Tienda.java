package com.ulima.poo.clasesconarreglos;

public class Tienda {
    private int[] stockProductos;

    public Tienda(int cantidadProductos) {
        stockProductos = new int[cantidadProductos];
    }

    /* definir stock de productos de forma aleatorea, numero entre 1 y 100 */

    public void definirStockProductos() {
        for (int i = 0; i < stockProductos.length; i++) {
            stockProductos[i] = (int) (Math.random() * 100) + 1;
        }
    }

    public void mostrarStockProductos() {
        for (int i = 0; i < stockProductos.length; i++) {
            System.out.println("Producto " + i + ": " + stockProductos[i]);
        }
    }

    /* productos con stock mayor a 50 */

    public void mostrarProductosConStockMayorA50() {
        for (int i = 0; i < stockProductos.length; i++) {
            if (stockProductos[i] > 50) {
                System.out.println("Producto " + i + ": " + stockProductos[i]);
            }
        }
    }
}
