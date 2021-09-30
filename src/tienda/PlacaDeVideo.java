/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tienda;

import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author Leonardo Morganti
 */
public class PlacaDeVideo extends Componente implements Serializable {
   
    private String fabricante;
    private String modelo;
    private String memoria;

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMemoria() {
        return memoria;
    }

    public void setMemoria(String memoria) {
        this.memoria = memoria;
    }

    public PlacaDeVideo(String fabricante, String modelo, String memoria, float precioUnitario, String descripcion, Date fecha) {
        super(precioUnitario, descripcion, fecha);
        this.fabricante = fabricante;
        this.modelo = modelo;
        this.memoria = memoria;
    }

    public PlacaDeVideo() {
    
        super();
    
    }
    
    public String toTextoArchivo(){
    
        int id=500;
        
            
    
    
    return fabricante + "," + modelo + "," + memoria;
   
            }
    
    
    
    
}
