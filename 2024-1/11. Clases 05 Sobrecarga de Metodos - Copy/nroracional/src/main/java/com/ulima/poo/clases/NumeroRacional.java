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

    public void restar(NumeroRacional nr) {
        this.numerador = this.numerador * nr.denominador - nr.numerador * this.denominador;
        this.denominador = this.denominador * nr.denominador;
        simplificar();
    }

    public void restar(NumeroRacional nr1, NumeroRacional nr2) {
        this.numerador = nr1.numerador * nr2.denominador - nr2.numerador * nr1.denominador;
        this.denominador = nr1.denominador * nr2.denominador;
        simplificar();
    }

    public void multiplicar(NumeroRacional nr) {
        this.numerador = this.numerador * nr.numerador;
        this.denominador = this.denominador * nr.denominador;
        simplificar();
    }

    public void multiplicar(NumeroRacional nr1, NumeroRacional nr2) {
        this.numerador = nr1.numerador * nr2.numerador;
        this.denominador = nr1.denominador * nr2.denominador;
        simplificar();
    }

    public void dividir(NumeroRacional nr) {
        if (nr.numerador != 0) {
            this.numerador = this.numerador * nr.denominador;
            this.denominador = this.denominador * nr.numerador;
        } else {
            System.out.println("No se puede dividir entre 0.  ");
        }
    }

    public void dividir(NumeroRacional nr1, NumeroRacional nr2) {
        if (nr2.numerador != 0) {
            this.numerador = nr1.numerador * nr2.denominador;
            this.denominador = nr1.denominador * nr2.numerador;
        } else {
            System.out.println("No se puede dividir entre 0.  ");
        }
    }



    @Override
    public String toString() {
        return this.numerador + "/" + this.denominador;
    }
 }
