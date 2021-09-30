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
public class Periferico extends Producto implements Serializable  {
    
  private String tipo;  

    

    


  public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
    public Periferico(float precioUnitario, String descripcion, Date fecha) {
        super(precioUnitario, descripcion, fecha);
    }
    
    
    
     public String toTextoArchivo(){ 
    
        int id=200;
        
            
    
    
    return  tipo ;
   
            }

    public Periferico() {
    
        super();
    }
    
    
    
     
     
     
    
    
    
}
