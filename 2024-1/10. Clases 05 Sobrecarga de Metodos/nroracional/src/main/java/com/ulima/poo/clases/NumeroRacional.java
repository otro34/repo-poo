package com.ulima.poo.clases;

public class NumeroRacional {
    private int numerador;
    private int denominador; 

    public NumeroRacional() {
        this.numerador = 0;
        this.denominador = 1;
    }

    public NumeroRacional(int numerador, int denominador) {
        if (denominador != 0) {
            this.numerador = numerador;
            this.denominador = denominador;
        } else {
            this.numerador = 0;
            this.denominador = 1;
        }

    }

    public void simplificar() {
        int mcd = mcd(this.numerador, this.denominador);

        this.numerador = this.numerador / mcd;
        this.denominador = this.denominador / mcd;
    }

    private int mcd(int a, int b) {
        int m = 0;

        while(b != 0) {
            m = b;
            b = a % b;
            a = m;
        }

        return m;
    }

    public void sumar(NumeroRacional nr) {
        this.numerador = this.numerador * nr.denominador + nr.numerador * this.denominador;
        this.denominador = this.denominador * nr.denominador;
        simplificar();
    }

    public void sumar(NumeroRacional nr1, NumeroRacional nr2) {
        this.numerador = nr1.numerador * nr2.denominador + nr2.numerador * nr1.denominador;
        this.denominador = nr1.denominador * nr2.denominador;
        simplificar();
    }

    @Override
    public String toString() {
        return this.numerador + "/" + this.denominador;
    }
 }
