package com.ulima.poo.clases;

public class CuentaBancaria {
    private String titular;
    private String nroCuenta;
    private double saldo;

    public CuentaBancaria(String titular, String nroCuenta) {
        this.titular = titular;
        this.nroCuenta = nroCuenta;
        this.saldo = 0;
    }

    public String getTitular() {
        return titular;
    }
    public void setTitular(String titular) {
        this.titular = titular;
    }
    public String getNroCuenta() {
        return nroCuenta;
    }
    public void setNroCuenta(String nroCuenta) {
        this.nroCuenta = nroCuenta;
    }
    public double getSaldo() {
        return saldo;
    }
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void depositar(double monto) {
    
        saldo += monto;
    }

    public void retirar(double monto) {
        saldo -= monto;
    }

    public String consultarSaldo() {
        return "\nTitular: " + titular + 
                "\nNro de Cuenta: " + nroCuenta + 
                "\nSaldo: " + saldo;
    }
    
}
