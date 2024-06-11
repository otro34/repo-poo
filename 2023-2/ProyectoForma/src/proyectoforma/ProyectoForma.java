/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoforma;

import java.util.ArrayList;

/**
 *
 * @author otro3
 */
public class ProyectoForma {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Forma forma1 = new Circulo("Circulo", 30);
        Forma forma2 = new Rectangulo("Rectangulo", 10,5);
        Forma forma3 = new Cuadrado("Cuadrado", 10);
        
        String str = "";
        
        ArrayList<Forma> lista = new ArrayList<Forma>();
        
        lista.add(forma3);
        lista.add(forma2);
        lista.add(forma1);
        
        for(Forma forma:lista) {
            forma.imprimirDatos();
        }
    }
    
}
