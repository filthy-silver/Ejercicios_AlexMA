package org.unidad4.Practica1;

import java.util.ArrayList;

public class AppProgramas {

    private static ArrayList<Cadena> listaCadenas = new ArrayList<Cadena>();

    public static void main(String[] args) {

        Cadena antena3 = new Cadena("Antena 3");
        System.out.println(antena3);

        Programa el_hormiguero = new Programa("El Hormiguero",antena3,"Pedro Sanchez");
        System.out.println(el_hormiguero);
        System.out.println(antena3);

        el_hormiguero.insertarEmpleado("Pablo Motos","presentador",null);
        System.out.println(el_hormiguero);
        System.out.println(el_hormiguero.getListaEmpleados());
        el_hormiguero.insertarInvitado("Aitana","cantante","2042-12-12",1);
        System.out.println(el_hormiguero.getListaInvitados());

        el_hormiguero.insertarInvitado("Iosif","humorista","2042-07-14",1);
        el_hormiguero.insertarInvitado("Rudolph","mascota","2050-12-25",1);
        el_hormiguero.insertarInvitado("Aitana","cantante","2044-12-12",1);
        System.out.println("Total invitados en la temporada 1\t→ " + el_hormiguero.invitadosTemporada(1));
        el_hormiguero.rastrearInvitado("Aitana");
        if(el_hormiguero.buscarInvitado("Iosif")){
            System.out.println("Iosif ha sido invitado");
        };

        Cadena laUno = new Cadena("la Uno");
        System.out.println(laUno);

        Programa noMezclados = new Programa("No Mezclados",laUno,"Pedro Sanchez");
        System.out.println(noMezclados);
        System.out.println(laUno);

        noMezclados.insertarEmpleado("Fidel Castro","presentador",null);
        System.out.println(noMezclados);
        noMezclados.insertarInvitado("Iosif", "humorista", "2042-07-12", 1);
        noMezclados.insertarInvitado("Iosif","humorista","2042-07-13",1);
        noMezclados.insertarInvitado("Roberto","mascota","2043-12-25",1);
        System.out.println(el_hormiguero.getListaInvitados());
        System.out.println("Total invitados en la temporada 1\t→ " + noMezclados.invitadosTemporada(1));

        listaCadenas.add(antena3);
        listaCadenas.add(laUno);

        System.out.println("===============\n");
        invitadoAntes("Iosif");

    }

    public static void invitadoAntes(String nombre){
        Invitado invitado = null;
        int veces = 0;
        String nombrePrograma = "";
        for (Cadena cadena: listaCadenas) {
            for (Programa programa: cadena.getListaProgramas()) {
                if(programa.buscarInvitado(nombre)){
                    veces++;
                    System.out.println("El invitado " + nombre + " ha sido invitado en el programa " + programa.getNombre());
                    if(invitado != null) {
                        Invitado aux = programa.getInvitado(nombre);
                        if(aux.getFecha_visita().isBefore(invitado.getFecha_visita())){
                            invitado = aux;
                            nombrePrograma = programa.getNombre();
                        }
                    }else{
                        invitado = programa.getInvitado(nombre);
                        nombrePrograma = programa.getNombre();
                    }

                }

            }
        }
        if(veces == 0) {
            System.out.println("El invitado " + nombre + " no ha sido invitado en ningún programa");
        } else if (veces == 1) {
            System.out.println("El invitado " + nombre + " solo ha sido invitado una vez");
        } else{
            System.out.println("El invitado " + nombre + " ha asistido antes a  " + nombrePrograma + " el día " + invitado.getFecha_visita());
        }
    }
}
