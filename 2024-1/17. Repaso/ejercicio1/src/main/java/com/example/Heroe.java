package com.example;

public class Heroe {
    private String nombre;
    private String raza;
    private Clasificacion clasificacion;
    private double fuerza;
    private double fuerzaMagica;
    private double vida;
    private double defensa;
    private double velocidadDeAtaque;
    private double probabilidadDeAtaqueCritico;
    private double velocidadDeMovimiento;
    private double daño;
    private double armaduraFisica;
    private double armaduraMagica;
    private double inteligencia;
    private double agilidad;
    private double experiencia;
    private double nivel;

    public Heroe(String nombre, String raza, double fuerza, double fuerzaMagica, double vida, double defensa,
            double velocidadDeAtaque, double probabilidadDeAtaqueCritico, double velocidadDeMovimiento, double daño,
            double armaduraFisica, double armaduraMagica, double inteligencia, double agilidad, double experiencia,
            double nivel, Clasificacion clasificacion) {
        this.nombre = nombre;
        this.raza = raza;
        this.fuerza = fuerza;
        this.fuerzaMagica = fuerzaMagica;
        this.vida = vida;
        this.defensa = defensa;
        this.velocidadDeAtaque = velocidadDeAtaque;
        this.probabilidadDeAtaqueCritico = probabilidadDeAtaqueCritico;
        this.velocidadDeMovimiento = velocidadDeMovimiento;
        this.daño = daño;
        this.armaduraFisica = armaduraFisica;
        this.armaduraMagica = armaduraMagica;
        this.inteligencia = inteligencia;
        this.agilidad = agilidad;
        this.experiencia = experiencia;
        this.nivel = nivel;
        this.clasificacion = clasificacion;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getRaza() {
        return raza;
    }
    public void setRaza(String raza) {
        this.raza = raza;
    }
    public double getFuerza() {
        return fuerza;
    }
    public void setFuerza(double fuerza) {
        this.fuerza = fuerza;
    }
    public double getFuerzaMagica() {
        return fuerzaMagica;
    }
    public void setFuerzaMagica(double fuerzaMagica) {
        this.fuerzaMagica = fuerzaMagica;
    }
    public double getVida() {
        return vida;
    }
    public void setVida(double vida) {
        this.vida = vida;
    }
    public double getDefensa() {
        return defensa;
    }
    public void setDefensa(double defensa) {
        this.defensa = defensa;
    }
    public double getVelocidadDeAtaque() {
        return velocidadDeAtaque;
    }
    public void setVelocidadDeAtaque(double velocidadDeAtaque) {
        this.velocidadDeAtaque = velocidadDeAtaque;
    }
    public double getProbabilidadDeAtaqueCritico() {
        return probabilidadDeAtaqueCritico;
    }
    public void setProbabilidadDeAtaqueCritico(double probabilidadDeAtaqueCritico) {
        this.probabilidadDeAtaqueCritico = probabilidadDeAtaqueCritico;
    }
    public double getVelocidadDeMovimiento() {
        return velocidadDeMovimiento;
    }
    public void setVelocidadDeMovimiento(double velocidadDeMovimiento) {
        this.velocidadDeMovimiento = velocidadDeMovimiento;
    }
    public double getDaño() {
        return daño;
    }
    public void setDaño(double daño) {
        this.daño = daño;
    }
    public double getArmaduraFisica() {
        return armaduraFisica;
    }
    public void setArmaduraFisica(double armaduraFisica) {
        this.armaduraFisica = armaduraFisica;
    }
    public double getArmaduraMagica() {
        return armaduraMagica;
    }
    public void setArmaduraMagica(double armaduraMagica) {
        this.armaduraMagica = armaduraMagica;
    }
    public double getInteligencia() {
        return inteligencia;
    }
    public void setInteligencia(double inteligencia) {
        this.inteligencia = inteligencia;
    }
    public double getAgilidad() {
        return agilidad;
    }
    public void setAgilidad(double agilidad) {
        this.agilidad = agilidad;
    }
    public double getExperiencia() {
        return experiencia;
    }
    public void setExperiencia(double experiencia) {
        this.experiencia = experiencia;
    }
    public double getNivel() {
        return nivel;
    }
    public void setNivel(double nivel) {
        this.nivel = nivel;
    }

    public void golpear(Heroe heroeEnemigo) {
        System.out.println(this.nombre + " golpea a " + heroeEnemigo.getNombre());
        double golpe = this.daño + this.nivel;
        
        if (this.clasificacion == Clasificacion.FUERZA) {
            golpe += this.fuerza;
        } else if (this.clasificacion == Clasificacion.INTELIGENCIA) {
            golpe += this.inteligencia;
        } else if (this.clasificacion == Clasificacion.AGILIDAD) {
            golpe += this.agilidad;
        }

        heroeEnemigo.recibirGolpe(golpe);
        System.out.println(heroeEnemigo.getNombre() + " puntos de vida: " + heroeEnemigo.getVida());
    }

    public void golpear(Creep creep) {
        double golpe = this.daño + this.nivel;
        
        if (this.clasificacion == Clasificacion.FUERZA) {
            golpe += this.fuerza;
        } else if (this.clasificacion == Clasificacion.INTELIGENCIA) {
            golpe += this.inteligencia;
        } else if (this.clasificacion == Clasificacion.AGILIDAD) {
            golpe += this.agilidad;
        }

        creep.recibirGolpe(golpe);

    }

    public void recibirGolpe(double golpeEnemigo) {
        double golpeFinal = golpeEnemigo - defensa - armaduraFisica;

        if (golpeFinal > 0) {
            vida -= golpeFinal;
        }
    }
    

}
