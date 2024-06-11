/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen3.pregunta1;

import examen3.pregunta1.gestion.Gestion;
import examen3.pregunta1.modelo.Electrico;
import examen3.pregunta1.modelo.NadadorCortaDistancia;
import examen3.pregunta1.modelo.NadadorLargaDistancia;
import examen3.pregunta1.modelo.Volador;

/**
 *
 * @author otro3
 */
public class Examen3Pregunta1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Gestion objGestion = new Gestion();
        
        Electrico objElectrico = new Electrico(111.11f, 0.50f,"Pikachu", "M", "Pikachu", 112.0f);
        Volador objVolador = new Volador(200.11f, 2.30f,"Dragonite", "F", "George", 50);
        NadadorCortaDistancia objNadadorCD = new NadadorCortaDistancia(50.11f, 0.90f,"Squirtle", "F", "Ikiko", 100,30f);
        NadadorLargaDistancia objNadadorLD = new NadadorLargaDistancia(50.11f, 0.90f,"Starmie", "M", "Harrison", 100,30f);
        
        objGestion.agregar(objVolador);
        objGestion.agregar(objElectrico);
        objGestion.agregar(objNadadorCD);
        objGestion.agregar(objNadadorLD);
        
        objGestion.imprimirTodos();
        
        
        
    }
    
}
