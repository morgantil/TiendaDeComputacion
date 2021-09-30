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
public abstract class Componente extends Producto implements Serializable {
    
   private String utilizable; 


   public String getUtilizable() {
        return utilizable;
    }

    public void setUtilizable(String utilizable) {
        this.utilizable = utilizable;
    }

   
  
    
    
    public Componente(float precioUnitario, String descripcion, Date fecha) {
        super(precioUnitario, descripcion, fecha);
    }

    public Componente() {
    
        super(); 
        
    }
    
  
    
}
