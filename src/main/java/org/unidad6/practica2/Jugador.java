package org.unidad6.practica2;

public class Jugador extends MutxamelIFC implements FuncionesIntegrantes, AccionesDeportivas {
    private Equipos categoria;
    private int dorsal;
    private String posicion;
    private String nombre;
    private int edad;

    public Jugador(String nombre, int edad, int dorsal, String demarcacion) {
        this.nombre = nombre;
        this.edad = edad;
        this.dorsal = dorsal;
        this.posicion = demarcacion;
    }

    public void calentar() {
        System.out.println("Calentando");
    }

    public void descansar() {
        System.out.println("Descansando");
    }
    public void marcarGol() {
        System.out.println("Marcar gol");
    }

    public String getNombre() {
        return nombre;
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

    @Override
    public void entrenar() {

    }

    @Override
    public void jugarPartido(String rival) {

    }
}
