package com.ulima.poo.clases.estructura;

public class Libro {
    private int codigo;
    private String titulo;
    private String autor;
    private double precioUnitario;
    private int unidadesVendidas;

    public Libro(int codigo, String titulo, String autor, double precioUnitario) {
        this.codigo = codigo;
        this.titulo = titulo;
        this.autor = autor;
        this.precioUnitario = precioUnitario;
        this.unidadesVendidas = 0;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public double getPrecioUnitario() {
        return precioUnitario;
    }

    public void setPrecioUnitario(double precioUnitario) {
        this.precioUnitario = precioUnitario;
    }

    public int getUnidadesVendidas() {
        return unidadesVendidas;
    }

    public void setUnidadesVendidas(int unidadesVendidas) {
        this.unidadesVendidas = unidadesVendidas;
    }

     /* Método que genera aleatoriamente unidades vendidas entre un número
      * mayor a 0 y menor a 60
      */

    public void vender() {
        this.unidadesVendidas = (int) (Math.random() * 60) + 1;
    }        

    public double calcularTotalVentas() {
        return this.unidadesVendidas * this.precioUnitario;
    }

    public String toString() {
        return "Código: " + this.codigo + "\n" +
               "Título: " + this.titulo + "\n" +
               "Autor: " + this.autor + "\n" +
               "Precio unitario: " + this.precioUnitario + "\n" +
               "Unidades vendidas: " + this.unidadesVendidas + "\n" +
               "Total ventas: " + this.calcularTotalVentas();
    }
}
