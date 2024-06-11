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
public class Volador extends MonstruoDeBolsillo{

    private float distanciaVueloPromedio;
    
    public Volador(float peso, float talla, String nombre, String sexo, 
            String apodo, float distanciaVueloPromedio) {
        super(peso, talla, nombre, sexo, apodo);
        
        this.distanciaVueloPromedio = distanciaVueloPromedio;
        this.tipo = "Volador";
    }
    
}
