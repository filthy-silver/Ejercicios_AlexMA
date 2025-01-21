package org.unidad1;
import org.unidad2.*;
import org.unidad2.*;
import org.unidad3.*;

import java.util.Locale;
import java.util.Scanner;

import static org.unidad1.Helper.*;

public class Main {
    static Scanner scn = new Scanner(System.in).useLocale(Locale.US);

    public static void main(String[] args) {
        tit();

        System.out.println("""
                Introduce la UNIDAD a la que acceder:
                 ► UNIDAD 1 → [1]
                   \s
                 ► UNIDAD 2 → [2]
                \s
                 ► UNIDAD 3 → [3]
                """);

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
                
                [123] VOLVER
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
                
                [123] VOLVER
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

    public static void unit3() {
        System.out.println("""
                Ejercicios de la UNIDAD 3:
                Introduce el número del ejercicio que quieres ejecutar:
                  ► Práctica 1:
               \t[1] para Actividad 1 //Sin terminar
                \t[2] para Actividad 2
                \t[3] para Batería de Vectores
                \t[4] para Práctica 1
                \t[5] para Práctica 2
                \t[6] para Práctica 3
                \t==========
                \tEXTRA:
                \t[7] para Espacio Cartesiano
               
                ==========

                [123] VOLVER
               """);
        switch (ejerNum()){
            case 1:
                Actividad1.main(null);
                break;
            case 2:
                Actividad2.main(null);
                break;
            case 3:
                BateriaVectores.main(null);
                break;
            case 4:
                Practica1.main(null);
                break;
            case 5:
                Practica2.main(null);
                break;
            case 6:
                org.unidad3.Practica3.main(null);
                break;
            case 7:
                EspacioCartesiano.main(null);
                break;
        }
    }
}