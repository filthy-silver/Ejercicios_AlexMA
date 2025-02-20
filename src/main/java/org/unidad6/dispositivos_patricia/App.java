package org.unidad6.dispositivos_patricia;

import java.util.ArrayList;

public class App {

    public static void main(String[] args) {

        ArrayList<Dispositivo> listaDispositivos =  new ArrayList<>();
        listaDispositivos.add(new Televisor("LG Smart"));
        listaDispositivos.add(new Alexa("Alexa 3.0"));
        listaDispositivos.add(new AireAcondicionado("Misubisi"));
        listaDispositivos.add(new Televisor("Samsung comedor"));

        Dispositivo Proyector = new Dispositivo("Optoma") {
            @Override
            public void encender() {
                if (getEstado()){
                    System.out.println("El proyector ya está encendido");
                }else {
                    setEstado(true);
                    System.out.println("Encendiendo proyector con ajuste automático de brillo...");
                }
            }
        };

        ControlRemoto proyectorControlRemoto = new ControlRemoto() {
            @Override
            public void sincronizar() {
                System.out.println("Sincronizando proyector con control remoto de presentación...");
            }
        };

        Dispositivo hornoInteligente = new Dispositivo("Horno Inteligente") {
            @Override
            public void encender() {
                if (getEstado()){
                    System.out.println("El horno ya está encendido 0");
                }else {
                    setEstado(true);
                    System.out.println("Calentando horno con ajuste automático de temperatura...");
                }
            }
        };
        
        listaDispositivos.add(Proyector);
        listaDispositivos.add(hornoInteligente);

        for (Dispositivo dispositivo : listaDispositivos){

            System.out.println("-------------------");
            dispositivo.encender();

            if (dispositivo instanceof ControlRemoto){
                ((ControlRemoto) dispositivo).sincronizar();
            }

            dispositivo.mostrarEstado();
            dispositivo.apagar();
            dispositivo.apagar();
        }


    }
}
