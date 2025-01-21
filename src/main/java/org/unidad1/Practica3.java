package org.unidad1;
import java.util.Locale;
import java.util.Scanner;

public class Practica3 {
    static final Scanner scn = new Scanner(System.in).useLocale(Locale.US);

    public static void votamatic3000(){
        System.out.println("""
                 __   __  _______  _______  _______  __   __  _______  _______  ___   _______  _______  _______  _______  _______\s
                |  | |  ||       ||       ||   _   ||  |_|  ||   _   ||       ||   | |       ||       ||  _    ||  _    ||  _    |
                |  |_|  ||   _   ||_     _||  |_|  ||       ||  |_|  ||_     _||   | |       ||___    || | |   || | |   || | |   |
                |       ||  | |  |  |   |  |       ||       ||       |  |   |  |   | |       | ___|   || | |   || | |   || | |   |
                |       ||  |_|  |  |   |  |       ||       ||       |  |   |  |   | |      _||___    || |_|   || |_|   || |_|   |
                 |     | |       |  |   |  |   _   || ||_|| ||   _   |  |   |  |   | |     |_  ___|   ||       ||       ||       |
                  |___|  |_______|  |___|  |__| |__||_|   |_||__| |__|  |___|  |___| |_______||_______||_______||_______||_______|""");
        System.out.println("¿Cómo te llamas?");
        String name = scn.nextLine();
        System.out.println("Hola " + name + ". ¿Qué edad tienes?");
        int age = Helper.getTPInt();
        if (age >= 18){
            System.out.println("Enhorabuena" + name + " puedes votar.");
        } else if (age <= 0){
            System.out.println("ERROR: Edad no válida");
        } else {
            System.out.println("Lo siento " + name + ", eres menor de edad.\nTe faltan " + (18 - age) + " años para ser mayor de edad.");
        }
    }

    public static void main(Object o) {

    }
}
