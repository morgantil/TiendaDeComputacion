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
public class Laptop extends Computadora implements Serializable {
    private String marca;
    private String modelo;
    private String pantalla;

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getPantalla() {
        return pantalla;
    }

    public void setPantalla(String pantalla) {
        this.pantalla = pantalla;
    }

    public Laptop(String marca, String modelo, String pantalla, DiscoRigido disco, Ram ram, PlacaDeVideo video, float precioUnitario, String descripcion, Date fecha) {
        super(disco, ram, video, precioUnitario, descripcion, fecha);
        this.marca = marca;
        this.modelo = modelo;
        this.pantalla = pantalla;
    }

    public Laptop() {
    
        super();
       
    }
    
    
    
    
    public String toTextoArchivo(){
    
        int id=700;
        
            
    
    
    return  marca + "," + modelo + "," + pantalla;
   
            }
    
    
    
    
}
