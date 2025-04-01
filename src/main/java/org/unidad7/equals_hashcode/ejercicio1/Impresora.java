package org.unidad7.equals_hashcode.ejercicio1;

import java.util.LinkedHashSet;

public class Impresora {
    static final String id = "PC5578";
    static LinkedHashSet<Peticion> peticiones = new LinkedHashSet<>();


    public static void main(String[] args) {

        addDocumento("documento1.pdf");
        addDocumento("documento2.pdf");
        addDocumento("documento3.pdf");
        addDocumento("documento4.txt");
        addDocumento("documento5.pdf");
        addDocumento("documento1.pdf");

        print();
        System.out.println("Quedan " + getNumPeticiones() + " documentos en la cola.");
        verTodo();
        imprimirTodo();

    }

    public static void addDocumento(String d) {
        if (!d.endsWith(".pdf") || peticiones.contains(new Peticion(d, id))) {
            System.out.println("No se puede añadir el documento: " + d);
            return;
        }
        System.out.println("Añadiendo documento: " + d);
        peticiones.addLast(new Peticion(d, id));
    }

    public static void print(){
        if (peticiones.isEmpty()) {
            System.out.println("No hay documentos para imprimir.");
            return;
        }
        System.out.println("Imprimiendo documento: " + peticiones.getFirst());
    }

    public static int getNumPeticiones(){
        return peticiones.size();
    }

    public static void  verTodo(){
        if (peticiones.isEmpty()) {
            System.out.println("No hay documentos para imprimir.");
            return;
        }
        for (Peticion p : peticiones) {
            System.out.println(p);
        }
    }

    public static void imprimirTodo(){
        if (peticiones.isEmpty()) {
            System.out.println("No hay documentos para imprimir.");
            return;
        }
        for (Peticion p : peticiones) {
            System.out.println("Imprimiendo documento: " + p.getName());
        }
    }
}
