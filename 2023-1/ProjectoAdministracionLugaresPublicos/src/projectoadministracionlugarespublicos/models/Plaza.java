/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectoadministracionlugarespublicos.models;

/**
 *
 * @author otro3
 */
public class Plaza extends Construccion {

    private int nroDeBancas;
    
    public Plaza(String fechaConstruccion, double areaTotal, String distrito, int nroDeBancas) {
        super(fechaConstruccion, areaTotal, distrito);
    }
    
    @Override
    public double getFactorAreaVerde() {
        return this.nroDeBancas * 5.5;
    }
    
}