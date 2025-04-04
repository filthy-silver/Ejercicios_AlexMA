package org.unidad7.practica1;

public enum Producto {
    MANZANAS(2.3f),
    PAN(2.5f),
    ARROZ(3.5f),
    POLLO(4.3f),
    LECHE(1.3f),
    ACEITE(8.3f),
    HUEVOS(3.3f),
    TOMATE(4f),
    PASTA(0.89f);

    private final float precio;
    Producto(float precio) {
        this.precio = precio;
    }

    public float getPrecio() {
        return precio;
    }
}
