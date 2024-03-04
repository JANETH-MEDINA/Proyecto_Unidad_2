import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        ControladorMain menuprincipal = new ControladorMain();
        int mod;
        do {
            mod = menuprincipal.menu();
            menuprincipal.menu();
        } while (mod != 5);

    }
}