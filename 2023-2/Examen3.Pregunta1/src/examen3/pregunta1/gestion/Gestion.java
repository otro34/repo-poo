/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen3.pregunta1.gestion;

import examen3.pregunta1.modelo.MonstruoDeBolsillo;

/**
 *
 * @author otro3
 */
public class Gestion {
    private final int MAX = 10;
    private MonstruoDeBolsillo[] monstruos;
    private int nroMonstruos;

    public Gestion() {
        this.monstruos = new MonstruoDeBolsillo [MAX];
        this.nroMonstruos = 0;
    }
    
    public void agregar(MonstruoDeBolsillo monstruo) {
        if (nroMonstruos < MAX) {
            this.monstruos[nroMonstruos] = monstruo;
            nroMonstruos++;
        }
    }
    
    public void imprimirTodos() {
        for(int i = 0; i < nroMonstruos; i++) {
            System.out.println("(" + i + "): " + this.monstruos[i].toString());
        }
    }
    
    
    
}
