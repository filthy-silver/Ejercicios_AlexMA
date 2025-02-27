package org.unidad6.ejercicioExcepciones;

public class EjercicioExcepciones {
    public static void main(String[] args) {
        int nivel = 150;
        
        if (nivel > 100) {
            try {
                throw new NivelNoValido();
            } catch (NivelNoValido e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
