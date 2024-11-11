package org.example;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class UNIDAD3BateriaVectores {
    static Scanner scn = new Scanner(System.in);
    static Random rdn = new Random();

    public static void main(String[] args) {
        Ejercicio10 ();
    }

    public static void Ejercicio1(){
        int [] vector = new int[8];

        for (int i = 0; i < vector.length; i++) {
            vector[i] = rdn.nextInt(500);
        }
        System.out.println("La suma de los vectores es: " + Arrays.stream(vector).sum());
    }

    public static void Ejercicio2() {
        int[] vector = new int[10];

        for (int i = 0; i < vector.length; i++) {
            vector[i] = rdn.nextInt(500);
        }
        System.out.println("El vector original es: " + Arrays.toString(vector));

        int[] vectorInvertido = new int[10];
        for (int i = 0; i < vector.length; i++) {
            vectorInvertido[i] = vector[vector.length - 1 - i];
        }
        System.out.println("El vector invertido es: " + Arrays.toString(vectorInvertido));
    }

    public static void Ejercicio22(){
        int [] vector = new int[10];
        for (int i = 0; i < vector.length; i++) {
            vector[i] = rdn.nextInt(500);
        }

        System.out.println("El vector original es: " + Arrays.toString(vector));

        for (int i = 0; i < (vector.length/2); i++) {
            int aux = vector [i];
            vector[i] = vector [vector.length -1 -i];
            vector[vector.length -1 -i] = aux;
        }

        System.out.println("El vector invertido es: " + Arrays.toString(vector));
    }


    public static void Ejercicio3(){
        int num = 0;
        boolean check = false;

        do {
            System.out.println("Introduce un número de muestras: ");
            if (scn.hasNextInt()) {
                num = scn.nextInt();
                scn.nextLine();
                check = true;
            } else {
                System.out.println("No has introducido un número válido.");
            }
        } while (!check);

        int [] vector = new int[num];

        for (int i = 0; i < vector.length; i++) {
            vector[i] = rdn.nextInt(100)+1;
        }

        System.out.println("Introduce un número a buscar: ");
        if (scn.hasNextInt()){
            num = scn.nextInt();
            scn.nextLine();
            int count = 0;

            for (int i = 0; i < vector.length; i++) {
                if (vector[i] == num){
                    count++;
                }
            }
            System.out.println("El número " + num + " aparece " + count + " veces en el vector.");
        } else {
            System.out.println("No has introducido un número válido.");
        }
    }

    public static void Ejercicio4(){
        int [] vector = new int[10];
        int num = 0;
        boolean check = false;

        for (int i = 0; i < vector.length; i++) {
            vector[i] = rdn.nextInt(100)+1;
        }
        System.out.println("El vector original es: " + Arrays.toString(vector));

        do {
            System.out.println("Introduce la posición a eliminar: ");
            if (scn.hasNextInt()) {
                num = scn.nextInt() - 1;
                scn.nextLine();
                if (num < 0 || num > vector.length) {
                    System.out.println("No has introducido un número válido.");
                } else {
                    check = true;
                }
            }
        } while (!check);

        int [] vectorNuevo = new int[vector.length-1];
        int e = 0;
        for (int i = 0; i < vectorNuevo.length+1; i++) {
            if (i != num) {
                vectorNuevo[e] = vector[i];
//                    System.out.println("DEBUG: POS [" + e + "] VALUE [" + vectorNuevo[e] + "]");
                e++;
            }
        }
        System.out.println("El vector resultante es: " + Arrays.toString(vectorNuevo));

    }

    public static void Ejercicio5(){
        int [] vector = new int[5];

        for (int i = 0; i < vector.length; i++) {
            vector[i] = rdn.nextInt(100)+1;
        }
        System.out.println("El vector original es: " + Arrays.toString(vector));

        int aux = vector[vector.length-1];

        for (int i = 0; i < vector.length-1; i++) {
            vector[vector.length-1-i] = vector[vector.length-2-i];
        }
        vector[0] = aux;

        System.out.println("El vector rotado es: " + Arrays.toString(vector));
    }

    public static void Ejercicio6() {
        System.out.println("Introduce el tamaño del vector: ");
        int n = 0;
        if (scn.hasNextInt()) {
            n = scn.nextInt();
            scn.nextLine();

        } else {
            System.out.println("No has introducido un número válido.");
            System.exit(1);
        }

        int[] vector = new int[n];

        System.out.println("Introduce los valores del vector: ");
        for (int i = 0; i < vector.length; i++) {
            System.out.println("Introduce el valor " + (i+1) + ": ");
            if (scn.hasNextInt()) {
                vector[i] = scn.nextInt();
                scn.nextLine();
            }
        }
        String aux = "El vector es simétrico.";
        var check = true;
        for (int i = 0; i < vector.length; i++) {
            if (vector[i] !=  vector[vector.length - i - 1]) {
                check = false;
                aux = "El vector no es simétrico.";

            } else if (i == vector.length - 1) {
                check = false;
            }
        }
        System.out.println(aux);
    }

    public static void Ejercicio7(){
        System.out.println("Introduce el tamaño del primer vector: ");

        int n = 0;
        if (scn.hasNextInt()) {
            n = scn.nextInt();
            scn.nextLine();

        } else {
            System.out.println("No has introducido un número válido.");
            System.exit(1);
        }

        int[] vector1 = new int[n];

        for (int i = 0; i < vector1.length; i++) {
            vector1[i] = rdn.nextInt(500);
        }

        System.out.println("El primer vector es: " + Arrays.toString(vector1).replace("[", "").replace("]", ""));


        System.out.println("Introduce el tamaño del segundo vector: ");
        if (scn.hasNextInt()) {
            n = scn.nextInt();
            scn.nextLine();

        } else {
            System.out.println("No has introducido un número válido.");
            System.exit(1);
        }

        int[] vector2 = new int[n];

        for (int i = 0; i < vector2.length; i++) {
            vector2[i] = rdn.nextInt(500);
        }
        System.out.println("El segundo vector es: " + Arrays.toString(vector2).replace("[", "").replace("]", ""));


        int[] vector3 = new int[vector1.length + vector2.length];

        System.arraycopy(vector1, 0, vector3, 0, vector1.length);
        System.arraycopy(vector2, 0, vector3, vector1.length, vector2.length);

        System.out.println("\n----\nEl vector resultante es: " + Arrays.toString(vector3).replace("[", "").replace("]", ""));
    }

    public static void Ejercicio8() {
        System.out.println("Introduce el tamaño del primer vector: ");

        int n = 0;
        if (scn.hasNextInt()) {
            n = scn.nextInt();
            scn.nextLine();

        } else {
            System.out.println("No has introducido un número válido.");
            System.exit(1);
        }

        int[] vector = new int[n];

        for (int i = 0; i < vector.length; i++) {
            vector[i] = rdn.nextInt(500);
        }

        System.out.println("El primer vector es: " + Arrays.toString(vector).replace("[", "").replace("]", ""));
        System.out.println("En qué posición quieres insertar el nuevo valor: ");

        if (scn.hasNextInt()) {
            n = scn.nextInt();
            scn.nextLine();

        } else if (scn.nextInt() > vector.length) {
            System.out.println("No has introducido un número comprendido en el vector.");
            System.exit(1);

        } else {
            System.out.println("No has introducido un número válido.");
            System.exit(1);
        }
        int [] vectorNuevo = new int[vector.length+1];
        vectorNuevo = Arrays.copyOf(vector, vector.length + 1);
        System.arraycopy(vector, 0, vectorNuevo, 0, n-1);
//        System.out.println("DEBUG: " + Arrays.toString(vectorNuevo).replace("[", "").replace("]", ""));

        System.arraycopy(vector, n-1, vectorNuevo, n, vectorNuevo.length - n);
//        System.out.println("DEBUG: " + Arrays.toString(vectorNuevo).replace("[", "").replace("]", ""));

        vectorNuevo[n-1] = rdn.nextInt(500);
        System.out.println("El nuevo valor es: " + vectorNuevo[n-1]);

        System.out.println("El vector resultante es: " + Arrays.toString(vectorNuevo).replace("[", "").replace("]", ""));
    }

    public static void Ejercicio9 (){
        System.out.println("Introduce la cantidad de palabras a contar: ");

        int n = 0;
        if (scn.hasNextInt()) {
            n = scn.nextInt();
            scn.nextLine();

        } else {
            System.out.println("No has introducido un número válido.");
            System.exit(1);
        }

        String[] palabras = new String[n];
        for (int i = 0; i < palabras.length; i++) {
            System.out.println("Introduce la palabra " + (i+1) + ": ");
            palabras [i] = scn.nextLine();
        }

        String aux = "";

        for (String palabra : palabras) {
            if (palabra.length() > aux.length()) {
                aux = palabra;
            }
        }
        System.out.println("La palabra más larga es: " + aux);
    }

    public static void Ejercicio10(){
        System.out.println("Introduce un carácter inicial que buscar: ");
        char c = scn.next().charAt(0);
        if (!Character.isLetter(c)) {
            System.out.println("No has introducido un carácter válido.");
            System.exit(1);
        }
        String [] palabras = {"Amor", "Amistad", "Aventura", "Arte", "Alegría", "Belleza", "Brisa", "Cálido", "Camino", "Cielo",
                "Corazón", "Creación", "Destino", "Dicha", "Dulzura", "Éxito", "Felicidad", "Fuerza", "Gracia", "Héroe",
                "Inspiración", "Jardín", "Luz", "Magia", "Melodía", "Misterio", "Naturaleza", "Ocaso", "Paz", "Plenitud",
                "Poder", "Pureza", "Rayo", "Sabiduría", "Serenidad", "Sueño", "Tesoro", "Tranquilidad", "Unidad", "Valor",
                "Verdad", "Viaje", "Victoria", "Voluntad", "Alma", "Ambición", "Aventura", "Amanecer", "Amabilidad",
                "Anhelo", "Apoyo", "Audacia", "Bondad", "Compasión", "Confianza", "Crecimiento", "Curiosidad",
                "Dedicación", "Desafío", "Deseo", "Determinación", "Ética", "Empatía", "Éxito", "Esfuerzo", "Esperanza",
                "Esplendor", "Estabilidad", "Éxtasis", "Generosidad", "Grandeza", "Honor", "Humildad", "Ilusión",
                "Ingenio", "Inocencia", "Integridad", "Inteligencia", "Intención", "Invierno", "Justicia", "Labor",
                "Libertad", "Lluvia", "Manantial", "Mirada", "Motivación", "Nieve", "Nostalgia", "Obra", "Optimismo",
                "Originalidad", "Otoño", "Pasión", "Patria", "Persistencia", "Perseverancia", "Primavera", "Progreso",
                "Propósito", "Raíz", "Realización", "Recuerdo", "Refugio", "Reflexión", "Respeto", "Reto", "Revolución",
                "Sabiduría", "Salud", "Sensibilidad", "Silencio", "Sinceridad", "Solidaridad", "Sueño", "Templanza",
                "Tenacidad", "Ternura", "Trabajo", "Tradición", "Triunfo", "Unidad", "Verano", "Victoria", "Vida",
                "Virtud", "Voluntad", "Voz", "Abundancia", "Adaptación", "Agua", "Aliento", "Alivio", "Amor", "Amparo",
                "Anhelo", "Ánimo", "Arcoiris", "Armonía", "Arriesgar", "Ascenso", "Astucia", "Atención", "Atracción",
                "Aventura", "Bienestar", "Calidez", "Cambio", "Capacidad", "Cercanía", "Confianza", "Consuelo",
                "Contemplación", "Conversación", "Coraje", "Curiosidad", "Descanso", "Destreza", "Dinamismo", "Dulzura",
                "Eficacia", "Eficiencia", "Elegancia", "Encanto", "Enfoque", "Equilibrio", "Esencia", "Esperanza",
                "Estudio", "Éxito", "Firmeza", "Flexibilidad", "Florecer", "Fortaleza", "Fraternidad", "Generosidad",
                "Gratitud", "Heroísmo", "Honestidad", "Humor", "Imaginación", "Imparcialidad", "Independencia",
                "Inspiración", "Instinto", "Intensidad", "Intuición", "Jovialidad", "Justicia", "Laboriosidad", "Lealtad",
                "Libertad", "Luz", "Mente", "Merced", "Motivación", "Música", "Naturaleza", "Nobleza", "Oportunidad",
                "Orden", "Paciencia", "Paz", "Permanencia", "Poder", "Positividad", "Precisión", "Progreso", "Pureza",
                "Puntualidad", "Refugio", "Rendimiento", "Resiliencia", "Respeto", "Responsabilidad", "Retorno",
                "Sabiduría", "Serenidad", "Sensatez", "Simplicidad", "Sinceridad", "Solidez", "Sublimidad", "Superación",
                "Tenacidad", "Ternura", "Tolerancia", "Transformación", "Triunfo", "Unidad", "Valentía", "Versatilidad",
                "Vida", "Virtud", "Voluntad", "Voz", "Karma", "Kilómetro", "Kiosco", "Kermés", "Kéfir", "Kilovatio",
                "Kimono", "Koala", "Kiosquero", "Kárate", "Quebrada", "Quehacer", "Quebrantable", "Quemazón",
                "Querencia", "Quimera", "Quinta", "Quirúrgico", "Quotidiano", "Quetzal", "Whisky", "Wafle", "Web",
                "Wifi", "Wok", "Walkman", "Waterpolo", "Walkie", "Wonder", "Western", "Xenón", "Xilófono", "Xenofobia",
                "Xilografía", "Xenofílico", "Xenófilo", "Xenofílico", "Xenón", "Xerófilo", "Xilófago", "Yate",
                "Yegua", "Yema", "Yacimiento", "Yodo", "Yoga", "Yogur", "Yugular", "Yugo", "Yesca", "Zafiro",
                "Zanahoria", "Zarza", "Zodíaco", "Zángano", "Zarzal", "Zorro", "Zafarrancho", "Zapateo", "Zumbido"};

        c = Character.toUpperCase(c);

        StringBuilder aux = new StringBuilder("Palabras que empiezan por " + c + ": \n\t");
        int lenght = 0;

        for (String palabra : palabras) {
            if (palabra.charAt(0) == c) {
                aux.append(palabra).append(", ");
                lenght += palabra.length();
                if (lenght > 40) {
                    aux.append("\n\t");
                    lenght = 0;
                }
            }
        }

        aux.replace(aux.length()-2, aux.length()-1, ".");
        System.out.println(aux);
    }
}
