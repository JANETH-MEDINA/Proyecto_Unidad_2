import java.util.ArrayList;

public class Libro {
    private String isbn;
    private String titulo;
    private Autor autor;
    private Fecha FechaDePublicacion;
    private boolean Disponibilidad;

    public Libro(String isbn, String titulo, Autor autor, Fecha FechaDePublicacion, boolean Disponibilidad) {
        this.isbn = isbn;
        this.titulo = titulo;
        this.autor = autor;
        this.FechaDePublicacion = FechaDePublicacion;
        this.Disponibilidad = Disponibilidad;
    }

    public String getIsbn() {
        return isbn;
    }

    public String getTitulo() {
        return titulo;
    }

    public Autor getAutor() {
        return autor;
    }

    public Fecha getFechaDePublicacion() {
        return FechaDePublicacion;
    }

    public boolean isDisponibilidad() {
        return Disponibilidad;
    }
}
