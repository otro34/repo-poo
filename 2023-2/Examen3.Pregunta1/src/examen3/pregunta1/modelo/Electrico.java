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
public class Electrico extends MonstruoDeBolsillo {

    private float potenciaEnVoltios;
    
    public Electrico(float peso, float talla, String nombre, String sexo, String apodo, 
            float potenciaEnVoltios) {
        super(peso, talla, nombre, sexo, apodo);
        this.tipo = "Eléctrico";
        this.potenciaEnVoltios = potenciaEnVoltios;
    }
    
}
