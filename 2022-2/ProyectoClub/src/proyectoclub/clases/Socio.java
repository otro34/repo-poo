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
public class Socio extends Persona {
    private int codigo;
    private int antiguedad;
    
    public Socio(int codigo, String nombre, String dni, 
                String medioDePago,float totalConsumido,
                int antiguedad) {
        super(nombre,dni,medioDePago,totalConsumido);
        this.codigo = codigo;
        this.antiguedad = antiguedad;
    }
    
    @Override
    public void calcularTotalFacturado() {
        if (antiguedad <= 5) {
            super.montoFacturado = super.totalConsumido * 0.4f;
        } else if (antiguedad > 5 && antiguedad <= 10) {
            super.montoFacturado = super.totalConsumido * 0.3f;
        } else {
            super.montoFacturado = super.totalConsumido * 0.2f;
        }
    } 

    @Override
    public String getDatos() {
       return super.getDatos() + "\nTipo: SOCIO "
               + "\nCodigo: " + this.codigo + ""
               + "\nAntiguedad: " + this.antiguedad;  
    }
    
}
