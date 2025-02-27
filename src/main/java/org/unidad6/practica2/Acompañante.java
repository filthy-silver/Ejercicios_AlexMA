package org.unidad6.practica2;

public class Acompañante extends MutxamelIFC{
    private Jugador integrante;
    private String parentesco;
    private String nombre;
    private int edad;

    public Acompañante(String nombre, int edad, Jugador integrante, String parentesco) {
        this.nombre = nombre;
        this.edad = edad;
        this.integrante = integrante;
        this.parentesco = parentesco;
    }

    public void animarEquipo() {
        System.out.println("Animar");
    }

    @Override
    public void concentrarse() {

    }

    @Override
    public void viajar(String ciudad) {

    }

    @Override
    public void celebrarGol() {

    }
}
