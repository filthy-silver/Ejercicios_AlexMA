package org.unidad7.practica1;

import java.util.HashMap;

public class Pedido {
    private HashMap<Producto, Integer> pedido;
    private float importeTotal;
    private boolean descuentosAplicados = false;

    public Pedido() {
        this.pedido = new HashMap<Producto, Integer>();
        this.importeTotal = 0;
    }

    public void aplicarPromo3x2(){
        for (Producto producto : pedido.keySet()) {
            if (pedido.get(producto) >= 3) {
                int cantidad = pedido.get(producto);
                int descuento = cantidad / 3; // Calcular cuantas veces se divide entre 3

                importeTotal -=  (producto.getPrecio()) * descuento;

                System.out.println("Aplicando promo 3x2 a " + producto.name() + ": " +
                        "pagas " + descuento * producto.getPrecio() + "€ menos\n");
                descuentosAplicados = true;
            }
        }
    }

    public void aplicarPromo3x2(int a){
        for (Producto producto : pedido.keySet()) {
            if (pedido.get(producto) >= 3) {
                int cantidad = pedido.get(producto);
                int descuento = cantidad / 3;

                importeTotal -=  (producto.getPrecio()) * descuento;
            }
        }
    }

    public void aplicarPromo10(){
        float aux = importeTotal;
        importeTotal = Math.round(importeTotal * 90) / 100.0f;
        System.out.println("Aplicando promo 10%: " + aux + "€ -> " + importeTotal + "€\n");
        descuentosAplicados = true;
    }

    public void aplicarPromo10(int a){
        float aux = importeTotal;
        importeTotal = Math.round(importeTotal * 90) / 100.0f;
    }

    public void addProducto(Producto producto){
        if (pedido.containsKey(producto)) {
            pedido.put(producto, pedido.get(producto) + 1 );
        } else {
            this.pedido.put(producto, 1);
        }
        calcularImporteTotal();
    }

    private void calcularImporteTotal(){
        float total = 0;
        for (Producto p : pedido.keySet()){
            total += p.getPrecio() * pedido.get(p);
        }
        this.importeTotal = Math.round(total * 100) / 100.0f;

        if (descuentosAplicados) {
            aplicarPromo3x2(0);
            aplicarPromo10(0);
        }
    }


    public HashMap<Producto, Integer> getPedido() {
        return pedido;
    }

    public float getImporteTotal() {
        return importeTotal;
    }

    public void removeProducto(Producto producto) {
        if (pedido.containsKey(producto)) {
            if (pedido.get(producto) > 1) {
                pedido.put(producto, pedido.get(producto) - 1);
            } else {
                pedido.remove(producto);
            }
        } else {
            System.out.println("El producto no está en el carrito");
        }
        calcularImporteTotal();
    }
}