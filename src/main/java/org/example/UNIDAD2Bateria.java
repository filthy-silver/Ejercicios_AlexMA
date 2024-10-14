package org.example;

import java.util.Scanner;
import java.util.regex.PatternSyntaxException;

public class UNIDAD2Bateria {
    static Scanner scn = new Scanner(System.in);

    public static void Ejercicio1(){
        System.out.println("Introduce un texto: ");
        String texto = scn.nextLine();
        System.out.println("---" +
                "\nTu texto tiene " + texto.length() + " caracteres." +
                "\nTu texto sin espacios se vería así:\n" +
                texto.replaceAll(" ", "") +
                "\nAhora partiremos tu texto por la mitad." +
                "\nLa primera mitad:\n" +
                texto.substring(0, (texto.length() / 2)) +
                "\n\nLa segunda mitad:\n" +
                texto.substring((texto.length() / 2)) +
                "\n\nPara acabar, mostraremos tu texto en mayusculas.\n" +
                texto.toUpperCase());
    }

    public static void Ejercicio2(){
        System.out.println("CUENTALETRAS//4444" +
                "\nIntroduce un texto: ");
        String texto1 = scn.nextLine();
        System.out.println("Introduce un segundo texto: ");
        String texto2 = scn.nextLine();

        if (texto1.length() > texto2.length()) {
            System.out.println("El primer texto es más largo.");
        } else{
            System.out.println("El segundo texto es más largo.");
        }
    }

    public static void Ejercicio3(){
        System.out.println("RECORTATONIC 1999"
        + "\nIntroduce un número: ");
        String numero = scn.nextLine();
        System.out.println("Tu número sin las dos últimas cifras és:");
        if (numero.length() > 1) {
            System.out.println(numero.substring(0, numero.length() - 2));
        } else {
            System.out.println("Tu número es bién chiquito, sorry :(");
        }
    }

    public static void Ejercicio4(){
        System.out.println("Introduce un texto:");
        String texto = scn.nextLine();
        System.out.println("Qué palabra quieres buscar?");
        String aux = scn.nextLine();
        String palabra = " " + aux + " ";
         if (contarPalabra(texto, palabra) <= 0){
             System.out.println("La palabra \""+ palabra +"\" no aparece.");
         } else {
             System.out.println("La palabra \"" + palabra + "\" aparece " + contarPalabra(texto, palabra) + " veces");
         }
    }

    public static void Ejercicio5(){
        System.out.println("BUSCAR LA PALABRA" +
                "\n[JUGADOR 1] Introduce un texto: ");
        String texto = scn.nextLine();
        System.out.println("[JUGADOR 2] Introduce la palabra:");
        String aux = scn.nextLine();
        String palabra = " " + aux + " ";

        boolean existe = false;
        int vidas = 10;
        do {
            if(texto.contains(palabra)){
                existe = true;

            } else {
                vidas -= 1;
                System.out.println("ERROR.\nAl JUGADOR 2 le quedan " + vidas + ".");
                if (vidas <= 0) {
                    System.out.println("JUGADOR 1 GANA");
                    break;
                }
                System.out.println("[JUGADOR 2] Introduce la palabra:");
                aux = scn.nextLine();
                palabra = " " + aux + " ";
            }

        } while (!existe);
        System.out.println("JUGADOR 2 GANA");
    }

    public static void Ejercicio4v2(){
        System.out.println("Introduce un texto:");
        String texto = scn.nextLine();
        System.out.println("Qué palabra quieres buscar?");
        String palabra = scn.nextLine();
        System.out.println("El texto contiene la palabra " + Helper.countWords(texto, palabra) + "veces.");
    }

    private static int contarPalabra(String texto, String palabra){
        return contarPalabra(texto, palabra, 0);
    }

    private static int contarPalabra(String texto, String palabra, int pos){
        int ultPos = texto.indexOf(palabra, pos);

        if (ultPos == -1){
            return 0;
        }
        return 1 + contarPalabra(texto, palabra, ultPos + 1);
    }


}
