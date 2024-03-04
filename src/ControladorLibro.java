import java.util.Scanner;

public class ControladorLibro {
    public void libro() {
        Scanner leer = new Scanner(System.in);
        System.out.println("{MENU}");
        System.out.println("> 1.- Borrar Libro");
        System.out.println("> 2.- Crear Libro");
        System.out.println("> 3.- Editar Libro");
        System.out.println(">4.- Mostarar libros");
        System.out.println(">5.- Volver al menú principal");
        int lib = leer.nextInt();
        switch (lib) {
            case 1 -> {
                if (RepositorLibro.Libros.isEmpty()) {
                    System.out.println("No hay libros");
                } else {
                    System.out.println("ISBN del Libro:");
                    String isbn = leer.next();
                    boolean a = false;
                    for (int i = 0; i < RepositorLibro.Libros.size(); i++) {
                        Libro libro = RepositorLibro.Libros.get(i);
                        if (libro.getIsbn().equalsIgnoreCase(isbn)) {
                            RepositorLibro.Libros.remove(i);
                            a = true;
                            System.out.println("Libro eliminado");
                            break;
                        }
                    }
                    if (!a) {
                        System.out.println("Libro inexistente");
                    }
                }
            }

            case 2 -> {
                System.out.println("DATOS DEL LIBRO");
                System.out.println(">1.-ISBN");
                String isbn = leer.next();
                System.out.println(">2.-Titulo");
                String titulo = leer.next();
                System.out.println(">3.-Autor");
                System.out.println("Nombre del Autor:");
                String nombre = leer.next();
                System.out.println("Apellido del Autor:");
                String apellido = leer.next();
                Autor autor = new Autor();
                for (int i = 0; i < RepositorLibro.Libros.size(); i++) {
                    RepositorLibro.Libros.get(i);
                    if (RepositorAutor.Autores.get(i).getPerfil().getNombre().equalsIgnoreCase(nombre) && RepositorAutor.Autores.get(i).getPerfil().getApellido().equalsIgnoreCase(apellido)) {
                        autor = RepositorAutor.Autores.get(i);
                    }

                }

                System.out.println(">4.-Fecha de publicación");
                System.out.println("Día: ");
                int dia = leer.nextInt();
                System.out.println("Mes: ");
                int mes = leer.nextInt();
                System.out.println("Año: ");
                int anualidad = leer.nextInt();
                System.out.println(">5.-Disponibilidad");
                System.out.println(">6.-Volver al menú de libros");
                Fecha FechaDePublicacion = new Fecha(dia, mes, anualidad);
                Libro libros = new Libro(isbn, titulo, autor, FechaDePublicacion, true);
                RepositorLibro.Libros.add(libros);

            }
            case 3 -> {
                System.out.println();
            }
            case 4 -> {
                if (RepositorLibro.Libros.isEmpty()) {
                    System.out.println("No hay libros");
                } else {
                    System.out.println("................................................................................................................................................");
                    System.out.printf(": %-20s : %-20s: %-20s: %-10s : %-10s :\n", "ISBN", "TITULO", "AUTOR", "FECHA DE PUBLICACION", "DISPONIBILIDAD");
                    System.out.println("................................................................................................................................................");
                    for (int i = 0; i < RepositorLibro.Libros.size(); i++) {
                        Fecha fecha = RepositorLibro.Libros.get(i).getFechaDePublicacion();
                        System.out.printf(": %-20s : %-10s :%-10: %-4s/%-4s/%-4s : %-10\n", RepositorLibro.Libros.get(i).getIsbn(), RepositorLibro.Libros.get(i).getTitulo(), RepositorLibro.Libros.get(i).getAutor(), fecha.getDia(), fecha.getMes(), fecha.getAnualidad(), RepositorLibro.Libros.get(i).isDisponibilidad());
                    }
                    System.out.println("................................................................................................................................................");
                }
            }
        }
    }
}