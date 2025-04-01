package org.unidad7.mapas_diccionarios.español_ingles;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Scanner;

public class DiccionarioEI {
    static Scanner sc = new Scanner(System.in);
    static HashMap<String, String> diccionario = new HashMap<>();

    public static void main(String[] args) {
        int preguntas = 0;
        int correctas = 0;

        diccionario.clear();
        diccionario.putAll(Map.of(
            "perro", "dog",
            "gato", "cat",
            "ratón", "mouse",
            "elefante", "elephant",
            "patata", "potato",
            "coche", "car",
            "mesa", "table",
            "silla", "chair"
        ));
        String fin = " ";
        do {
            String palabra = palabraAleatoria();
            primeraLetraTraduccion(palabra);
            System.out.print("Indique la respuesta: ");
            String respuesta = sc.nextLine();
            if (respuesta.equals("fin")) {
                fin = respuesta;
                break;
            }
            if (Objects.equals(respuesta, diccionario.get(palabra))){
                System.out.println("Correcto");
                correctas++;
            } else {
                System.out.println("Incorrecto");
            }
            preguntas++;
        } while (!Objects.equals(fin, "fin"));

        System.out.println("FIN DEL PROGRAMA" +
                "\nTotal de preguntas: " + preguntas +
                "\nTotal aciertos: " + correctas +
                "\nTotal fallos: " + (preguntas - correctas));
    }

    public static void nuevoPar(String espanol, String ingles) {
        diccionario.put(espanol, ingles);
    }

    public static void traduce(String espanol) {
        if (diccionario.containsKey(espanol)) {
            System.out.println("La traducción de " + espanol + " es: " + diccionario.get(espanol));
        } else {
            System.out.println("La palabra " + espanol + " no está en el diccionario.");
        }
    }

    public static String palabraAleatoria(){
        int randomIndex = (int) (Math.random() * diccionario.size());
        return (String) diccionario.keySet().toArray()[randomIndex];

    }

    public static void primeraLetraTraduccion(String palabra) {
        String traduccion = diccionario.get(palabra);
        if (traduccion != null && !traduccion.isEmpty()) {
            System.out.println(palabra + ": " + traduccion.charAt(0) + "...");
        } else {
            System.out.println("No se encontró la traducción para " + palabra);
        }
    }
}
