import java.util.Scanner;

public class ControladorMain {
    ControladorAutor autor = new ControladorAutor();
    ControladorCliente clientes = new ControladorCliente();

    ControladorLibro libro = new ControladorLibro();
    ControladorTransacciones transacciones = new ControladorTransacciones();

    public int menu() {
        Scanner leer = new Scanner(System.in);
        System.out.println("{MENU}");
        System.out.println("> 1.- Modificar Autores");
        System.out.println("> 2.- Modificar Libros");
        System.out.println("> 3.- Modificar Cliente");
        System.out.println(">4.- Transacciones");
        System.out.println(">5.- Salir");
        int mod = leer.nextInt();
        switch (mod) {
            case 1 -> {
                autor.autores();
            }
            case 2 -> {
                libro.libro();
            }
            case 3 -> {
                clientes.clientes();
            }
            case 4 -> {
                transacciones.transacciones();
            }
        }
        return mod;
    }
}

