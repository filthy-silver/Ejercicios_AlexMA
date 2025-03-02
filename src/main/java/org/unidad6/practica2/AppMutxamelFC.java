package org.unidad6.practica2;

import java.util.ArrayList;
import java.util.Scanner;

import static org.unidad6.practica2.AppMantenimiento.appMantenimiento;

public class AppMutxamelFC {

    static Scanner sc = new Scanner(System.in);

    static ArrayList<Jugador> jugadores = new ArrayList<>();
    static ArrayList<Acompanante> acompanantes = new ArrayList<>();
    static ArrayList<Masajista> masajistas = new ArrayList<>();

    static ArrayList<MutxamelIFC> Integrantes = new ArrayList<>();

    public static String FORMAT_ERROR(String error){
        return "\t\u001B[33m > " + error + "\u001B[0m";
    }

    public static String FORMAT_SECTION(String section){
        return "\n\u001B[34m" + section + "\u001B[0m";
    }


    public static void main(String[] args) {

        Jugador Juan25 = new Jugador("Juan", 25, 7, "defensa");
        Jugador Pedro30 = new Jugador("Pedro", 30, 10, "delantero");
        Jugador Jose12 = new Jugador("Jose", 35, 10, "centrocampista");
        Jugador Antonio40 = new Jugador("Antonio", 40, 5, "portero");
        Jugador Javier45 = new Jugador("Javier", 45, 1, "portero");
        Jugador Javi5 = new Jugador("Javi", 50, 17, "portero");

         try{
            addJugador(Juan25, Pedro30, Jose12, Antonio40, Javier45, Javi5);
         } catch (SameDorsalException e) {
            System.out.println(FORMAT_ERROR(e.getMessage()));
         }
        Integrantes.addAll(jugadores);

        Entrenador entrenador = new Entrenador("Pep", 50, Equipos.SENIOR);
        Integrantes.add(entrenador);

        Masajista masajista = new Masajista("Juan", 30, "Fisioterapeuta", 5);
        Masajista masajista2 = new Masajista("Pedro", 35, "Fisioterapeuta", 10);
        Integrantes.add(masajista);
        Integrantes.add(masajista2);

        Acompanante acompanante = new Acompanante("Maria", 51, Juan25, "Madre");
        Acompanante acompanante2 = new Acompanante("Josefa", 58, Pedro30, "Madre");
        Acompanante acompanante3 = new Acompanante("Clementina", 63, Jose12, "Madre");

        Integrantes.add(acompanante);
        Integrantes.add(acompanante2);
        Integrantes.add(acompanante3);

        for (MutxamelIFC integrante : Integrantes) {
            if (integrante instanceof Acompanante comp) {
                acompanantes.add(comp);
            } else if (integrante instanceof Masajista mas) {
                masajistas.add(mas);
            }
        }

        System.out.println(FORMAT_SECTION("CONCENTRACIÓN"));
        jugadores.forEach(Jugador::concentrarse);

        System.out.println(FORMAT_SECTION("ENTRENAMIENTO"));
        for (MutxamelIFC integrante : Integrantes){
            if (integrante instanceof AccionesDeportivas jugador) {
                jugador.entrenar();
            }
        }

        System.out.println(FORMAT_SECTION("FISIOTERAPIA"));
        masajista.darMasaje(Pedro30);
        masajista2.darMasaje(Juan25);

        System.out.println(FORMAT_SECTION("VIAJE"));
        Integrantes.forEach(i -> i.viajar("Madrid"));


        System.out.println(FORMAT_SECTION("PLANIFICACIÓN"));
        entrenador.planificarEntrenamiento();

        System.out.println(FORMAT_SECTION("ENTRENAR"));
        jugadores.forEach(Jugador::entrenar);

        System.out.println(FORMAT_SECTION("DESCANSO"));
        for (MutxamelIFC integrante : Integrantes){
            if (integrante instanceof Jugador jugador) {
                jugador.descansar();
            }
        }

        System.out.println(FORMAT_SECTION("CALENTAMIENTO"));
        jugadores.forEach(Jugador::calentar);

        System.out.println(FORMAT_SECTION("PARTIDO"));
        jugadores.forEach(j -> j.jugarPartido("Real Madrid"));

        System.out.println(FORMAT_SECTION("ANIMACIÓN"));
        acompanantes.forEach(Acompanante::animarEquipo);

        entrenador.hacerCambios();

        Javi5.marcarGol();

        System.out.println(FORMAT_SECTION("CELEBRACIÓN"));
        Integrantes.forEach(MutxamelIFC::celebrarGol);

        System.out.println(FORMAT_SECTION("FISIO TIME"));
        masajista.darMasaje(Juan25);
        masajista2.darMasaje(Javi5);

        System.out.println(FORMAT_SECTION("VIAJE DE VUELTA"));
        Integrantes.forEach(i -> i.viajar("Mutxamel"));

        System.out.println(FORMAT_SECTION("DESCANSO"));
        jugadores.forEach(Jugador::descansar);

        System.out.println("\n\nPULSA 'M' PARA ENTRAR EN MANTENIMIENTO\nCualquier otra para salir");


        if (sc.nextLine().equalsIgnoreCase("M")) {
            System.out.println("Entrando en modo mantenimiento...\n\n\n\n\n");
            appMantenimiento();

        } else {
            System.out.println("Saliendo del programa...");

        }
    }

    public static void addJugador(Jugador jugador) {
        if (checkDorsal(jugador)) {
            jugadores.add(jugador);
            System.out.println("Jugador añadido: " + jugador.getNombre() + " con dorsal " + jugador.getDorsal() +
                    " y demarcación " + jugador.getPosicion() + " en el equipo " + jugador.getCategoria());
        } else {
            throw new SameDorsalException(jugador);
        }
    }

    public static void addJugador(Jugador... j) {
        for (Jugador jugador : j) {
            try {
                addJugador(jugador);
            } catch (SameDorsalException e) {
                System.out.println(FORMAT_ERROR(e.getMessage()));
            }
        }
    }

    public static boolean checkDorsal(Jugador jugador) {
        for (Jugador j : jugadores) {
            if (j.getDorsal().equals(jugador.getDorsal())) {
                return false;
            }
        }
        return true;
    }
}