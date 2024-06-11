/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectoadministracionlugarespublicos.models;

import java.util.ArrayList;

/**
 *
 * @author otro3
 */
public class LugarPublico<T extends Construccion> {
    private double areaTotal;
    private double costoPorMetroCuadrado = 1500;
    private ArrayList<Instalacion> listaDeInstalaciones;
    private T lugar;

    public LugarPublico(double areaTotal, T lugar) {
        this.areaTotal = areaTotal;
        this.listaDeInstalaciones = new ArrayList<>();
        this.lugar = lugar;
    }
    
    public void agregarInstalacion(Instalacion instalacion) {
        listaDeInstalaciones.add(instalacion);
    }
    
    public double getValoracion() {
        double valoracion = this.areaTotal * this.costoPorMetroCuadrado;
        
        return valoracion; 
    }
    
    public double getAreaVerdeRequerida() {
        return this.lugar.getFactorAreaVerde() / 100;
    }
    
}
