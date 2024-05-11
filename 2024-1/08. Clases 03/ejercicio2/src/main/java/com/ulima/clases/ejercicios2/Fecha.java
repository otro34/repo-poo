package com.ulima.clases.ejercicios2;

public class Fecha {
    private int dia;
    private int mes;
    private int anio;

public Fecha() {
    dia = 1;
    mes = 1;
    anio = 1900;
}

public Fecha (int dia, int mes, int anio) {
    if (esFechaValida(dia, mes, anio)) {
        this.dia = dia;
        this.mes = mes;
        this.anio = anio;
    } else {
        this.dia = 1;
        this.mes = 1;
        this.anio = 1900;
    }
}



public int getDia() {
    return dia;
}

public void setDia(int dia) {
    if ((dia >= 1) && (dia <= nroDiasMes(mes, anio))) {
        this.dia = dia;
    } else {
        System.out.println("Error. El día no es válido.");
    }
    
}

public int getMes() {
    return mes;
}

public void setMes(int mes) {
    if ((mes >= 1) && (mes <=12) && (this.dia <= nroDiasMes(mes, mes))) {
        this.mes = mes;
    } else {
        System.out.println("Error. Mes no es válido.");
    }
    
}

public int getAnio() {
    return anio;
}

public void setAnio(int anio) {
    if (esFechaValida(this.dia, this.mes, anio)) {
        this.anio = anio;
    } else 
        System.out.println("Error. Año incorecto. ");
    
}

private int nroDiasMes(int mes, int anio) {
    if (mes == 2) {
        if (anio % 4 == 0) {
            return 29;
        } else
            return 28;
    } else {
        if ((mes == 4) || (mes == 6) || (mes == 9) || (mes == 11)) {
            return 30;
        } else
            return 31;
    }
}

private boolean esFechaValida(int dia, int mes, int anio) {
    if (anio > 0) {
        if ((1 <= mes) && (mes <=12)) {
            if ((dia >= 1) && (dia <= nroDiasMes(mes, anio))) {
                return true;
            } else {
                System.out.println("El dia no es valido");
                return false;
            }
        } else {
            System.out.println("El dia no es válido.");
            return false;
        }
    } else {
        System.out.println("El día no es válido.");
        return false;
    }
    }
}
