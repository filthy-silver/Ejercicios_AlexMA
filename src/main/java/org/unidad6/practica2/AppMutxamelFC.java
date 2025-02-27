package org.unidad6.practica2;

import java.util.ArrayList;

public class AppMutxamelFC {

    static ArrayList<Jugador> Equipo = new ArrayList<>();

    public static void main(String[] args) {
        Jugador Juan25 = new Jugador("Juan", 25, 7, "defensa");
        Jugador Pedro30 = new Jugador("Pedro", 30, 10, "delantero");
        Jugador Jose12 = new Jugador("Jose", 35, 10, "centrocampista");
        Jugador Antonio40 = new Jugador("Antonio", 40, 5, "portero");
        Jugador Javier45 = new Jugador("Javier", 45, 1, "portero");
        Jugador Toño17 = new Jugador("Javier", 50, 17, "portero");

         try{
            addJugador(Juan25, Pedro30, Jose12, Antonio40, Javier45, Toño17);
         } catch (Exception e) {
            System.out.println(e.getMessage());
         }


//        addJugador(Juan25, Pedro30, Jose12, Antonio40, Javier45, Toño17);
    }

    public static void addJugador(Jugador... jugadores) {
        for (Jugador jugador : jugadores) {
            if (checkDorsal(jugador)) {
                Equipo.add(jugador);
                System.out.println("Jugador añadido: " + jugador.getNombre() + " con dorsal " + jugador.getDorsal() + " y demarcación "
                        + jugador.getPosicion() + " en el equipo " + jugador.getCategoria());
            } else {
                throw new SameDorsalException(jugador);
            }
        }
    }

    public static boolean checkDorsal(Jugador jugador) {
        for (Jugador j : Equipo) {
            if (j.getDorsal().equals(jugador.getDorsal())) {
                return false;
            }
        }
        return true;
    }
}