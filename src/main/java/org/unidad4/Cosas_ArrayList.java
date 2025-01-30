package org.unidad4;

import java.util.ArrayList;
import java.util.Arrays;

public class Cosas_ArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> listaNum = new ArrayList<>();
        listaNum.add(1);
        listaNum.add(25);
        listaNum.add(33);
        listaNum.add(1,45);
        System.out.println(listaNum.get(2));
        listaNum.remove(2);
        System.out.println(listaNum.get(2));
        listaNum.remove(Integer.valueOf(33));
        listaNum.remove((Integer)2);
        System.out.println(listaNum);
        System.out.println(listaNum.indexOf(45));


        for (int i = 0; i < listaNum.size(); i++) {
            System.out.println(listaNum.get(i));
        }

        for (int i : listaNum) {
            System.out.println(i);
        }

        listaNum.set(0, 100);
        System.out.println(listaNum);

        Object lista_copia = listaNum.clone();

        listaNum.clear();

        System.out.println(listaNum);

        if (listaNum.contains(100)) {
            System.out.println("El 100 esta en la lista");
        } else {
            System.out.println("El 100 no esta en la lista");
        }

        listaNum.addAll((Arrays.asList(1,2,3,4,5,6,7,8,9,10)));

        System.out.println(listaNum);

        addNums(listaNum, 11,12,13,14,15,16,17,18,19,20);

        System.out.println(listaNum);

    }
    public static void addNums(ArrayList<Integer> lista, Integer ... n) {
        lista.addAll(Arrays.asList(n));
    }
}
