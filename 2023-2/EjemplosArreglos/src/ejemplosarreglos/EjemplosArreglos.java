/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplosarreglos;

/**
 *
 * @author otro3
 */
public class EjemplosArreglos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String[] carros = {"Volvo", "BMW", "Ford", "Mazda"};
        
        int[] numeros = {1,2,3,4,5}; 
        
        double[] numerosGrandes = new double[5];
        
        numerosGrandes[0] = 234234234;
        
        System.out.println(numerosGrandes[0]);
        
        for(int i = 0; i < carros.length; i++){
            System.out.println(carros[i]);
        }
        
        for(String carro:carros) {
            System.out.println(carro);
        }
        
    }
    
}
