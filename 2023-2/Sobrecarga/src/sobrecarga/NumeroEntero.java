/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sobrecarga;

/**
 *
 * @author otro3
 */
public class NumeroEntero {
    private int valor = 0;
    
    private NumeroEntero() { }
    
    private NumeroEntero(int valor) {
        this.valor = valor;
    }
    
    //Getter y Setter
    
    public int getValor() {
        return this.valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }
    
    //Metodos para creación
    
    public static NumeroEntero crear() {
        return new NumeroEntero();
    }

    public static NumeroEntero crear(int i) {
        return new NumeroEntero(i);
    }
    
    //Operaciones
    
    public void sumar(int i) {
        this.valor += i;
    }
    
    public void sumar(int x, int y) {
        this.valor = x + y;
    }
    
    public void restar(int i) {
        this.valor -= i;
    }
    
    public void restar(int x, int y) {
        this.valor = x - y;
    }
    
    public void multiplicar(int i) {
        this.valor *= i;
    }
    
    public void multiplicar(int x, int y) {
        this.valor = x * y;
    }
    
    public void division(int i) {
        this.valor /= i;
    }
    
    public void division(int x, int y) {
        this.valor = x / y;
    }
    
    
    
}
