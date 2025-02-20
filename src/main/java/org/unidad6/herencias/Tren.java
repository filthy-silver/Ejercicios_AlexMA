package org.unidad6.herencias;

public class Tren extends Vehiculo {

    private int vagones;

    public Tren(String marca, String matricula, int vagones) {
        super(marca, matricula);
        this.vagones = vagones;
    }

    @Override
    public void getInfo() {
        super.getInfo();
        System.out.println("Numero de vagones: " + vagones);
    }

    @Override
    public void ruido() {
        System.out.println("CHU CHU");
    }

}

