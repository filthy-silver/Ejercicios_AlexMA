package org.example;

import java.time.LocalDate;
import java.util.Scanner;

public class UNIDAD2Actividad1 {
    static Scanner scn = new Scanner(System.in);
    static LocalDate fecha = LocalDate.now();

    public static void main(String[] args) {
        System.out.println("""
                               )     (                  (       )     )                  )  (    \s
                 (          ( /(     )\\ )   (      *   ))\\ ) ( /(  ( /(  (      *   ) ( /(  )\\ ) \s
                 )\\ )   (   )\\())(  (()/(   )\\   ` )  /(()/( )\\()) )\\()) )\\   ` )  /( )\\())(()/( \s
                (()/(   )\\ ((_)\\ )\\  /(_)|(((_)(  ( )(_))(_)|(_)\\ ((_)((((_)(  ( )(_)|(_)\\  /(_))\s
                 /(_))_((_) _((_|(_)(_))  )\\ _ )\\(_(_()|_))   ((_) _((_)\\ _ )\\(_(_())  ((_)(_))  \s
                (_)) __| __| \\| | __| _ \\ (_)_\\(_)_   _|_ _| / _ \\| \\| (_)_\\(_)_   _| / _ \\| _ \\ \s
                  | (_ | _|| .` | _||   /  / _ \\   | |  | | | (_) | .` |/ _ \\   | |  | (_) |   / \s
                   \\___|___|_|\\_|___|_|_\\ /_/ \\_\\  |_| |___| \\___/|_|\\_/_/ \\_\\  |_|   \\___/|_|_\\ \s
                                                                                                 \s
                
                """);
        System.out.println("Qué método quieres usar?\n" +
                " ► METODO: Nacimiento → [1]\n" +
                " ► METODO: Edad → [2]\n");
        int metodo = -1;
        do{
            try {
                metodo = scn.nextInt();
                scn.nextLine();
            } catch (NumberFormatException e) {
                System.out.println("Introduce un número válido.\n");
            }
        }
        while (metodo != 1 && metodo != 2);


        switch (metodo) {
            case 1 -> Generacion(Nacimiento());
            case 2 -> Generacion(Edad());
        }
    }

    public static int Nacimiento() {
        String nacimiento;
        int ano_nacimiento = 0;
        do {
            System.out.println("Introduce tu año de nacimiento: ");
            nacimiento = scn.nextLine();

            try {
                ano_nacimiento = Integer.parseInt(nacimiento);
            } catch (NumberFormatException e) {
                System.out.println("Introduce un año válido.\n");
                Nacimiento();
            }
        } while (ano_nacimiento < 1900 || ano_nacimiento > fecha.getYear());
        return ano_nacimiento;
    }

    public static int Edad(){
        int edad = 0;
        int ano_nacimiento = 0;
        do {
            System.out.println("Introduce tu edad: ");
            if (scn.hasNextInt()){
                edad = scn.nextInt();
                scn.nextLine();
            } else {
                System.out.println("Introduce un número válido.\n");
                scn.nextLine();
                Edad();
            }

//            try {
//                edad = scn.nextInt();
//                scn.nextLine();
//                System.out.println("DEBUG → Edad: " + edad);
//            } catch (NumberFormatException e) {
//                System.out.println("Introduce un año válido.\n");
//                Edad();
//            }

            ano_nacimiento = fecha.getYear() - edad;
            System.out.println("DEBUG → Año de nacimiento: " + ano_nacimiento);
        } while (ano_nacimiento < 1900 || ano_nacimiento > fecha.getYear());
        return ano_nacimiento;
    }

    public static void Generacion(int arg){
        if (1900 <= arg && arg <=  1927){
            System.out.println("Sin Generación bautizada");
        } else if (1928 <= arg && arg <= 1944){
            System.out.println("Generación Silent");
        } else if (1945 <= arg && arg <= 1964){
            System.out.println("Generación Baby Boomers");
        } else if (1965 <= arg && arg <= 1981){
            System.out.println("Generación X");
        } else if (1980 <= arg && arg <= 1994){
            System.out.println("Generación Y (Millennials)");
        } else if (1995<= arg) {
            System.out.println("Generación Z (Centennials)");
        }
    }
}
