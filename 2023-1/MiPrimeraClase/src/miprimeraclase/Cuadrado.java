/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package miprimeraclase;

/**
 *
 * @author otro3
 */
public class Cuadrado {
    
    // propiedades
    
    private float lado;
    private float area;
    private float perimetro;
    
    
    //constructores
    public Cuadrado() {
        lado = 1;
    }
    
    public Cuadrado(float plado) {
        lado = plado;
    }    
    
    // métodos
    
    public float calcularArea() {
    
        return (float) Math.pow(lado, 2);
    }
    
}
