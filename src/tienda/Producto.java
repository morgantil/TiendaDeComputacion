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
public abstract class Producto implements Serializable {
    
    private float precioUnitario;
    private String descripcion;
    private Date fecha;  

   
    public float getPrecioUnitario() {
        return precioUnitario;
    }

    public void setPrecioUnitario(float precioUnitario) {
        this.precioUnitario = precioUnitario;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Producto(float precioUnitario, String descripcion, Date fecha) {
        this.precioUnitario = precioUnitario;
        this.descripcion = descripcion;
        this.fecha = fecha;
    }

    public Producto() {
    }


    @Override
    public String toString() {
        
        Object tipo=this.getClass();
        return  "precioUnitario=" + precioUnitario + ", descripcion=" + descripcion + ", fecha=" + fecha + "El tipo es: "+ tipo;
    }

   
    
    
    
    
}
