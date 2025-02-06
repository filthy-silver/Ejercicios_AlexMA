package org.unidad4.Practica1;

import java.time.DateTimeException;
import java.time.LocalDate;
import java.util.Scanner;

import static org.unidad4.Practica1.Helper.*;

public class Invitado {

    Scanner sc = new Scanner(System.in);

    private String nombre;
    private String profesion;
    private LocalDate fecha_visita;
    private int temporada;

    //region Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getProfesion() {
        return profesion;
    }

    public void setProfesion(String profesion) {
        this.profesion = profesion;
    }

    public LocalDate getFecha_visita() {
        return fecha_visita;
    }

    public void setFecha_visita(LocalDate fecha_visita) {
        this.fecha_visita = fecha_visita;
    }

    public int getTemporada() {
        return temporada;
    }

    public void setTemporada(int temporada) {
        this.temporada = temporada;
    }
    //endregion

    public Invitado(String nombre, String profesion, int temporada){

        System.out.println("Introduce el año en el que acudirá " + nombre + " :");
        int ano = getUserInt("Introduce el año:");
        System.out.println("Introduce el mes:");
        int mes = getUserInt("Introduce el mes:");
        System.out.println("Introduce el día:");
        int dia = getUserInt("Introduce el día:");

        try{
        this.fecha_visita = LocalDate.of(ano, mes, dia);
            } catch (DateTimeException e) {
            System.out.println("Fecha no válida");
            return;
        }

        this.nombre = nombre;
        this.profesion = profesion;
        this.temporada = temporada;
    }

    public Invitado(String nombre, String profesion, String date, int temporada) {

        if (date.matches("\\d{4}-\\d{2}-\\d{2}")) {
            this.fecha_visita = LocalDate.parse(date);
        } else {
            System.out.println("Fecha no válida");
        }

        this.nombre = nombre;
        this.profesion = profesion;
        this.temporada = temporada;
    }
        @Override
    public String toString() {
        return "Invitado{" +
                "nombre='" + nombre + '\'' +
                ", profesion='" + profesion + '\'' +
                ", fecha_visita=" + fecha_visita +
                ", temporada=" + temporada +
                '}';
    }

}
