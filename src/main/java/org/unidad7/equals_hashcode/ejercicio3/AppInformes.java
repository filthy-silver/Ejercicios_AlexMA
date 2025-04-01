package org.unidad7.equals_hashcode.ejercicio3;

import java.util.Stack;

public class AppInformes {
    static Stack<Informe> informeStack = new Stack<>();

    public static void main(String[] args) {
        informeStack.push(new Informe(1, "Informe 1", Tipos.ADMINISTRATIVO));
        informeStack.push(new Informe(2, "Informe 2", Tipos.EMPRESARIAL));
        informeStack.push(new Informe(3, "Informe Casa", Tipos.PERSONAL));
        informeStack.push(new Informe(4, "Informe 4", Tipos.ADMINISTRATIVO));

        while (!informeStack.isEmpty()) {
            Informe i = informeStack.pop();
            System.out.println(i);
        }

        informeStack.push(new Informe(5, "Informe 5", Tipos.ADMINISTRATIVO));
        informeStack.push(new Informe(6, "Informe 6", Tipos.EMPRESARIAL));
        informeStack.push(new Informe(7, "Informe Casa", Tipos.PERSONAL));
        informeStack.push(new Informe(8, "Informe 8", Tipos.ADMINISTRATIVO));


        System.out.println("\nMostrando el stack en orden de impresión:");
        for (int i = informeStack.size() - 1; i >= 0; i--) {
            System.out.println(informeStack.get(i));
        }


    }
}
