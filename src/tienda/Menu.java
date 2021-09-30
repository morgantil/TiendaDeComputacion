/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tienda;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Calendar;
import static java.util.Calendar.DATE;
import java.util.Date;

import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Leonardo Morganti
 */
public class Menu {

    int opcion;
    ArrayList<Producto> listaProductos = new ArrayList<Producto>();

    public Menu() {
    }

    public void saludar(Sistema sistemas) throws IOException {
        listaProductos = sistemas.getProductos();

        Scanner scanner = new Scanner(System.in);
        do {

            System.out.println("BIENVENIDO A TIENDA DE COMPUTACION");
            System.out.println("Elija 1 para Listar ariculos");
            System.out.println("Elija 2 para Agregar articulos");
            System.out.println("Elija 3 para Vender ariculos");
            System.out.println("Elija 4 Salir");
            opcion = scanner.nextInt();

            switch (opcion) {

                case 1:
                    listarProductos();
                    break;
                case 2:
                    agregar(sistemas);
                    break;
                case 3:
                    vender(sistemas);
                    break;
                case 4:
                    break;
                default:
                    System.out.println(" \n Elija una opcion valida \n");
            }
        } while (opcion != 4);

    }

    public void agregar(Sistema sistema) throws IOException {
        Scanner scanner = new Scanner(System.in);
        int producto;
        System.out.println("VA A AGREGAR ALGUN PRODUCTO ELIJA POR FAVOR");
        System.out.println("Elija 1 para Agregar Laptop");
        System.out.println("Elija 2 para Agregar Componentes");
        System.out.println("Elija 3 para Agregar Perifericos");
        System.out.println("Elija 4 Salir");
        producto = scanner.nextInt();

        String texto;

        switch (producto) {

            case 1:

                Laptop laptop = ingresarLaptop();
                listaProductos.add(laptop);
                texto = laptop.toTextoArchivo();
                 sistema.setProductos(listaProductos);//
               sistema.serializar("computacion2.txt");//

                break;
            case 2:
                agregarComponentes(sistema);
                break;
            case 3:

                Periferico peri = ingresarPeriferico();
                listaProductos.add(peri);
                texto = peri.toTextoArchivo();
               sistema.setProductos(listaProductos);//
               sistema.serializar("computacion2.txt");//

                break;
            case 4:
                break;
            default:
                System.out.println(" \n Elija una opcion valida \n");
        }

    }

    public void agregarComponentes(Sistema sistemas) throws IOException {

        Scanner scanner = new Scanner(System.in);
        int componentes;
        System.out.println("VA A INGRESAR ALGUN COMPONENTE ELIJA POR FAVOR");
        System.out.println("Elija 1 para Agregar Procesador Desktop");
        System.out.println("Elija 2 para Agregar Procesador Laptop");
        System.out.println("Elija 3 para Agregar Disco Rigido");
        System.out.println("Elija 4 para Agregar Memoria Ram");
        System.out.println("Elija 5 para Agregar Placa de Video");
        System.out.println("Elija 6 Salir");
        componentes = scanner.nextInt();

        String texto;
        switch (componentes) {

            case 1:

                ProcesadorDesktop pd = ingresarDatosProcesadorDesktop();
                listaProductos.add(pd);
                sistemas.setProductos(listaProductos);
                sistemas.serializar("computacion2.txt");
                texto = pd.toTextoArchivo();

                break;
            case 2:
                ProcesadorLaptop pl = ingresarDatosProcesadorLaptop();
                listaProductos.add(pl);

                sistemas.setProductos(listaProductos);
                sistemas.serializar("computacion2.txt");
                texto = pl.toTextoArchivo();

                break;
            case 3:
                DiscoRigido hd = ingresarDatosDiscoRigido();
                listaProductos.add(hd);
                sistemas.setProductos(listaProductos);
                sistemas.serializar("computacion2.txt");
                texto = hd.toTextoArchivo();

                break;
            case 4:

                Ram ram = ingresarDatosRam();
                listaProductos.add(ram);
                sistemas.setProductos(listaProductos);
                sistemas.serializar("computacion2.txt");
                texto = ram.toTextoArchivo();

                break;
            case 5:
                PlacaDeVideo pv = ingresarDatosPlacaDeVideo();
                listaProductos.add(pv);
                sistemas.setProductos(listaProductos);
                sistemas.serializar("computacion2.txt");
                texto = pv.toTextoArchivo();

                break;
            default:
                System.out.println(" \n Elija una opcion valida \n");
        }

    }

