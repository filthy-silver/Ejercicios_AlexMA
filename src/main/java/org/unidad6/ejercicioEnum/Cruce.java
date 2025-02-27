package org.unidad6.ejercicioEnum;

public class Cruce {
    private Semaforo semaforo;

    public Cruce(Semaforo semaforo) {
        this.semaforo = semaforo;
    }

    public Semaforo siguiente() {
         switch (semaforo) {
            case ROJO:
                return Semaforo.VERDE;
            case AMARILLO:
                return Semaforo.ROJO;
            case VERDE:
                return Semaforo.AMARILLO;
             default:
                 return Semaforo.AMARILLO;
        }
    }

    public Semaforo getSemaforo() {
        return semaforo;
    }

    public static void main(String[] args) {
        Cruce cruce = new Cruce(Semaforo.ROJO);

        for (int i = 0; i < 10; i++) {
            System.out.println(cruce.getSemaforo());
            cruce.semaforo = cruce.siguiente();
        }
    }
}
//  LANDAs
//
//    public Semaforo siguiente() {
//        return switch (semaforo) {
//            case ROJO -> Semaforo.VERDE;
//            case AMARILLO -> Semaforo.ROJO;
//            case VERDE -> Semaforo.AMARILLO;
//        };
//    }
