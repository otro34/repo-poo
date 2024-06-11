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
public class NadadorLargaDistancia extends Nadador {

    private float capacidadBronquial;
    
    public NadadorLargaDistancia(float peso, float talla, String nombre, String sexo, 
            String apodo, float tiempoPromedioEnSuperficie, float capacidadBronquial) {
        super(peso, talla, nombre, sexo, apodo, tiempoPromedioEnSuperficie);
        this.capacidadBronquial = capacidadBronquial;
        this.apodo = "Nadador de Larga Distancia";
    }
    
}
