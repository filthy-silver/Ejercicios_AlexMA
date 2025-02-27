package org.unidad6.ejercicioExcepciones;

public class DepositoMaximoException extends RuntimeException {
    public DepositoMaximoException() {
        super("Deposito maximo excedido");
    }
}
