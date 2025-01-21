package org.unidad4;

public class Recursividad {
    public static void main(String[] args) {
//        imprimirNumeros(10, 0);
        System.out.println(sumarNumeros(3, 1));
    }

    public static void imprimirNumeros(int end, int origin) {
        if (end >= origin) {
            System.out.println(origin);
            imprimirNumeros(end, origin + 1);
        }
    }

    public static int sumarNumeros(int end, int origin) {
        if (end > origin) {
            return origin + sumarNumeros(end, origin + 1);
        }
        return origin;
    }
}
