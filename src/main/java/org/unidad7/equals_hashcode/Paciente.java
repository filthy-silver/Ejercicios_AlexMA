package org.unidad7.equals_hashcode;

public class Paciente {
    private String nombre;
    private String apellido;
    private int sip;

    public Paciente(String nombre, String apellido, int sip) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.sip = sip;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Paciente paciente = (Paciente) obj;
        return sip == paciente.sip && nombre.equals(paciente.nombre) && apellido.equals(paciente.apellido);
    }

    @Override
    public String toString() {
        return "Paciente{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", sip=" + sip +
                '}';
    }

    @Override
    public int hashCode() {
        int result = nombre.hashCode();
        result = 31 * result + apellido.hashCode();
        result = 31 * result + sip;
        return result;
    }
}
