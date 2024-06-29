package com.examen3;

public class Reserva {
    private String codigoDeReserva;
    private String fechaDeRegistro;
    private String paisDestino;
    private double precioTotal;
    private Cliente cliente;


    public Reserva(String fechaDeRegistro, String paisDestino, double precioTotal, Cliente cliente) {
        this.codigoDeReserva = generarCodigoDeReserva();
        this.fechaDeRegistro = fechaDeRegistro;
        this.paisDestino = paisDestino;
        this.precioTotal = precioTotal;
        this.cliente = cliente;
    }

    private String generarCodigoDeReserva() {
    
        int ran = (int) (Math.random() * 9999 - 1000) + 1000;
    
        return "EX-" + ran;
    }

    public double getCobroPorServicio() {
        return precioTotal * 0.05;
    }

    public String getCodigo() {
        return codigoDeReserva;
    }

    public String toString() {
        return "\nCodigo de Reserva: " + codigoDeReserva +
            "\nFecha de Registro: " + fechaDeRegistro + 
            "\nPais de Destino: " + paisDestino +
            "\nPrecio Total: " + precioTotal + 
            "\nCobro por Servicio: " + getCobroPorServicio() + 
            cliente;

    }


    
}
