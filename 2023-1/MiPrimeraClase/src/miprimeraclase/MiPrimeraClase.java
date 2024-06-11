/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package miprimeraclase;

/**
 *
 * @author otro3
 */
public class MiPrimeraClase {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Cuadrado objCuadrado = new Cuadrado();
        
        float areaCuadrado = objCuadrado.calcularArea();
        
        System.out.println("El area del cuadrado es " + areaCuadrado);
        
        Cuadrado objCuadradoMasGrande = new Cuadrado(21.5f);
        
        float areaCuadradoMasGrande = objCuadradoMasGrande.calcularArea();
        
        System.out.println("El area del cuadrado más grande es " + areaCuadradoMasGrande);
        
    }
    
}
