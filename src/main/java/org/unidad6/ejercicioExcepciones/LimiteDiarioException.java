package org.unidad6.ejercicioExcepciones;

public class LimiteDiarioException extends RuntimeException {
    public LimiteDiarioException() {
        super("Limite diario excedido");
    }
}
