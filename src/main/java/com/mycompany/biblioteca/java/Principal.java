package com.mycompany.biblioteca.java;

public class Principal {
    public static void main(String[] args) {
      
        
        Libro libro = new Libro("Programación en Java", 2022, "John Doe", 500);
        Revista revista = new Revista("Ciencia Hoy", 2021, 10, "Revista Científica");

        System.out.println("Información del libro:");
        libro.mostrarInfo();

        System.out.println("Información de la revista:");
        revista.mostrarInfo();
    }
    }

