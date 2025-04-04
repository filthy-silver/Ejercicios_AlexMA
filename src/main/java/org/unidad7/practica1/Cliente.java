package org.unidad7.practica1;

import java.util.HashMap;

public class Cliente {
    private String usuario;
    private String contrasena;
    private String direccion;
    private Pedido pedido;
    private boolean promociones;

    public Cliente(String usuario, String contrasena, String direccion) {
        this.usuario = usuario;
        this.contrasena = contrasena;
        this.direccion = direccion;
        this.promociones = false;

        crearPedido();
    }

    public void crearPedido() {
        this.pedido = new Pedido();
    }

    public String getUsuario() {
        return usuario;
    }

    public String getContrasena() {
        return contrasena;
    }

    public Pedido getPedido() {
        return pedido;
    }

    @Override
    public String toString() {
        String print =  "\n\tCliente:" +
                "usuario='" + usuario + '\'';
                if (usuario.length() < 10) {
                print += "\t";
                }
                print += "\tcontrasena='" + contrasena;
                return print;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setPromociones(boolean b) {
        this.promociones = b;
    }

    public boolean getPromociones() {
        return promociones;
    }
}