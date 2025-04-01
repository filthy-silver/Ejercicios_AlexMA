package org.unidad7.stringbuilder;

import java.util.Random;

public class Bus {
    public static final int size = 97;
    static Random random = new Random();

    public static void main(String[] args) throws InterruptedException {
        int pos1 = 0;
        int pos2 = 0;
        System.out.println("""
                  ________   ___  ___  _______  ___             \s
                 / ___/ _ | / _ \\/ _ \\/ __/ _ \\/ _ |            \s
                / /__/ __ |/ , _/ , _/ _// , _/ __ |     de     \s
                \\___/_/ |_/_/|_/_/|_/___/_/|_/_/_|_|_____________
                  / _ |/ / / /_  __/ __ \\/ _ )/ / / / __/ __/ __/
                 / __ / /_/ / / / / /_/ / _  / /_/ /\\ \\/ _/_\\ \\ \s
                /_/ |_\\____/ /_/  \\____/____/\\____/___/___/___/ \s
                                                                \s
                
                """);
        Thread.sleep(3000);
        while (pos1 < size && pos2 < size) {
            pos1 += (int) (Math.random() + (5 * Math.random()/3));
            pos2 += (int) (Math.random() + (5 * Math.random()/3));

            if (pos1 > size) {
                pos1 = size;
            }
            if (pos2 > size) {
                pos2 = size;
            }

            limpiarPantalla();
            System.out.println(autobus1(pos1));
            System.out.println(autobus2(pos2));

            Thread.sleep(70);
        }
        String winner;
        if (pos1 >= size && pos2 >= size) {
            winner = "Resulta en empate!";
        } else if (pos1 >= size) {
            winner = "\n" +
                    "   ____________  __  _____  _________  _____   __  _________ \n" +
                    "  /  _/ __/ __/ /  |/  / / / /_  __/ |/_/ _ | /  |/  / __/ / \n" +
                    " _/ // _/_\\ \\  / /|_/ / /_/ / / / _>  </ __ |/ /|_/ / _// /__\n" +
                    "/___/___/___/ /_/  /_/\\____/ /_/ /_/|_/_/ |_/_/  /_/___/____/\n" +
                    "                                                             ";
        } else {
            winner = "\n" +
                    "   ____________  _______   _  __  _   ________________  ____________\n" +
                    "  /  _/ __/ __/ / __/ _ | / |/ / | | / /  _/ ___/ __/ |/ /_  __/ __/\n" +
                    " _/ // _/_\\ \\  _\\ \\/ __ |/    /  | |/ // // /__/ _//    / / / / _/  \n" +
                    "/___/___/___/ /___/_/ |_/_/|_/   |___/___/\\___/___/_/|_/ /_/ /___/  \n" +
                    "                                                                    \n";
        }

        System.out.println("\033[32m" + "GANADOR: " + "\033[0m");
        System.out.println("\033[32m" + winner + "\033[0m");
    }

    public static String autobus1(int n1) {
        StringBuilder sb = new StringBuilder();
        sb.append("-".repeat(117)).append("\n");
        sb.append(" ".repeat(n1)).append("_______________  ").append(" ".repeat(100 - n1)).append("|\n");
        sb.append(" ".repeat(n1)).append("|__|__|__|__|__|___ ").append(" ".repeat(size - n1)).append("|\n");
        sb.append(" ".repeat(n1)).append("|   IES MUTXAMEL  |)").append(" ".repeat(size - n1)).append("|\n");
        sb.append(" ".repeat(n1)).append("|~~~@~~~~~~~~~@~~~|)").append(" ".repeat(size - n1)).append("|\n");
        sb.append("_".repeat(117));

        return sb.toString();
    }

    public static String autobus2(int n2) {
        StringBuilder sb = new StringBuilder();

        sb.append("-".repeat(117)).append("\n");
        sb.append(" ".repeat(n2)).append("_______________  ").append(" ".repeat(100 - n2)).append("|\n");
        sb.append(" ".repeat(n2)).append("|__|__|__|__|__|___ ").append(" ".repeat(size - n2)).append("|\n");
        sb.append(" ".repeat(n2)).append("| IES SAN VICENTE |)").append(" ".repeat(size - n2)).append("|\n");
        sb.append(" ".repeat(n2)).append("|~~~@~~~~~~~~~@~~~|)").append(" ".repeat(size - n2)).append("|\n");
        sb.append("_".repeat(117));

        return sb.toString();
    }

    public static void limpiarPantalla() {
        try {
            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        } catch (Exception e) {
            System.out.print("\033[H\033[2J");
            System.out.flush();
        }
    }
}