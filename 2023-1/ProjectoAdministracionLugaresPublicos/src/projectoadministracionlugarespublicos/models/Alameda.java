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
public class Alameda extends Construccion {

    public Alameda(String fechaConstruccion, double areaTotal, String distrito) {
        super(fechaConstruccion, areaTotal, distrito);
    }
    
    @Override
    public double getFactorAreaVerde() {
        return 0;
    }
    
    
    
}
