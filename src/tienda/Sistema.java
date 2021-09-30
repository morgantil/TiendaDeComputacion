package tienda;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;

public class Sistema implements Serializable {

    private ArrayList<Producto> productos;
    private ArrayList<Usuario> usuarios;
    private static Sistema sistema;

    
    public ArrayList<Producto> getProductos() {
        return productos;
    }

    public void setProductos(ArrayList<Producto> productos) {
        this.productos = productos;
    }
    
    
    
    

    private Sistema() {  
        productos = new ArrayList<Producto>();
        usuarios = new ArrayList<Usuario>();
    }
    
    ////SINGLETON
    
    public static Sistema getSistamaInstance() {
        if(sistema==null) {
            sistema = new Sistema();
        }
        return sistema;
    }
    
    
    
    

    public Sistema deSerializar(String a) throws IOException, ClassNotFoundException {
        FileInputStream f = new FileInputStream(a);
        ObjectInputStream o = new ObjectInputStream(f);
        Sistema s = (Sistema) o.readObject();
        o.close();
        f.close();
        return s;
    }

    public void serializar(String a) throws IOException {
        FileOutputStream f = new FileOutputStream(a);
        ObjectOutputStream o = new ObjectOutputStream(f);
        o.writeObject(this);
        o.close();
        f.close();
    }

    public Usuario buscarPersona(String datos) {
        int i = 0;
        boolean encontrado = false;
        Usuario p = null;

        while (i < usuarios.size() && !encontrado) {
            p = usuarios.get(i);
            if (datos.equals(p.getUser() + ":" + p.getPass())) {
                encontrado = true;
            } else {
                i++;
            }
        }
        if (!encontrado) {
            return null;
        } else {
            return p;
        }
    }

    
    public ArrayList<Usuario> getUsuarios() {
        return usuarios;
    }

    public void setUsuarios(ArrayList<Usuario> usuarios) {
        this.usuarios = usuarios;
    }
    
    
    
    
    
    
    
    
    
}
