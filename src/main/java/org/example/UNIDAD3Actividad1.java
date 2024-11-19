package org.example;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class UNIDAD3Actividad1
{
    static Scanner scn = new Scanner(System.in);
    static Random rng = new Random();


    private static final String[] COLOR = {"rojo","negro"};
    private static final String[] EVENODD = {"par", "impar"};
    private static final Integer[] NUMS = new Integer[37];

    public static void main(String[] args)
    {
        int player = -1;
        String color, evenOdd;
        boolean check;

        System.out.println(
                "Ruletator 6699" +
                "========" +
                "Introduce un número del 0 - 36");

        if(scn.hasNextInt()) {
            if (scn.nextInt() <= 36 && scn.nextInt() > 0){
                player = scn.nextInt();
                scn.nextLine();
            }
        } else {
            return;
        }

        if (player != 0){

            System.out.println("Introduce un color");
            String aux = scn.nextLine().toLowerCase();

            if (Arrays.asList(COLOR).contains(aux)){
                color = aux;
            } else {
                System.out.println("ERROR: Color no válido");
                return;
            }

            System.out.println("Introduce PAR o IMPAR");
            aux = scn.nextLine().toLowerCase();

            if (Arrays.asList(EVENODD).contains(aux)){
                evenOdd = aux;
            } else {
                System.out.println("ERROR: Argumento no válido");
                return;
            }
        }

        int rouletteNum = rng.nextInt(36) + 1;

    }
}
