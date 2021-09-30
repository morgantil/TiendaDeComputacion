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
public class DiscoRigido extends Componente implements Serializable {
    private String marca;
    private String tipo;
    private String capacidad;

   

    

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(String capacidad) {
        this.capacidad = capacidad;
    }

    public DiscoRigido(String marca, String tipo, String capacidad, float precioUnitario, String descripcion, Date fecha) {
        super(precioUnitario, descripcion, fecha);
        this.marca = marca;
        this.tipo = tipo;
        this.capacidad = capacidad;
    }

    public DiscoRigido() {
        
        
        super();
    }

    @Override
    public String toString() {
        return "DiscoRigido{" + "marca=" + marca + ", tipo=" + tipo + ", capacidad=" + capacidad + '}';
    }

  
    public String toTextoArchivo(){
    
        int id=100;
        
            
    
    
    return  marca + "," + tipo + "," + capacidad;
   
            }
    
    
    
    

   
    
    
}

