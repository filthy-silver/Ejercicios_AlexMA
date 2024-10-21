package org.example;

import java.util.Scanner;

public class UNIDAD2Practica3 {
    static Scanner scn = new Scanner(System.in);

    public static void main(String[] args) {
    ISBNcheck(ISBNcheck());
    }

    public static String ISBNcheck() {
        String isbn;
        do {
            System.out.println("Introduce el ISBN: ");
            isbn = scn.nextLine();

            if (isbn.length() != 10) {
                System.out.println("El ISBN debe tener 10 dígitos.");
                ISBNcheck();
            } else if (ISBNmissCheck(isbn) > 1) {
                System.out.println("Solo puede faltar un número.");
                ISBNcheck();
            }
        }
        while (isbn.length() != 10);
        return isbn;
    }

    public static int ISBNmissCheck(String arg) {
        int check = 0;
        for (int i = 0; i < arg.length(); i++) {
            if (arg.charAt(i) == '?') {
                check++;
            }
        }
        return check;
    }

    public static void ISBNcheck(String arg) {
        int ISBNtotal = 0;
        int missing = 0;
        int count = 10;
        boolean check = false;


        try {
            for (int i = 0; i < arg.length(); i++) {

                System.out.println("DEBUG: count = " + count);

                if (arg.charAt(i) == 'X' && arg.charAt(i) == arg.length()) {
                    ISBNtotal += 10;
                } else {
                    System.out.println("DEBUG: La X no es última posición");
                }
                if (arg.charAt(i) == '?') {
                    missing = count;
                    System.out.println("DEBUG: missing = " + missing);
                } else {
                    System.out.println("DEBUG: arg.charAt(i): " + arg.charAt(i));
                    ISBNtotal += Integer.parseInt(String.valueOf(arg.charAt(i))) * count;
                    System.out.println("DEBUG: ISBNtotal: " + ISBNtotal);
                }
                count--;
            }

            if (missing != 0) {
                System.out.println("El número que falta es: " + missingNumber(missing, ISBNtotal));

            } else {
                if (ISBNtotal % 11 == 0) {
                    System.out.println("El ISBN es correcto.");
                } else {
                    System.out.println("El ISBN no es correcto.");
                }
                retry();
            }

        } catch (NumberFormatException e) {
            System.out.println("El ISBN es inválido.");
            retry();
        }

    }

    public static int missingNumber(int num, int isbnActual) {
        int missing = 0;

        for (int i = 0; i < 10; i++) {
            if ((isbnActual + (i * num)) % 11 == 0) {
                missing = i;
            }
        }
        return missing;
    }

    public static void retry(){
        System.out.println("¿Desea realizar otra operación? (s/n): ");
        String respuesta = scn.next().toLowerCase();
        scn.nextLine();
        if (respuesta.equals("s")) {
            ISBNcheck(ISBNcheck());
        } else {
            System.out.println("Hasta luego.");
        }
    }
}
