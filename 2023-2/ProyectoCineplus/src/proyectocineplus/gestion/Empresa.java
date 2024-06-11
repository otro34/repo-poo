/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectocineplus.gestion;
import proyectocineplus.modelo.*;
/**
 *
 * @author otro3
 */
public class Empresa {
    private final int MAX = 10;
    private Cliente[] clientes;
    private int nroClientes;

    public Empresa() {
        this.clientes = new Cliente[MAX];
        this.nroClientes = 0;
    }
    
    public void agregar(Cliente cliente) {
        if (nroClientes < MAX) {
            this.clientes[nroClientes] = cliente;
            nroClientes++;
        }
    }
    
    public float getMaximoTotalDescuentoClientesCorporativos() {
        
        float suma = 0;
        for (int i = 0; i<nroClientes;i++) {
            suma += this.clientes[i].getMontoMaximoDescuento();
        }
        
        return suma;
    }
    
    public void imprimirMembretes() {
        for (int i = 0; i<nroClientes;i++) {
            System.out.println(clientes[i].getMembrete());
        }
    }
    
    
}
