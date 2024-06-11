/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ulima.registroderesultados.modelo;

/**
 *
 * @author otro3
 */
public class Resultado {
    private int Id;
    private Pais Equipo1;
    private Pais Equipo2;
    private int Score1;
    private int Score2;
    private boolean TiempoExtra;
    private boolean Penales;
    private Pais Ganador;

    public Resultado(Pais Equipo1, Pais Equipo2, int Score1, int Score2, boolean TiempoExtra, boolean Penales) {
        this.Equipo1 = Equipo1;
        this.Equipo2 = Equipo2;
        this.Score1 = Score1;
        this.Score2 = Score2;
        this.TiempoExtra = TiempoExtra;
        this.Penales = Penales;
    }

    public void setGanador(Pais Ganador) {
        this.Ganador = Ganador;
    }

    public Pais getGanador() {
        return Ganador;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public void setEquipo1(Pais Equipo1) {
        this.Equipo1 = Equipo1;
    }

    public void setEquipo2(Pais Equipo2) {
        this.Equipo2 = Equipo2;
    }

    public void setScore1(int Score1) {
        this.Score1 = Score1;
    }

    public void setScore2(int Score2) {
        this.Score2 = Score2;
    }

    public void setTiempoExtra(boolean TiempoExtra) {
        this.TiempoExtra = TiempoExtra;
    }

    public void setPenales(boolean Penales) {
        this.Penales = Penales;
    }

    public int getId() {
        return Id;
    }

    public Pais getEquipo1() {
        return Equipo1;
    }

    public Pais getEquipo2() {
        return Equipo2;
    }

    public int getScore1() {
        return Score1;
    }

    public int getScore2() {
        return Score2;
    }

    public boolean isTiempoExtra() {
        return TiempoExtra;
    }

    public boolean isPenales() {
        return Penales;
    }
    
    
    
}
