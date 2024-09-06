import com.mycompany.biblioteca.java.Libro;
import com.mycompany.biblioteca.java.Publicacion;
import com.mycompany.biblioteca.java.Revista;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class BibliotecaTest {

    // Pruebas para la clase Publicacion
    @Test
    public void testConstructorPublicacion() {
        Publicacion publicacion = new Publicacion("El Quijote", 1605);
        assertEquals("El Quijote", publicacion.getTitulo());
        assertEquals(1605, publicacion.getAnioPublicacion());
    }

    @Test
    public void testMostrarInfoPublicacion() {
        Publicacion publicacion = new Publicacion("El Quijote", 1605);
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
        publicacion.mostrarInfo();
        String expectedOutput = "Título: El Quijote\nAño de publicación: 1605\n";
        assertEquals(expectedOutput, outContent.toString());
        System.setOut(System.out);
    }

    @Test
    public void testGetTitulo() {
        Publicacion publicacion = new Publicacion("El Quijote", 1605);
        assertEquals("El Quijote", publicacion.getTitulo());
    }

    @Test
    public void testGetAnioPublicacion() {
        Publicacion publicacion = new Publicacion("El Quijote", 1605);
        assertEquals(1605, publicacion.getAnioPublicacion());
    }

    // Pruebas para la clase Libro
    @Test
    public void testConstructorLibro() {
        Libro libro = new Libro("Cien años de soledad", 1967, "Gabriel García Márquez", 417);
        assertEquals("Cien años de soledad", libro.getTitulo());
        assertEquals(1967, libro.getAnioPublicacion());
        assertEquals("Gabriel García Márquez", libro.getAutor());
        assertEquals(417, libro.getNumPaginas());
    }

    @Test
    public void testMostrarInfoLibro() {
        Libro libro = new Libro("Cien años de soledad", 1967, "Gabriel García Márquez", 417);
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
        libro.mostrarInfo();
        String expectedOutput = """
                                T\u00edtulo: Cien a\u00f1os de soledad
                                A\u00f1o de publicaci\u00f3n: 1967
                                Autor: Gabriel Garc\u00eda M\u00e1rquez
                                N\u00famero de p\u00e1ginas: 417
                                """;
        assertEquals(expectedOutput, outContent.toString());
        System.setOut(System.out);
    }

    @Test
    public void testGetAutor() {
        Libro libro = new Libro("Cien años de soledad", 1967, "Gabriel García Márquez", 417);
        assertEquals("Gabriel García Márquez", libro.getAutor());
    }

    @Test
    public void testGetNumPaginas() {
        Libro libro = new Libro("Cien años de soledad", 1967, "Gabriel García Márquez", 417);
        assertEquals(417, libro.getNumPaginas());
    }

    // Pruebas para la clase Revista
    @Test
    public void testConstructorRevista() {
        Revista revista = new Revista("National Geographic", 2021, 150, "Exploración");
        assertEquals("National Geographic", revista.getTitulo());
        assertEquals(2021, revista.getAnioPublicacion());
        assertEquals(150, revista.getNumeroRevista());
        assertEquals("Exploración", revista.getNombreRevista());
    }

    @Test
    public void testMostrarInfoRevista() {
        Revista revista = new Revista("National Geographic", 2021, 150, "Exploración");
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
        revista.mostrarInfo();
        String expectedOutput = """
                                T\u00edtulo: National Geographic
                                A\u00f1o de publicaci\u00f3n: 2021
                                N\u00famero de la revista: 150
                                Nombre de la revista: Exploraci\u00f3n
                                """;
        assertEquals(expectedOutput, outContent.toString());
        System.setOut(System.out);
    }

    @Test
    public void testGetNumeroRevista() {
        Revista revista = new Revista("National Geographic", 2021, 150, "Exploración");
        assertEquals(150, revista.getNumeroRevista());
    }

    @Test
    public void testGetNombreRevista() {
        Revista revista = new Revista("National Geographic", 2021, 150, "Exploración");
        assertEquals("Exploración", revista.getNombreRevista());
    }
}