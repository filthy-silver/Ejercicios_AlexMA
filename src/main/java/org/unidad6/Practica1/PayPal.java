package org.unidad6.Practica1;

public class PayPal extends MetodoPago{
    private String cuenta;
    private double saldo;

    public PayPal(String cuenta) {
        this.cuenta = cuenta;
        this.saldo = 23d;
    }

    @Override
    public void procesarPago(double importe) {
        System.out.println("Procesando pago de " + importe + "€ con PayPal");
    }

    public boolean validarPayal(Double importe){
        if (!cuenta.matches("^[a-zA-Z0-9._-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,6}$")){
            System.out.println("Formato de email incorrecto");
            return false;
        } else {
            if (saldo < importe){
                System.out.println("Saldo insuficiente");
                return false;
            }
                return true;
        }
    }
}
