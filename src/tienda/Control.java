package tienda;

import java.io.IOException;
import java.util.Scanner;

public class Control {

    public void ejecutar() throws IOException {
        Scanner scanner = new Scanner(System.in);
        Sistema sistema = Sistema.getSistamaInstance();///SINGLETON

        String seguir;
        try {
            sistema = sistema.deSerializar("computacion2.txt");

            System.out.println("TIENDA DE COMPUTACION");
            System.out.println("¿Desea ingresar? ingresi si o no");
            seguir = scanner.nextLine();

        } catch (Exception e) {

            System.out.println("Bienvenido");

            System.out.println("Digite su nombre de usuario");

            String usuario = scanner.nextLine();

            if (usuario.equals("")) {
                throw new NullPointerException("INGRESE UN USUARIO CORRECTO");
            }

            System.out.println("Digite su Contraseña:");
            String password = scanner.nextLine();

            if (password.equals("")) {
                throw new NullPointerException("HAY UN ERROR EN SU CONTRASEÑA");
            }
            sistema.getUsuarios().add(new Usuario(usuario, password));
            try {
                sistema.serializar("computacion2.txt");

                System.out.println("Inicio correcto!! Reinicie por favor");

            } catch (IOException ex) {
                ex.printStackTrace();
            }
            seguir = "no";
        }

        while (seguir.equals("si")) {

            System.out.println("Digite su nombre de usuario:");
            String usuario = scanner.nextLine();

            System.out.println("Digite su Contraseña:");
            String password = scanner.nextLine();

            Usuario p = sistema.buscarPersona(usuario + ":" + password);

            if (p == null) {

                System.out.println("El usuario o la contraseña son incorrectos");

            } else {

                Menu menu = new Menu();

                menu.saludar(sistema);

            }
        }
    }
}
