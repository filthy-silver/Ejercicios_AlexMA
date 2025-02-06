package org.unidad4.Practica1;

import java.io.IOException;
import java.util.Scanner;

/**
 * Helper class to console usage and read user input.
 * @version 1.0
 * @author filthy.silver
 */
public class Helper {
    public static Scanner sc = new Scanner(System.in);

    /**
     * Reads an integer from the user input.
     * @return the integer input by the user
     */
    public static int getUserInt(){
        if(sc.hasNextInt()){
            return sc.nextInt();
        } else {
            sc.nextLine();
            return getUserInt();
        }
    }

    /**
     * Reads an integer from the user input with a prompt message.
     * @param message the message to prompt the user
     * @return the integer input by the user
     */
    public static int getUserInt(String message){
        if(sc.hasNextInt()){
            return sc.nextInt();
        } else {
            System.out.println(message);
            sc.nextLine();
            return getUserInt(message);
        }
    }

    /**
     * Reads a positive integer from the user input with a prompt message.
     * @param message the message to prompt the user
     * @return the positive integer input by the user
     */
    public static int getUserPosInt(String message){
        if(sc.hasNextInt()){
            int value = sc.nextInt();
            if(value > 0){
                return value;
            }
        }
        System.out.println(message);
        sc.nextLine();
        return getUserInt(message);
    }

    /**
     * Clears the console screen.
     * @throws IOException if an I/O error occurs
     * @throws InterruptedException if the current thread is interrupted
     */
    public static void clear() throws IOException, InterruptedException {
        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
    }
}