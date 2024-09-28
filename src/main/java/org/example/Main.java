package org.example;
import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;
import java.io.Console;
import static org.example.Helper.*;



public class Main {
    static Scanner scn = new Scanner(System.in).useLocale(Locale.US);
    static Console c = System.console();

    public static void main(String[] args) {

        Ejercicio_UD1 ejercicioInicial = new Ejercicio_UD1();
        Ejercicio_UD1 ejercicio1 = new Ejercicio_UD1();
        System.out.println("▓█████ ▄▄▄██▀▀▀▓█████  ██▀███   ▄████▄   ██▓ ▄████▄   ██▓ ▒█████    ██████ \n" +
                "▓█   ▀   ▒██   ▓█   ▀ ▓██ ▒ ██▒▒██▀ ▀█  ▓██▒▒██▀ ▀█  ▓██▒▒██▒  ██▒▒██    ▒ \n" +
                "▒███     ░██   ▒███   ▓██ ░▄█ ▒▒▓█    ▄ ▒██▒▒▓█    ▄ ▒██▒▒██░  ██▒░ ▓██▄   \n" +
                "▒▓█  ▄▓██▄██▓  ▒▓█  ▄ ▒██▀▀█▄  ▒▓▓▄ ▄██▒░██░▒▓▓▄ ▄██▒░██░▒██   ██░  ▒   ██▒\n" +
                "░▒████▒▓███▒   ░▒████▒░██▓ ▒██▒▒ ▓███▀ ░░██░▒ ▓███▀ ░░██░░ ████▓▒░▒██████▒▒\n" +
                "░░ ▒░ ░▒▓▒▒░   ░░ ▒░ ░░ ▒▓ ░▒▓░░ ░▒ ▒  ░░▓  ░ ░▒ ▒  ░░▓  ░ ▒░▒░▒░ ▒ ▒▓▒ ▒ ░\n" +
                " ░ ░  ░▒ ░▒░    ░ ░  ░  ░▒ ░ ▒░  ░  ▒    ▒ ░  ░  ▒    ▒ ░  ░ ▒ ▒░ ░ ░▒  ░ ░\n" +
                "   ░   ░ ░ ░      ░     ░░   ░ ░         ▒ ░░         ▒ ░░ ░ ░ ▒  ░  ░  ░  \n" +
                "   ░  ░░   ░      ░  ░   ░     ░ ░       ░  ░ ░       ░      ░ ░        ░  \n" +
                "                               ░            ░                              \n" +
                "\n");

        System.out.println("Ejercicios de la Unidad 1:\n");
        System.out.println("Introduce el número del ejercicio que quieres ejecutar: ");
        System.out.println("\t[0] para ejercicioInicial");
        System.out.println("  ► Batería de programas sencillos en Java");
        System.out.println("\t[1] para Ejercicio 1");
        System.out.println("\t[2] para Ejercicio 2");
        System.out.println("\t[3] para Ejercicio 3");
        System.out.println("\t[4] para Ejercicio 4");
        System.out.println("\t[5] para Ejercicio 5");
        System.out.println("\t[6] para Ejercicio 6");
        System.out.println("  ► Operadores:\n" +
                "\t[11] para aritmeticos\n" +
                "\t[12] para asignacion\n" +
                "\t[13] para relacionales\n" +
                "\t[14] para logicos\n");
        System.out.println("Práctica 3:\n" +
                "\t[21] para votamatic3000\n");

        Integer ejercicioN = null;

        try {
             ;
            ejercicioN = getTPInt();
        }
        catch (NumberFormatException | InputMismatchException e) {

            System.out.println("Introduce un número válido.\n");
            scn.nextLine();
        }


        switch (ejercicioN) {
            case 0:
                ejercicio1.ejercicioInicial();
                returnToMain();
                break;
            case 1:
                ejercicioInicial.ejercicioBateria1();
                returnToMain();
                break;

            case 2:
                ejercicioInicial.ejercicioBateria2();
                returnToMain();
                break;
            case 3:
                ejercicioInicial.ejercicioBateria3();
                returnToMain();

                break;
            case 4:
                ejercicioInicial.ejercicioBateria4();
                returnToMain();

                break;
            case 5:
                ejercicioInicial.ejercicioBateria5();
                returnToMain();

                break;
            case 6:
                ejercicioInicial.ejercicioBateria6();
                returnToMain();

                break;
            case 11:
                Operadores.aritmeticos(null);
                returnToMain();
                break;
            case 12:
                Operadores.asignacion(null);
                returnToMain();
                break;
            case 13:
                Operadores.relacionales(null);
                returnToMain();
                break;
            case 14:
                Operadores.logicos(null);
                returnToMain();
                break;
            case 21:
                Practica3.votamatic3000();
                returnToMain();
                break;

            default:
                System.out.println("Ejercicio no encontrado");
                System.out.flush();
                returnToMain();
                break;
        }
    }
}