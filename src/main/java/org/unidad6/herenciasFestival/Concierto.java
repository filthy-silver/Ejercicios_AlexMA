package org.unidad6.herenciasFestival;

public class Concierto {
    public static void main(String[] args) {

        Asistente a1 = new Asistente("Carlos", 25, "VIP");
        Artista art1 = new Artista("Dua Lipa", 28, "Pop");
        Organizador org1 = new Organizador("Juan", 30, "Director");

        System.out.println("Información del asistente:");
        a1.mostrarInfo();

        System.out.println();

        System.out.println("Información del artista:");
        art1.mostrarInfo();

        System.out.println("Información del organizador:");
        org1.mostrarInfo();


        mostrarAcceso(a1);
        mostrarAcceso(art1);
        mostrarAcceso(org1);
    }

    public static void mostrarAcceso(Persona p){
        p.accederEvento();
    }
}
