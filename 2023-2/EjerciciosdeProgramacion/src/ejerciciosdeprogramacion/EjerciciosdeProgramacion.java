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
public class EjerciciosdeProgramacion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Ingrese valor: ");
        
        float piesOriginal = sc.nextFloat();
        
        float pieEnMetros = 0.305f;
        
        float resultado = piesOriginal * pieEnMetros;
        
        System.out.println("Pies en Metros: " + resultado);
        
        
        
    }
    
}
