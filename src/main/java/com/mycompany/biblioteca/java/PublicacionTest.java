
package com.mycompany.biblioteca.java;



import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class PublicacionTest {
    
    @Test
    public void testMostrarInfoLibro() {
        Libro libro = new Libro("Java Programming", 2020, "John Doe", 500);
        assertEquals("Java Programming", libro.getTitulo());
        assertEquals(2020, libro.getAnioPublicacion());
        assertEquals("John Doe", libro.getAutor());
        assertEquals(500, libro.getNumPaginas());
    }
    
    @Test
    public void testMostrarInfoRevista() {
        Revista revista = new Revista("Tech Today", 2021, 12, "Tech Innovators");
        assertEquals("Tech Today", revista.getTitulo());
        assertEquals(2021, revista.getAnioPublicacion());
        assertEquals(12, revista.getNumeroRevista());
        assertEquals("Tech Innovators", revista.getNombreRevista());
    }
}


