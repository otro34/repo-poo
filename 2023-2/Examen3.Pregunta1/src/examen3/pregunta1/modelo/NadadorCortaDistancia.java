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
public class NadadorCortaDistancia extends Nadador {
    
    private float resistenciaCorporal;
    
    public NadadorCortaDistancia(float peso, float talla, String nombre, 
            String sexo, String apodo, float tiempoPromedioEnSuperficie,
            float resistenciaCorporal) {
        super(peso, talla, nombre, sexo, apodo, tiempoPromedioEnSuperficie);
        this.resistenciaCorporal = resistenciaCorporal;
        this.apodo  = "Nadador de Corta Distancia";
    }
    
}
