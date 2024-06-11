/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package resolucionexamen1;

import java.util.Scanner;

/**
 *
 * @author otro3
 */
public class ResolucionExamen1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Ingrese numero de colchones vendidos en el mes: ");
        Scanner objScanner = new Scanner(System.in);
        
        int nroDeColchones = objScanner.nextInt();
        
        float sueldoBase = 3500;
        float precioColchon = 1200;
        float ventasDelMes = nroDeColchones * precioColchon;
        float comision = 0;
        
        if (ventasDelMes <= 12000) {
            comision = ventasDelMes * 0.03f;
        } else if (ventasDelMes <= 24000) {
            comision = ventasDelMes * 0.05f;
        } else {
            comision = ventasDelMes * 0.10f;
        }
        
        float sueldoFinal = sueldoBase + comision;
        
        System.out.println("El sueldo final es: S/" + sueldoFinal);
    }
    
}
