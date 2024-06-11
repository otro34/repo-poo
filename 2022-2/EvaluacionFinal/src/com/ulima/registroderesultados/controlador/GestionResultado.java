/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ulima.registroderesultados.controlador;
import com.ulima.registroderesultados.modelo.Resultado;
import java.util.ArrayList;
/**
 *
 * @author otro3
 */
public class GestionResultado {
    private ArrayList<Resultado> resultados;
    private int nroResultados;
    
    public GestionResultado() {
        this.resultados = new ArrayList();
        this.nroResultados = 0;
    }
    
    public Resultado insertar(Resultado resultado) {
        
        //Calcule ganador y actualice el valor
        
        resultado.setId(nroResultados + 1);
        resultados.add(resultado);
        nroResultados++;
        return resultado;
    }
    
    public Resultado buscar(int id) {
        for(Resultado resultado:resultados) {
            if (resultado.getId() == id)
                return resultado;
        }
        
        return null;
    }

    public ArrayList<Resultado> getRutas() {
        return resultados;
    }
    
    
}
