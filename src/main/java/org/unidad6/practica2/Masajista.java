package org.unidad6.practica2;

public class Masajista  extends MutxamelIFC
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
        System.out.println("El masajista" + nombre + "le está dando un masaje a" + jugador.getNombre());
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
