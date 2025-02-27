package org.unidad6.ejercicioExcepciones;

public class NivelNoValido extends Exception {
    public NivelNoValido() {
        super("El nivel no es válido");
    }
}
