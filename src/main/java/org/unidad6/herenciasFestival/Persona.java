package org.unidad6.herenciasFestival;

class Persona {
    private static final int EDAD_MINIMA = 18;

    String nombre;
    int edad;

    public Persona(String nombre, int edad) throws EdadMinimaException {
        this.nombre = nombre;
        setEdad(edad);
    }

    public void mostrarInfo() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
    }

    public void accederEvento(){
        System.out.println("Accediendo al evento ...");
    }

    public void setEdad(int edad) throws EdadMinimaException {
        if (edad < EDAD_MINIMA) {
            throw new EdadMinimaException("La edad mínima es de " + EDAD_MINIMA + " años");
        } else {
            this.edad = edad;
        }
    }
}
