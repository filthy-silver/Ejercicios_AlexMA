package org.unidad2;

import java.util.Scanner;

public class UNIDAD2 {
    static Scanner sc = new Scanner(System.in);
    public static void Ejercicio1 (){
        System.out.println("Introduce tu fecha de nacimiento (dd/aa/aaaa):");
        String nacimiento = sc.nextLine();


        boolean valid = false;
        do {
            if (nacimiento.length() != 10) {
                System.out.println("Introduce un formato válido\n====\n");
                Ejercicio1();
            } else {
                boolean check = false;
                if (!check) {
                    isNumeric(nacimiento, 0);
                }
                if (!check) {
                    check = isNumeric(nacimiento, 1);
                }
                if (!check){
                    check = isSymbol(nacimiento, 2);
                }
                if (!check) {
                    check = isNumeric(nacimiento, 3);
                }
                if (!check) {
                    check = isNumeric(nacimiento, 4);
                }
                if (!check){
                    check = isSymbol(nacimiento, 5);
                }
                if (!check) {
                    check = isNumeric(nacimiento, 6);
                }
                if (!check) {
                    check = isNumeric(nacimiento, 7);
                }
                if (!check) {
                    check = isNumeric(nacimiento, 8);
                }

                if (!check) {
                    check = isNumeric(nacimiento, 9);
                }
                if (!check) {
                    System.out.println("Introduce un formato valido");
                    nacimiento = sc.nextLine();
                } else{
                    valid = true;
                }
            }
        } while (!valid);


        int numerology;
        do {
            int num1, num2, num3, num4, num5, num6;
            num1 = isNumeric(nacimiento, 0, 2);
            if (num1 == -1){
                valid = false;
            }
            num2 = isNumeric(nacimiento, 3, 2);
            if (num2 == -1){
                valid = false;
            }
            num3 = isNumeric(nacimiento, 6, 1);
            if (num3 == -1){
                valid = false;
            }
            num4 = isNumeric(nacimiento, 7, 1);
            if (num4 == -1){
                valid = false;
            }
            num5 = isNumeric(nacimiento, 8, 1);
            if (num5 == -1){
                valid = false;
            }
            num6 = isNumeric(nacimiento, 9, 1);
            if (num6 == -1){
                valid = false;
            }
            numerology = num1 + num2 + num3 + num4 + num5 + num6;
            if (!valid){
                System.out.println("Introduce un valor numérico válido\n====\n");
                Ejercicio1();
            }

        } while (!valid);

        System.out.println("Tu número de la suerte es: " + numerology);



    }

    private static boolean isNumeric(String str, int pos) {
        boolean valid = true;

        try {
            Integer.parseInt(str.substring(pos,pos+1));
        } catch (NumberFormatException e) {
            valid = false;
        }
        return valid;
    }
    private static int isNumeric(String str, int pos, int a) {
        boolean valid = true;
        int num = 0;

        try {
            num = Integer.parseInt(str.substring(pos,pos+a));
        } catch (NumberFormatException e) {
            valid = false;
        }

        if (num<=0){
            return -1;
        }

        valid = num > 0;
        return isNumeric(str, pos, a,valid);
    }
    private static int isNumeric(String str, int pos, int a, boolean check) {
        try {
            Integer.parseInt(str.substring(pos,pos+a));
        }
        catch (NumberFormatException e) {
            System.out.println("Introduce un valor numérico\n====\n");
            Ejercicio1();
        }
        return Integer.parseInt(str.substring(pos,pos+a));
    }

    private static boolean isSymbol(String str, int pos) {
        return str.charAt(pos) == '-'|| str.charAt(pos) == '/' || str.charAt(pos) == '.' || str.charAt(pos) == ' ';
    }
}