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
public class ProgramaInstancias {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Libro objLibro = new Libro("Cien años de soledad", 600);
        
        int nroPaginas = 550;
        
        System.out.println(objLibro.getDatos());
        
        cambiarNroDePaginas(objLibro, nroPaginas);
        
        System.out.println(objLibro.getDatos());
        
        objLibro.setTitulo("El señor de los anillos");
        
        System.out.println(objLibro.getDatos());
        
        System.out.println(nroPaginas);
    }
    
    public static void cambiarNroDePaginas(Libro objLibro, int nroPaginas) {
        nroPaginas += 1;
        objLibro.setNroPaginas(nroPaginas);
    }
    
}
