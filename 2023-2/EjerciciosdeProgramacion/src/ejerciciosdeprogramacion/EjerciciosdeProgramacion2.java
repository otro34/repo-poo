/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosdeprogramacion;
import java.util.Scanner;

/**
 *
 * @author otro3
 */
public class EjerciciosdeProgramacion2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Ingrese subtotal:");
        
        double subtotal = sc.nextDouble();
        
        System.out.println("Ingrese tasa de gratuidad (en %)");
        
        double tasaGratuidad = sc.nextDouble();
        
        double gratuidad = tasaGratuidad * subtotal / 100;
        
        double total = subtotal + gratuidad;
        
        System.out.println("Subtotal: " + subtotal + 
                            "\nTasa de Gratuidad: " + tasaGratuidad + "%"
                + "\nGratuidad: " + gratuidad
                + "\nTotal:" + total);
        
        
    }
    
}
