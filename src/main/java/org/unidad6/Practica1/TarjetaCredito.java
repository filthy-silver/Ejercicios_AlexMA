package org.unidad6.Practica1;

import static org.unidad6.Practica1.Tienda.sc;

public class TarjetaCredito extends MetodoPago{

    private enum tipo {
        VISA, MASTERCARD, MAESTRO
    }

    private String nroTarjeta;
    private tipo tipoTarjeta;


    public TarjetaCredito(String nro_tarjeta) {
        this.nroTarjeta = nro_tarjeta;
        this.tipoTarjeta = asignarTipoTarjeta();
    }

    @Override
    public void procesarPago(double importe) {
        System.out.println("Procesando pago de "+ importe   +"€ con tarjeta de crédito " + tipoTarjeta);
    }

    public boolean validarTarjeta(){
        if (nroTarjeta.length() != 16){
            System.out.println("Número de tarjeta incorrecto");
            return false;
        } else if (tipoTarjeta == null){
            System.out.println("Tipo de tarjeta no asignado");
            return false;
        } else {
            return true;
        }
    }

    private tipo asignarTipoTarjeta(){
        System.out.println("Introduzca el tipo de tarjeta [VISA, MASTERCARD, MAESTRO]");
        try {
            return tipo.valueOf(sc.nextLine().toUpperCase());
        } catch (IllegalArgumentException e) {
            System.out.println("Tipo de tarjeta no válido");
            return null;
        }
    }
}
