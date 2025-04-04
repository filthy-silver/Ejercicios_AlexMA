package org.unidad6.practica2;

import static org.unidad6.practica2.AppMutxamelFC.checkDorsal;

public class Jugador extends MutxamelIFC implements FuncionesIntegrantes, AccionesDeportivas {
    private Equipos categoria;
    private int dorsal;
    private Posiciones posicion;
    private String nombre;
    private int edad;

    public Jugador(String nombre, int edad, int dorsal, String demarcacion) {
        this.nombre = nombre;
        this.edad = setEdad(edad);
        this.dorsal = dorsal;
        this.posicion = setDemarcacion(demarcacion);
        this.categoria = setCategoria(edad);
    }

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

    private Posiciones setDemarcacion(String demarcacion) {
        if (demarcacion.equalsIgnoreCase("portero")) {
            return Posiciones.PORTERO;
        } else if (demarcacion.equalsIgnoreCase("defensa")) {
            return Posiciones.DEFENSA;
        } else if (demarcacion.equalsIgnoreCase("centrocampista")) {
            return  Posiciones.CENTROCAMPISTA;
        } else if (demarcacion.equalsIgnoreCase("delantero")) {
            return Posiciones.DELANTERO;
        } else {
            System.out.println("La demarcación " + demarcacion + " no es válida");
            return null;
        }
    }

    int setEdad(int edad) {
        if (edad < 8) {
            System.out.println("El jugador " + nombre + " no puede jugar, es muy pequeño");
            return 0;
        } else {
            return edad;
        }
    }

    public void calentar() {
        System.out.println("El jugador" + nombre + " con el dorsal " +  dorsal + " está calentando");}

    public void descansar() {
        System.out.println(nombre + " está descansando");
    }
    public void marcarGol() {
        System.out.println( "El" + posicion + " " + nombre + " ha marcado un gol");
    }

    public String getNombre() {
        return nombre;
    }

    public String getPosicion() {
        return posicion.toString();
    }

    public String getCategoria() {
        return categoria.toString();
    }

    @Override
    public void concentrarse() {
        System.out.println("El jugador " + nombre + " se está concentrando");
    }

    @Override
    public void viajar(String ciudad) {
        System.out.println("El jugador " + nombre + " está viajando a " + ciudad);
    }

    @Override
    public void celebrarGol() {
        System.out.println("GOLASSSOOOOO!!");
    }

    @Override
    public void entrenar() {
        System.out.println("El jugador " + nombre + " está entrenando");
    }

    @Override
    public void jugarPartido(String rival) {
        System.out.println("El jugador " + nombre + " está jugando un partido contra " + rival);
    }

    @Override
    public String toString() {
        return nombre + "\t→ EDAD: " + edad +  "\t|\tCATEGORIA: " + categoria + "\t|\tPOSICION: " + posicion + "\t|\tDORSAL: " + dorsal;
    }

    public String getDorsal() {
        return String.valueOf(dorsal);
    }

    public void setNombre(String name) {
        this.nombre = name;
    }

    public void setPosicion(String posicion) {
        this.posicion = setDemarcacion(posicion);
    }

    public void setDorsal(int nuevoDorsal) {
        // Creamos un jugador temporal porque no sé cómo hacerlo de otra forma con el tiempo que me queda
        Jugador tempPlayer = new Jugador(this.nombre, this.edad, nuevoDorsal, this.posicion.toString());

        if (checkDorsal(tempPlayer)) {
            this.dorsal = nuevoDorsal;
        } else {
            throw new SameDorsalException(this);

        }
    }
}
