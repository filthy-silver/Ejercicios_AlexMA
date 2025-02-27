package org.unidad6.practica2;

public class Entrenador extends MutxamelIFC implements AccionesDeportivas{
    private String nombre;
    private int edad;
    private Equipos equipo;
    private String formacion;

    public Entrenador(String nombre, int edad, Equipos equipo, String formacion) {
        this.nombre = nombre;
        this.edad = edad;
        this.equipo = equipo;
        this.formacion = formacion;
    }

    public void entrenar(){
        System.out.println("El entrenador " + nombre + " está entrenando al equipo " + equipo);
    }

    public void jugarPartido(String rival){
        System.out.println("Está jugando un partido contra " + rival);
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
