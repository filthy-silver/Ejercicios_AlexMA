package org.unidad6.ejercicio1;

public class Basico extends Usuario {
    public Basico(String nombre, int edad, String nombreUsuario) {
        super(nombre, edad, nombreUsuario);
    }
    public void getInfo(){
        System.out.println("========");
        System.out.println("Usuario Basico");
        super.getInfo();
        System.out.println("========\n");
    }
}
