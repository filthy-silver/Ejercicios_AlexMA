package org.unidad6.ejercicioExcepciones;

public class SaldoInsuficienteException extends RuntimeException {
    public SaldoInsuficienteException() {
        super("Saldo insuficiente");
    }
}
