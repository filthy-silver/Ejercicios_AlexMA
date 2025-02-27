package org.unidad6.ejercicioEnum;

import java.util.Random;
import java.util.Scanner;

public class Jueguito {

   static Scanner sc = new Scanner(System.in);
   static Random rng = new Random();

   private static Dificultad dificultad;

   public static void main(String[] args) {
        System.out.println("Introduce la dificultad [FACIL, MEDIO, DIFICIL, EXPERTO]: ");
        try {
            dificultad = Dificultad.valueOf(sc.nextLine().toUpperCase());
        } catch (IllegalArgumentException e) {
            System.out.println("Tipo de tarjeta no válido");
            return;
        }

        int puntuacion = rng.nextInt(1000, 9999);
       System.out.println("Tu puntuación es: " + puntuacion +
               "\nTu multiplicador es: " + dificultad.getMultiplicador() +
               "\nTu puntuación final es: " + puntuacion * dificultad.getMultiplicador());

   }
}
