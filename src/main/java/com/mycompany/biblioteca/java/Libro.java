package com.mycompany.biblioteca.java;

public class Libro extends Publicacion{
    
     public String autor;
    public int numPaginas;

    public Libro(String titulo, int anioPublicacion, String autor, int numPaginas) {
        super(titulo, anioPublicacion);
        this.autor = autor;
        this.numPaginas = numPaginas;
    }

     @Override
    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("Autor: " + autor);
        System.out.println("Número de páginas: " + numPaginas);
    }

  
    public String getAutor() {
        return autor;
    }

    public int getNumPaginas() {
        return numPaginas;
    }
}

