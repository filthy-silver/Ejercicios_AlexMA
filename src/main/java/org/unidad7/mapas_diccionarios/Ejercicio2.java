package org.unidad7.mapas_diccionarios;

import java.util.HashMap;
import java.util.Scanner;

public class Ejercicio2 {
    static Scanner sc = new Scanner(System.in);
    static HashMap<Integer, String> mapaDiccionarios = new HashMap<>();

    public static void main(String[] args) {
        System.out.println("Introduce una palabra:");
        String w = sc.nextLine();

        contarFrecuenciaCaracteres(w);

    }

    private static void contarFrecuenciaCaracteres(String palabra) {
        HashMap<Character, Integer> frecuencia = new HashMap<>();

        // Recorrer cada carácter de la palabra
        for (int i = 0; i < palabra.length(); i++) {
            char caracter = palabra.charAt(i);

            // Si el carácter ya está en el mapa, incrementar su contador
            // Si no, añadirlo con valor inicial 1
            frecuencia.put(caracter, frecuencia.getOrDefault(caracter, 0) + 1);
        }

        // Mostrar resultados
        System.out.println("Frecuencia de caracteres:");
        for (char caracter : frecuencia.keySet()) {
            System.out.println("'" + caracter + "': " + frecuencia.get(caracter));
        }
    }


}
