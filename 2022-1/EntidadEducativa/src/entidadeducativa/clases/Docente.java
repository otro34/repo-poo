/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidadeducativa.clases;

/**
 *
 * @author otro3
 */
public abstract class Docente {
    
    protected String codigo;
    protected String nombres;
    protected String dni;
    protected int aniosEmpresa;
    protected int diasVacaciones;
    protected int edad;
    protected boolean esActivo;
    protected float sueldo;
    private final float sueldoBase = 2000;
    
    public Docente(String nombres, String dni, int aniosEmpresa, int edad, boolean esActivo) {
        this.nombres = nombres;
        this.dni = dni;
        this.aniosEmpresa = aniosEmpresa;
        this.edad = edad;
        this.esActivo = esActivo;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getNombres() {
        return nombres;
    }

    public String getDni() {
        return dni;
    }

    public int getAniosEmpresa() {
        return aniosEmpresa;
    }

    public int getDiasVacaciones() {
        return diasVacaciones;
    }

    public int getEdad() {
        return edad;
    }

    public boolean getEsActivo() {
        return esActivo;
    }
    
    public float getSueldo() {
        return sueldo;
    }
    
    public abstract void asignarCodigo(int correlativo);

    public void calcularVacaciones() {
        if (this.aniosEmpresa >= 1 && this.aniosEmpresa <= 5) {
            this.diasVacaciones = 15;
        } else if (this.aniosEmpresa > 5 && this.aniosEmpresa <= 10) {
            this.diasVacaciones = 20;
        } else if (this.aniosEmpresa > 10) {
            this.diasVacaciones = 30;
            }
    }
    
    public void cesar() {
        this.esActivo = false;
    }

    public void asignarSueldo() {
        this.sueldo = sueldoBase;
    }

    public String obtenerDatos() {
        return "Codigo: "+this.codigo+
                "\nNombres: "+this.nombres+
                "\nDni: "+this.dni+
                "\nAños en la Empresa"+this.aniosEmpresa+
                "\nDias de vacaciones:"+this.diasVacaciones+
                "\nEdad: "+this.edad+
                "\nSueldo: "+this.sueldo+
                "\nEs Activo: "+this.esActivo;
    }
    
}
