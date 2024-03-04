import java.util.Scanner;

public class ControladorTransacciones {
    public void transacciones() {
        Scanner leer = new Scanner(System.in);
        System.out.println("VER TRANSACCIONES DE:");
        System.out.println(">1.- Rango de Fechas");
        System.out.println(">2.-Cliente");
        System.out.println(">3.-Libro");
        System.out.println(">4.- Volver al menu principal");
        int op = leer.nextInt();
        switch (op) {
            case 1 -> {
                System.out.println("MOVIMIENTOS EN RANGO DE FECHAS");

            }
            case 2 -> {
                System.out.println("MOVIENTOS HECHOS POR UN CLIENTE");
            }
            case 3 -> {
                System.out.println("MOVIMIENTOS DE UN SOLO LIBRO");
            }
        }
    }
}
