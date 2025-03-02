# Documentación de Gestión del Club de Fútbol Mutxamel FC

## Índice
1. [Introducción](#introducción)
2. [Estructura de Clases](#estructura-de-clases)
    - [Clase Abstracta y Interfaces](#clase-abstracta-e-interfaces)
    - [Miembros del Club](#miembros-del-club)
    - [Enumeraciones](#enumeraciones)
    - [Excepciones](#excepciones)
3. [Funcionalidad del Sistema](#funcionalidad-del-sistema)
    - [Gestión de Jugadores](#gestión-de-jugadores)
    - [Simulación de Actividades](#simulación-de-actividades)
4. [Aplicación](#aplicación)
    - [AppMutxamelFC](#appmutxamelfc)
    - [AppMantenimiento](#appmantenimiento)
5. [Ejemplos de Código](#ejemplos-de-código)

## Introducción

El sistema de gestión para el club de fútbol Mutxamel FC permite administrar los diferentes integrantes del equipo (jugadores, entrenadores, masajistas y acompañantes), así como simular las actividades relacionadas con la práctica deportiva.

## Estructura de Clases

### Clase Abstracta e Interfaces

La estructura del sistema se basa en una clase abstracta `MutxamelIFC` que implementa la interfaz `FuncionesIntegrantes`, estableciendo las funciones básicas de todos los integrantes del club:

```java
public abstract class MutxamelIFC implements FuncionesIntegrantes {
     private String nombre;
     private int edad;
}

public interface FuncionesIntegrantes {
     void concentrarse();
     void viajar(String ciudad);
     void celebrarGol();
}
```

La interfaz `AccionesDeportivas` define las acciones específicas para miembros que realizan actividades deportivas:

```java
public interface AccionesDeportivas {
     void entrenar();
     void jugarPartido(String rival);
}
```

### Miembros del Club

Los diferentes miembros del club extienden la clase abstracta `MutxamelIFC`:

1. **Jugador**: Representa a los futbolistas del club, implementando tanto `FuncionesIntegrantes` como `AccionesDeportivas`.
2. **Entrenador**: Gestiona el equipo y establece las tácticas.
3. **Masajista**: Proporciona cuidados físicos a los jugadores.
4. **Acompañante**: Representa a familiares o acompañantes de los jugadores.

### Enumeraciones

El sistema utiliza dos enumeraciones para organizar información:

```java
public enum Equipos {
     BENJAMIN,
     ALEVIN,
     INFANTIL,
     CADETE,
     JUVENIL,
     SENIOR
}

public enum Posiciones {
     PORTERO,
     DEFENSA,
     CENTROCAMPISTA,
     DELANTERO
}
```

### Excepciones

Para gestionar errores específicos, se han creado excepciones personalizadas:

- `SameDorsalException`: Se lanza cuando se intenta asignar un mismo dorsal a diferentes jugadores.
- `FormacionPreferidaFormatException`: Se lanza cuando el formato de la formación táctica es incorrecto.

## Funcionalidad del Sistema

### Gestión de Jugadores

La clase `Jugador` implementa la lógica para categorizar a los jugadores según su edad:

```java
private Equipos setCategoria(int edad) {
     if (edad < 8) {
          System.out.println("El jugador " + nombre + " no puede jugar, es muy pequeño");
          return null;
     } else if (edad < 12) {
          return Equipos.BENJAMIN;
     } else if (edad < 16) {
          return Equipos.ALEVIN;
     } else if (edad < 18) {
          return Equipos.CADETE;
     } else {
          return Equipos.SENIOR;
     }
}
```

El sistema valida los dorsales para evitar duplicados:

```java
public static void addJugador(Jugador jugador) {
     if (checkDorsal(jugador)) {
          jugadores.add(jugador);
          acompanantes.forEach(System.out::println);
     } else {
          throw new SameDorsalException(jugador);
     }
}
```
## Aplicación
### AppMutxamelFC

La clase principal `AppMutxamelFC` gestiona la simulación del equipo de fútbol y proporciona la estructura base del sistema. Incluye colecciones para almacenar los diferentes miembros del equipo:

```java
public class AppMutxamelFC {
    static ArrayList<Jugador> jugadores = new ArrayList<>();
    static ArrayList<Acompanante> acompanantes = new ArrayList<>();
    static ArrayList<Masajista> masajistas = new ArrayList<>();
    static ArrayList<MutxamelIFC> Integrantes = new ArrayList<>();
}
```

La clase implementa métodos para formatear la salida en consola y mejorar la experiencia de usuario:

```java
public static String FORMAT_ERROR(String error){
    return "\t\u001B[33m > " + error + "\u001B[0m";
}

public static String FORMAT_SECTION(String section){
    return "\n\u001B[34m" + section + "\u001B[0m";
}
```

La gestión de jugadores se realiza mediante métodos que controlan la no duplicidad de dorsales:

```java
public static void addJugador(Jugador jugador) {
    if (checkDorsal(jugador)) {
        jugadores.add(jugador);
        System.out.println(FORMAT_SUCCESS("Jugador añadido: " + jugador.getNombre()));
    } else {
        throw new SameDorsalException(jugador);
    }
}

public static boolean checkDorsal(Jugador jugador) {
    for (Jugador j : jugadores) {
        if (j.getDorsal().equals(jugador.getDorsal())) {
            return false;
        }
    }
    return true;
}
```

El método `main()` ejecuta una simulación completa de actividades del club:
- Inicialización del equipo
- Concentración de jugadores y entrenadores
- Entrenamiento con formaciones tácticas
- Simulación de partido contra un rival
- Celebración de goles

### AppMantenimiento

La clase `AppMantenimiento` proporciona una interfaz de administración para el sistema, organizada mediante un menú interactivo:

```java
public static void main(String[] args) {
    boolean exit = false;
    while (!exit) {
        printMenu();
        try {
            int option = Integer.parseInt(sc.next());
            switch (option) {
                case 1:
                    mantenimientoJugadores();
                    break;
                case 2:
                    mantenimientoEntrenadores();
                    break;
                // Más opciones...
                default:
                    exit = true;
                    break;
            }
        } catch (Exception e) {
            System.out.println(FORMAT_ERROR(e.getMessage()));
        }
    }
}
```

Implementa funcionalidades completas para administrar jugadores:
- Añadir jugadores con validación de dorsales
- Modificar datos (nombre, edad, dorsal, posición)
- Añadir acompañantes relacionados
- Listar y consultar jugadores por equipos

También incluye métodos para generar informes y estadísticas de los equipos:

```java
private static void consultarEquipos() {
    Map<Equipos, List<Jugador>> equiposMap = jugadores.stream()
            .collect(Collectors.groupingBy(Jugador::getCategoria));
    
    equiposMap.forEach((equipo, jugadoresEquipo) -> {
        System.out.println("Equipo " + equipo + ": " + jugadoresEquipo.size() + " jugadores");
    });
}
```


