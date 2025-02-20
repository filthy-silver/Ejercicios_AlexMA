package org.unidad6.ejercicio1;

public class RedSocial {
    public static void main(String[] args) {
        Basico usuario1 = new Basico("Juan", 20, "Juanito");
        usuario1.getInfo();
        Streamer streamer1 = new Streamer("Pedro", 25, "Pedrito", 10, 100);
        streamer1.getInfo();
        Influencer influencer1 = new Influencer("Maria", 30, "Marita", "Colaboracion1", "Colaboracion2");
        influencer1.getInfo();

        Usuario usuario2 = new Basico("Juan", 20, "Juanito");

        mostrarInfo(streamer1);

        System.out.println(usuario1.equals(usuario2));

    }

    public static void mostrarInfo(Usuario usuario){
        usuario.getInfo();
    }
}
