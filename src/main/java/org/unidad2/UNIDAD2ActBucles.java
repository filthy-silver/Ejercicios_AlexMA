package org.unidad2;

import java.util.Random;
import java.util.Scanner;

public class UNIDAD2ActBucles {
    static Scanner scn = new Scanner(System.in);
    static Random rdn = new Random();

    public static void main(String[] args) {
        System.out.println("""
                Introduce el número del ejercicio que quieres ejecutar:\
                
                \t[1] para Ejercicio 1\
                
                \t[2] para Ejercicio 2\
                
                \t[3] para Ejercicio 3\
                
                \t[4] para Ejercicio 4""");
        int ejercicio;
        do {
            if (scn.hasNextInt()){
                ejercicio = scn.nextInt();
                scn.nextLine();
            } else {
                System.out.println("Introduce un número entero.");
                return;
            }
        } while (ejercicio < 1);

        switch (ejercicio) {
            case 1 -> Ejercicio1();
            case 2 -> Ejercicio2();
            case 3 -> Ejercicio3();
            case 4 -> Ejercicio4();
        }
    }

    public static void Ejercicio1(){
        System.out.println("    ► Pulsa ENTER para lanzar los dados ◄");
        scn.nextLine();
        int d1 = rdn.nextInt(6) + 1;
        int d2 = rdn.nextInt(6) + 1;

        System.out.println("Dado 1: " + d1 + "\nDado 2: " + d2
                + "\nLa suma de los dados es: " + (d1 + d2));
    }

    public static void Ejercicio2() {
        System.out.println("PASSGENIUS 6009\n");
        System.out.println("Introduce la longitud de la contraseña: ");
        int longitud = -1;

        do {
            if (scn.hasNextInt()) {
                longitud = scn.nextInt();
                scn.nextLine();
            }
            System.out.println("Introduce un número entero positivo: ");
        } while (longitud < 1);

        String caracteres = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        String especiales = "!@#$%^&*()_+-=[]{};':,.<>?";
        StringBuilder password = new StringBuilder();

        System.out.println("¿Quieres incluir caracteres especiales? [s/n]");
        String respuesta = scn.nextLine();
        respuesta = respuesta.toLowerCase();

        if (respuesta.equals("s") || respuesta.equals("si")) {
            caracteres += especiales;
        } else if (respuesta.equals("n") || respuesta.equals("no")) {
            System.out.println("No se incluirán caracteres especiales.");
        } else {
            System.out.println("Respuesta no reconocida. No se incluirán caracteres especiales.");
        }

        for (int i = 0; i < longitud; i++) {
            password.append(caracteres.charAt(rdn.nextInt(caracteres.length())));

        }

        System.out.println("Contraseña generada: " + password);
    }

    public static void Ejercicio3() {
        System.out.println("RANDOM'r'US\n");
        int n1 = -1, n2 = -1, num;
        boolean check = true;

        System.out.print("Introduce el número mínimo: ");
        do {
            if (scn.hasNextInt()) {
                n1 = scn.nextInt();
                scn.nextLine();
                check = false;
            } else {
                System.out.print("Introduce un número válido: ");
            }
        } while (check);

        System.out.print("Introduce el número máximo: ");
        check = true;
        do {
            if (scn.hasNextInt()) {
                n2 = scn.nextInt();
                scn.nextLine();
                if (n2 < n1) {
                    System.out.println("El número máximo debe ser mayor que el mínimo.");
                    System.out.print("Introduce el número máximo: ");
                    continue;
                }
                check = false;
            }
            System.out.println("Introduce un número entero positivo: ");
        } while (check);



            num = rdn.nextInt(n2 - n1 + 1) + n1;
        System.out.println("Número aleatorio entre " + n1 + " y " + n2 + ": " + num);
    }

    public static void Ejercicio4(){
        System.out.println("PASSGENIUS 6009\n");

        int longitud;
        longitud = rdn.nextInt(2) + 6;

        String caracteres = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        String especiales = "!@#$%^&*()_+-=[]{};':,.<>?";
        StringBuilder password = new StringBuilder();

        System.out.println("¿Quieres incluir caracteres especiales? [s/n]");
        String respuesta = scn.nextLine();
        respuesta = respuesta.toLowerCase();

        if (respuesta.equals("s") || respuesta.equals("si")) {
            caracteres += especiales;
        } else if (respuesta.equals("n") || respuesta.equals("no")) {
            System.out.println("No se incluirán caracteres especiales.");
        } else {
            System.out.println("Respuesta no reconocida. No se incluirán caracteres especiales.");
        }

        for (int i = 0; i < longitud; i++) {
            password.append(caracteres.charAt(rdn.nextInt(caracteres.length())));
        }

        System.out.println("Contraseña generada: \n" + password);

    }

}
