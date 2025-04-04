# MERCADAM

Vamos a crear una aplicación para gestionar un carrito de la compra. Consistirá en una zona para clientes, una muestra pequeña de productos para la prueba y generaremos automáticamente unos pocos usuarios para comprobar autenticaciones y que el programa funciona correctamente.

---

##### Índice

[Diagrama](#Diagrama)

Enlaces

A

Partes

Del Proyecto

## 

## Diagrama

```mermaid
classDiagram
direction LR
class AppZonaClientes {
  + AppZonaClientes() 
  - resumenCompra() void
  - queHacer() void
  + iniciarCompra() void
  + imprimirDespedida() void
  - eliminarProducto() void
  + imprimirListaCantidad() void
  + imprimirProductos() void
  + main(String[]) void
  + autenticaion(List~Cliente~) void
}
class Cliente {
  + Cliente(String, String, String) 
  - String usuario
  - String contrasena
  - String direccion
  - Pedido pedido
  - boolean promociones
  + crearPedido() void
  + toString() String
   String usuario
   boolean promociones
   String direccion
   Pedido pedido
   String contrasena
}
class Mercadam {
  + Mercadam() 
  - List~Cliente~ clientes
  + generarClientes() void
   List~Cliente~ clientes
}
class Pedido {
  + Pedido() 
  - HashMap~Producto, Integer~ pedido
  - float importeTotal
  + removeProducto(Producto) void
  + aplicarPromo3x2(int) void
  + aplicarPromo10() void
  + aplicarPromo3x2() void
  + aplicarPromo10(int) void
  - calcularImporteTotal() void
  + addProducto(Producto) void
   HashMap~Producto, Integer~ pedido
   float importeTotal
}
class Producto {
<<enumeration>>
  - Producto(float) 
  - float precio
  + values() Producto[]
  + valueOf(String) Producto
   float precio
}

AppZonaClientes "1" *--> "cliente 1" Cliente 
AppZonaClientes  ..>  Mercadam : «create»
Cliente  ..>  Pedido : «create»
Cliente "1" *--> "pedido 1" Pedido 
Mercadam "1" *--> "clientes *" Cliente 
Mercadam  ..>  Cliente : «create»
Pedido "1" *--> "pedido *" Producto 


```
