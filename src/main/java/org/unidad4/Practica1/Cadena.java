package org.unidad4.Practica1;

import java.util.ArrayList;

public class Cadena  {
    private String nombre;
    private ArrayList<Programa> listaProgramas;

//region Constructors
    public ArrayList<Programa> getListaProgramas() {
        return listaProgramas;
    }

    public void addPrograma(Programa programa){
        listaProgramas.add(programa);
    }

    public void setListaProgramas(ArrayList<Programa> listaProgramas) {
        this.listaProgramas = listaProgramas;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
//endregion

    public Cadena(String nombre){
        this.nombre = nombre;
        this.listaProgramas = new ArrayList<Programa>();
    }

    @Override
    public String toString() {
        return "Cadena{" +
                "nombre='" + nombre + '\'' +
                ", listaProgramas=" + listaProgramas +
                '}';
    }
}
