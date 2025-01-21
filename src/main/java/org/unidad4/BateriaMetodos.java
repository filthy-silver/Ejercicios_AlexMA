package org.unidad4;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Helper {
    static Scanner scn = new Scanner(System.in);
}

public class BateriaMetodos {
    public static void main(String[] args) {
        Ejercicio4.main(args);
    }
}

class Ejercicio1{

    static boolean check = true;

    public static void main(String[] args) {

        System.out.println("Introduce un número entero: ");
        do {
            try {
                int num = Helper.scn.nextInt();
                System.out.println("El cubo de " + num + " es: " + power3(num));
                check = false;
            } catch (NumberFormatException e) {
                System.out.println("Introduce un número válido.");
                Helper.scn.next();
            }
        } while (check);
    }

    public static int power3(int num) {
        return (int) Math.pow(num, 3);
    }
}

class Ejercicio2 {
    public static void main(String[] args) {
        System.out.println("MENU\n" +
                "1. Decir <Hola>\n" +
                "2. Preguntar cómo estas\n" +
                "3. Enumerar el menú de nuevo\n" +
                "4. Contar hasta el 10\n" +
                "5. Opción misteriosa\n" +
                "0. Salir\n");

        int option = -1;
        do {
            try {
                option = Helper.scn.nextInt();
                Helper.scn.nextLine();
            } catch (NumberFormatException e) {
                System.out.println("Introduce un número válido.");
                Helper.scn.next();
            }
        } while (option < 0 || option > 5);
    }

    public static void menu(int option) {
        switch (option) {
            case 1 -> System.out.println("Hola");
            case 2 -> System.out.println("¿Qué tal estás?");
            case 3 -> System.out.println("MENU\n" +
                    "1. Decir <Hola>\n" +
                    "2. Preguntar cómo estas\n" +
                    "3. Enumerar el menú de nuevo\n" +
                    "4. Contar hasta el 10\n" +
                    "5. Opción misteriosa\n" +
                    "0. Salir\n");
            case 4 -> {
                for (int n = 1; n <= 10; n++) {
                    System.out.println(n);
                }
            }
            case 5 -> System.out.println("*Se escuchan ruidos extraños*");
            case 0 -> {
                System.out.println("Saliendo...");
                return;
            }
        }
    }
}
class Ejercicio3{
    public static void main(String[] args) {
        System.out.println("Introduce una cadena de texto: ");
        String str = stringToCaps(Helper.scn.nextLine());
        System.out.println("La cadena en mayúsculas es: " + str);
        System.out.println("La cadena tiene " + countVowels(str) + " vocales.");
    }

    private static String stringToCaps(String str) {
        return str.toUpperCase();
    }

    private static int countVowels(String str) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u') {
                count++;
            }
        }
        return count;
    }

}

class Ejercicio4{
    public static void main(String[] args) {
        List<Float> aux = new ArrayList<>();
        float[] recaudacion;
        do {
            System.out.println("Introduce la recaudación: ");
             recaudacion = recaudacionSemanal(Helper.scn.nextFloat(), aux);
//            System.out.println("ULTIMO VALOR: " + recaudacion[recaudacion.length - 1]);
        } while (recaudacion[recaudacion.length - 1] != -1);

        String semana = maxRecaudacion(recaudacion) + "\t" + minRecaudacion(recaudacion);

        if (mediaRecaudacion(recaudacion) > domingoRecaudacion(recaudacion)) {
            semana += "\tSI";
        } else if (mediaRecaudacion(recaudacion) == domingoRecaudacion(recaudacion)) {
            semana += "\tEMPATE";
        } else {
            semana += "\tNO";
        }

        System.out.println(semana);

    }

    public static float[] recaudacionSemanal(float valor, List<Float> semana) {
        if (valor != -1){
            semana.add(valor);
//            System.out.println("AÑADE " + valor);
        }
        semana.add(valor);
        float[] array = new float[semana.size()];
        for (int i = 0; i < semana.size(); i++) {
            array[i] = semana.get(i);
        }
        return array;
    }

    public static float mediaRecaudacion(float[] semana) {
        float total = 0;
        for (float v : semana) {
            if (v != -1) {
                total += v;
            }
        }
        return total / semana.length - 1;
    }

    public static float maxRecaudacion(float[] semana) {
        float max = semana[0];
        for (float v : semana) {
            if (v > max) {
                max = v;
            }
        }
        return max;
    }

    public static float minRecaudacion(float[] semana) {
        float min = semana[0];
        for (float v : semana) {
            if (v < min && v != -1) {
                min = v;
            }
        }
        return min;
    }

    public static float domingoRecaudacion(float[] semana) {
        return semana[semana.length - 1];
    }
}
