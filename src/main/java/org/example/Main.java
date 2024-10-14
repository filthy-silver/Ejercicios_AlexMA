package org.example;
import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;
import java.io.Console;
import static org.example.Helper.*;

public class Main {
    static Scanner scn = new Scanner(System.in).useLocale(Locale.US);

    public static void main(String[] args) {
        tit();

        System.out.println("""
                Introduce la UNIDAD a la que acceder:
                 ► UNIDAD 1 → [1]
                   \s
                 ► UNIDAD 2 → [2]
                \s""");

        selecUnidad(getTPInt());


    }

    public static void tit() {
        System.out.println("""
                ▓█████ ▄▄▄██▀▀▀▓█████  ██▀███   ▄████▄   ██▓ ▄████▄   ██▓ ▒█████    ██████\s
                ▓█   ▀   ▒██   ▓█   ▀ ▓██ ▒ ██▒▒██▀ ▀█  ▓██▒▒██▀ ▀█  ▓██▒▒██▒  ██▒▒██    ▒\s
                ▒███     ░██   ▒███   ▓██ ░▄█ ▒▒▓█    ▄ ▒██▒▒▓█    ▄ ▒██▒▒██░  ██▒░ ▓██▄  \s
                ▒▓█  ▄▓██▄██▓  ▒▓█  ▄ ▒██▀▀█▄  ▒▓▓▄ ▄██▒░██░▒▓▓▄ ▄██▒░██░▒██   ██░  ▒   ██▒
                ░▒████▒▓███▒   ░▒████▒░██▓ ▒██▒▒ ▓███▀ ░░██░▒ ▓███▀ ░░██░░ ████▓▒░▒██████▒▒
                ░░ ▒░ ░▒▓▒▒░   ░░ ▒░ ░░ ▒▓ ░▒▓░░ ░▒ ▒  ░░▓  ░ ░▒ ▒  ░░▓  ░ ▒░▒░▒░ ▒ ▒▓▒ ▒ ░
                 ░ ░  ░▒ ░▒░    ░ ░  ░  ░▒ ░ ▒░  ░  ▒    ▒ ░  ░  ▒    ▒ ░  ░ ▒ ▒░ ░ ░▒  ░ ░
                   ░   ░ ░ ░      ░     ░░   ░ ░         ▒ ░░         ▒ ░░ ░ ░ ▒  ░  ░  ░ \s
                   ░  ░░   ░      ░  ░   ░     ░ ░       ░  ░ ░       ░      ░ ░        ░ \s
                                               ░            ░                             \s
                
                """);
    }

    public static void unit1(){
        System.out.println("""
                Ejercicios de la UNIDAD 1:
                Introduce el número del ejercicio que quieres ejecutar:
                \t[0] para ejercicioInicial
                  ► Batería de programas sencillos en Java
                \t[1] para Ejercicio 1
                \t[2] para Ejercicio 2
                \t[3] para Ejercicio 3
                \t[4] para Ejercicio 4
                \t[5] para Ejercicio 5
                \t[6] para Ejercicio 6
                  ► Operadores:
                \t[11] para aritmeticos
                \t[12] para asignacion
                \t[13] para relacionales
                \t[14] para logicos
                  ► Práctica 3:
                \t[21] para votamatic3000
                  ► Práctica 4:
                \t[31] para multimatic99
                ==========
                
                [123] Seleccionar UNIDAD
                """);
        Ejercicio_UD1 ejercicioInicial = new Ejercicio_UD1();

        switch (ejerNum()) {
            case 0:
                ejercicioInicial.ejercicioInicial();
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
            case 31:
                Practica4.multimatic99();
                returnToMain();
                break;

            default:
                System.out.println("Ejercicio no encontrado");
                System.out.flush();
                returnToMain();
                break;
        }
    }

    public static void unit2(){
        System.out.println("""
                Ejercicios de la UNIDAD 1:
                Introduce el número del ejercicio que quieres ejecutar:
                  ► Batería de ejercicios con cadenas de caracteres
                \t[1] para Ejercicio 1
                \t[2] para Ejercicio 2
                \t[3] para Ejercicio 3
                \t[4] para Ejercicio 4
                \t[5] para Ejercicio 5
                
                ==========
                
                [123] Seleccionar UNIDAD
                """);

        switch (ejerNum()) {
            case 1:
                UNIDAD2Bateria.Ejercicio1();
                break;
            case 2:
                UNIDAD2Bateria.Ejercicio2();
                break;
            case 3:
                UNIDAD2Bateria.Ejercicio3();
                break;
            case 4:
                UNIDAD2Bateria.Ejercicio4();
                break;
            case 5:
                UNIDAD2Bateria.Ejercicio5();
                break;
            case 41:
                UNIDAD2Bateria.Ejercicio4v2();
            case 11:
                UNIDAD2.Ejercicio1();
            case 123:
                returnToMain();
                break;

            default:
                System.out.println("Ejercicio no encontrado");
                System.out.flush();
                returnToMain();
        }
    }
}