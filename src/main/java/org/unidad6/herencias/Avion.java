package org.unidad6.herencias;

public class Avion extends Vehiculo {
    private int numMotores;

    public Avion(String marca, String matricula, int numMotores){
        super(marca, matricula);
        this.numMotores = numMotores;
    }

    @Override
    public void getInfo(){
        super.getInfo();
        System.out.println("Numero de motores: " + numMotores);
    }

    @Override
    public void ruido(){
        System.out.println("ZUUUM");
    }
}
