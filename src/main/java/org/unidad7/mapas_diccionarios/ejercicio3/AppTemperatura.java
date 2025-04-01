package org.unidad7.mapas_diccionarios.ejercicio3;

public class AppTemperatura {
    public static void main(String[] args) {

        RegistroTemperaturas registro = new RegistroTemperaturas();
        registro.registrarTemperatura(25, "Madrid");
        registro.registrarTemperatura(30, "Barcelona");
        registro.registrarTemperatura(20, "Valencia");

        registro.mostrarTemperaturas();
        registro.actualizarTemperatura("Madrid");
        registro.mostrarTemperaturas();
        registro.mostrar();

    }
}
