/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examenmorasedano;

public class Gestion {
    
    private Docente[] docentes;
    private int indice;
    
    public Gestion(){
        docentes = new Docente[30];
        indice = 0;
    }
    
    public void ingresar(Docente d){
        docentes[indice] = d;
        indice++;
    }
    
    public Docente findByCodigo(String codigo){
        
        for(int i = 0; i < indice; i++){
            if(docentes[i].getCodigo().equals(codigo)){
                return docentes[i];
            }
        }
        
        return null;
    }

    /**
     * @return the docentes
     */
    public Docente[] getDocentes() {
        return docentes;
    }

    /**
     * @param docentes the docentes to set
     */
    public void setDocentes(Docente[] docentes) {
        this.docentes = docentes;
    }

    /**
     * @return the indice
     */
    public int getIndice() {
        return indice;
    }

    /**
     * @param indice the indice to set
     */
    public void setIndice(int indice) {
        this.indice = indice;
    }
    
    
    
    
    
}
