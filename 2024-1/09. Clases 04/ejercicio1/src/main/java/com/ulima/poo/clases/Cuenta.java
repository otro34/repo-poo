package com.ulima.poo.clases;

public class Cuenta {
    private String nroCuenta;
    private int dni;
    private double saldo;

    public Cuenta() {
        this.nroCuenta = "000-00000-0-00";
        this.dni = 0;
        this.saldo = 0.0d;
    }

    public Cuenta(String nroCuenta, int dni, double saldo) {
        this.nroCuenta = nroCuenta;
        this.dni = dni;

        if (this.saldo < 0.0d) {
            this.saldo = 0.0d;
        } else
            this.saldo = saldo;
    }

    public double getSaldo() {
        return this.saldo;
    }

    public String getNroCuenta() {
        return this.nroCuenta;
    }

    @Override
    public String toString() {
        return "Nro. de Cuenta: " + this.nroCuenta 
        + " | DNI: " + this.dni
        + " | Saldo: " + this.saldo;

    }

    public void imprimir(){
        System.out.println(toString());
    }

    public void depositar(double monto) {
        if (monto > 0) {
            this.saldo += monto;
            System.out.println("Depósito realizado.");
        } else
            System.out.println("Transacción inválida. Monto menor o igual a 0.");
    }

    public void retirar(double monto) {
        if (monto > 0 && monto <= this.saldo) {
            this.saldo -= monto;
            System.out.println("Retiro realizado con éxito. Mont: " + monto);
        } else 
            System.out.println("No se pudo realizar transacción de retiro. ");
    }

    public void transferir(Cuenta cuentaDestino, double monto) {
        if(monto <= this.saldo) {
            this.saldo -= monto;
            cuentaDestino.depositar(monto);
            System.out.println("Transferencia a Cuenta exitosa. Cuenta Destino: " + cuentaDestino.getNroCuenta() + ". Monto: " + monto );
        }
    }

    public void transferir(Cuenta origen, Cuenta destino, double monto) {
        origen.transferir(destino, monto);
    }

}
