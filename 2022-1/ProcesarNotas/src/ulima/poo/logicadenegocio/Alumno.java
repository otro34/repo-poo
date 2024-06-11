/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ulima.poo.logicadenegocio;

/**
 *
 * @author otro3
 */
public class Alumno {
   private int codigo;
   private String nombre;
   
   public Alumno(int paramCodigo, String paramNombre){
       codigo = paramCodigo;
       nombre = paramNombre;
   }
   
   //getters y setters
   
   public int getCodigo() {
       return codigo;
   }
   
   public void setCodigo(int paramCodigo) {
       codigo = paramCodigo;
   }
   
   public String getNombre() {
       return nombre;
   }
   
   public void setNombre(String paramNombre) {
       nombre = paramNombre;
   }
}
