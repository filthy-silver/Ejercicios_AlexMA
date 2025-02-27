package org.unidad6.practica2;

import java.util.Scanner;

public class Entrenador extends MutxamelIFC implements AccionesDeportivas{

    static Scanner sc = new Scanner(System.in);

    private String nombre;
    private int edad;
    private Equipos equipo;
    private String formacion;

    public Entrenador(String nombre, int edad, Equipos equipo) {
        this.nombre = nombre;
        this.edad = edad;
        this.equipo = equipo;
        this.formacion = setFormacion();
    }

    private String setFormacion() {
        System.out.println("Introduce la formación para el entrenador " + nombre);
        String formacion = sc.nextLine();
        if(!formacion.matches("\\d-\\d-\\d")) {
            System.out.println("Formato incorrecto. Debe ser n-n-n (ejemplo: 4-4-2)");
            return setFormacion(); // recursión para pedir de nuevo
        }
        return formacion;
    }

    public void entrenar(){
        System.out.println("El entrenador " + nombre + " está entrenando al equipo " + equipo);
    }

    public void jugarPartido(String rival){
        System.out.println("Está jugando un partido contra " + rival);
    }

    @Override
    public void concentrarse() {
        System.out.println("El entrenador " + nombre + " se está concentrando");
    }

    @Override
    public void viajar(String ciudad) {
        System.out.println("El entrenador " + nombre + " está viajando a " + ciudad);
    }

    @Override
    public void celebrarGol() {
        System.out.println("GOLASSSOOOOO!!");

    }
}
