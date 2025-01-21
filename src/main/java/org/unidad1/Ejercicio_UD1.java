package org.unidad1;

import java.util.Locale;
import java.util.Scanner;

public class Ejercicio_UD1 {
        static final Scanner scn = new Scanner(System.in).useLocale(Locale.US);


        public void ejercicioInicial (){
            System.out.println("¿Cómo te llamas?:");
            String name = scn.nextLine();
            System.out.println("¿A qué curso vas?:");
            String course = scn.nextLine();
            System.out.println("Hola " + name + " bienvenido a " + course);
            System.out.println("Introduce un número: ");
            int num1 = Helper.getTPInt();
            System.out.println("Introduce otro número: ");
            int num2 = Helper.getTPInt();
            System.out.println("El resultado de sumar los dos números es: " + (num2 + num1));

        }
        public void ejercicioBateria1(){
            System.out.println("Vamos a averiguar si el número es positivo, negativo o 0\n----");
            System.out.println("Introduce un número: ");
            int num = Helper.getTPInt();

            if (num != 0) {

                if (num > 0) {
                    System.out.println("El número es positivo");
                } else {
                    System.out.println("El número es negativo");
                }
            } else {
                System.out.println("El número es 0");
            }
        }
        public void ejercicioBateria2(){
            System.out.println("Vamos a comparar dos números\n----");
            System.out.println("Introduce un número: ");
            int num = Helper.getTPInt();
            System.out.println("Introduce un segundo número: ");
            int num2 = Helper.getTPInt();

            if (num == num2) {
                System.out.println("ERROR: los números introducidos son iguales");
            } else {
                if (num > num2) {
                    System.out.println("El número " + num + " es mayor que " + num2);
                } else {
                    System.out.println("El número " + num2 + " es mayor que " + num);
                }
            }
        }

        public void ejercicioBateria3(){
            System.out.println("Vamos a dividir un número entre otro\n----");
            System.out.println("Introduce un número: ");
            int num = Helper.getTPInt();
            System.out.println("Introduce el divisor: ");
            int num2 = Helper.getTPInt();

            if (num2 == 0) {
                System.out.println("ERROR: no se puede dividir entre 0");
            } else {
                System.out.println("El resultado de dividir " + num + " entre " + num2 + " es: " + (num / num2));
            }
        }

        public void ejercicioBateria4(){
            System.out.println("Vamos a calcular el área de un triángulo\n----");
            System.out.println("Introduce la base: ");
            int base = Helper.getTPInt();
            while (base <= 0) {
                System.out.println("ERROR: la base no puede ser 0 o negativa");
                System.out.println("Introduce la base: ");
                base = Helper.getTPInt();
            }

            System.out.println("Introduce la altura: ");
            int altura = scn.nextInt();
            while (altura <= 0) {
                System.out.println("ERROR: la altura no puede ser 0 o negativa");
                System.out.println("Introduce la altura: ");
                altura = Helper.getTPInt();
            }

            System.out.println("El área del rectángulo es: " + (base * altura / 2));
        }

        public void ejercicioBateria5(){
        System.out.println("Vamos a comprobar el qué valor es más pequeño.\n----\nIntroduce un número: ");
        Integer num = Helper.getTPInt();
        System.out.println("Introduce un segundo número: ");
        num = Helper.smallerInteger(num, Helper.getTPInt());

        if (num == null) {
            System.out.println("ERROR: hay números introducidos que son iguales");
        } else {
            System.out.println("Introduce un tercer número");
            num = Helper.smallerInteger(num, Helper.getTPInt());
            if (num == null) {
                System.out.println("ERROR: hay números introducidos que son iguales");
            } else {
                System.out.println("El número más pequeño es: " + num);
            }
        }
    }

        public void ejercicioBateria6(){
            System.out.print("Hay tomate en casa?\n----\nIntroduce 's' para sí o 'n' para no: ");
            if (!Helper.preguntaSN()){
                System.out.println("¡Tenemos que ir a comprar!");
            } else {
                System.out.println("Hay aceite en casa?\n----\nIntroduce 's' para sí o 'n' para no: ");
                if (!Helper.preguntaSN()){
                    System.out.println("¡Tenemos que ir a comprar!");
                } else {
                    System.out.println("Hay jamón en casa?\n----\nIntroduce 's' para sí o 'n' para no: ");
                    if (!Helper.preguntaSN()){
                        System.out.println("¡Tenemos que ir a comprar!");
                    } else {
                        System.out.println("¡No tenemos que ir a comprar!");
                    }
                }
            }

        }
    }



