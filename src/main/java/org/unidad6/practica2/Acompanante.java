package org.unidad6.practica2;

public class Acompanante extends MutxamelIFC{
    private Jugador integrante;
    private String parentesco;
    private String nombre;
    private int edad;

    public Acompanante(String nombre, int edad, Jugador integrante, String parentesco) {
        this.nombre = nombre;
        this.edad = edad;
        this.integrante = integrante;
        this.parentesco = parentesco;
    }

    public void animarEquipo() {
        System.out.println(nombre + " está animando a " + integrante.getNombre());
    }

    @Override
    public void concentrarse() {
        System.out.println("El acompañante de "+ integrante + ", " + nombre + " se está concentrando");
    }

    @Override
    public void viajar(String ciudad) {
        System.out.println("El acompañante de "+ integrante.getNombre() + ", " + nombre + " está viajando a " + ciudad);
    }

    @Override
    public void celebrarGol() {
        System.out.println(nombre + "grita desde las gradas: GOLASSSOOOOO!!");
    }
}
