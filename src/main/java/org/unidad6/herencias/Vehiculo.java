package org.unidad6.herencias;

public class Vehiculo {
    private String marca;
    private String matricula;

    public Vehiculo (String marca, String matricula){
        this.marca = marca;
        this.matricula = matricula;
    }

    public void getInfo(){
        System.out.println("Marca: " + marca);
        System.out.println("Matricula: " + matricula);
    }

    public void ruido(){
        System.out.println("BEEP BEEP");
    }
}
