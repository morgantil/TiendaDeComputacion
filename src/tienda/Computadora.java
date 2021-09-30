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
public abstract class Computadora extends Producto implements Serializable {
    
   private DiscoRigido disco;
   private Ram ram;
   private PlacaDeVideo video;

    public DiscoRigido getDisco() {
        return disco;
    }

    public void setDisco(DiscoRigido disco) {
        this.disco = disco;
    }

    public Ram getRam() {
        return ram;
    }

    public void setRam(Ram ram) {
        this.ram = ram;
    }

    public PlacaDeVideo getVideo() {
        return video;
    }

    public void setVideo(PlacaDeVideo video) {
        this.video = video;
    }

    public Computadora(DiscoRigido disco, Ram ram, PlacaDeVideo video, float precioUnitario, String descripcion, Date fecha) {
        super(precioUnitario, descripcion, fecha);
        this.disco = disco;
        this.ram = ram;
        this.video = video;
    }

    public Computadora() {
        super();
    }

    public String toTextoArchivo(){
    
        int id=800;
        
            
    
    
    return disco + "," + ram + "," + video;
   
            }
    
    
   
    
    
    
    
}
