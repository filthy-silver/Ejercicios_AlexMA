package org.unidad2;

import java.util.Random;
import java.util.Scanner;

public class UNIDAD2BateriaPreExamen {
    static Scanner scn = new Scanner(System.in);
    static Random rdn = new Random();

    public static void main(String[] args) {
        Ejercicio2();

    }

    private static void Ejercicio0(){
        int n = -1;
        boolean check = true;

        String numStr = "";

        System.out.println("Cuántos números quieres producir?");
        n=getInt();

        int aux, neg = 0, pos = 0, zero = 0;
        StringBuilder negStr = new StringBuilder("Numeros negativos:\n");
        StringBuilder posStr = new StringBuilder("Numeros positivos:\n");

        for (int i = 0; i < n; i++) {


            aux = rdn.nextInt(19) - 9;

            if (aux < 0) {
                negStr.append(aux).append(" ");
                neg++;
            } else if (aux > 0) {
                posStr.append(aux).append(" ");
                pos++;
            } else {
                zero++;
            }

        }
            String zeroStr = "Se han producido " + zero + " ceros.";

            numStr = "Se han generado los siguientes números: "
                    + neg + " negativos y " + pos + " positivos .\n"
                    + negStr + "\n"
                    + posStr + "\n"
                    + zeroStr;

        System.out.println(numStr);
    }

    private static void Ejercicio2(){
        int n = -1, m = -1;

        System.out.println("mundial\nRONALDINHO POTENCIATOR 64'\n ~hahaha~\n" +
                "=====\n" +
                "Introduce la base:");
        n = getInt();

        System.out.println("Introduce el exponente:");
        m = getPosInt();
        int total = n;

        for (int i = 1; i < m; i++) {
            total *= n;
            System.out.println(n);
        }

        System.out.println("El resultado es: " + total);
    }

    private static void Ejercicio3(){

    }

    private static int getPosInt() {
        boolean check = true;
        int m = -1;
        do {
            if (scn.hasNextInt()) {
                m = scn.nextInt();
                scn.nextLine();
                if (m < 1) {
                    System.out.println("Introduce un número entero positivo.");
                    continue;
                }
                check = false;
            } else {
                System.out.println("Introduce un número entero.");
            }
        } while (check);
        return m;
    }
    private static int getInt() {
        boolean check = true;
        int m = -1;
        do {
            if (scn.hasNextInt()) {
                m = scn.nextInt();
                scn.nextLine();
                check = false;
            } else {
                System.out.println("Introduce un número entero.");
            }
        } while (check);
        return m;
    }
}