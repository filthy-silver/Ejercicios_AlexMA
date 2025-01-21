package org.unidad2;

import java.util.Scanner;

public class UNIDAD2BateríaBucles {

    static Scanner scn = new Scanner(System.in);

    public static void main(String[] args) {
        menu();
    }

    public static void menu() {
        System.out.println("BATERIA DE EJERCICIOS: BUCLES" +
                "\nIntroduce el número de ejercicio que quieres ejecutar: " +
                "\n[1] Contraseña" +
                "\n[2] Números hasta 1" +
                "\n[3] Múltiplos de 3 hasta 50" +
                "\n[4] Imprimir caracteres de un String" +
                "\n[5] Tabla de multiplicar" +
                "\n[6] Suma de n números" +
                "\n[7] Factorial de un número" +
                "\n[8] Invertir un String");

        int numEj = scn.nextInt();
        scn.nextLine();
        switch (numEj) {
            case 1 -> {
                password();
                backto();
            }
            case 2 -> {
                numTo1();
                backto();
            }
            case 3 -> {
                x3on50();
                backto();
            }
            case 4 -> {
                printCharString();
                backto();
            }
            case 5 -> {
                tablaMultiplicar();
                backto();
            }
            case 6 -> {
                sumaHasta();
                backto();
            }
            case 7 -> {
                factorialDe();
                backto();
            }
            case 8 -> {
                invertString();
                backto();
            }
        }
    }

    public static void backto() {
        System.out.println("Quieres volver al menú? (s/n)");
        String volver = scn.nextLine();
        if (volver.equals("s")) {
            menu();
        } else {
            System.out.println("Hasta luego!");
        }
    }

    public static void password(){
        System.out.println("Introduce una contraseña: ");
        String password = scn.nextLine();
        String passwordCheck;
        do {
            System.out.println("Verifica la contraseña: ");
            passwordCheck = scn.nextLine();
            if (!password.equals(passwordCheck)) {
                System.out.println("Las contraseñas no coinciden.");
            } else {
                System.out.println("Contraseña válida.");
                break;
                }
        } while (!password.equals(passwordCheck));
        }

        public static void numTo1(){
            System.out.println("Introduce un número: ");
            int num = scn.nextInt();
            scn.nextLine();
            System.out.println("------");
            for (int i = num; i >= 1; i--) {
                System.out.println(i);
            }
        }

        public static void x3on50(){
            System.out.println("Múltiplos de 3 hasta 50: ");
            for (int i = 1; i <= 50; i++) {
                if (i % 3 == 0) {
                    System.out.println(i);
                }
            }
        }

        public static void printCharString(){
            System.out.println("Introduce un String:");
            String str = scn.nextLine();

            for (int i = 0; i < str.length(); i++) {
                System.out.println(str.charAt(i));
            }
        }

        public static void tablaMultiplicar(){
            System.out.println("Introduce un número: ");
            int num = scn.nextInt();
            scn.nextLine();
            for (int i = 1; i <= 10; i++) {
                System.out.println(num + " x " + i + " = " + num * i);
            }
        }

        public static void sumaHasta(){
            System.out.println("Cuántos números quieres sumar?:  ");
            int num = scn.nextInt();
            scn.nextLine();
            int suma = 0;
            for (int i = 1; i <= num; i++) {
                System.out.println("Inserta nº " + i + ": ");
                int n = scn.nextInt();
                scn.nextLine();
                suma += n;
            }
            System.out.println("El resultado es: " + suma);
        }

        public static void factorialDe(){
            System.out.println("Introduce un número: ");
            int num = scn.nextInt();
            scn.nextLine();
            int factorial = 1;
            for (int i = 1; i <= num; i++) {
                factorial *= i;
            }
            System.out.println("El factorial de " + num + " es: " + factorial);
        }

        public static void invertString(){
            System.out.println("Introduce un String: ");
            String str = scn.nextLine();
            String strInvert = "";
            for (int i = str.length() - 1; i >= 0; i--) {
                strInvert += str.charAt(i);
            }
            System.out.println("El String invertido es: " + strInvert);
        }
    }

