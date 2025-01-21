package org.unidad2;

import java.util.Scanner;

public class UNIDAD2Practica3 {
    static Scanner scn = new Scanner(System.in);

    public static void main(String[] args) {
    ISBNcheck(ISBNcheck());
    }

    public static String ISBNcheck() {
        String isbn;
        boolean check = true;
        do {
            System.out.println("Introduce el ISBN: ");
            isbn = scn.nextLine();

            if (isbn.length() != 10) {
                System.out.println("El ISBN debe tener 10 dígitos.");

            } else if (ISBNmissCheck(isbn) > 1) {
                System.out.println("Solo puede faltar un número.");

            } else
                check = false;
        }
        while (check);

        return isbn;
    }

    public static void ISBNcheck(String arg) {
        arg = arg.toUpperCase();
        int ISBNtotal = 0;
        int missing = 0;
        int count = 10;

            for (int i = 0; i < arg.length(); i++) {

                if (arg.charAt(i) == '?') {
                    missing = count;
                } else if (arg.charAt(i) == 'X' && i == arg.length()-1) {
                    ISBNtotal += 10;
                } else {
                    try {
                        ISBNtotal += Integer.parseInt(String.valueOf(arg.charAt(i))) * count;

                    }
                    catch (NumberFormatException e) {
                        System.out.println("Hay caracteres no válidos.");
                        break;
                    }
                }
                count--;
            }
            if (ISBNtotal == 0){
                System.out.println("El ISBN no es correcto.");
                retry();
            } else if (missing != 0) {
                System.out.println("El número que falta es: " + missingNumber(missing, ISBNtotal));
                retry();
            } else {
                if (ISBNtotal % 11 == 0) {
                    System.out.println("El ISBN es correcto.");
                    retry();
                } else {
                    System.out.println("El ISBN no es correcto.");
                    retry();
                }
            }
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

    public static String missingNumber(int pos, int ISBNSumatorio) {
        String missing = "X";

        for (int i = 0; i < 10; i++) {
            if ((ISBNSumatorio + (i * pos)) % 11 == 0) {
                missing = i + "";
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
