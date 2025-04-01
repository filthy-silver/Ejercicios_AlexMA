package org.unidad7.equals_hashcode.ejercicio1;

public class Peticion {
    private String nombre;
    private String id;

    public Peticion(String nombre, String id) {
        this.nombre = nombre;
        this.id = id;
    }

    @Override
    public String toString() {
        return "Peticion{" +
                "nombre='" + nombre + '\'' +
                ", id='" + id + '\'' +
                '}';
    }

    public boolean endsWith(String s) {
        return this.nombre.endsWith(s);
    }

    public String getName() {
        return  this.nombre;
    }
}
