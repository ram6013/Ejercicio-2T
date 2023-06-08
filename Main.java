import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Crear algunas categorías
        Categoria aventuras = new Categoria("Aventuras");
        Categoria cienciaFiccion = new Categoria("Ciencia Ficción");
        Categoria romantica = new Categoria("Romántica");
        Categoria historia = new Categoria("Historia");
        Categoria arte = new Categoria("Arte");

        // Crear algunos libros
        Libro libro1 = new Libro("Libro 1", crearListaAutores("Autor 1"), "ISBN1", aventuras, 10);
        Libro libro2 = new Libro("Libro 2", crearListaAutores("Autor 2"), "ISBN2", cienciaFiccion, 12);
        Libro libro3 = new Libro("Libro 3", crearListaAutores("Autor 3"), "ISBN3", romantica, 15);

        // Crear algunos usuarios
        Usuario usuario1 = new Usuario("Usuario 1", "Apellidos 1", "01/01/2000", "DNI1");
        Usuario usuario2 = new Usuario("Usuario 2", "Apellidos 2", "01/01/2005", "DNI2");

        // Obtener la instancia de la biblioteca
        Biblioteca biblioteca = Biblioteca.getInstance();

        // Agregar libros y usuarios a la biblioteca
        biblioteca.agregarLibro(libro1);
        biblioteca.agregarLibro(libro2);
        biblioteca.agregarLibro(libro3);
        biblioteca.agregarUsuario(usuario1);
        biblioteca.agregarUsuario(usuario2);

        // Realizar un préstamo de libro
        try {
            biblioteca.prestarLibro(libro1, usuario1);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

        // Listar libros prestados por usuario
        List<Libro> librosPrestadosPorUsuario = biblioteca.buscarLibrosPorUsuario(usuario1);
        for (Libro libro : librosPrestadosPorUsuario) {
            System.out.println(libro.getTitulo());
        }

        // Devolver un libro prestado
        biblioteca.devolverLibro(libro1);
    }

    private static List<String> crearListaAutores(String autor) {
        List<String> listaAutores = new ArrayList<String>();
        listaAutores.add(autor);
        return listaAutores;
    }
}
