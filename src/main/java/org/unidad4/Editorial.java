package org.unidad4;

import java.util.ArrayList;

public class Editorial {
    private String nombre;
    private String pais;
    private ArrayList<Libro> listaLibros;

    public Editorial(String nombre, String pais){
        this.nombre = nombre;
        this.pais = pais;
        listaLibros = new ArrayList<Libro>();
    }

    public void añadirLibro(Libro libro){
        listaLibros.add(libro);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    @Override
    public String toString() {
        return "Editorial [nombre = " + nombre + ", pais = " + pais + ", libros publicados = " + listaLibros + "]";
    }
}
