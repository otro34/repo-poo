/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoclub.clases;

/**
 *
 * @author otro3
 */
public class NoSocio extends Persona {
    private int nroIngresos;
    
    public NoSocio(String nombre, String dni, String medioDePago,float totalConsumido, int nroIngresos) {
        super(nombre,dni,medioDePago,totalConsumido);
        this.nroIngresos = nroIngresos;
    }
    
    @Override
    public void calcularTotalFacturado() {
        if (nroIngresos <= 1) {
            super.montoFacturado = super.totalConsumido + 250;
        } else if (nroIngresos >=2 && nroIngresos <=6 ) {
            super.montoFacturado = super.totalConsumido + 150;
        } else {
            super.montoFacturado = super.totalConsumido + 100;
        }
    }

    @Override
    public String getDatos() {
        return super.getDatos() + "\nTipo: No Socio"
                + "\nNro de Ingresos: " + this.nroIngresos;
    }
}
