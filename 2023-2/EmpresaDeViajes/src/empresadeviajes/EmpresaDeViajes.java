/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package empresadeviajes;
import empresadeviajes.gestion.Empresa;
import empresadeviajes.modelo.Agente;
import empresadeviajes.modelo.Crucero;
import empresadeviajes.modelo.Paquete;
import empresadeviajes.modelo.Pasaje;
/**
 *
 * @author otro3
 */
public class EmpresaDeViajes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Empresa objEmpresa = new Empresa("Empresa Viajes SAC");
        
        Agente agente = new Agente("Juan Agente", "0001" , "01/01/2022");
              
        Crucero objCrucero1 = new Crucero(1, "11/10/2023", "11/11/2023", 100, 
                9000, 0, 10, agente, 30, 10);
        Paquete objPaquete = new Paquete(2, "11/10/2023", "11/11/2023", 
                20, 700, 0, 10, agente, 12, 4);
        Pasaje objPasaje = new Pasaje(3, "11/10/2023", "11/11/2023", 15, 
                800, 0, 20, agente, 
                "AeroPerú", "JFK", false);
        
        objEmpresa.registro(objCrucero1);
        objEmpresa.registro(objPaquete);
        objEmpresa.registro(objPasaje);
        
        objEmpresa.imprimirProductos();
        
        System.out.println("Monto total Acumulado: " + objEmpresa.getMontoTotalAcumulado());
        
    }
    
}
