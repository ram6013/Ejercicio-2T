import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
    private static Biblioteca instancia;
    private List<Libro> libros;
    private List<Usuario> usuarios;

    private Biblioteca() {
        this.libros = new ArrayList<>();
        this.usuarios = new ArrayList<>();
    }

    public static Biblioteca getInstance() {
        if (instancia == null) {
            instancia = new Biblioteca();
        }
        return instancia;
    }

    public void agregarLibro(Libro libro) {
        libros.add(libro);
    }

    public void agregarUsuario(Usuario usuario) {
        usuarios.add(usuario);
    }

    public void prestarLibro(Libro libro, Usuario usuario) throws Exception {
        if (!libro.isPrestado() && usuario.getEdad() >= libro.getEdadRecomendada()) {
            libro.setPrestado(true);
            libro.setUsuarioPrestamo(usuario);
        } else {
            throw new Exception("No se puede prestar el libro");
        }
    }

    public void devolverLibro(Libro libro) {
        if (libro.isPrestado()) {
            libro.setPrestado(false);
            libro.setUsuarioPrestamo(null);
        }
    }

    public List<Libro> buscarLibrosPorUsuario(Usuario usuario) {
        List<Libro> librosPrestados = new ArrayList<>();
        for (Libro libro : libros) {
            if (libro.isPrestado() && libro.getUsuarioPrestamo().equals(usuario)) {
                librosPrestados.add(libro);
            }
        }
        return librosPrestados;
    }

    public void darDeBajaLibro(Libro libro) {
        libros.remove(libro);
    }

    public void darDeBajaUsuario(Usuario usuario) {
        usuarios.remove(usuario);
    }

    public List<Libro> listarLibrosDisponibles() {
        List<Libro> librosDisponibles = new ArrayList<>();
        for (Libro libro : libros) {
            if (!libro.isPrestado()) {
                librosDisponibles.add(libro);
            }
        }
        return librosDisponibles;
    }

    public List<Libro> buscarLibrosPorTitulo(String titulo) {
        List<Libro> librosEncontrados = new ArrayList<>();
        for (Libro libro : libros) {
            if (libro.getTitulo().equalsIgnoreCase(titulo)) {
                librosEncontrados.add(libro);
            }
        }
        return librosEncontrados;
    }

    public List<Libro> buscarLibrosPorCategoria(Categoria categoria) {
        List<Libro> librosEncontrados = new ArrayList<>();
        for (Libro libro : libros) {
            if (libro.getCategoria().equals(categoria)) {
                librosEncontrados.add(libro);
            }
        }
        return librosEncontrados;
    }
}
