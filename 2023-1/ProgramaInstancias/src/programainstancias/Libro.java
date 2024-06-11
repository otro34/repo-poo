/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programainstancias;

/**
 *
 * @author otro3
 */
public class Libro {

    private String titulo;
    private int nroPaginas;
    
    public Libro(String titulo, int nroPaginas) {
        this.titulo = titulo;
        this.nroPaginas = nroPaginas;
    }
    
    public void setNroPaginas(int nroPaginas) {
        this.nroPaginas = nroPaginas;
    }
    
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    
    public String getDatos() {
        return "Titulo: " + this.titulo + ", Nro. Paginas: " + this.nroPaginas;
    }
    
}
