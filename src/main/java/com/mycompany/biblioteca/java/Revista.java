package com.mycompany.biblioteca.java;

public class Revista extends Publicacion {
    
    public int numeroRevista;
    public String nombreRevista;

    
    public Revista(String titulo, int anioPublicacion, int numeroRevista, String nombreRevista) {
        
        super(titulo, anioPublicacion);
        this.numeroRevista = numeroRevista;
        this.nombreRevista = nombreRevista;
    }

    @Override
    public void mostrarInfo() {
        
        super.mostrarInfo();
        System.out.println("Número de la revista: " + numeroRevista);
        System.out.println("Nombre de la revista: " + nombreRevista);
    }

    
    public int getNumeroRevista() {
        return numeroRevista;
    }

    public String getNombreRevista() {
        return nombreRevista;
    }
}
