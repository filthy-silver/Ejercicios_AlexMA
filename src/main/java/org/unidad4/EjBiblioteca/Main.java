package org.unidad4.EjBiblioteca;

import java.security.SecureRandom;
import java.time.Instant;

public class Main {
    static SecureRandom random = new SecureRandom();

    public static void main(String[] args) {
        Estudiante estudiante1 = new Estudiante("Juan");
        System.out.println(estudiante1.toString());
        System.out.println("Total estudiantes: " + Estudiante.obtenerTotalEstudiantes());
        System.out.println((Instant.now().getNano()/1000) + Instant.now().getNano()/1000);

        Libro libro1 = new Libro("El Quijote", "Cervantes");
        Libro libro2 = new Libro("El Quijote", "Cervantes");
        Libro libro3 = new Libro("La Celestina", "Fernando de Rojas");
        Libro libro4 = new Libro("El Libro Troll", "Rubius");

        System.out.println(libro1.getID());
        System.out.println(libro2.getID());
        System.out.println(libro3.getID());
        System.out.println(libro4.getID());

        System.out.println(libro2);
        System.out.println("Total libros: " + Libro.getTotalLibros());
        System.out.println("Libros disponibles: " + Libro.getLibrosDisponibles());
        libro2.prestar(estudiante1);
        System.out.println(libro3);
        libro3.prestar(estudiante1);
        libro2.devolver(estudiante1);
        libro3.prestar(estudiante1);



    }
}
