/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen3.pregunta1.modelo;

/**
 *
 * @author otro3
 */
public class MonstruoDeBolsillo {
    protected float peso;
    protected float talla;
    protected String nombre;
    protected String sexo;
    protected String apodo;
    protected String tipo;

    public MonstruoDeBolsillo(float peso, float talla, String nombre, String sexo, String apodo) {
        this.peso = peso;
        this.talla = talla;
        this.nombre = nombre;
        this.sexo = sexo;
        this.apodo = apodo;
        this.tipo = "Monstruo de Bolsillo";
    }
    @Override
    public String toString() {
        return this.tipo + " - " + this.nombre;
    }
    
    
}
