package org.unidad6.ejercicio1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Influencer extends Usuario {
   private ArrayList<String> colaboraciones = new ArrayList<>();

    public Influencer(String nombre, int edad, String nombreUsuario, String ... colaboraciones) {
        super(nombre, edad, nombreUsuario);
//        this.colaboraciones.add(Arrays.toString(colaboraciones));
        Collections.addAll(this.colaboraciones, colaboraciones);
    }

    public void getInfo(){
        System.out.println("========");
        System.out.println("Usuario Influencer");
        super.getInfo();
//        System.out.println("Colaboraciones: " + colaboraciones);
        for (String colaboracion : colaboraciones) {
            System.out.println("Colaboraciones: " + colaboracion);
        }
        System.out.println("========\n");
    }

}
