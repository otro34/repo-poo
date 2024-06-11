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
public class ClientePreferente extends Cliente {
    private String tarjetaDeCredito;
    private String marcaAuto;

    public ClientePreferente(String nombre, String direccion, float montoMaximoDescuento, String distrito, 
            String tarjetaDeCredito, String marcaAuto) {
        super(nombre, direccion, montoMaximoDescuento, distrito);
        
        this.tarjetaDeCredito = tarjetaDeCredito;
        this.marcaAuto = marcaAuto;
    }
    
    @Override
    protected void generarCodigoUnico() {
        boolean encontrado = false;
        int N=5000;
        int M=1000;
        int  numAleatorio=-1;
        while (!encontrado){
            numAleatorio = (int)(Math.random()*(N-M+1)+M);
            if (numAleatorio%7 ==0)
                encontrado= true;
        }
        
        this.codigoUnico = numAleatorio;
    }
    
    
}
