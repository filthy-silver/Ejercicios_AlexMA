package org.unidad6.practica2;

public class SameDorsalException extends RuntimeException {
    public SameDorsalException(Jugador j) {
        super("El jugador " + j.getNombre() + " no puede ser añadido porque el dorsal " + j.getDorsal() + " ya está en uso por otro jugador.");
    }
}
