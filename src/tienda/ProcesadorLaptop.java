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
public class ProcesadorLaptop extends Componente implements Serializable {
    
    private String fabricante;
    private String modelo;
    private String frecuencia;

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

    public String getFrecuencia() {
        return frecuencia;
    }

    public void setFrecuencia(String frecuencia) {
        this.frecuencia = frecuencia;
    }

    public ProcesadorLaptop(String fabricante, String modelo, String frecuencia, float precioUnitario, String descripcion, Date fecha) {
        super(precioUnitario, descripcion, fecha);
        this.fabricante = fabricante;
        this.modelo = modelo;
        this.frecuencia = frecuencia;
    }

    public ProcesadorLaptop(String fabricante, String modelo, String frecuencia) {
        this.fabricante = fabricante;
        this.modelo = modelo;
        this.frecuencia = frecuencia;
    }

    
    
    
    

   

    public ProcesadorLaptop() {
    super();
    }

    public String toTextoArchivo(){
    
        int id=400;
        
            
    
    
    return fabricante + "," + modelo + "," + frecuencia;
   
            }
    
    
    
     


    
    
}
