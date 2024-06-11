/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectopelota;
import proyectopelota.implementacion.Pelota;

/**
 *
 * @author otro3
 */
public class ProyectoPelota {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //radio en cm
        Pelota objPelota1 = new Pelota();
        objPelota1.setRadio(22);
        objPelota1.setColor("Blanco");
        //otras pelotas
        Pelota objPelota2 = new Pelota();
        objPelota2.setRadio(23);
        objPelota2.setColor("Rojo");
        
        double volumen1 = objPelota1.hallarVolumen();
        double volumen2 = objPelota2.hallarVolumen();
        
        System.out.println("La pelota 1 tiene un volumen de: " + volumen1 
                            + ", su color es " + objPelota1.getColor() + 
                            " por lo que se trata de una pelota de " + objPelota1.hallarUso(objPelota1.getColor()));
        
        System.out.println("La pelota 2 tiene un volumen de: " + volumen2 + 
                            ", su color es " + objPelota2.getColor() + 
                            " por lo que se trata de una pelota de " + objPelota2.hallarUso(objPelota2.getColor()));
    }
    
}
