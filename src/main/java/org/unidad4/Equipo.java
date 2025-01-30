package org.unidad4;

import java.util.ArrayList;

public class Equipo {

    public ArrayList<Persona> getComponentes() {
        return componentes;
    }

    public void setComponentes(ArrayList<Persona> componentes) {
        this.componentes = componentes;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    private String nombre;
    private ArrayList<Persona> componentes = new ArrayList<>();

    public Equipo(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString(){
        return "Equipo: " + nombre + " con " + componentes.size() + " componentes";
    }
}
