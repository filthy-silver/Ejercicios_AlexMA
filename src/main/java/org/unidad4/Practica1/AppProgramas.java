package org.unidad4.Practica1;

import java.util.ArrayList;

public class AppProgramas {

    static ArrayList<Cadena> listaCadenas = new ArrayList<Cadena>(); // Lista estática para almacenar las cadenas de televisión

    public static void main(String[] args) {

        // Crea una nueva cadena de televisión llamada "Antena 3"
        Cadena antena3 = new Cadena("Antena 3");
        System.out.println(antena3);

        // Crea un nuevo programa llamado "El Hormiguero" en la cadena "Antena 3" con el director "Pedro Sanchez"
        Programa el_hormiguero = new Programa("El Hormiguero",antena3,"Pedro Sanchez");
        System.out.println(el_hormiguero);
        System.out.println(antena3);

        // Inserta un empleado llamado "Pablo Motos" con el cargo de "presentador" en el programa "El Hormiguero"
        el_hormiguero.insertarEmpleado("Pablo Motos","presentador",null);
        System.out.println(el_hormiguero);
        System.out.println(el_hormiguero.getListaEmpleados());

        // Inserta un invitado llamado "Aitana" con la profesión de "cantante" y la fecha de visita "2042-12-12" en la temporada 1
        el_hormiguero.insertarInvitado("Aitana","cantante","2042-12-12",1);
        System.out.println(el_hormiguero.getListaInvitados());

        // Inserta más invitados en el programa "El Hormiguero"
        el_hormiguero.insertarInvitado("Iosif","humorista","2042-07-14",1);
        el_hormiguero.insertarInvitado("Rudolph","mascota","2050-12-25",1);
        el_hormiguero.insertarInvitado("Aitana","cantante","2044-12-12",1);

        // Muestra el total de invitados en la temporada 1 del programa "El Hormiguero"
        System.out.println("Total invitados en la temporada 1\t→ " + el_hormiguero.invitadosTemporada(1));

        // Rastrea las apariciones del invitado "Aitana" en el programa "El Hormiguero"
        el_hormiguero.rastrearInvitado("Aitana");

        // Verifica si el invitado "Iosif" ha sido invitado al programa "El Hormiguero"
        if(el_hormiguero.buscarInvitado("Iosif")){
            System.out.println("Iosif ha sido invitado");
        };

        // Crea una nueva cadena de televisión llamada "la Uno"
        Cadena laUno = new Cadena("la Uno");
        System.out.println(laUno);

        // Crea un nuevo programa llamado "No Mezclados" en la cadena "la Uno" con el director "Pedro Sanchez"
        Programa noMezclados = new Programa("No Mezclados",laUno,"Pedro Sanchez");
        System.out.println(noMezclados);
        System.out.println(laUno);

        // Inserta un empleado llamado "Fidel Castro" con el cargo de "presentador" en el programa "No Mezclados"
        noMezclados.insertarEmpleado("Fidel Castro","presentador",null);
        System.out.println(noMezclados);

        // Inserta más invitados en el programa "No Mezclados"
        noMezclados.insertarInvitado("Iosif", "humorista", "2042-07-12", 1);
        noMezclados.insertarInvitado("Iosif","humorista","2042-07-13",1);
        noMezclados.insertarInvitado("Roberto","mascota","2043-12-25",1);

        // Muestra la lista de invitados del programa "El Hormiguero"
        System.out.println(el_hormiguero.getListaInvitados());

        // Muestra el total de invitados en la temporada 1 del programa "No Mezclados"
        System.out.println("Total invitados en la temporada 1\t→ " + noMezclados.invitadosTemporada(1));

        // Agrega las cadenas "Antena 3" y "la Uno" a la lista de cadenas
        listaCadenas.add(antena3);
        listaCadenas.add(laUno);

        System.out.println("===============\n");

        // Llama al método para verificar las apariciones del invitado "Iosif" en todos los programas
        invitadoAntes("Iosif");
    }

    // Método para verificar las apariciones de un invitado en todos los programas de todas las cadenas
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