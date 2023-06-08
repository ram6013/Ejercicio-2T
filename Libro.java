import java.util.ArrayList;
import java.util.List;

public class Libro {
    private String titulo;
    private List<String> autores;
    private String identificador;
    private Categoria categoria;
    private int edadRecomendada;
    private boolean prestado;
    private Usuario usuarioPrestamo;

    public Libro(String titulo, List<String> autores, String identificador, Categoria categoria, int edadRecomendada) {
        this.titulo = titulo;
        this.autores = new ArrayList<>(autores);
        this.identificador = identificador;
        this.categoria = categoria;
        this.edadRecomendada = edadRecomendada;
        this.prestado = false;
        this.usuarioPrestamo = null;
    }

    public String getTitulo() {
        return titulo;
    }

    public List<String> getAutores() {
        return autores;
    }

    public String getIdentificador() {
        return identificador;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public int getEdadRecomendada() {
        return edadRecomendada;
    }

    public boolean isPrestado() {
        return prestado;
    }

    public void setPrestado(boolean prestado) {
        this.prestado = prestado;
    }

    public Usuario getUsuarioPrestamo() {
        return usuarioPrestamo;
    }

    public void setUsuarioPrestamo(Usuario usuarioPrestamo) {
        this.usuarioPrestamo = usuarioPrestamo;
    }
}
