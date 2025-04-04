package org.unidad7.practica1;

import java.util.Collections;
import java.util.List;

public class Mercadam {
    private List<Cliente> clientes;

    private final String[] nicks = {
            "Pollo", "Pato", "Gato", "Pez", "Rata",
            "Bruja", "Duende", "Yeti", "Alien", "Robot",
            "Taza", "Sofa", "Cubo", "Boli", "Pan",
            "Queso", "Saco", "Pala", "Bomba", "Wifi"
    };
    private final String[] adjetivos = {
            "Muerto", "Vivo", "Roto", "Quemado", "Duro",
            "Bailando", "Flotando", "Gritando", "Mordiendo", "Llorando",
            "Invisible", "Magico", "Cosmico", "Acuatico", "Espacial",
            "Pegajoso", "Gelatinoso", "Electro", "DeGoma", "Pixelado"
    };


    public Mercadam() {
        this.clientes = new java.util.ArrayList<>();
        generarClientes();
    }

    public void generarClientes(){
        for (int i = 0; i < 5; i++){
            String cliente = "";
            StringBuilder contrasena = new StringBuilder();
            do {
                cliente = nicks[(int) (Math.random() * nicks.length)] + adjetivos[(int) (Math.random() * adjetivos.length)];

            } while (cliente.length() > 12);

            for (int j = 0; j < 8; j++){
                String caracteres = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
                contrasena.append(String.valueOf(caracteres.charAt((int) (Math.random() * caracteres.length()))));
            }
            clientes.add(new Cliente(cliente, contrasena.toString(), "Calle Falsa 123"));
        }

        System.out.println("Clientes generados: " +
                clientes.toString().replace("[", "").replace("]", "").replace(",","'") + "'\n");

    }

    public List<Cliente> getClientes(){
        return Collections.unmodifiableList(clientes);
    }
}
