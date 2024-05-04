package com.ulima.poo.clases;

public class Main {
    public static void main(String[] args) {
        CuentaBancaria cuenta = new CuentaBancaria("Juan Perez", "111-9999-888");

        cuenta.depositar(100);

        System.out.println(cuenta.consultarSaldo());

        cuenta.retirar(50);

        System.out.println(cuenta.consultarSaldo());

        cuenta.retirar(10);

        System.out.println(cuenta.consultarSaldo());

        cuenta.depositar(80);

        System.out.println(cuenta.consultarSaldo());
    }
}