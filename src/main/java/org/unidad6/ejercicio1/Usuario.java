package org.unidad6.ejercicio1;

public class Usuario {
    String nombre;
    int edad;
    String nombreUsuario;
    int seguidores;

    public Usuario(String nombre, int edad, String nombreUsuario) {
        this.nombre = nombre;
        this.edad = edad;
        this.nombreUsuario = nombreUsuario;
    }

    public void getInfo(){
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Nombre de usuario: " + nombreUsuario);
        System.out.println("Seguidores: " + seguidores);
    }

    public boolean equals(Usuario usuario) {
        if (this.nombre.equals(usuario.nombre) && this.edad == usuario.edad && this.nombreUsuario.equals(usuario.nombreUsuario)) {
            return true;
        }
        return false;}
}
