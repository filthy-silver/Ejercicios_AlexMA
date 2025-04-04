package org.unidad7.ejemplos;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorObjetos {
    public static void main(String[] args) {

        ArrayList<Persona> listaPersonas = new ArrayList<>();
        listaPersonas.add(new Persona("Juan", 25));
        listaPersonas.add(new Persona("Ana", 30));
        listaPersonas.add(new Persona("Luis", 22));

        Iterator<Persona> iterador = listaPersonas.iterator();

        while (iterador.hasNext()) {
            Persona persona = iterador.next();
            System.out.println(persona);

            // eliminar personas menores de 25 años
            if (persona.edad < 25) {
                iterador.remove();
            }
        }

        System.out.println("Lista final después de eliminar menores de 25 años:");
        for (Persona p : listaPersonas) {
            System.out.println(p);
        }
    }
}