    public Laptop ingresarLaptop() {

        Scanner scanner = new Scanner(System.in);
        Laptop laptop = new Laptop();

        System.out.println("INGRESE LA MARCA DE LA LAPTOP");
        laptop.setMarca(scanner.nextLine());

        System.out.println("INGRESE MODELO DE LAPTOP");
        laptop.setModelo(scanner.nextLine());

        System.out.println("INGRESE EL TAMAÑO DE LA PANTALLA");
        laptop.setPantalla(scanner.nextLine());

        ingresarDatosProductos(laptop);

        return laptop;
    }

    public Periferico ingresarPeriferico() {

        Scanner scanner = new Scanner(System.in);
        Periferico peri = new Periferico();

        System.out.println("INGRESE TIPO DE PERIFIRICO");
        peri.setTipo(scanner.nextLine());

        ingresarDatosProductos(peri);

        return peri;
    }

    public DiscoRigido ingresarDatosDiscoRigido() {

        Scanner scanner2 = new Scanner(System.in);
        DiscoRigido hd = new DiscoRigido();

        System.out.println("INGRESE LA MARCA DEL DISCO RIGIDO");
        hd.setMarca(scanner2.nextLine());

        System.out.println("INGRESE EL TIPO DEL DISCO RIGIDO");
        hd.setTipo(scanner2.nextLine());

        System.out.println("INGRESE LA CAPACIDAD DEL DISCO RIGIDO");
        hd.setCapacidad(scanner2.nextLine());

        ingresarDatosComponentes(hd);

        ingresarDatosProductos(hd);

        return hd;
    }

    public ProcesadorDesktop ingresarDatosProcesadorDesktop() {

        ProcesadorDesktop desktop = new ProcesadorDesktop();
        Scanner scanner = new Scanner(System.in);
        System.out.println("INGRESE EL FABRICANTE DEL PROCESADOR");
        desktop.setFabricante(scanner.nextLine());

        System.out.println("INGRESE EL MODELO DEL PROCESADOR");
        desktop.setModelo(scanner.nextLine());

        System.out.println("INGRESE LA FRENCUENCIA");
        desktop.setFrecuencia(scanner.nextLine());

        ingresarDatosComponentes(desktop);

        ingresarDatosProductos(desktop);

        return desktop;

    }

    public ProcesadorLaptop ingresarDatosProcesadorLaptop() {
        Scanner scanner = new Scanner(System.in);
        ProcesadorLaptop laptop = new ProcesadorLaptop();

        System.out.println("INGRESE EL FABRICANTE DEL PROCESADOR");
        laptop.setFabricante(scanner.nextLine());

        System.out.println("INGRESE EL MODELO DEL PROCESADOR");
        laptop.setModelo(scanner.nextLine());

        System.out.println("INGRESE LA FRENCUENTCIA");
        laptop.setFrecuencia(scanner.nextLine());

        ingresarDatosComponentes(laptop);

        ingresarDatosProductos(laptop);

        return laptop;
    }

    public Ram ingresarDatosRam() {
        Scanner scanner = new Scanner(System.in);
        Ram ram = new Ram();

        System.out.println("INGRESE LA MARCA DE LA MEMORIA");
        ram.setMarca(scanner.nextLine());

        System.out.println("INGRESE LA TECNOLOGIA DE LA MEMORIA");
        ram.setTecnologia(scanner.nextLine());

        System.out.println("INGRESE LA FRENCUENTCIA");
        ram.setFrecuencia(scanner.nextLine());

        System.out.println("INGRESE LA CAPACODAD DE LA MEMORIA");
        ram.setCapacidad(scanner.nextLine());

        ingresarDatosComponentes(ram);

        ingresarDatosProductos(ram);

        return ram;
    }

    public PlacaDeVideo ingresarDatosPlacaDeVideo() {
        Scanner scanner = new Scanner(System.in);
        PlacaDeVideo video = new PlacaDeVideo();

        System.out.println("INGRESE EL FABRICANTE DE LA PLACA");
        video.setFabricante(scanner.nextLine());

        System.out.println("INGRESE EL MODELO DE LA PLACA");
        video.setModelo(scanner.nextLine());

        System.out.println("INGRESE LA MEMORIA DE LA PLACA");
        video.setMemoria(scanner.nextLine());

        ingresarDatosComponentes(video);

        ingresarDatosProductos(video);

        return video;
    }

