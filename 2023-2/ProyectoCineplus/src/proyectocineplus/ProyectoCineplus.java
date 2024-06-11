/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectocineplus;
import proyectocineplus.gestion.Empresa;
import proyectocineplus.modelo.*;
/**
 *
 * @author otro3
 */
public class ProyectoCineplus {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Empresa empresa = new Empresa();
        
        System.out.println("Código único de clientes corporativos es un aleatorio par entre 1200 y 5400");          
        Cliente objCliente1 = new ClienteCorporativo("Jose Pérez","Av. Javier prado 1236", 717, "La Victoria",1234567890,"Europo Gomez");
        Cliente objCliente2 = new ClienteCorporativo("Manuela Ramos", "Av. Arequipa 5632", 15614, "San Isidro", 1087564321, "Jorge Pineda");
        
        System.out.println("Código único de clientes preferentes es un aleatorio múltiplo de 7 entre 5000 y 1000");  
        Cliente objCliente3 = new ClientePreferente("Carla Romero", "Av. Arenales 136", 124f, "Lince", "TARJETA 486236", "Toyota");
        Cliente objCliente4 = new ClientePreferente("Juan Acevedo", "Av. La Encalada 1224", 300, "Surco", "TARJETA 48535", "Mercedes");
        
        System.out.println("Código único de clientes estándar es un aleatorio impar entre 11000 y 15000");  
        Cliente objCliente5 = new ClienteEstandar("Carlos Chavez", "Av. Arenales 1358", 350, "Lince", "DNI 43045693", "19/07/1985");
        Cliente objCliente6 = new ClienteEstandar("Susana Marcos", "Av. La Encalada 124", 200, "Surco", "DNI 24636587", "06/09/2001");
        
        empresa.agregar(objCliente1);
        empresa.agregar(objCliente2);
        empresa.agregar(objCliente3);
        empresa.agregar(objCliente4);
        empresa.agregar(objCliente5);
        empresa.agregar(objCliente6);
        
        empresa.imprimirMembretes();
        
        System.out.println("Descuento Máximo para clientes corporativos: " + empresa.getMaximoTotalDescuentoClientesCorporativos());

    }
    
}
