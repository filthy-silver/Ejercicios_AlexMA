package org.unidad7.mapas_diccionarios;

import java.util.HashMap;
import java.util.Scanner;

public class Ejercicio1 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        getWordString(sc.nextLine());
    }

    public static String[] getWordString(String sentence) {
        return sentence.split(" ");
    }

    public static void wordCount(String [] sentence) {
        HashMap<String, Integer> wordCount = new HashMap<>();

        for (String word : sentence) {
            wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
        }

        for (String word : wordCount.keySet()) {
            System.out.println(word + ": " + wordCount.get(word));
        }
    }
}
