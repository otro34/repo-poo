/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arreglos;

/**
 *
 * @author otro3
 */
public class Arreglos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
        
//        System.out.println(cars[0]);
//        
//        cars[0] = "Audi";
//        
//        System.out.println(cars[0]);
//        
//        System.out.println(cars.length);
        
        for(int i = 0;i < cars.length;i++){
            System.out.println(cars[i]);
        }
        
        for(String car:cars) {
            System.out.println(car);
        }
    }
    
}
