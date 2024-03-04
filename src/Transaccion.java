public class Transaccion {
    private String id;
    private String tipo;
    private Cliente cliente;
    /* private Libro libro;*/
    private Fecha fecha;

    public String getId() {
        return id;
    }

    public String getTipo() {
        return tipo;
    }

    public Cliente getCliente() {
        return cliente;
    }

    /*public Libro getLibro() {
        return libro;
    }*/

    public Fecha getFecha() {
        return fecha;
    }
}

