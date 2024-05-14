package com.ulima.poo.clases;

public class Main {
    public static void main(String[] args) {
        Cuenta objCuenta = new Cuenta("AAA", 00112244, 100);

        Cuenta objCuenta2 = new Cuenta("BBB", 11223344, 200);

        Cuenta objCuenta3 = new Cuenta("CCC", 996633, 1000);

        objCuenta.imprimir();
        objCuenta.depositar(300);
        objCuenta.imprimir();
        objCuenta.depositar(0);
        objCuenta.imprimir();
        objCuenta.retirar(150);
        objCuenta.imprimir();

        objCuenta2.imprimir();
        objCuenta.transferir(objCuenta2, 100);
        objCuenta.imprimir();
        objCuenta2.imprimir();

        objCuenta3.imprimir();
        objCuenta.transferir(objCuenta3, objCuenta2, 500);
        objCuenta2.imprimir();
        objCuenta3.imprimir();



    }
}