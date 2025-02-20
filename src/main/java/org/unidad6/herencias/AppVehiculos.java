package org.unidad6.herencias;

public class AppVehiculos {
    public static void main(String[] args) {
        Avion Boeing = new Avion("Boeing", "1234ABC", 4);
        Tren Renfe = new Tren("Renfe", "5678DEF", 10);
        Renfe.getInfo();
        Renfe.ruido();
        Boeing.getInfo();
        Boeing.ruido();
    }
}
