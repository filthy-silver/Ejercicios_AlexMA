package org.unidad6.practica2;

import java.util.ArrayList;

import static org.unidad6.practica2.AppMutxamelFC.*;


public class AppMantenimiento {

    public static void appMantenimiento() {
        printMenu();
        loadSection();

    }

    private static void loadSection() {
        int option = sc.nextInt();
        switch (option) {
            case 1:
                mantenimientoJugadores();
                break;
            case 2:
                mantenimientoEntrenadores();
                break;
            case 3:
                mantenimientoMasajistas();
                break;
            case 4:
                consultarEquipos();
                break;
            default:
                System.out.println("Opción no válida");
                break;
        }
    }

    private static void consultarEquipos() {
        System.out.println(FORMAT_SECTION("Equipos del club"));
        System.out.println(FORMAT_ERROR("Bajo construcción"));
    }

    private static void mantenimientoMasajistas() {
        System.out.println(FORMAT_SECTION("Mantenimiento de masajistas"));
        System.out.println(FORMAT_ERROR("Bajo construcción"));
    }

    private static void mantenimientoEntrenadores() {
        System.out.println(FORMAT_SECTION("Mantenimiento de entrenadores"));
        System.out.println(FORMAT_ERROR("Bajo construcción"));

    }

    private static void mantenimientoJugadores() {
        System.out.println(FORMAT_SECTION("Mantenimiento de jugadores"));
        System.out.println("[1]. Añadir jugador\n[2]. Modificar datos de jugador\n[3]. Añadir acompañante\n[X]. Volver al menú principal");

        String option = sc.next();

        switch (option) {
            case "1":
                System.out.println(FORMAT_SECTION(" # Mantenimiento de jugadores. Añadir jugador"));
                System.out.println("Introduce el nombre del jugador");
                String nombre = sc.next();
                System.out.println("Introduce la edad del jugador");
                int edad = sc.nextInt();
                System.out.println("Introduce el dorsal del jugador");
                int dorsal = sc.nextInt();
                System.out.println("Introduce la demarcación del jugador");
                String demarcacion = sc.next();

                AppMutxamelFC.addJugador(new Jugador(nombre, edad, dorsal, demarcacion));

                break;

            case "2":
                System.out.println(FORMAT_SECTION(" # Mantenimiento de jugadores. Modificar datos de jugador"));
                for (Jugador jugador : jugadores) {
                    int i = jugadores.indexOf(jugador);
                    System.out.println("["+ i +"]\t"+ jugador);
                }

                System.out.println("Introduce el número del jugador a modificar");
                int index = sc.nextInt();

                System.out.println("Qué quieres modificar?\n[1]. Nombre\n[2]. Edad\n[3]. Dorsal\n[4]. Demarcación");
                int mod = sc.nextInt();
                modJugador(index, mod);

                break;

            case "3":
                System.out.println(FORMAT_ERROR("Bajo construcción"));
                break;

            case "X":
                appMantenimiento();
                break;

            default:
                System.out.println(FORMAT_ERROR("Opción no válida"));
                break;
        }
    }

    private static void modJugador(int index, int mod) {
        Jugador jugador = jugadores.get(index);
        switch (mod) {
            case 1:
                System.out.println("Introduce el nuevo nombre");
                jugador.setNombre(sc.next());
                break;
            case 2:
                System.out.println("Introduce la nueva edad");
                jugador.setEdad(sc.nextInt());
                break;
            case 3:
                System.out.println("Introduce el nuevo dorsal");
                try{
                    jugador.setDorsal(sc.nextInt());
                } catch (SameDorsalException e) {
                    System.out.println(FORMAT_ERROR(e.getMessage()));
                }
                break;
            case 4:
                System.out.println("Introduce la nueva demarcación");
                jugador.setPosicion(sc.next());
                break;
            default:
                System.out.println(FORMAT_ERROR("Opción no válida"));
                break;
        }
    }

    private static void printMenu() {
        System.out.println(FORMAT_SECTION("Menú de mantenimiento").toUpperCase());
        System.out.println("[1]. Mantenimiento de jugadores\n\tDentro podremos añadir jugadores, modificar datos y añadir acompañantes (sólo seniors)" +
                "\n[2]. Mantenimiento de entrenadores\n\tDentro podremos añadir entrenadores y modificar sus datos" +
                "\n[3]. Mantenimiento de masajistas\n\tDentro podremos añadir masajistas y modificar sus datos" +
                "\n[4]. Consultar equipos\n\tDentro se deben listar los tipos de equipos del club y elegir uno");
    }
}
