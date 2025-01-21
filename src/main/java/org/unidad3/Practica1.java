package org.unidad3;

import java.util.Random;
import java.util.Scanner;
import java.util.regex.PatternSyntaxException;

public class Practica1 {
    static Scanner scn = new Scanner(System.in);
    static Random rdn = new Random();

    public static void main(String[] args) {
        String values;
        String[] team = new String[7];
        boolean check = false;

        System.out.println("> Equipo 1");
        do {
            System.out.print("> Introduce potencia de los samurais: ");
            values = scn.nextLine();    // Introducimos los valores de los samurais en una variable String

            values = fixString(values); // Llamamos a la función fixString para corregir el formato o posibles "typos"
            // de los valores introducidos

            if (values.contains(" ")) { // Si la cadena contiene un espacio, la separamos en un array de Strings

                try {   // Intentamos separar la cadena en un array de Strings, debería ser correcto siempre que
                    // el separador sea un espacio pero puede que el usuario haya metido un carácter
                    // no contemplado en fixString
                    team = values.split(" ");

                } catch (PatternSyntaxException e) {
                    System.out.println("Error: separador incorrecto [0e]" +
                            "\nIntroduce los valores separados por un espacio");

                }
                check = correctValues(team);    //Pasamos el array de Strings a la función correctValues para
                // comprobar que los valores son correctos. Si lo son, devolverán true

            } else {
                System.out.println("Error: separador incorrecto [1e]" +
                        "\nIntroduce los valores separados por un espacio");
            }

        } while (!check);

        int[] team1 = getValues(team);  //Como ya sabemos y hemos comprobado que los valores son correctos,
        //pasamos el array de Strings a la función getValues
        //para convertirlo en un array de enteros

        System.out.println("> Equipo compleatado.\n> Equipo 2");

        do {    //Repetimos el proceso para el equipo 2
            System.out.print("> Introduce potencia de los samurais: ");
            values = scn.nextLine();

            values = fixString(values);

            if (values.contains(" ")) {
                try {
                    team = values.split(" ");

                } catch (PatternSyntaxException e) {
                    System.out.println("Error: separador incorrecto [0e]" +
                            "\nIntroduce los valores separados por un espacio");

                    System.out.println("DEBUG: Valor 0e: " + values);
                }
                check = correctValues(team);

            } else {
                System.out.println("Error: separador incorrecto [1e]" +
                        "\nIntroduce los valores separados por un espacio");
                check = false;
            }

        } while (!check);

        int[] team2 = getValues(team);

        System.out.println("> Equipo completado");

        int beginWith = rdn.nextInt(7);  //Elegimos un número aleatorio entre 0 y 6 para determinar con qué
        //samurai empieza la batalla

        System.out.println("> ¡Empieza la batalla!\n> La batalla empieza con el Samurai " + (beginWith + 1));
        int t1score=0, t2score=0;   //Almacenamos el número de bajas de cada equipo como puntos

        int e;  //Inicializamos una variable para almacenar el índice del samurai que se enfrenta en cada ronda fuera del
        //bucle para que no se reinicie en cada iteración
        for (int i = 0; i < team1.length; i++) {

            if (i + beginWith < 7) {    //Siempre que el índice no supere 6, se mantiene el valor
                e = i + beginWith;

            } else {
                e = i + beginWith - 7;  //Si el índice supera 6, se resta 7 para que vuelva a 0
            }

            if (team1[e] > team2[e]) {
                System.out.println("> Samurai " + (e + 1) + ". Gana Equipo 1. " + team1[e] + " vs " + team2[e]);
                t1score ++;     //Añadimos un punto al equipo 1
                team2[e] = 0;   //"Eliminamos" al samurai del equipo 2 pasando su potencia a 0

            } else if (team1[e] < team2[e]) {
                System.out.println("> Samurai " + (e + 1) + ". Gana Equipo 2. " + team1[e] + " vs " + team2[e]);
                t2score ++;     //Añadimos un punto al equipo 2
                team1[e] = 0;   //"Eliminamos" al samurai del equipo 1 pasando su potencia a 0

            } else {
                System.out.println("> Samurai " + (e + 1) + ". Empate. " + team1[e] + " vs " + team2[e]);
                t1score ++; team1[e] = 0; //En caso de empate, se añade un punto a ambos equipos y se "elimina" al samurai
                t2score ++; team2[e] = 0;
            }
            if (t1score > 3 || t2score > 3){
                break;  //Si un equipo llega a 4 puntos, se acaba la batalla
            }
        }

        if (t1score > t2score){
            System.out.println("¡Equipo 1 GANA! Equipo 2 ha tenido " + t1score + " bajas.");
        } else if (t1score < t2score){
            System.out.println("¡Equipo 2 GANA! Equipo 1 ha tenido " + t2score + " bajas.");
        } else {
            System.out.println("¡EMPATE!");

        }

    }

    private static String fixString(String values) {

        if (values.contains(",")) {     //Si contiene una coma, la reemplazamos por un espacio
            values = values.replace(",", " ");
        }
        if (values.contains(".")) {     //Si contiene un punto, la reemplazamos por un espacio
            values = values.replace(".", " ");
        }
        if (values.contains("/")) {     //Si contiene una barra, la reemplazamos por un espacio
            values = values.replace("/", " ");
        }
        if (values.contains("-")) {     //Si contiene un guión, la reemplazamos por un espacio
            values = values.replace("-", " ");
        }

        while (values.contains("  ")) {     //Si contiene dos espacios seguidos, los reemplazamos por un único espacio
            //evitando errores al separar por espacios
            values = values.replace("  ", " ");
        }

        while (values.charAt(0) == ' ') {   //Aseguramos que no haya espacios al principio de la cadena que formen un
            // valor vacío en el array
            values = values.substring(1);
        }

        return values;
    }

    protected static boolean correctValues(String[] arg) {
        if (arg.length != 7) {  //Comprobamos que el array tenga 7 valores
            System.out.println("> Error: número de samurais incorrecto [c0]" +
                    "\n> Introduce 7 valores separados por un espacio");
            return false;
        }
        for (String s : arg) {  //Comprobamos que los valores sean numéricos
            try {
                Integer.parseInt(s);
            } catch (NumberFormatException e) {
                System.out.println("> Error: valor no numérico [c1]" +
                        "\n> Introduce 7 valores numéricos separados por un espacio");
                return false;   //Si no es numérico, devolvemos false
            }
        }
        int aux = 0;    //Comprobamos que la suma de los valores sea 30
        for (String s : arg) {
            aux += Integer.parseInt(s);
            if (Integer.parseInt(s) < 1 || Integer.parseInt(s) > 24) {
                System.out.println("> Error: valor fuera de rango [c3]" +
                        "\n> Los valores deben estar entre 1 y 24");
                return false;   //Si no está entre 1 y 24, devolvemos false
            }
        }
        if (aux != 30) {
            System.out.println("> Error: suma de potencias incorrecta [c2]" +
                    "\n> La suma de las potencias de los samurais debe ser 30");
            return false;   //Si no es 30, devolvemos false
        } else {
            return true;    //Si es 30, devolvemos true
        }
    }

    protected static int[] getValues(String[] arg) { //Convertimos el array de Strings en un array de enteros
        int[] values = new int[7];
        for (int i = 0; i < arg.length; i++) {
            values[i] = Integer.parseInt(arg[i]);
        }
        return values; //Devolvemos el array de enteros
    }
}

