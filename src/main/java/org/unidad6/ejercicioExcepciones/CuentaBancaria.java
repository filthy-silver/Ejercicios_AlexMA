package org.unidad6.ejercicioExcepciones;

public class CuentaBancaria {
    private int saldo;

    public CuentaBancaria(int saldo) {
        this.saldo = saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    public int getSaldo() {
        return saldo;
    }

    public void retirar(int cantidad){

        if (cantidad == 0){
            System.out.println("No se puede retirar 0");
        } else if (cantidad > saldo) {
            try {
                throw new SaldoInsuficienteException();
            } catch (SaldoInsuficienteException e) {
                System.out.println(e.getMessage());
            }
        } else if (cantidad > 600) {
            try {
                throw new LimiteDiarioException();
            } catch (LimiteDiarioException e) {
                System.out.println(e.getMessage());
            }

        } else {
            saldo -= cantidad;
        }
    }

    public void depositar(int cantidad){
        if (cantidad == 0){
            System.out.println("No se puede depositar 0");
        } else if (cantidad > 3000) {
            try {
                throw new DepositoMaximoException();
            } catch (DepositoMaximoException e) {
                System.out.println(e.getMessage());
            }
        } else {
            saldo += cantidad;
        }
    }
}
