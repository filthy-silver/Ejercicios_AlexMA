package org.unidad7.ejemplos;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class IterarHashMapPares {
    public static void main(String[] args) {

        HashMap<Integer, String> mapa = new HashMap<>();
        mapa.put(1, "Ana");
        mapa.put(2, "Luis");
        mapa.put(3, "Carlos");

        Iterator<Map.Entry<Integer, String>> iterador = mapa.entrySet().iterator();

        while (iterador.hasNext()) {
            Map.Entry<Integer, String> entrada = iterador.next();
            System.out.println("Clave: " + entrada.getKey() + ", Valor: " + entrada.getValue());

        }
    }
}
