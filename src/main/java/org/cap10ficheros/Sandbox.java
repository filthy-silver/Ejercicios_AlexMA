package org.cap10ficheros;

import java.io.*;
import java.util.Scanner;

public class Sandbox {

    static Scanner sc = new Scanner(System.in);

    public Sandbox() throws FileNotFoundException {
        System.out.println("Hola");
    }

    public static void main(String[] args) throws IOException {
        escribirFichero();
    }

    public static void leerFichero(String nombreFichero) {
        try (BufferedReader br = new BufferedReader(new FileReader(nombreFichero))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                System.out.println(linea);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void escribirFichero() throws IOException {
        try(BufferedWriter out = new BufferedWriter(new FileWriter("src/main/java/org/cap10ficheros/salida.txt", true))) {
            String linea = sc.nextLine();
            out.write(linea);
            out.newLine();
            out.close();
        }
    }
}
