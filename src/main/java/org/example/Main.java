package org.example;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    static Scanner scn = new Scanner(System.in).useLocale(Locale.US);
    public static void main(String[] args) {
        System.out.println("¿Cómo te llamas?:");
        String name = scn.nextLine();
        System.out.println("¿A qué curso vas?:");
        String course = scn.nextLine();
        System.out.println("Hola " + name + " bienvenido a " + course);
        System.out.println("Introduce un número: ");
        int num1 = scn.nextInt();
        System.out.println("Introduce otro número: ");
        int num2 = scn.nextInt();
        System.out.println("El resultado de sumar los dos números es: " + (num2 + num1));
    }
}