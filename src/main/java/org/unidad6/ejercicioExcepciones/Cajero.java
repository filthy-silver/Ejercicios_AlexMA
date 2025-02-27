package org.unidad6.ejercicioExcepciones;

import java.util.Scanner;

public class Cajero {

    static Scanner sc = new Scanner(System.in);
    static String option;

    public static void main(String[] args) {

        CuentaBancaria cuenta = new CuentaBancaria(1000);
        menu(cuenta);

    }

    private static void menu(CuentaBancaria cuenta) {
        System.out.println("=== Cajero Automático ===\n");
        System.out.println("\t[1] Consultar saldo");
        System.out.println("\t[2] Depositar");
        System.out.println("\t[3] Retirar");
        System.out.println("\t[X] Salir");
        System.out.print("\n\tSeleccione una opción: ");
        switch(sc.nextLine()) {
            case "1" -> {
                System.out.println("\nSaldo actual: " + cuenta.getSaldo());
                menu(cuenta);
            }
            case "2" -> {
                System.out.print("\nIngrese la cantidad a depositar: ");
                cuenta.depositar(Integer.parseInt(sc.nextLine()));
                System.out.println("Saldo actual: " + cuenta.getSaldo());
                menu(cuenta);
            }
            case "3" -> {
                System.out.print("\nIngrese la cantidad a retirar: ");
                cuenta.retirar(Integer.parseInt(sc.nextLine()));
                System.out.println("Saldo actual: " + cuenta.getSaldo());
                menu(cuenta);
            }
            case "X" -> {
                System.out.println("Gracias por usar el cajero automático");
            }
        }
    }
}
