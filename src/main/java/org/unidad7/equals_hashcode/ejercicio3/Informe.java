package org.unidad7.equals_hashcode.ejercicio3;

public class Informe {
    private int codigo;
    private String descripcion;
    private Tipos tipo;

    public Informe(int codigo, String descripcion, Tipos tipo) {
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "informe [codigo=" + codigo + ", descripcion=" + descripcion + ", tipo=" + tipo + "]";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Informe informe = (Informe) obj;
        return codigo == informe.codigo && tipo == informe.tipo;
    }

    @Override
    public int hashCode() {
        int result = Integer.hashCode(codigo);
        result = 31 * result + descripcion.hashCode();
        result = 31 * result + tipo.hashCode();
        return result;
    }

    public Tipos getTipo() {
        return tipo;
    }
}
