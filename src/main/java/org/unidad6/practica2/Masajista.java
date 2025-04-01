package org.unidad6.practica2;

public class Masajista extends MutxamelIFC
{
    private String titulacion;
    private int anosExperiencia;

    private String nombre;
    private int edad;

    public Masajista(String nombre, int edad, String titulacion, int anosExperiencia) {
        this.nombre = nombre;
        this.edad = edad;
        this.titulacion = titulacion;
        this.anosExperiencia = anosExperiencia;
    }

    public void darMasaje(Jugador jugador){
        System.out.println("El masajista " + nombre + " le está dando un masaje a " + jugador.getNombre());
    }

    @Override
    public void concentrarse() {
        System.out.println("El masajista " + nombre + " se está concentrando");
    }

    @Override
    public void viajar(String ciudad) {
        System.out.println("El masajista " + nombre + " está viajando a " + ciudad);
    }

    @Override
    public void celebrarGol() {
        System.out.println("GOLASSSOOOOO!!");
    }

    @Override
    public String toString() {
        return nombre;
    }
}
