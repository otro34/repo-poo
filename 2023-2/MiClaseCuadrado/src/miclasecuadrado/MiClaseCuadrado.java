/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package miclasecuadrado;

/**
 *
 * @author otro3
 */
public class MiClaseCuadrado {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Cuadrado cuadrado1 = new Cuadrado(2);
        
        System.out.println(cuadrado1.getDatos());
        
        cuadrado1.setLado(5);
                
        System.out.println(cuadrado1.getDatos());
        
        System.out.println("El perímetro del cuadrado es: " + cuadrado1.getPerimetro());
        
        System.out.println("El área del cuadrado es: " + cuadrado1.getArea());
    }
    
}
