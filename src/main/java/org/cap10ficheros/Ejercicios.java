package org.cap10ficheros;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Ejercicios {
    public static void main(String[] args) {

    }

    private static void Ejercicio2() throws IOException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Escriba su nombre:");
        String nombre = sc.nextLine();
        System.out.println("Escriba su edad:");
        String edad = sc.nextLine();

        try{
            BufferedWriter out = new BufferedWriter(new FileWriter("src/main/resources/EJ10_2-Datos.txt"));
            out.write("Nombre: " + nombre);
            out.newLine();
            out.write("Edad: " + edad);
            out.newLine();

            out.close();

        } catch (IOException e) {
            System.out.println("El fichero no se puede abrir");
        }
    }

    private static void Ejercicio3() throws IOException {}
}
