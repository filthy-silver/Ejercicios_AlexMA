package org.unidad7;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

import static org.unidad4.Practica1.Helper.sc;

public class colecciones {
    public static void main(String[] args) {
        ejercicio5palindromo();
    }

    private static void prueba() {
        Deque<Integer> colaDoble = new LinkedList<>();
        colaDoble.offer(1);
        colaDoble.offerFirst(2);
        colaDoble.offerLast(3);
        colaDoble.pollFirst();
        colaDoble.pollLast();
        System.out.println(colaDoble);
    }

    public static void ejercicio1(){
    }

    public static void ejercicio2(){}

    public static void ejercicio3(){
        Queue<String> playList = new LinkedList<>();

        playList.offer("Mirror - Justin Timberlake");
        playList.offer("Toxic - Britney Spears");
        playList.offer("Clavaito - Chanel feat Abraham Mateo");
        playList.offer("La reina - Lola Índigo");

        System.out.println("Lista de reproducción:" + playList);
    }

    public static void ejercicio4Compra(){
        Deque<String> listaCompra = new LinkedList<>();
        System.out.print("""
                --- LISTA DE LA COMPRA ---
                1. Añadir producto al final
                2. Eliminar primer producto
                3. ELiminar producto por nombre
                4. Ver primer producto
                5. Buscar producto
                6. Mostrar lisa actual
                X. Salir
                
                Seleccionar una opción:
                """);
        switch (sc.nextLine()){
            case "1":
                break;
            case "2":
                break;
            case "3":
                break;
            case "4":
                break;
            case "5":
                break;
            case "6":
                break;
            default:
                System.out.println("Opción no válida");
                break;
        }


    }

    public static void ejercicio5palindromo(){
        System.out.println("Introduce una palabra:");
        String s = sc.nextLine();

        Deque<Character> decomp = new LinkedList<>();
        for (int i = 0; i < s.length(); i++) {
            decomp.offer(s.charAt(i));
        }

        if (isPalindrome(decomp)){
            System.out.println("La palabra es un palíndromo");
        } else {
            System.out.println("La palabra no es un palíndromo");
        }
    }

    private static boolean isPalindrome(Deque<Character> decomp) {
        while (decomp.size() > 1) {
            if (decomp.pollFirst() != decomp.pollLast()) {
                return false;
            }
        }
        return true;
    }
}
