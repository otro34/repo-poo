/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ulima.profesores.controlador;
import com.ulima.profesores.modelo.Profesor;
import java.util.ArrayList;
/**
 *
 * @author otro3
 */
public class GestionProfesor {
    private ArrayList<Profesor> profesores;
    
    public GestionProfesor() {
        this.profesores = new ArrayList<Profesor>();
    }
    
    public ArrayList<Profesor> getProfesores() {
        return this.profesores;
    }
    
    public int generarNuevoId() {
        return this.profesores.size() + 1;
    }
    
    public void insertar(Profesor profesor) {
        if (profesor != null) {
            this.profesores.add(profesor);
        }
    }
    
    public void remover(Profesor profesor) {
        if (profesor != null)
            this.profesores.remove(profesor);
    }
    
    public Profesor buscar(int id) {
        for(Profesor profesor: this.profesores) {
            if (profesor != null &&
                    profesor.getId() == id) {
                return profesor;
            }
        }
        return null;
    }
    
    public void actualizar(Profesor profesor) {
        Profesor objProfesor = this.buscar(profesor.getId());
        
        if (objProfesor != null) {
            int index = this.profesores.indexOf(objProfesor);
            this.profesores.set(index, profesor);
        }
    }
    
    public void printProfesores() {
        for(Profesor profesor:this.profesores) {
            if (profesor != null) {
                System.out.println(profesor.toString());
            }
        }
    }
}
