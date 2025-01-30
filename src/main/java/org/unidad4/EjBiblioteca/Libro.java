package org.unidad4.EjBiblioteca;

import java.time.Instant;


public class Libro {
    private String titulo;
    private String autor;
    private final String ID;
    private boolean disponible;
    private static int cantidadLibros;
    private static int librosDisponibles;

    private Estudiante estudiantePrestado;

//region Getter y Setter
    public Libro(String titulo, String autor){
        this.titulo = titulo;
        this.autor = autor;
        this.disponible = true;
        cantidadLibros++;
        librosDisponibles++;

        ID = calcularId();
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getAutor() {
        return autor;
    }

    public String getID() {
        return ID;
    }

    public boolean getDisponible() {
        return disponible;
    }

    public Estudiante getEstudiantePrestado() {
        return estudiantePrestado;
    }

    public void setEstudiantePrestado(Estudiante estudiantePrestado) {
        this.estudiantePrestado = estudiantePrestado;
    }

    //endregion

    private String calcularId() {
         String hash = autor.substring(0,1).toUpperCase()
                + titulo.substring(0,1).toUpperCase()
                + Instant.now().getNano()/1000
                + (cantidadLibros%10);

         if (cantidadLibros > 10) {
             int c = 65;
             if (cantidadLibros / 10 < 27) {
                 c += cantidadLibros % 27;
                 String s = String.valueOf(c);
                 hash = hash.substring(0,2) + s + hash.substring(3);
             } else {
                 c += cantidadLibros % 27;
                 String s = String.valueOf(c);
                 hash = hash.substring(0,2) + s + hash.substring(3);

                 c = 65;
                 c += cantidadLibros / 27;
                 s = String.valueOf(c);
                 hash = hash.substring(0,3) + s + hash.substring(4);
             }

         }
         return hash;
    }

    public Prestamo prestar(Estudiante estudiante) {
        if(disponible && !estudiante.getLibroPrestado().contains(this)) {
            disponible = false;
            estudiantePrestado = estudiante;
            Prestamo prestamo = new Prestamo(estudiante, this);
            librosDisponibles--;
            estudiante.addLibro(this);
            System.out.println("El libro se ha prestado con exito a " + estudiante.getNombre() +
                    "\n\tLibros disponibles: " + librosDisponibles + "\n");
            return prestamo;
        } else if (estudiante.getLibroPrestado().contains(this)){
            System.out.println("El estudiante"+ estudiante.getNombre() +" ya tiene un libro prestado");
        } else {
            System.out.println("El libro no esta disponible\n");
        }
        return null;
    }

    public void devolver(Estudiante estudiante){
        if(!disponible){
            disponible = true;
            librosDisponibles++;

            estudiante.removeLibro(this);
            System.out.println( estudiantePrestado.getNombre() + " ha devuelto con exito "  + getTitulo() +
                    "\n\tLibros disponibles: " + librosDisponibles);
            estudiantePrestado = null;
        } else {
            System.out.println("El libro ya esta disponible");
        }
    }

    public static int getTotalLibros(){
        return cantidadLibros;
    }

    public static int getLibrosDisponibles(){
        return librosDisponibles;
    }

    @Override
    public String toString() {
        return "\n=====================================\n" +
                "\tLibro: " + titulo + "\n" +
                "\tAutor: " + autor + "\n" +
                "\tID: " + ID + "\n" +
                "=====================================" +
                "\n";
    }
}
