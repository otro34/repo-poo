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
public class Ejercicio9 {
    public static void main(String[] args) {
    // TODO code application logic here
    
    Scanner sc = new Scanner(System.in);
        
    System.out.println("Ingresar Numero de Niños");
    int nroNinos = sc.nextInt();
    
    int i = 1;
    
    float sumaTallaNinas = 0;
    float sumaTallaNinos = 0;
    float sumaPesoNinas = 0;
    float sumaPesoNinos = 0;
    
    int nNinos = 0;
    int nNinas = 0;
    
    while(i <= nroNinos) {
        System.out.println("Ingrese Sexo: ");
        String sex = sc.next();
        System.out.println("Ingrese Talla (m): ");
        float talla = sc.nextFloat();
        System.out.println("Ingrese Peso (Kg): ");
        float peso = sc.nextFloat();
        
        if (sex.equals("M")) {
            sumaTallaNinos += talla;
            sumaPesoNinos += peso;
            nNinos++;
        } else {
            sumaTallaNinas += talla;
            sumaPesoNinas += peso; 
            nNinas++;
        }
        
        i++;
    }
    
    System.out.println("El promedio de talla de niñas es: " + (sumaTallaNinas/nNinas));
    System.out.println("El promedio de talla de niños es: " + (sumaTallaNinos/nNinos));
    System.out.println("El promedio de peso de niñas es: " + (sumaPesoNinas/nNinas));
    System.out.println("El promedio de peso de niños es: " + (sumaPesoNinos/nNinos));        
    }
}
