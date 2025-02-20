package org.unidad6.Practica1;

import java.util.Scanner;

public class Tienda {

    static Scanner sc = new Scanner(System.in);
    static void realizarPago(MetodoPago metodoPago, double importe){
        metodoPago.procesarPago(importe);
    }

    static void iniciarPago(){
        System.out.println("Que método de pago desea utilizar?\t[Bizum,PayPal,Tarjeta]");
        switch (sc.nextLine().toLowerCase()){
            case "bizum":
                System.out.println("Introduzca su número de teléfono");
                Bizum bizum = new Bizum(sc.nextLine());

                if (bizum.validarBizum() && bizum.validarPin()){
                    realizarPago(bizum, 23d);
                }
                break;
            case "paypal":
                System.out.println("Introduzca su email");
                PayPal payPal = new PayPal(sc.nextLine());
                if (payPal.validarPayal(23d)){
                    realizarPago(payPal, 23d);
                }
                break;
            case "tarjeta":

                System.out.println("Introduzca su número de tarjeta [16 digitos]");
                TarjetaCredito usuarioTarjetaCredito = new TarjetaCredito(sc.nextLine());
                if (usuarioTarjetaCredito.validarTarjeta()){
                    realizarPago(usuarioTarjetaCredito, 23d);
                }
                break;
            default:
                System.out.println("Método de pago no válido");
                break;
        }
    }
}
