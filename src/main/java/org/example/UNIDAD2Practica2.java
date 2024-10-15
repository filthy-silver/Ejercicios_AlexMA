package org.example;

import java.util.Scanner;

public class UNIDAD2Practica2 {
    static Scanner scn = new Scanner(System.in);
    public static void main(String[] args) {
        calculadora();
    }

    public static String operador() {
        String operador;
        do {
            System.out.println("Introduce un operador (+, -, /, x, R): ");
            operador = scn.next().toLowerCase();
            scn.nextLine();

            if (!operador.equals("+")
                    && !operador.equals("-")
                    && !operador.equals("x")
                    && !operador.equals("/")
                    && !operador.equals("r")) {
                System.out.println("Operador no válido.");
            }
        } while (!operador.equals("+")
                && !operador.equals("-")
                && !operador.equals("x")
                && !operador.equals("/")
                && !operador.equals("r"));
        return operador;
    }

    public static int numero() {
        int numero = 0;
        boolean valido = false;
        do {
            System.out.println("Introduce un número: ");
            if (scn.hasNextInt()) {
                numero = scn.nextInt();
                scn.nextLine();
                valido = true;
            } else {
                System.out.println("Introduce un número válido.");
                scn.next();
                scn.nextLine();
            }

        } while (!valido);
        return numero;
    }

    public static void calculadora() {
        int num1 = numero();
        String operador = operador();
        int num2 = 0;
        if (!operador.equals("r")) {
            num2 = numero();
        }


        switch (operador) {
            case "+" -> System.out.println("El resultado de la suma es: " + (num1 + num2));
            case "-" -> System.out.println("El resultado de la resta es: " + (num1 - num2));
            case "x" -> System.out.println("El resultado de la multiplicación es: " + (num1 * num2));
            case "/" -> {
                if (num2 == 0) {
                    System.out.println("No se puede dividir entre 0.");
                } else {
                    System.out.println("El resultado de la división es: " + (num1 / num2));
                }
                    }
            case "r" -> {
                if (num1 < 0) {
                    System.out.println("No se puede calcular la raíz cuadrada de un número negativo.");
                } else
                    System.out.println("El resultado de la raíz cuadrada es: " + Math.sqrt(num1));
            }
            default -> System.out.println("Operador no válido");

        }

        System.out.println("¿Desea realizar otra operación? (s/n): ");
        String respuesta = scn.next().toLowerCase();
        scn.nextLine();
        if (respuesta.equals("s")) {
            calculadora();
        } else {
            System.out.println("Hasta luego.");
        }
    }
}
