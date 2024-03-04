import java.util.Scanner;

public class ControladorAutor {
    public void autores() {
        Scanner leer = new Scanner(System.in);
        System.out.println("{MENU}");
        System.out.println("> 1.- Borrar Autor");
        System.out.println("> 2.- Crear Autor");
        System.out.println("> 3.- Editar Autor ");
        System.out.println(">4.- Mostrar Autores");
        System.out.println(">5.- Ver libros del algun autor");
        System.out.println(">6.- Volver al menú principal");
        int aut = leer.nextInt();
        switch (aut) {
            case 1 -> {
                if (RepositorAutor.Autores.isEmpty()) {
                    System.out.println("No hay autores");
                } else {
                    System.out.println("Nombre del Autor:");
                    String nombre = leer.next();
                    System.out.println("Apellido del Autor");
                    String apellido = leer.next();
                    boolean a = false;
                    for (int i = 0; i < RepositorAutor.Autores.size(); i++) {
                        Autor autor = RepositorAutor.Autores.get(i);
                        if (autor.getPerfil().getNombre().equals(nombre) && autor.getPerfil().getApellido().equals(apellido)) {
                            RepositorAutor.Autores.remove(i);
                            a = true;
                            System.out.println("Autor eliminado");
                            break;
                        }
                    }
                    if (!a) {
                        System.out.println("Autor inexistente");
                    }
                }
            }
            case 2 -> {
                System.out.println("DATOS DEL AUTOR");
                System.out.println(">1.-Nombre del autor");
                String nombre = leer.next();
                System.out.println(">2.-Apellido del  autor");
                String apellido = leer.next();
                System.out.println(">3.-Fecha de Nacimiento con 2 digitos");
                System.out.println("Día: ");
                int dia = leer.nextInt();
                System.out.println("Mes: ");
                int mes = leer.nextInt();
                System.out.println("Año: ");
                int anualidad = leer.nextInt();
                Fecha nacimiento = new Fecha(dia, mes, anualidad);
                Perfil autores = new Perfil(nombre, apellido, nacimiento);
                Autor autoress = new Autor();
                autoress.setPerfil(autores);
                RepositorAutor.Autores.add(autoress);
            }
            case 3 -> {


                if (RepositorAutor.Autores.isEmpty()) {
                    System.out.println("No hay autores");
                } else {
                    System.out.println("................................................................................................................................................");
                    System.out.printf(": %-20s : %-10s : %-10s :\n", "NOMBRE", "APELLIDO", "NACIEMIENTO");
                    System.out.println("................................................................................................................................................");
                    for (int i = 0; i < RepositorAutor.Autores.size(); i++) {
                        Fecha fecha = RepositorAutor.Autores.get(i).getPerfil().getNacimiento();
                        System.out.printf(": %-30s : %-20s : %-4s/%-4s/%-4s\n", RepositorAutor.Autores.get(i).getPerfil().getNombre(), RepositorAutor.Autores.get(i).getPerfil().getApellido(), fecha.getDia(), fecha.getMes(), fecha.getAnualidad());
                    }
                    System.out.println("................................................................................................................................................");
                }

                System.out.println("AUTOR A EDITAR");
                System.out.println("Nombre del Autor:");
                String nombre = leer.next();
                System.out.println("Apellido del Autor");
                String apellido = leer.next();
                boolean a = false;
                for (int i = 0; i < RepositorAutor.Autores.size(); i++) {
                    Autor autor = RepositorAutor.Autores.get(i);
                    if (autor.getPerfil().getNombre().equals(nombre) && autor.getPerfil().getApellido().equals(apellido)) {
                        System.out.println("¿Qué dato desea cambiar? (Nombre, Apellido, Fecha de nacimiento) ");
                        String dato = leer.next();
                        switch (dato) {
                            case "Nombre" -> {
                                RepositorAutor.Autores.remove(autor.getPerfil().getNombre());
                                System.out.println("Ingrese el nombre correcto:");

                            }
                            case "Apellido" -> {
                                RepositorAutor.Autores.remove(autor.getPerfil().getApellido());
                                System.out.println("Ingrese el apellido correcto:");


                            }
                            case "Fecha de nacimiento" -> {
                                RepositorAutor.Autores.remove(autor.getPerfil().getNacimiento());
                                System.out.println("Ingrese la fecha correcta:");
                                System.out.println("Día:");
                                int dia = leer.nextInt();
                                System.out.println("Mes:");
                                int mes = leer.nextInt();
                                System.out.println("Año:");
                                int anualidad = leer.nextInt();
                                Fecha nacimiento = new Fecha(dia, mes, anualidad);
                                Perfil autores = new Perfil(nombre, apellido, nacimiento);
                                Autor autoress = new Autor();
                                autoress.setPerfil(autores);
                                RepositorAutor.Autores.add(autoress);
                            }
                        }
                    }
                }
                if (!a) {
                    System.out.println("Autor inexistente");
                }
            }

            case 4 -> {
                if (RepositorAutor.Autores.isEmpty()) {
                    System.out.println("No hay autores");
                } else {
                    System.out.println("................................................................................................................................................");
                    System.out.printf(": %-20s : %-10s : %-10s :\n", "NOMBRE", "APELLIDO", "NACIEMIENTO");
                    System.out.println("................................................................................................................................................");
                    for (int i = 0; i < RepositorAutor.Autores.size(); i++) {
                        Fecha fecha = RepositorAutor.Autores.get(i).getPerfil().getNacimiento();
                        System.out.printf(": %-30s : %-20s : %-4s/%-4s/%-4s\n", RepositorAutor.Autores.get(i).getPerfil().getNombre(), RepositorAutor.Autores.get(i).getPerfil().getApellido(), fecha.getDia(), fecha.getMes(), fecha.getAnualidad());
                    }
                    System.out.println("................................................................................................................................................");
                }
            }
            case 5 -> {
                System.out.println("De que autor desea ver los libros?");
            }
        }
    }
}
