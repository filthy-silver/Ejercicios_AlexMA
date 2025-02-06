package org.unidad4.Practica1;

import java.util.ArrayList;

public class Programa {

    private String nombre;
    private Cadena cadena;
    private int temporadas;
    private ArrayList<Empleado> listaEmpleados;
    private ArrayList<Invitado> listaInvitados;
    private Empleado director;

    //region Constructors
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Cadena getCadena() {
        return cadena;
    }

    public void setCadena(Cadena cadena) {
        this.cadena = cadena;
    }

    public int getTemporadas() {
        return temporadas;
    }

    public void setTemporadas(int temporadas) {
        this.temporadas = temporadas;
    }

    public ArrayList<Empleado> getListaEmpleados() {
        return listaEmpleados;
    }

    public void setListaEmpleados(ArrayList<Empleado> listaEmpleados) {
        this.listaEmpleados = listaEmpleados;
    }

    public ArrayList<Invitado> getListaInvitados() {
        return listaInvitados;
    }

    public void setListaInvitados(ArrayList<Invitado> listaInvitados) {
        this.listaInvitados = listaInvitados;
    }

    public Empleado getDirector() {
        return director;
    }

    public void setDirector(Empleado director) {
        this.director = director;
    }

    //endregion
    public Programa(String nombre, Cadena cadena, Empleado director){
        this.nombre = nombre;
        this.cadena = cadena;
        this.temporadas = 0;
        this.listaEmpleados = new ArrayList<Empleado>();
        this.listaInvitados = new ArrayList<Invitado>();
        this.director = director;

        cadena.addPrograma(this);
    }

    public Programa(String nombre, Cadena cadena, String director){
        this.nombre = nombre;
        this.cadena = cadena;
        this.temporadas = 0;
        this.listaEmpleados = new ArrayList<Empleado>();
        this.listaInvitados = new ArrayList<Invitado>();
        this.director = new Empleado (director, "director", null);

        listaEmpleados.add(this.director);
        cadena.addPrograma(this);
    }

    public void insertarEmpleado(String nombre, String cargo, Empleado director){
        Empleado empleado = new Empleado(nombre, cargo, director);
        listaEmpleados.add(empleado);
    }

    public void insertarInvitado(String nombre, String profesion, int temporada){
        Invitado invitado = new Invitado(nombre, profesion, temporada);
        listaInvitados.add(invitado);
    }

    public void insertarInvitado(String nombre, String profesion,String fecha, int temporada){
        Invitado invitado = new Invitado(nombre, profesion, fecha, temporada);
        listaInvitados.add(invitado);
    }

    public int invitadosTemporada(int temporada){
        int aux = 0;
        for (Invitado invitado: listaInvitados) {
            if (invitado.getTemporada() == temporada) {
                aux++;
                System.out.println(" • " + invitado.getNombre() +
                        "\t → Profesion: " + invitado.getProfesion());

            }
        }
        return aux;
    }

    public int vecesInvitado(String nombre){
        int aux = 0;
        for (Invitado invitado: listaInvitados) {
            if (invitado.getNombre().equals(nombre)) {
                aux++;
            }
        }
        return aux;
    }

    public Invitado getInvitado(String nombre){
        Invitado invitado = null;
        for (Invitado inv: listaInvitados) {
            if (inv.getNombre().equals(nombre)) {
                invitado = inv;
            }
        }
        return invitado;
    }

    public void rastrearInvitado(String nombre){

        System.out.println(nombre + " ha aparecido " + vecesInvitado(nombre) + " veces en el programa.");

        for (Invitado invitado: listaInvitados) {
            if (invitado.getNombre().equals(nombre)) {
                System.out.println(" • " + invitado.getNombre() +
                        "\t → Profesion: " + invitado.getProfesion());
            }
        }
    }

    public boolean buscarInvitado(String nombre){
        boolean aux = false;
        for (Invitado invitado: listaInvitados) {
            if (invitado.getNombre().equals(nombre)) {
                aux = true;
            }
        }
        return aux;
    }


    @Override
    public String toString() {
        return "Programa{" +
                "nombre='" + nombre + '\'' +
                ", cadena=" + cadena.getNombre() +
                ", director=" + director +
                ", temporadas=" + temporadas +
                ", listaEmpleados=" + listaEmpleados +
                ", listaInvitados=" + listaInvitados +
                '}';
    }
}
