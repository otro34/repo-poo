package com.examen3;

public class TiendaDeMusica {
    private int MAX = 10;
    private Producto[] productos;
    private int nroProductos;

    public TiendaDeMusica() {
        this.productos = new Producto[MAX];
        this.nroProductos = 0;
    }

    public void agregar(Producto producto) {
        if (nroProductos < 10) {
            productos[nroProductos] = producto;
            nroProductos++;
            System.out.println("Producto registrado.");
        } else
            System.out.println("Error agregando.");
    }

    public Producto buscar(String codigo) {
        for (Producto producto : productos) {
            if (producto != null && producto.getCodigo().equals(codigo)) {
                return producto;
            }
        }
        return null;
    }

    public void imprimirProductos() {
        for (Producto producto : productos) {
            if (producto != null)
                System.out.println(producto);
        }
    }
}
