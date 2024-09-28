package org.example;

import java.util.Locale;
import java.util.Scanner;

public class Helper {
    static Scanner scn = new Scanner(System.in).useLocale(Locale.US);

    public static int getTPInt() {
        int result = 0;
        boolean valid = false;
        do {
            try {
                String value = scn.nextLine();
                result = Integer.parseInt(value);
                valid = true;

            } catch (NumberFormatException e) {
                System.out.println("Introduce un número válido.");
            }
        } while (!valid);

        return result;
    }
    public static boolean preguntaSN(){
        boolean valid = false;
        boolean result = false;
        do {
            String value = scn.nextLine();
            if (value.equalsIgnoreCase("s")) {
                result = true;
                valid = true;
            } else if (value.equalsIgnoreCase("n")) {
                result = false;
                valid = true;
            } else {
                System.out.println("Introduce S o N");
            }
        } while (!valid);
        return result;
    }
    public static Integer smallerInteger(int num1, int num2) {
        if (num1 == num2) {
            return null;
        } else {
            if (num1 > num2) {
                return num2;
            } else {
                return num1;
            }
        }
    }
    public static void returnToMain() {
        System.out.println("\n----\n¿Quieres volver al menú principal? (S/N)");
        if (Helper.preguntaSN()) {
            Main.main(null);
        } else {
            System.out.println("Hasta luego!");
        }
    }
}
