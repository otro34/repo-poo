/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package resolucionexamen1;

/**
 *
 * @author otro3
 */
public class PartidoDeBasquetbol {
    private String fecha;
    private String coliseo;
    private String arbitro;
    private String equipoLocal;
    private String equipoVisita;
    private int scoreLocal = 0;
    private int scoreVisita = 0;
    private String ganador;
    
    public PartidoDeBasquetbol(String fecha, String coliseo, String arbitro, 
            String equipoLocal, String equipoVisita) {
        this.fecha = fecha;
        this.coliseo = coliseo;
        this.arbitro = arbitro;
        this.equipoLocal = equipoLocal;
        this.equipoVisita = equipoVisita;  
    }
    
    public void agregarScore(String equipo, String tipoScore) {
        int puntajeAgregar = 0;
        switch(tipoScore) {
            case "TiroLibre":
                puntajeAgregar = 1;
                break;
            case "FueraDeLinea":
                puntajeAgregar = 3;
                break;
            default:
                puntajeAgregar = 2;
                break;
        }
        if (equipo.equals(equipoLocal)){
            this.scoreLocal+=puntajeAgregar;
            this.scoreLocal = this.scoreLocal + puntajeAgregar;
        } else {
            this.scoreVisita+=puntajeAgregar;
        }
    }
    
    public void imprimirGanador() {
        if (this.scoreLocal > this.scoreVisita){
            this.ganador = this.equipoLocal;
            //this.ganador = "Equipo Local";
        } else if (this.scoreLocal == this.scoreVisita) {
            this.ganador = "Empate";
        } else {
            this.ganador = this.equipoVisita;
        }
        
        System.out.println("Equipo ganador: " + this.ganador);
    }
    
}
