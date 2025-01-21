package org.unidad1;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class Helper {
    static Scanner scn = new Scanner(System.in).useLocale(Locale.US);

    public static void selecUnidad(int arg) {
        switch (arg) {
            case 1:
                Main.tit();
                Main.unit1();
                returnToMain();
                break;
            case 2:
                Main.tit();
                Main.unit2();
                returnToMain();
                break;

            case 3:
                Main.tit();
                Main.unit3();
                returnToMain();
                break;

            default:
                System.out.println("UNIDAD no encontrada.");
                returnToMain();
                break;
        }
    }

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

    public static void  posneg(){
        int num1 = getTPInt();

        if ((num1 >= 2 && num1 <= 10) || (num1 <= -2 && num1 >= -10)){
            System.out.println("OK");
        }
    }

    public static int ejerNum(){
        Integer ejerNum = null;

        try {
            ejerNum = getTPInt();
        }
        catch (NumberFormatException | InputMismatchException e) {

            System.out.println("Introduce un número válido.\n");
            scn.nextLine();
        }
        return ejerNum;
    }

    public static int countWords(String text, String word) {
        int count = 0;
        for (int i = 0; i < text.length(); i++) {
            {
                for (int j = 0; j <= word.length() && (text.charAt(i) == word.charAt(j)); j++) {
                    if (j == word.length()-1) {
                        count++;
                    }
                }
            }
        }
        return count;
    }
}
