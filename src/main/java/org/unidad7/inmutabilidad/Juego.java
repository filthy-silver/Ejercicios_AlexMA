package org.unidad7.inmutabilidad;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Juego {
    private String nombre;
    private int nivel;
    private ArrayList<String> personajes;

    public Juego(String nombre, int nivel) {
        this.nombre = nombre;
        this.nivel = nivel;
        this.personajes = new ArrayList<>();
    }

//    public ArrayList<String> getPersonajes() {
////        return Collections.unmodifiableList(personajes);
//    }
}
