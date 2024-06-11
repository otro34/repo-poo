/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosdeprogramacion;
import java.util.Scanner;

/** jromaina@ulima.edu.pe
 *
 * @author otro3
 */
public class EjerciciosDeProgramacion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner objScanner = new Scanner(System.in);
        
        System.out.println("EJERCICIOS DE PROGRAMACION\n" + "--------------------------");
        
        
        System.out.println("1. Valor en If \n"
                + "2. Ejercicio Bucle\n"
                + "6. Area de un cilindro\n"
                + "7. Pies a metros\n"
                + "11. Regla de pago\n"
                + "0. SALIR.\n");
        
        System.out.println("\nPor favor, ingrese una opción: ");
        
        int opcion = objScanner.nextInt();
        
        switch(opcion) {
            case 1:
                //codigo del primer ejercicio
                float consumo = 0.0f;
                int velocidad = 120;
                
                if (velocidad>80) {
                    consumo = 10.0f;
                } else if (velocidad > 100) {
                    consumo = 12.0f;
                } else if (velocidad > 120) {
                    consumo = 15.0f;
                }
                
                System.out.println("El consumo es: " + consumo);
                    break;
            case 2: 
                //Ejercicio A
                
                double suma = 0.0f;
                for (int i = 2; i<=50;i++) {
                    suma = suma + (float)1/i; //casteo
                }
                
                System.out.println("La suma total es: "+suma);
                
                //Ejercicio B
                int nota;
                
                do {
                    System.out.println("Ingrese la nota: ");
                    nota = objScanner.nextInt();
                }while(nota > 0);
                
                System.out.println("La nota es 0. Se termina la lectura. ");
                
                //Ejercicio C
                System.out.println("Suma de 11 a 50");
                int acumulado = 0;
                for (int i = 11;i<=50;i++){
                    acumulado+=i;
                    System.out.println(acumulado);
                }
                
                break;
            case 6:
                
                System.out.println("Ingrese radio de cilindro: ");
                float radio = objScanner.nextFloat();
                System.out.println("Ingrese longitud de cilindro: ");
                float longitud = objScanner.nextFloat();
                
                float area = radio * radio * 3.1416f;
                float volumen = area * longitud;
                
                System.out.println("Area: "+area+", Volumen: "+volumen);
                
                break;
            case 7:
                System.out.println("Ingrese un valor en pies: ");
                float numeroEnPies = objScanner.nextFloat();
                float numeroEnMetros = numeroEnPies * 0.305f;
                
                System.out.println("El valor en metros es:"+numeroEnMetros);
                
                break;
            case 11:
                System.out.println("Ingrese el gasto: ");
                int gasto = objScanner.nextInt();
                        
                if (gasto <= 100) {
                    System.out.println("Pago en efectivo.");
                } else if (gasto > 100 && gasto < 300) {
                    System.out.println("Pago con tarjeta de débito");
                } else {
                    System.out.println("Pago con tarjeta de crédito");
                }
                
                break;
            case 0:
                System.out.println("Programa terminado.");
                break;
            default:
                System.out.println("No ha ingresado una opción válida.");
                break;
        }
        
        
    }
    
}
