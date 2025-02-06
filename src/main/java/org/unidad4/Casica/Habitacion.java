package org.unidad4.Casica;

import java.util.ArrayList;

class Habitacion {
    private String nombre;
    private Float metrosCuadrados;
    private ArrayList<Electrodomestico> electrodomesticos;

    public Habitacion(String nombre, Float metrosCuadrados) {
        this.nombre = nombre;
        this.metrosCuadrados = metrosCuadrados;
    }

    public Float getMetrosCuadrados() {
        return metrosCuadrados;
    }

    public void setMetrosCuadrados(Float metrosCuadrados) {
        this.metrosCuadrados = metrosCuadrados;
    }

    public String getNombre() {
        return nombre;
    }

    public String mostrarHabitaciones() {
        return "- " + nombre + " (" + metrosCuadrados + " m2)\n";
    }

    public void eliminarHabitacion(String nombre) {
        if (this.nombre.equals(nombre)) {
            this.nombre = null;
            this.metrosCuadrados = null;
        }
    }

    public void agregarElectrodomestico(Electrodomestico electrodomestico) {
        if (electrodomesticos == null) {
            electrodomesticos = new ArrayList<>();
        }
        electrodomesticos.add(electrodomestico);
    }

    public void mostrarElectrodomesticos() {
        if (electrodomesticos != null) {
            for (Electrodomestico electrodomestico : electrodomesticos) {
                System.out.println(electrodomestico);
            }
        }
    }

    @Override
    public String toString() {
        return "- " + nombre + " (" + metrosCuadrados + " m2)\n";
    }
}
