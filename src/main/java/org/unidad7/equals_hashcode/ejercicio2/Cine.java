package org.unidad7.equals_hashcode.ejercicio2;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;

public class Cine {
    static LinkedHashSet cola = new LinkedHashSet();
    static final String[] nombres = {
        "Juan", "Pedro", "María", "Ana", "Luis", "Laura", "Carlos", "Marta",
        "Javier", "Sofía", "Diego", "Clara", "Andrés", "Lucía", "Fernando",
        "Isabel", "Pablo", "Teresa", "Raúl", "Elena"
    };
    static final String[] apellidos = {
        "García", "López", "Martínez", "Sánchez", "Pérez", "Gómez", "Fernández",
        "Torres", "Ramírez", "Hernández", "Jiménez", "Vásquez", "Morales",
        "Castillo", "Rojas", "Cruz", "Reyes", "Ortega", "Mendoza"
    };
    public static void main(String[] args) {
        System.out.println("***** CINE AL POBLE *****");
        generarCola(21);
        recaudarCola();
    }

    private static void recaudarCola() {
        float recaudacion = 0;
        while (!cola.isEmpty()) {
            Persona persona = (Persona) cola.getFirst();
            cola.remove(persona);
            System.out.println("Persona atendida: " + persona);
            if (persona.edad < 10 && persona.edad > 3) {
                recaudacion += 1F;
            } else if (persona.edad < 18 && persona.edad > 10) {
                recaudacion += 2.5F;
            } else {
                recaudacion += 3.5F;
            }
        }
        System.out.println("La recaudación ha sido de " + recaudacion + " €");
    }

    public static void generarCola(int numPersonas) {
        for (int i = 0; i < numPersonas; i++) {

            int edad = 3 + (int) (Math.random() * 100 - 3);

            String nombre = nombres[(int) (Math.random() * nombres.length)];
            String apellido = apellidos[(int) (Math.random() * apellidos.length)];
            Persona persona = new Persona(nombre, apellido, edad);
            cola.add(persona);

        }
        System.out.println("Hay " + cola.size() + " personas en la cola.");
    }
}
