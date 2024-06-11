/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectocineplus.modelo;

/**
 *
 * @author otro3
 */
public class ClienteEstandar extends Cliente {

    private String dni;
    private String fechaDeCumpleanios;
    
    public ClienteEstandar(String nombre, String direccion, float montoMaximoDescuento, String distrito,
            String dni, String fechaDeCumpleanios) {
        super(nombre, direccion, montoMaximoDescuento, distrito);
        
        this.dni = dni;
        this.fechaDeCumpleanios = fechaDeCumpleanios;
    }
    
    @Override
    protected void generarCodigoUnico() {
        boolean encontrado = false;
        int N=15000;
        int M=11000;
        int  numAleatorio=-1;
        while (!encontrado){
            numAleatorio = (int)(Math.random()*(N-M+1)+M);
            if (numAleatorio%2 !=0)
                encontrado= true;
        }
        
        this.codigoUnico = numAleatorio;
    }
   
    
    
    
}
