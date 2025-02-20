package org.unidad6.ejercicio1;

public class Streamer extends Usuario {
    private int numero_retransmisiones;
    private int horas_directo;

    public Streamer(String nombre, int edad, String nombreUsuario,int numero_retransmisiones, int horas_directo) {
        super(nombre, edad, nombreUsuario);
        this.numero_retransmisiones = numero_retransmisiones;
        this.horas_directo = horas_directo;
    }

    public void getInfo(){
        System.out.println("========");
        System.out.println("Usuario Streamer");
        super.getInfo();
        System.out.println("Numero de retransmisiones: " + numero_retransmisiones);
        System.out.println("Horas en directo: " + horas_directo);
        System.out.println("========\n");
    }

}
