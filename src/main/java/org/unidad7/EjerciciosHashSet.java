package org.unidad7;

import java.util.*;

public class EjerciciosHashSet {
    public static void main(String[] args) {
        ejercicio4();
    }

    public static void ejercicio4(){
        TreeSet<Integer> num = new TreeSet<>(){
            {
                add(1);
                add(2);
                add(3);
                add(4);
                add(5);
                add(6);
                add(7);
                add(10);
                add(11);
                add(12);
                add(15);
            }
        };
        TreeSet<Integer> num2 = new TreeSet<>(){
            {
                add(1);
                add(4);
                add(5);
                add(7);
                add(8);
                add(9);
                add(10);
            }
        };

        num = mezclados(num, num2);
        System.out.println("Array mezclado: " + num);
    }

    public static TreeSet<Integer> mezclados(TreeSet<Integer> tree, TreeSet<Integer> tree2){

        TreeSet<Integer> mezclado = new TreeSet<>();
        while(!tree2.isEmpty()){
            while (!tree.isEmpty()){
                mezclado.add(tree.pollFirst());
            }
//                tree.add(tree2.getFirst());
//                tree2.remove(tree2.getFirst());
            mezclado.add(tree2.pollFirst());
        }
        return mezclado;
    }
}

