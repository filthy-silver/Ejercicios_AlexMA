package org.unidad6.Practica1;

import static org.unidad6.Practica1.Tienda.sc;

public class Bizum extends MetodoPago {
    private String telefono;
    private int pin;

    public Bizum(String telefono) {
        this.telefono = telefono;
        pin = generarPin();
    }

    @Override
    public void procesarPago(double importe) {
        System.out.println("Procesando pago de "+ importe +"€ con Bizum");
    }

    private int generarPin() {
        return (int) (Math.random() * 1000000);
    }

    public boolean validarBizum() {
        if (!telefono.matches("^[0-9]{9}$")) {
            System.out.println("Número de teléfono incorrecto");
            return false;
        } else {
            return true;
        }
    }

    public boolean validarPin(){
        System.out.println("Pin generado: " + pin);
        System.out.println("Introduzca el pin");
        int aux = 0;
        if(sc.hasNextInt()){
             aux = sc.nextInt();
        } else {
            sc.nextLine();
            System.out.println("Pin incorrecto");
            return false;
        }
        if (sc.nextInt() == pin){
            System.out.println("Pin correcto");
            return true;
        } else {
            System.out.println("Pin incorrecto");
            return false;
        }
    }
}
