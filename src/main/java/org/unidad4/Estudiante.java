package org.unidad4;

import java.util.ArrayList;

public class Estudiante {

    private static final String CORREO_FORMAT = "^[A-Za-z0-9+_.-]+@alu.edu.gva.es$";


    private static int contadorEstudiantes = 0;



    private String nombre;
    private String curso;
    private int nia;
    private String email;

    public ArrayList<Libro> getLibroPrestado() {
        return libroPrestado;
    }

    public void setLibroPrestado(ArrayList<Libro> libroPrestado) {
        this.libroPrestado = libroPrestado;
    }

    private ArrayList<Libro> libroPrestado;

    public Estudiante(String nombre) {
        this.nombre = nombre;
        contadorEstudiantes++;
        libroPrestado = new ArrayList<>();
    }

    public Estudiante(String nombre, String curso, String email) {
        this.nombre = nombre;
        this.curso = curso;
        this.email = email;

        contadorEstudiantes++;

        libroPrestado = new ArrayList<>();

        this.nia = 1000 + contadorEstudiantes;
    }



    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCurso() {
        return curso;
    }
    public void setCurso(String curso) {
        this.curso = curso;
    }

    public int getNia() {
        return nia;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    public void addLibro(Libro libro){
        libroPrestado.add(libro);
    }
    public void removeLibro(Libro libro){
        libroPrestado.remove(libro);
    }

    @Override
    public String toString() {
        if (libroPrestado != null) {
            return "Alumno: [nombre= " + nombre + " - NIA: " + nia + " - Curso: " + curso + " - Email: " + email + " - Libro prestado: " + libroPrestado + "]";
        }
        return "Alumno: [nombre= " + nombre + " - NIA: " + nia + " - Curso: " + curso + " - Email: " + email + "]";
    }

    public static int obtenerTotalEstudiantes(){
        return contadorEstudiantes;
    }

    public static boolean validarCorreo(String correo) {
        return correo.matches(CORREO_FORMAT) && correo != null;
    }
    public boolean validarCorreo() {
        return this.email.matches(CORREO_FORMAT) && this.email != null;
    }

}
