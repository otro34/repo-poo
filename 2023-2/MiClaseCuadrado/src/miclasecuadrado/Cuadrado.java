/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package miclasecuadrado;

/**
 *
 * @author otro3
 */
public class Cuadrado {
    private int lado;
    
    //Constructor
    public Cuadrado(int lado){
       this.lado = lado; 
    }
    
    //getters y setters
    
    public int getLado() {
       return this.lado;
    }
    
    public void setLado(int lado) {
        this.lado = lado;
    }
    
    // otros metodos
    
    public String getDatos() {
        return "El tamaño de los lados del cuadrado es: " + this.lado ;
    }
    
    public int getPerimetro() {
        return this.lado*4;
    }
    
    public double getArea() {
        return Math.pow(lado, 2);
    }
    
    public static void Calcular() {
    
    }
}
