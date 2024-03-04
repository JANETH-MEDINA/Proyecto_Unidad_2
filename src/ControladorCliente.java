import java.util.Scanner;

public class ControladorCliente {
    public void clientes() {
        Scanner leer = new Scanner(System.in);
        System.out.println("{MENU}");
        System.out.println("> 1.- Borrar Cliente");
        System.out.println("> 2.- Crear Cliente");
        System.out.println("> 3.- Editar Cliente ");
        System.out.println(">4.- Mostrar clientes");
        System.out.println(">5.- Volver al menú principal");
        int cli = leer.nextInt();
        switch (cli) {
            case 1 -> {
                if (RepositorCliente.Clientes.isEmpty()) {
                    System.out.println("No hay clientes");
                } else {
                    System.out.println("Nombre del Cliente:");
                    String nombre = leer.next();
                    System.out.println("Apellido del Cliente");
                    String apellido = leer.next();
                    boolean c = false;
                    for (int i = 0; i < RepositorCliente.Clientes.size(); i++) {
                        Cliente cliente = RepositorCliente.Clientes.get(i);
                        if (cliente.getPerfil().getNombre().equals(nombre) && cliente.getPerfil().getApellido().equals(apellido)) {
                            RepositorCliente.Clientes.remove(i);
                            c = true;
                            System.out.println("Cliente eliminado");
                            break;
                        }
                    }
                    if (!c) {
                        System.out.println("Autor inexistente");
                    }
                }
            }
            case 2 -> {
                System.out.println("DATOS DEL CLIENTE");
                System.out.println(">1.-Nombre del cliente");
                String nombre = leer.next();
                System.out.println(">2.-Apellido del cliente");
                String apellido = leer.next();
                System.out.println(">3.-Fecha de Nacimiento con 2 digitos");
                System.out.println("Día: ");
                int dia = leer.nextInt();
                System.out.println("Mes: ");
                int mes = leer.nextInt();
                System.out.println("Año: ");
                int anualidad = leer.nextInt();
                Fecha nacimiento = new Fecha(dia, mes, anualidad);
                Perfil clientes = new Perfil(nombre, apellido, nacimiento);
                Cliente clientess = new Cliente();
                clientess.setPerfil(clientes);
                RepositorCliente.Clientes.add(clientess);

            }
            case 3 -> {
                if (RepositorCliente.Clientes.isEmpty()) {
                    System.out.println("No hay clientes");
                } else {
                    System.out.println("................................................................................................................");
                    System.out.printf(": %-30s : %-20s : %-10s : %-20s : %-15s :\n", "NOMBRE", "APELLIDO", "NACIMIENTO");
                    System.out.println("................................................................................................................");
                    for (int i = 0; i < RepositorCliente.Clientes.size(); i++) {
                        System.out.printf(RepositorCliente.Clientes.get(i).getPerfil().getNombre());
                        System.out.printf(RepositorCliente.Clientes.get(i).getPerfil().getApellido());
                        Fecha fecha = RepositorCliente.Clientes.get(i).getPerfil().getNacimiento();
                        System.out.printf(String.valueOf(fecha.getDia() + fecha.getMes() + fecha.getAnualidad()));
                        System.out.printf(": %-30s : %-20s : %-10s : %-20s : %-15s :\n");

                    }
                    System.out.println("................................................................................................................");
                    System.out.println("CLIENTE A EDITAR");
                    System.out.println("Nombre del Cliente:");
                    String nombre = leer.next();
                    System.out.println("Apellido del Cliente");
                    String apellido = leer.next();
                    boolean c = false;
                    for (int i = 0; i < RepositorCliente.Clientes.size(); i++) {
                        Cliente cliente = RepositorCliente.Clientes.get(i);
                        if (cliente.getPerfil().getNombre().equals(nombre) && cliente.getPerfil().getApellido().equals(apellido)) {
                            System.out.println("¿Qué dato desea cambiar? (Nombre, Apellido, Fecha de nacimiento) ");
                            String dato = leer.next();
                            switch (dato) {
                                case "Nombre" -> {
                                    RepositorCliente.Clientes.remove(cliente.getPerfil().getNombre());
                                    System.out.println("Ingrese el nombre correcto:");

                                }
                                case "Apellido" -> {
                                    RepositorCliente.Clientes.remove(cliente.getPerfil().getApellido());
                                    System.out.println("Ingrese el apellido correcto:");
                                }
                                case "Fecha de nacimiento" -> {
                                    RepositorCliente.Clientes.remove(cliente.getPerfil().getNacimiento());
                                    System.out.println("Ingrese la fecha correcta:");
                                    System.out.println("Día:");
                                    System.out.println("Mes:");
                                    System.out.println("Año:");
                                }
                            }
                        }
                    }
                    if (!c) {
                        System.out.println("Cliente inexistente");
                    }
                }
            }
            case 4 -> {
                if (RepositorCliente.Clientes.isEmpty()) {
                    System.out.println("No hay clientes");
                } else {
                    System.out.println("................................................................................................................................................");
                    System.out.printf(": %-20s : %-10s : %-10s :\n", "NOMBRE", "APELLIDO", "NACIEMIENTO");
                    System.out.println("................................................................................................................................................");
                    for (int i = 0; i < RepositorCliente.Clientes.size(); i++) {
                        Fecha fecha = RepositorCliente.Clientes.get(i).getPerfil().getNacimiento();
                        System.out.printf(": %-30s : %-20s : %-4s/%-4s/%-4s\n", RepositorCliente.Clientes.get(i).getPerfil().getNombre(), RepositorCliente.Clientes.get(i).getPerfil().getApellido(), fecha.getDia(), fecha.getMes(), fecha.getAnualidad());
                    }
                    System.out.println("................................................................................................................................................");
                }
            }
        }
    }
}

