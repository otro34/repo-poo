package com.ulima.ejercicios.gestionarmatricula;

public class AlumnoFIS {
    private String nombre;
    private String codigo; 
    private int totalCreditosMatriculado;
    private double precioCredito;

    public AlumnoFIS(String nombre, String codigo, int totalCreditosMatriculado, double precioCredito) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.totalCreditosMatriculado = totalCreditosMatriculado;
        this.precioCredito = precioCredito;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public int getTotalCreditosMatriculado() {
        return totalCreditosMatriculado;
    }

    public void setTotalCreditosMatriculado(int totalCreditosMatriculado) {
        this.totalCreditosMatriculado = totalCreditosMatriculado;
    }

    public double getPrecioCredito() {
        return precioCredito;
    }

    public void setPrecioCredito(double precioCredito) {
        this.precioCredito = precioCredito;
    }

    public double calcularMontoMatricula() {
        return totalCreditosMatriculado * precioCredito;
    }

    @Override
    public String toString() {
        return "AlumnoFIS {" +
                "\nnombre= '" + nombre + '\'' +
                "\n, codigo= '" + codigo + '\'' +
                "\n, totalCreditosMatriculado= " + totalCreditosMatriculado +
                "\n, precioCredito= " + precioCredito +
                "\n, totalMatricula= " + calcularMontoMatricula() +
                "\n, montoMensual= " + calcularMontoMatricula() / 4 +
                "\n }";
    }
}
