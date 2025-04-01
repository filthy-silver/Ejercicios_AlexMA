package org.unidad7.equals_hashcode.ejercicio2;

public class Persona {
    private String nombre;
    private String apellidos;
    int edad;

    public Persona(String nombre, String apellidos, int edad) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", apellidos='" + apellidos + '\'' +
                ", edad=" + edad +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Persona persona = (Persona) obj;
        return edad == persona.edad &&
                nombre.equals(persona.nombre) &&
                apellidos.equals(persona.apellidos);
    }

    @Override
    public int hashCode() {
        int result = nombre.hashCode();
        result = 31 * result + apellidos.hashCode();
        result = 31 * result + edad;
        return result;
    }
}
