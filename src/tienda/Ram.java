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
public class Ram extends Componente implements Serializable {
    
    private String marca;
    private String tecnologia;
    private String frecuencia;
    private String capacidad;

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getTecnologia() {
        return tecnologia;
    }

    public void setTecnologia(String tecnologia) {
        this.tecnologia = tecnologia;
    }

    public String getFrecuencia() {
        return frecuencia;
    }

    public void setFrecuencia(String frecuencia) {
        this.frecuencia = frecuencia;
    }

    public String getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(String capacidad) {
        this.capacidad = capacidad;
    }

    public Ram(String marca, String tecnologia, String frecuencia, String capacidad, float precioUnitario, String descripcion, Date fecha) {
        super(precioUnitario, descripcion, fecha);
        this.marca = marca;
        this.tecnologia = tecnologia;
        this.frecuencia = frecuencia;
        this.capacidad = capacidad;
    }

    public Ram() {
    
        super();
    }
    
    public String toTextoArchivo(){
    
        int id=600;
        
            
    
    
    return marca + "," + tecnologia + "," +tecnologia + "," + capacidad;
    
   
            }
    
    
    
    
    
}
