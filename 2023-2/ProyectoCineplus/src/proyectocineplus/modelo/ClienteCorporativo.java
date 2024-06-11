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
public class ClienteCorporativo extends Cliente {

    private int ruc;
    private String nombreResponsable;
    
    
    public ClienteCorporativo(String nombre, String direccion, float montoMaximoDescuento, 
            String distrito, int ruc, String nombreResponsable) {
        super(nombre, direccion, montoMaximoDescuento, distrito);
        
        this.ruc = ruc;
        this.nombreResponsable = nombreResponsable;
    }
    
    @Override
    protected void generarCodigoUnico() {
        boolean encontrado = false;
        int N=5400;
        int M=1200;
        int  numAleatorio=-1;
        while (!encontrado){
            numAleatorio = (int)(Math.random()*(N-M+1)+M);
            if (numAleatorio%2 ==0)
                encontrado= true;
        }
        
        this.codigoUnico = numAleatorio;
    }
    
}
