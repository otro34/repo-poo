/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectoadministracionlugarespublicos;

import projectoadministracionlugarespublicos.models.Instalacion;
import projectoadministracionlugarespublicos.models.LugarPublico;
import projectoadministracionlugarespublicos.models.Parque;
import projectoadministracionlugarespublicos.models.Plaza;

/**
 *
 * @author otro3
 */
public class ProjectoAdministracionLugaresPublicos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
       Parque parqueCastilla = new Parque("11-03-1960",1500,"Lince"); 
        
       LugarPublico<Parque> lugarParqueCastilla = new LugarPublico<Parque>(1500,parqueCastilla);
       
       lugarParqueCastilla.agregarInstalacion(new Instalacion(150,200));
       
       lugarParqueCastilla.agregarInstalacion(new Instalacion(200,300));
       
       Plaza plazaMancoCapac = new Plaza("11-04-2021", 1600,"Surquillo", 10);
       
       LugarPublico<Plaza> lugarPlazaMancoCapac = new LugarPublico<Plaza>(1600,plazaMancoCapac);
       
       lugarPlazaMancoCapac.agregarInstalacion(new Instalacion(400,500));
       
        System.out.println("Valoracion de Parque Castilla: " + lugarParqueCastilla.getValoracion());
        
        System.out.println("El porcentaje de areas verdes es: " + lugarParqueCastilla.getAreaVerdeRequerida() + "%");
    }
    
}
