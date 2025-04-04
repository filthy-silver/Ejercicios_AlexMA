package org.unidad7.practica1;

import java.util.*;

public class AppZonaClientes {
    private static Cliente cliente;
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        Mercadam mercadam = new Mercadam();
        List<Cliente> clientes = mercadam.getClientes();

        autenticacion(clientes);
        System.out.println("BIENVENID@ " + cliente.getUsuario() + "!"
        + "\nAñade productos a tu carrito de la compra...\n");

        imprimirProductos();
        iniciarCompra();
        String anadirProductos = "S";
        String producto = "";
        Producto productoSelec = null;
        do{
            System.out.print("\tElige un producto:");
            producto = sc.nextLine();
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

            try {
                productoSelec = Producto.valueOf(producto.toUpperCase());
                cliente.getPedido().addProducto(productoSelec);

            } catch (IllegalArgumentException e) {
                System.out.println("Producto no encontrado. Intente de nuevo.");
                productoSelec = null;
            }

            if (productoSelec == null){ //evita un nullpointer
                continue;
            }

            System.out.println("Has añadido " + productoSelec.name() + " con un precio de "
                    + productoSelec.getPrecio() + "€." +
                    "\nImporte total del carrito: " + cliente.getPedido().getImporteTotal() + "€.");

            do {
                System.out.println("¿Quieres añadir más productos al carrito de la compra? [S/N]");
                anadirProductos = sc.nextLine().toUpperCase();
                if (!anadirProductos.equals("S") && !anadirProductos.equals("N")) {
                    System.out.println("\t► Entrada no reconocida");
                }

            } while (!anadirProductos.equals("S") && !anadirProductos.equals("N") );

            if (anadirProductos.equals("S")){
                System.out.println();
                imprimirProductos();
            }

        } while (anadirProductos.equals("S"));

        resumenCompra();

        boolean exit = false;
        do {
            queHacer();
            switch (sc.nextInt()){
                case 1 -> {
                    if (cliente.getPedido().getPedido().isEmpty()){
                        System.out.println("No hay productos en el carrito");
                        break;
                    } else if (cliente.getPromociones()){
                        System.out.println("Ya has aplicado las promociones");
                        break;
                    } else {
                        System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n");
                        cliente.getPedido().aplicarPromo3x2();
                        cliente.getPedido().aplicarPromo10();
                        cliente.setPromociones(true);
                        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n");
                    }
                }
                case 2 -> imprimirListaCantidad();
                case 3 -> eliminarProducto();
                case 4 -> {
                    System.out.println("Pedido terminado");
                    exit = true;
                }
                default -> System.out.println("Opción no válida");
            }

        } while (!exit);

        imprimirDespedida();
    }

    private static void eliminarProducto() {
        sc.nextLine(); // Limpiar el buffer
        System.out.println("¿Qué producto quieres eliminar?");
        String producto = sc.nextLine();
        try {
            Producto.valueOf(producto.toUpperCase());
            cliente.getPedido().removeProducto(Producto.valueOf(producto.toUpperCase()));
            System.out.println("Has eliminado " + producto + " de tu carrito.");
        } catch (IllegalArgumentException e) {
            System.out.println("Producto no encontrado. Intente de nuevo.");
        }
    }

    private static void queHacer() {
        System.out.println("""
                ┌¿Qué desea hacer?───────────────────────┐
                │ 1. Aplicar promo.                      │
                │ 2. Mostrar resumen ordenado por uds.   │
                │ 3. Eliminar producto.                  │
                │ 4. Terminar pedido.                    │
                └────────────────────────────────────────┘
                """);
    }

    private static void resumenCompra() {
        System.out.println("\n" +"~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n" +
                                 "RESUMEN DEL CARRITO DE TU COMPRA:\n\n" +
                                 "Producto\t\tCantidad\tPrecio\n");


        for (Producto p : cliente.getPedido().getPedido().keySet()){
            int cantidad = cliente.getPedido().getPedido().get(p);
            float precioTotal = p.getPrecio() * cantidad;
            System.out.printf("%-15s\t%5d\t  %7.2f€%n",
                    p.name(),
                    cantidad,
                    precioTotal);
        }

        System.out.println("TOTAL A PAGAR " + cliente.getPedido().getImporteTotal() + "€\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n");
    }

    public static void autenticacion(List<Cliente> clientes){
        int intento = 0;
        do {
            System.out.println("Introduce tu usuario");
            String usuario = sc.nextLine();
            System.out.println("Introduce tu contraseña");
            String contrasena = sc.nextLine();

            for (Cliente c : clientes) {
                if (c.getUsuario().equals(usuario) && c.getContrasena().equals(contrasena)) {
                    System.out.println("Usuario encontrado!\n");
                    cliente = c;
                    break;
                }
            }

            if (cliente == null) {
                System.out.println("Usuario no encontrado! Vuelve a intentarlo...\n");
            }
            intento++;


        } while (intento <= 3 && cliente == null);

        if (cliente == null){
            System.out.println("ERROR DE AUTENTICACION");
            System.exit(0);
        }
    }

    public static void iniciarCompra(){
            cliente.crearPedido();
    }

    public static void imprimirProductos(){
        String lineaHorizontal = "╔═══════════════════════════════════════════╗";
        System.out.println(lineaHorizontal);
        System.out.println("║ Productos disponibles:                    ║");
        for (Producto p : Producto.values()){
            String linea = String.format("║ \t► %-15s precio (%-5.2f€)", p.name(), p.getPrecio());
            while (linea.length() < lineaHorizontal.length() - 2) {
                linea += " ";
            }
            System.out.println(linea + "║");
        }
        System.out.println("""
                ║                                           ║
                ╚═══════════════════════════════════════════╝""");
    }

    public static void imprimirDespedida(){
        System.out.println("Pago final: "+ cliente.getPedido().getImporteTotal() + "€" + "\nGracias por su compra." +
                "\nLe enviaremos su pedido a su dirección: " + cliente.getDireccion());
    }

    public static void imprimirListaCantidad() {
        System.out.println("\nPRODUCTOS ORDENADOS POR CANTIDAD:");
        System.out.println("Producto\t\tCantidad\tPrecio");

        List<Map.Entry<Producto, Integer>> entradas = new ArrayList<>(cliente.getPedido().getPedido().entrySet());

        entradas.sort(new Comparator<Map.Entry<Producto, Integer>>() {
            public int compare(Map.Entry<Producto, Integer> entrada1, Map.Entry<Producto, Integer> entrada2) {
//                System.out.println(entrada1.getValue() + " " + entrada2.getValue());
                return entrada2.getValue().compareTo(entrada1.getValue());
            }
        });

        for (Map.Entry<Producto, Integer> entrada : entradas) {
            Producto producto = entrada.getKey();
            Integer cantidad = entrada.getValue();
            System.out.printf("%-15s\t%5d\t  %7.2f€%n",
                    producto.name(),
                    cantidad,
                    producto.getPrecio() * cantidad);
        }

        System.out.println("\nTOTAL A PAGAR: " + cliente.getPedido().getImporteTotal() + "€");
    }
}
