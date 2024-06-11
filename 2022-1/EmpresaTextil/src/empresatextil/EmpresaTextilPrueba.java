/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package empresatextil;
import empresatextil.negocio.EmpresaTextil;
import empresatextil.negocio.Categoria;
import empresatextil.negocio.Talla;
import empresatextil.helpers.Aleatorio;
import empresatextil.negocio.Terno;
import empresatextil.negocio.RopaParaAdolescentes;
import empresatextil.negocio.VestidosParaDama;

/**
 *
 * @author otro3
 */
public class EmpresaTextilPrueba {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        EmpresaTextil objEmpresa = new EmpresaTextil("Mi Empresa");
        
        for (int i = 0;i<100;i++){
            Categoria objproducto1 = new Terno(Talla.M,"Azul Marino");
            objEmpresa.ingresar(objproducto1);
        }
        
        for (int i = 100;i<200;i++){
            Categoria objProducto2 = new RopaParaAdolescentes(Talla.S, "Rosado");
            objEmpresa.ingresar(objProducto2);
        }
        
        for (int i = 200;i<300;i++){
            Categoria objProducto3 = new VestidosParaDama(Talla.L, "Verde");
            objEmpresa.ingresar(objProducto3);
        }       

        objEmpresa.ordernarProductosBurbuja();
        
        objEmpresa.imprimirProductos();
        
        System.out.println("Terminé.");
    }
    
}
