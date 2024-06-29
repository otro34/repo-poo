package com.ulima.poo.examen2;

public class Venta {
    private String marca;
    private String modelo;
    private String dni;
    private double precioBase;
    private double[] adicionales;

    public Venta(String marca, String modelo, String dni, double precioBase, double[] adicionales) {
        this.marca = marca;
        this.modelo = modelo;
        this.dni = dni;
        this.precioBase = precioBase;
        this.adicionales = adicionales;
    }

    public double getTotal() {

        double sumaAdicionales = 0;

        for (double d : adicionales) {
            sumaAdicionales += d;
        }

        double total = precioBase + sumaAdicionales * 1.18;

        return total;
    }

    public void imprimir() {
        double sumaAdicionales = 0;

        for (double d : adicionales) {
            sumaAdicionales += d;
        }

        String datos =  "Marca: " + marca + 
            "\nModelo: " + modelo + 
            "\nDNI: " + dni + 
            "\nPrecio Base: S/ " + precioBase + 
            "\nAdicionales: S/ " + sumaAdicionales + 
            "\nTotal: S/ " + getTotal();

        System.out.println(datos);
        System.out.println();

    }

    
}