    public void ingresarDatosComponentes(Componente componente) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("INGRESE D PARA DESKTOP L PARA LAPTOP A PARA AMBOS");
        componente.setUtilizable(scanner.nextLine());

    }

    public void ingresarDatosProductos(Producto producto) {
        Scanner scanner = new Scanner(System.in);
        String precio = new String();
        System.out.println("INGRESE PRECIO UNITARIO  ");
        precio = scanner.nextLine();
        producto.setPrecioUnitario(Float.valueOf(precio));
        System.out.println("INGRESE UNA DESCRIPCION DEL PRODUCTO");
        producto.setDescripcion(scanner.nextLine());
        System.out.println("INGRESE LA FECHA DE CARGA dd/mm/yyyy");
        producto.setFecha(new Date(scanner.nextLine()));
    }

    public void listarProductos() {

        System.out.println("LOS PRODUCTOS SON:");

        Producto p = null;

        for (int i = 0; i < listaProductos.size(); i++) {

            p = listaProductos.get(i);

            System.out.println(p.toString());

        }

    }

    public void vender(Sistema sistemas) {

        Scanner scanner = new Scanner(System.in);
        int componentesVender;

        System.out.println("VA A VENDER ALGUN COMPONENTE ELIJA POR FAVOR");
        System.out.println("Elija 1 para Vender Procesador Desktop");
        System.out.println("Elija 2 para Vender Disco Rigido");
        System.out.println("Elija 3 para Vender Memoria Ram");
        System.out.println("Elija 4 para Vender Placa de Video");
        System.out.println("Elija 5 para Vender Laptop");
        System.out.println("Elija 6 para Vender Desktop");
        System.out.println("Elija 7 para Vender Periferico");
        System.out.println("Elija 8 Salir");
        componentesVender = scanner.nextInt();
        Producto producto = null;
        boolean hayDiezStock = false;
        boolean fechaSuperior = false;

        switch (componentesVender) {

            case 1:

                System.out.println("USTED HA SELECCIONADO UN PROCESADOR DESKTOP");
                ProcesadorDesktop pd = new ProcesadorDesktop();
                hayDiezStock = hayDiezStock(pd);
                producto = borrarProducto(pd, sistemas);
                fechaSuperior = fechaSuperior(producto);

                if (producto != null) {

                    if (hayDiezStock == true && fechaSuperior == false) {
                        System.out.println("EL PRECIO ES: " + producto.getPrecioUnitario());
                    }
                    if (hayDiezStock == false && fechaSuperior == false) {

                        System.out.println("SE APLICO UN DESCUENTO POR BAJO STOCK: " + producto.getPrecioUnitario() * 0.80);
                    }

                    if (fechaSuperior == true && hayDiezStock == true) {
                        System.out.println("SE APLICO UN DESCUENTO POR FECHA SUPERIOR A UN AÑO: " + producto.getPrecioUnitario() * 0.80);
                    }

                    if (hayDiezStock == false && fechaSuperior == true) {

                        System.out.println("SE APLICO UN DESCUENTO POR BAJO STOCK Y FECHA SUPERIOR A UN AÑO: " + producto.getPrecioUnitario() * 0.80);

                    }

                }
                fechaSuperior = hayDiezStock = false;
                break;
            case 2:

                System.out.println("USTED HA SELECCIONADO UN DISCO RIGIDO");
                DiscoRigido hd = new DiscoRigido();

                hayDiezStock = hayDiezStock(hd);
                producto = borrarProducto(hd, sistemas);
                fechaSuperior = fechaSuperior(producto);

                if (producto != null) {

                    if (hayDiezStock == true && fechaSuperior == false) {
                        System.out.println("EL PRECIO ES: " + producto.getPrecioUnitario());
                    }
                    if (hayDiezStock == false && fechaSuperior == false) {

                        System.out.println("SE APLICO UN DESCUENTO POR BAJO STOCK: " + producto.getPrecioUnitario() * 0.80);
                    }

                    if (fechaSuperior == true && hayDiezStock == true) {
                        System.out.println("SE APLICO UN DESCUENTO POR FECHA SUPERIOR A UN AÑO: " + producto.getPrecioUnitario() * 0.80);
                    }

                    if (hayDiezStock == false && fechaSuperior == true) {

                        System.out.println("SE APLICO UN DESCUENTO POR BAJO STOCK Y FECHA SUPERIOR A UN AÑO: " + producto.getPrecioUnitario() * 0.80);

                    }

                }
                hayDiezStock = false;
                fechaSuperior = false;

                break;
            case 3:

                System.out.println("USTED HA SELECCIONADO UNA MEMORIA RAM");
                Ram ram = new Ram();

                hayDiezStock = hayDiezStock(ram);
                producto = borrarProducto(ram, sistemas);
                fechaSuperior = fechaSuperior(producto);

                if (producto != null) {

                    if (hayDiezStock == true && fechaSuperior == false) {
                        System.out.println("EL PRECIO ES: " + producto.getPrecioUnitario());
                    }
                    if (hayDiezStock == false && fechaSuperior == false) {

                        System.out.println("SE APLICO UN DESCUENTO POR BAJO STOCK: " + producto.getPrecioUnitario() * 0.80);
                    }

                    if (fechaSuperior == true && hayDiezStock == true) {
                        System.out.println("SE APLICO UN DESCUENTO POR FECHA SUPERIOR A UN AÑO: " + producto.getPrecioUnitario() * 0.80);
                    }

                    if (hayDiezStock == false && fechaSuperior == true) {

                        System.out.println("SE APLICO UN DESCUENTO POR BAJO STOCK Y FECHA SUPERIOR A UN AÑO: " + producto.getPrecioUnitario() * 0.80);

                    }

                }
                fechaSuperior = hayDiezStock = false;

                break;
            case 4:
                System.out.println("USTED HA SELECCIONADO UN PLACA DE VIDEO");
                PlacaDeVideo pv = new PlacaDeVideo();

                hayDiezStock = hayDiezStock(pv);
                producto = borrarProducto(pv, sistemas);
                fechaSuperior = fechaSuperior(producto);

                if (producto != null) {

                    if (hayDiezStock == true && fechaSuperior == false) {
                        System.out.println("EL PRECIO ES: " + producto.getPrecioUnitario());
                    }
                    if (hayDiezStock == false && fechaSuperior == false) {

                        System.out.println("SE APLICO UN DESCUENTO POR BAJO STOCK: " + producto.getPrecioUnitario() * 0.80);
                    }

                    if (fechaSuperior == true && hayDiezStock == true) {
                        System.out.println("SE APLICO UN DESCUENTO POR FECHA SUPERIOR A UN AÑO: " + producto.getPrecioUnitario() * 0.80);
                    }

                    if (hayDiezStock == false && fechaSuperior == true) {

                        System.out.println("SE APLICO UN DESCUENTO POR BAJO STOCK Y FECHA SUPERIOR A UN AÑO: " + producto.getPrecioUnitario() * 0.80);

                    }

                }
                fechaSuperior = hayDiezStock = false;

                break;
            case 5:

                System.out.println("USTED HA SELECCIONADO UNA LAPTOP");

                ProcesadorLaptop pl1 = new ProcesadorLaptop();
                Ram ram1 = new Ram();
                PlacaDeVideo pv1 = new PlacaDeVideo();
                DiscoRigido hd1 = new DiscoRigido();
                Laptop laptop = new Laptop();

                boolean flag = false;

                if (existeProducto(pl1) == true && existeProducto(ram1) == true && existeProducto(hd1) == true && existeProducto(pv1) == true && existeProducto(laptop) == true) {

                    flag = true;

                }

                if (flag == true) {

                    Producto p1=borrarProducto(pl1, sistemas);

                    Producto p2=borrarProducto(ram1, sistemas);

                    Producto p3=borrarProducto(pv1, sistemas);

                    Producto p4=borrarProducto(hd1, sistemas);

                    Producto p5=borrarProducto(laptop, sistemas);
                    
                    float precio=calcularPreciolaptop(p1, p2, p3, p4,p5);
                    System.out.println("EL PRECIO DE LA VENTA FUE: "+precio);
                    
                } else {

                    System.out.println("NO SE PUEDE VENDER YA QUE NO SE ENCUENTRA EN STOCK TODAS SUS PARTES");
                }

                break;

            case 6:

                System.out.println("USTED HA SELECCIONADO UNA DESKTOP");

                ProcesadorDesktop pd1 = new ProcesadorDesktop();
                Ram ram2 = new Ram();
                PlacaDeVideo pv2 = new PlacaDeVideo();
                DiscoRigido hd2 = new DiscoRigido();

                boolean flag1 = false;

                if (existeProducto(pd1) == true && existeProducto(ram2) == true && existeProducto(hd2) == true && existeProducto(pv2) == true) {

                    flag1 = true;

                }

                if (flag1 == true) {

                    Producto producto1 = borrarProducto(pd1, sistemas);

                    Producto producto2 = borrarProducto(ram2, sistemas);

                    Producto producto3 = borrarProducto(pv2, sistemas);

                    Producto producto4 = borrarProducto(hd2, sistemas);

                    float precio = calcularPrecioDesktop(producto1, producto2, producto3, producto4);

                    System.out.println("EL PRECIO DE LA DESKTOP ES: " + precio);

                } else {

                    System.out.println("NO SE PUEDE VENDER YA QUE NO SE ENCUENTRA EN STOCK TODAS SUS PARTES");
                }

                break;

            case 7:
                System.out.println("USTED HA SELECCIONADO UN PERIFERICO");
                Periferico periferico = new Periferico();

                hayDiezStock = hayDiezStock(periferico);
                producto = borrarProducto(periferico, sistemas);
                fechaSuperior = fechaSuperior(producto);

                if (producto != null) {

                    if (hayDiezStock == true && fechaSuperior == false) {
                        System.out.println("EL PRECIO ES: " + producto.getPrecioUnitario());
                    }
                    if (hayDiezStock == false && fechaSuperior == false) {

                        System.out.println("SE APLICO UN DESCUENTO POR BAJO STOCK: " + producto.getPrecioUnitario() * 0.80);
                    }

                    if (fechaSuperior == true && hayDiezStock == true) {
                        System.out.println("SE APLICO UN DESCUENTO POR FECHA SUPERIOR A UN AÑO: " + producto.getPrecioUnitario() * 0.80);
                    }

                    if (hayDiezStock == false && fechaSuperior == true) {

                        System.out.println("SE APLICO UN DESCUENTO POR BAJO STOCK Y FECHA SUPERIOR A UN AÑO: " + producto.getPrecioUnitario() * 0.80);

                    }

                }
                fechaSuperior = hayDiezStock = false;

                break;
            case 8:
                break;

            default:
                System.out.println(" \n Elija una opcion valida \n");
        }

    }

    public Producto borrarProducto(Producto producto, Sistema sistemas) {

        Producto producto1 = null;

        boolean flag = false;
        Object tipo = producto.getClass();

        for (Producto p : listaProductos) {

            if (p.getClass() == tipo) {

                producto1 = p;

                listaProductos.remove(p);
                System.out.println("Producto Vendido");
                flag = true;
                break;

            }

        }

        if (flag == false) {

            String componente = "";

            if (tipo == ProcesadorDesktop.class) {

                componente = "Procesador de Desktop";

            }

            if (tipo == Ram.class) {

                componente = "Memoria Ram";

            }

            if (tipo == DiscoRigido.class) {

                componente = "Disco Rigido";

            }

            if (tipo == PlacaDeVideo.class) {

                componente = "Placa De Video";

            }

            if (tipo == Periferico.class) {

                componente = "Periferico";

            }

            if (tipo == ProcesadorLaptop.class) {

                componente = "Procesador de Laptop";

            }

            System.out.println("NO HAY STOCK DE: " + componente);
        }

        try {
            sistemas.serializar("computacion2.txt");
        } catch (IOException ex) {
            Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
        }
        return producto1;
    }

    public boolean existeProducto(Producto producto) {

        boolean flag = false;
        Object tipo = producto.getClass();

        for (Producto p : listaProductos) {

            if (p.getClass() == tipo) {

                flag = true;
                break;

            }
        }

        return flag;
    }

    public boolean hayDiezStock(Producto producto) {

        boolean bandera = false;

        int contador = 0;

        Object tipo = producto.getClass();

        for (Producto p : listaProductos) {

            if (p.getClass() == tipo) {

                contador++;

            }
        }

        if (contador >= 10) {

            bandera = true;
        }

        return bandera;
    }

    public boolean fechaSuperior(Producto producto) {

        Calendar fecha = Calendar.getInstance();

        fecha.setTime(producto.getFecha());
        fecha.add(Calendar.YEAR, 1);
        Date fechaProd = fecha.getTime();

        Date fechaActual = new Date();

        boolean bandera = false;

        if (fechaProd.before(fechaActual)) {

            bandera = true;

        }

        return bandera;
    }

    public float calcularPrecioDesktop(Producto pd, Producto hd, Producto ram, Producto pv) {

        float preciofinal, precioaux = 0;

        preciofinal = (pd.getPrecioUnitario() + hd.getPrecioUnitario() + ram.getPrecioUnitario() + pv.getPrecioUnitario());
        preciofinal = preciofinal * (float) 0.85;

        return preciofinal;
    }

    public float calcularPreciolaptop(Producto pl, Producto hd, Producto ram, Producto pv,Producto laptop) {

        float preciofinal;
        
         preciofinal = (pl.getPrecioUnitario() + hd.getPrecioUnitario() + ram.getPrecioUnitario() + pv.getPrecioUnitario()+laptop.getPrecioUnitario());
        
       if(((Laptop) laptop).getMarca().equals("lenovo")||((Laptop) laptop).getMarca().equals("hp")) {

     preciofinal = preciofinal * (float) 1.10;
       
       }
       
 
        return preciofinal;

    }

}
