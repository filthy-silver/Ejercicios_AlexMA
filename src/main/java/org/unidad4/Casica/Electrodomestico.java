package org.unidad4.Casica;

public class Electrodomestico {

    private String nombre;
    private float consumo;

    public Electrodomestico(String nombre, float consumo) {
        this.nombre = nombre;
        this.consumo = consumo;
    }

    //region Geters y Seters
    public String getNombre() {
        return nombre;
    }

    public float getConsumo() {
        return consumo;
    }

    public void setConsumo(float consumo) {
        this.consumo = consumo;
    }
    //endregion

    @Override
    public String toString() {
        return "Electrodomestico: " + getNombre() + ", consumo = " + getConsumo();
    }

}