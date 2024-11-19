package org.example;

import java.util.Arrays;
import java.util.Random;

public class Testing {

    static Random rdn = new Random();

    private static int[] boleto = new int[7];


    public static void main(String[] args) {
        System.out.println(
                "██╗      █████╗     ██████╗ ██████╗ ██╗███╗   ███╗██╗████████╗██╗██╗   ██╗ █████╗ \n" +
                "██║     ██╔══██╗    ██╔══██╗██╔══██╗██║████╗ ████║██║╚══██╔══╝██║██║   ██║██╔══██╗\n" +
                "██║     ███████║    ██████╔╝██████╔╝██║██╔████╔██║██║   ██║   ██║██║   ██║███████║\n" +
                "██║     ██╔══██║    ██╔═══╝ ██╔══██╗██║██║╚██╔╝██║██║   ██║   ██║╚██╗ ██╔╝██╔══██║\n" +
                "███████╗██║  ██║    ██║     ██║  ██║██║██║ ╚═╝ ██║██║   ██║   ██║ ╚████╔╝ ██║  ██║\n" +
                "╚══════╝╚═╝  ╚═╝    ╚═╝     ╚═╝  ╚═╝╚═╝╚═╝     ╚═╝╚═╝   ╚═╝   ╚═╝  ╚═══╝  ╚═╝  ╚═╝\n" +
                "                                                                                  \n" +
                "\n");

        if(validadarBoleto("1-20-3-4-5-6/2")){
            System.out.println("Boleto: " + Arrays.toString(boleto));
            sorteoComplementario(sorteo());
        } else {
            System.out.println("Boleto falsificado");
        };


    }

    private static boolean validadarBoleto(String arg) {

        boolean check = true;
        String [] aux = new String[7];
        int [] boletoAux = new int[7];

        arg = arg.trim();
        System.out.println(Arrays.toString(arg.split("-")));

        if (arg.matches("\\d{1,2}-\\d{1,2}-\\d{1,2}-\\d{1,2}-\\d{1,2}-\\d{1,2}/\\d{1,2}"))
         {
             aux = arg.split("[-/]");

             for (int i = 0; i < aux.length; i++) {
                 boletoAux[i] = Integer.parseInt(aux[i]);
             }

             for (int i = 0; i < boletoAux.length; i++) {
                 if (i != boletoAux.length-1) {
                     if (boletoAux[i] < 1 || boletoAux[i] > 49) {
                         check = false;
                         System.out.println("Error: valores incorrectos [0a]");
                         break;
                     }
                 } else {
                     if (boletoAux[i] < 0 || boletoAux[i] > 10) {
                         check = false;
                         System.out.println("Error: valores incorrectos [1a]");
                         break;
                     }
                 }
             }

         } else {
            System.out.println("Error: valores incorrectos [0]");
            return false;
        }
        if (check) {
            boleto = boletoAux;
            return true;
        } else {
            System.out.println("Error: valores incorrectos [1]");
            return false;
        }
    }
    private static int[] sorteo() {
        int [] sorteo = new int[6];
        for (int i = 0; i < sorteo.length; i++) {
            sorteo[i] = rdn.nextInt(49) + 1;
        }
        System.out.println("DEBUG: SORTEO PRE-ROLL"+Arrays.toString(sorteo));

        for (int i = 1; i < sorteo.length; i++) {
            if (sorteo[i] == sorteo[i-1]) {
                sorteo[i] = rdn.nextInt(49) + 1;
            }
        }
        System.out.println("DEBUG: SORTEO POST-ROLL" + Arrays.toString(sorteo));
        return sorteo;
    }
    private static int[] sorteoComplementario(int[] arg) {
        int [] sorteo = Arrays.copyOf(arg, arg.length + 1);
        int complementario;

        do {
            complementario = rdn.nextInt(49) + 1;

        } while (Arrays.asList(arg).contains(complementario));

        sorteo[sorteo.length-1] = complementario;

        System.out.println("DEBUG: SORTEO NUEROS" + Arrays.toString(sorteo) +
                "\nDEBUG: SORTEO COMPLEMENTARIO = " + sorteo[sorteo.length-1]);

        return sorteo;
    }
}


