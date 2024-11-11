package org.example;

import java.util.Random;
import java.util.Scanner;
import java.util.regex.PatternSyntaxException;

public class UNIDAD3Practica1 {
    static Scanner scn = new Scanner(System.in);
    static Random rdn = new Random();

    public static void main(String[] args) {
        String values;
        String[] team = new String[7];
        boolean check = false;

        System.out.println("> Equipo 1");
        do {
            System.out.print("> Introduce potencia de los samurais: ");
            values = scn.nextLine();

//            values = fixString(values);

            if (values.contains(" ")) {

                try {
                    team = values.split(" ");

                } catch (PatternSyntaxException e) {
                        System.out.println("Error: separador incorrecto [0e]" +
                                "\nIntroduce los valores separados por un espacio");

                }
                check = correctValues(team);

            } else {
                System.out.println("Error: separador incorrecto [1e]" +
                        "\nIntroduce los valores separados por un espacio");
            }

        } while (!check);

        int[] team1 = getValues(team);

        System.out.println("> Equipo compleatado.\n> Equipo 2");

        do {
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

        int beginWith = rdn.nextInt(7);

        System.out.println("> ¡Empieza la batalla!\n> La batalla empieza con el Samurai " + (beginWith + 1));
        int t1score=0, t2score=0;

        int e;
        for (int i = 0; i < team1.length; i++) {

            if (i + beginWith < 7) {
                e = i + beginWith;

            } else {
                e = i + beginWith - 7;
            }

            if (team1[e] > team2[e]) {
                System.out.println("> Samurai " + (e + 1) + ". Gana Equipo 1. " + team1[e] + " vs " + team2[e]);
                t1score ++;
                team2[e] = 0;
//                System.out.println("DEBUG : T1 Score =" + t1score);
            } else if (team1[e] < team2[e]) {
                System.out.println("> Samurai " + (e + 1) + ". Gana Equipo 2. " + team1[e] + " vs " + team2[e]);
                t2score ++;
                team1[e] = 0;

//                System.out.println("DEBUG : T2 Score =" + t2score);
            } else {
                System.out.println("> Samurai " + (e + 1) + ". Empate. " + team1[e] + " vs " + team2[e]);
                t1score ++; team1[e] = 0;
                t2score ++; team2[e] = 0;
            }
            if (t1score > 3 || t2score > 3){
                break;
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

        if (values.contains(",")) {
            values = values.replace(",", " ");
        }
        if (values.contains(".")) {
            values = values.replace(".", " ");
        }
        if (values.contains("/")) {
            values = values.replace("/", " ");
        }
        if (values.contains("-")) {
            values = values.replace("-", " ");
        }

        while (values.contains("  ")) {
            values = values.replace("  ", " ");
        }

        while (values.charAt(0) == ' ') {
            values = values.substring(1);
        }

        return values;
    }

    protected static boolean correctValues(String[] arg) {
        if (arg.length != 7) {
            System.out.println("> Error: número de samurais incorrecto [c0]" +
                    "\n> Introduce 7 valores separados por un espacio");
            return false;
        }
        for (String s : arg) {
            try {
                Integer.parseInt(s);
            } catch (NumberFormatException e) {
                System.out.println(">Error: valor no numérico [c1]" +
                        "\n> Introduce 7 valores numéricos separados por un espacio");
                return false;
            }
        }
        int aux = 0;
        for (String s : arg) {
//            System.out.println("DEBUG: Valor de s: " + s);
            aux += Integer.parseInt(s);
//            System.out.println("DEBUG: Valor de aux: " + aux);
        }
        if (aux != 30) {
            System.out.println(">Error: suma de potencias incorrecta [c2]" +
                    "\n> La suma de las potencias de los samurais debe ser 30");
            return false;
        } else {
            return true;
        }
    }

    protected static int[] getValues(String[] arg) {
        int[] values = new int[7];
        for (int i = 0; i < arg.length; i++) {
            values[i] = Integer.parseInt(arg[i]);
        }
        return values;
    }
}

