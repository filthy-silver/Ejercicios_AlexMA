package org.unidad7.mapas_diccionarios.ejercicio3;

import java.util.HashMap;
import java.util.Scanner;

public class RegistroTemperaturas {
    private HashMap<String, Integer> mapaDiccionarios;
    static Scanner sc = new Scanner(System.in);

    public RegistroTemperaturas() {
        mapaDiccionarios = new HashMap<>();
    }

    public void registrarTemperatura(Integer temperatura, String ciudad) {
        mapaDiccionarios.put(ciudad,temperatura);
    }

    public void actualizarTemperatura(String ciudad) {

        System.out.println("Introduce la temperatura del ciudad " + ciudad);
        int temperatura = sc.nextInt();
        sc.nextLine();
        mapaDiccionarios.put(ciudad,temperatura);
    }

    public void mostrarTemperaturas() {
        System.out.println("Introduce la ciudad a consular:");
        String ciudad = sc.nextLine();
        if (mapaDiccionarios.containsKey(ciudad)) {
            System.out.println("La temperatura de " + ciudad + " es: " + mapaDiccionarios.get(ciudad));
        } else {
            System.out.println("La ciudad de " + ciudad + " no tiene teperaturas registradas");
        }
    }

    public void mostrar() {
        System.out.println("Temperaturas registradas:");
        for (String ciudad : mapaDiccionarios.keySet()) {
            System.out.println("Ciudad: " + ciudad + "  \t Temperatura: " + mapaDiccionarios.get(ciudad));
        }
    }
}
