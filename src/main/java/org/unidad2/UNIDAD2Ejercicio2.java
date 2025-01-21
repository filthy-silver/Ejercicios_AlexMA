package org.unidad2;

import java.util.Scanner;

public class UNIDAD2Ejercicio2 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        String fecha;
        boolean valid = false;

        int n1 = 0;
        int n2 = 0;
        int n3 = 0;

        do {fecha = nacimiento();
            boolean check = false;

            check = dataCheck(fecha);

            if (check){
                n1 = Integer.parseInt(fecha.substring(0, 2));
                n2 = Integer.parseInt(fecha.substring(3, 5));
                n3 = Integer.parseInt(fecha.substring(6, 10));

                if (n1 < 1 || n1 > 31){
                    System.out.println("ERROR: Día fuera de rango.\n=====");
                } else if (n2 < 1 || n2 > 12){
                    System.out.println("ERROR: Mes fuera de rango.\n=====");
                } else if (n3 < 1900 || n3 > 2024){
                    System.out.println("ERROR: Año fuera de rango.\n=====");
                } else {
                    valid = true;
                }
            }

        } while (!valid);



        Integer intAux = n1+n2+n3;

        String aux = intAux.toString();

        int n31 = Integer.parseInt(aux.substring(0, 1));
        int n32 = Integer.parseInt(aux.substring(1, 2));
        int n33 = Integer.parseInt(aux.substring(2, 3));
        int n34 = Integer.parseInt(aux.substring(3, 4));

        System.out.println(n1 + "+" + n2 + "+" + n3 + " = " + (n1+n2+n3) +
                "\n" + n31 + "+" + n32 + "+" + n33 + "+" + n34 + " = " + (n31+n32+n33+n34) +
                "\nTu número de la suerte es: " + (n31+n32+n33+n34));
    }
    public static String nacimiento(){
        System.out.println("Introduce tu fecha de nacimiento (dd/aa/aaaa):");
        String fecha = sc.nextLine();
        if (fecha.length() != 10){
            System.out.println("ERROR: Formato de fecha incorrecto. [0]\n=====");
            sc.nextLine();
            nacimiento();
        }
        return fecha;


//        String fecha;
//        do{
//            System.out.println("Introduce tu fecha de nacimiento (dd/aa/aaaa):");
//            fecha = sc.nextLine();
//            if (fecha.length() != 10) {
//            System.out.println("ERROR: Formato de fecha incorrecto. [0]\n=====");
//            }
//        } while (fecha.length() != 10);
//        return fecha;
    }

    public static boolean dataCheck(String fecha) {
        boolean check = false;
        int error = 0;
        do {
            if (charCheck(fecha.charAt(0)) != 0) {
                error = 1;
                check = true;
            }
            if (!check) {
                if(charCheck(fecha.charAt(1)) != 0) {
                    error = 1;
                    check = true;
                }
            }
            if (!check) {
                if(charCheck(fecha.charAt(2)) != 2) {
                    error = 2;
                    check = true;
                }
            }
            if (!check) {
                if(charCheck(fecha.charAt(3)) != 0) {
                    error = 1;
                    check = true;
                }
            }
            if (!check) {
                if(charCheck(fecha.charAt(4)) != 0) {
                    error = 1;
                    check = true;
                }
            }
            if (!check) {
                if(charCheck(fecha.charAt(5)) != 2) {
                    error = 2;
                    check = true;
                }
            }
            if (!check) {
                if(charCheck(fecha.charAt(6)) != 0) {
                    error = 1;
                    check = true;
                }
            }
            if (!check) {
                if(charCheck(fecha.charAt(7)) != 0) {
                    error = 1;
                    check = true;
                }
            }
            if (!check) {
                if(charCheck(fecha.charAt(8)) != 0) {
                    error = 1;
                    check = true;
                }
            }
            if (!check) {
                if(charCheck(fecha.charAt(9)) != 0) {
                    error = 1;
                    check = true;
                }
            }
            check = true;

        } while (!check);

        if (error == 1) {
            System.out.println("ERROR: Valor numérico incorrecto. [dC" + error + " ]\n=====");
            check = false;
        }
        if (error == 2) {
            System.out.println("ERROR: Separador de fecha incorrecto. [dC" + error + "]\n=====");
            check = false;
        }
//        if (error == 0) {
//            System.out.println("VALIDO: Formato de fecha correcto. [dC" + error + "]\n=====");
//        }

        return check;
    }

    private static int charCheck (char text){
    // Vamos a recorrer los chars del texto introducido para comprobar qué tipo de char son:
    // [indice][-1] = No válido
    // [indice][0]  = Número
    // [indice][1]  = Letra
    //  [indice][2] = Separador válido
    int value = -1;

        System.out.println("DEBUG → Char: " + text);

    if (Character.isDigit(text)){

        value = 0;
        System.out.println("DEBUG → Número: " + value);
    } else if (Character.isLetter(text)){
        value = 1;
        System.out.println("DEBUG → Letra: " + value);
    } else if (text == '/' || text == '-' || text == '.' || text == ' '){
        value = 2;
        System.out.println("DEBUG → Separador: " + value);
    }

    return value;
    }
}
