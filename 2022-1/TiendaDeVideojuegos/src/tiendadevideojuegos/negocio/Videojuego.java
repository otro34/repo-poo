/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tiendadevideojuegos.negocio;

/**
 *
 * @author otro3
 */
public class Videojuego {
    private int codigo;
    private String titulo;
    private String publisher;
    private int stock;
    private int precio;
    private String plataforma;
    
    public Videojuego(int codigo, String titulo, 
                        String publisher, int stock, 
                        int precio, String plataforma) {
        this.codigo = codigo;
        this.titulo = titulo;
        this.publisher = publisher;
        this.stock = stock;
        this.precio = precio;
        this.plataforma = plataforma;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getPublisher() {
        return publisher;
    }

    public int getStock() {
        return stock;
    }

    public int getPrecio() {
        return precio;
    }

    public String getPlataforma() {
        return plataforma;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public void setPlataforma(String plataforma) {
        this.plataforma = plataforma;
    }
    
    
    
    public String concantenarDatos() {
        return "--- VIDEOJUEGO --- \n" +
                "Codigo: " + this.codigo + "\n" + 
                "Titulo: " + this.titulo + "\n" + 
                "Publisher: " + this.publisher + "\n" + 
                "Stock: " + this.stock + "\n" + 
                "Precio: " + this.precio + "\n" + 
                "Plataforma: " + this.plataforma + "\n"; 
    }
    
}
