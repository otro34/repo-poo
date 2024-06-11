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
public class EntidadEducativa {

    private String nombre;
    private Docente[] docentes;
    private final int MAX = 30;
    private int contadorDocente;
    
    public EntidadEducativa(String nombre) {
        this.nombre = nombre;
        docentes = new Docente[30];
    }

    public String getNombre() {
        return nombre;
    }

    public Docente[] getDocentes() {
        return docentes;
    }

    public int getMAX() {
        return MAX;
    }
    
    public void registrarDocente(Docente objDocente) {
        docentes[contadorDocente] = objDocente;
        contadorDocente++;
    }

    public void cesarDocente(String codigo) {
        Docente docente = null;
        
        for(Docente objDocente:docentes) {
            if (objDocente.getCodigo().equals(codigo)) {
                docente = objDocente;
            }
        }
        
        if (docente != null)
            docente.cesar();
    }
    
    public void ordernarBurbuja() {
        Docente temp;
        
        try {
            for (int i = 0; i < this.docentes.length - 1; i++){
                for (int j = i+1; j < this.docentes.length - 1; j++) {
                    if (this.docentes[j].getSueldo() > this.docentes[i].getSueldo()) {
                        temp = docentes[i];
                        docentes[i] = docentes[j];
                        docentes[j] = temp;
                    }
                }
            }
            System.out.println("He terminado de ordenar!");
        } catch(Exception e) {
            System.out.println("Ha ocurrido un error!");
            System.out.println(e);   
        }
    }
    
}
