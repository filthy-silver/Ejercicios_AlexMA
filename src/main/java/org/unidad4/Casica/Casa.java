package org.unidad4.Casica;

import java.util.ArrayList;
import java.util.Scanner;

class Casa {
    Scanner sc = new Scanner(System.in);

    private String direccion;
    private ArrayList<Habitacion> habitaciones; // COMPOSICIÓN: la Casa tiene habitaciones
    private Propietario propietario;


    public Casa(String direccion, String nombre, String edad) {
        this.direccion = direccion;
        this.habitaciones = new ArrayList<>();
        this.propietario = new Propietario(nombre, edad);
    }

    public Casa(String direccion) {
        this.direccion = direccion;
        this.habitaciones = new ArrayList<>();

        System.out.println("Introduce el nombre del propietario: ");
                String nombre = sc.nextLine();
                System.out.println("Introduce la edad del propietario: ");
                String edad = sc.nextLine();
        this.propietario = new Propietario(nombre, edad);



    }

    public void agregarHabitacion(String nombre, Float metrosCuadrados) {
        Habitacion habitacion = new Habitacion(nombre, metrosCuadrados); //solamente la Casa crea las habitaciones

        for (Habitacion h : habitaciones) {
            if (h.getNombre().equals(nombre)) {
                return;
            }
        }

        habitaciones.add(habitacion);
    }

    public void mostrarHabitaciones() {
        System.out.println("Casa en " + direccion + " tiene " + habitaciones.size() + " habitaciones:");
        for (Habitacion habitacion : habitaciones) {
            System.out.print(habitacion);
        }
        if (!habitaciones.isEmpty()) {
            System.out.println();
        }
        System.out.println("Propietario: " + propietario.getNombre() + " (" + propietario.getEdad() + " años)");
    }

    public void getHabitacionMasGrande(){
        Habitacion habitacionMasGrande = habitaciones.get(0);
        for (Habitacion habitacion : habitaciones) {
            if (habitacion.getMetrosCuadrados() > habitacionMasGrande.getMetrosCuadrados()) {
                habitacionMasGrande = habitacion;
            }
        }
        System.out.println("La habitación más grande es: " + habitacionMasGrande);
    }

    public void eliminarHabitacion(String nombre){
        for (Habitacion h : habitaciones) {
            if (h.getNombre().equals(nombre)) {
                habitaciones.remove(h);
                return;
            }
        }
    }
}
