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
public class Nadador extends MonstruoDeBolsillo {

    protected float tiempoPromedioEnSuperficie;
    
    public Nadador(float peso, float talla, String nombre, String sexo, String apodo,
                float tiempoPromedioEnSuperficie) {
        super(peso, talla, nombre, sexo, apodo);
        this.tiempoPromedioEnSuperficie = tiempoPromedioEnSuperficie;
        this.tipo = "Nadador";
    }
    
    @Override
    public String toString() {
        return this.tipo + " - " + this.nombre;
    }
    
}
