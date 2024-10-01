package org.example;

public class Practica4 {

    public static void multimatic99(){

        System.out.println("              .__   __  .__                __  .__       ________  ________ \n" +
                "  _____  __ __|  |_/  |_|__| _____ _____ _/  |_|__| ____/   __   \\/   __   \\\n" +
                " /     \\|  |  \\  |\\   __\\  |/     \\\\__  \\\\   __\\  |/ ___\\____    /\\____    /\n" +
                "|  Y Y  \\  |  /  |_|  | |  |  Y Y  \\/ __ \\|  | |  \\  \\___  /    /    /    / \n" +
                "|__|_|  /____/|____/__| |__|__|_|  (____  /__| |__|\\___  >/____/    /____/  \n" +
                "      \\/                         \\/     \\/             \\/                   ");
        System.out.println("Introduce un número de 3 cifras: ");
        int num1 = threeDigitNumber();

        System.out.println("Introduce otro número de 3 cifras: ");
        int num2 = threeDigitNumber();

        boolean neg = false;
        if (num2 < 0) {
            num2 *= -1;
            neg = true;
        }

        String numStr = Integer.toString(num2);
        int n1 = Integer.parseInt(numStr.substring(2)) ;
        int n2 = Integer.parseInt(numStr.substring(1,2)) ;
        int n3 = Integer.parseInt(numStr.substring(0,1)) ;

        if (neg){
            n1 *= -1;
            n2 *= -1;
            n3 *= -1;
            num2 *= -1;
        }

        System.out.print("\nEl producto de la multiplicación es: "+(num1*num2)+
                "\n\nEl proceso es:"+
                "\n   "+num1+
                "\n x "+num2+
                "\n--------"+
                "\n  "+(num1*n1)+
                "\n "+(num1*n2)+"x "+
                "\n"+(num1*n3)+"xx "+
                "\n--------"+
                "\n"+(num1*num2)+"\n");
    }

    public static int threeDigitNumber() {
        int num;
        do {
            num = Helper.getTPInt();
            if ((num < 100 || num > 999) && (num < -999 || num > -100)) {
                System.out.println("Número no válido. Introduce un número de 3 cifras: ");
            }
        } while ((num < 100 || num > 999) && (num < -999 || num > -100));
        return num;
    }

//    public static void multimatic99(){
//
//        System.out.println("              .__   __  .__                __  .__       ________  ________ \n" +
//                "  _____  __ __|  |_/  |_|__| _____ _____ _/  |_|__| ____/   __   \\/   __   \\\n" +
//                " /     \\|  |  \\  |\\   __\\  |/     \\\\__  \\\\   __\\  |/ ___\\____    /\\____    /\n" +
//                "|  Y Y  \\  |  /  |_|  | |  |  Y Y  \\/ __ \\|  | |  \\  \\___  /    /    /    / \n" +
//                "|__|_|  /____/|____/__| |__|__|_|  (____  /__| |__|\\___  >/____/    /____/  \n" +
//                "      \\/                         \\/     \\/             \\/                   ");
//        System.out.println("Introduce un número de 3 cifras: ");
//        int num1;
//        boolean neg1 = false;
//        do {
//            num1 = Helper.getTPInt();
//            if (num1 < 0) {
//                neg1 = true;
//                num1 *= -1;
//            } else if (num1 <= 100 || num1 >= 999) {
//                System.out.println("Número no válido. Introduce un número de 3 cifras: ");
//            }
//        } while (num1 <= 100 || num1 >= 999);
//
//        System.out.println("Introduce otro número de 3 cifras: ");
//        int num2;
//        boolean neg2 = false;
//        do {
//            num2 = Helper.getTPInt();
//            if (num2 < 0) {
//                neg2 = true;
//                num2 *= -1;
//            } else if (num2 <= 100 || num2 >= 999) {
//                System.out.println("Número no válido. Introduce un número de 3 cifras: ");
//            }
//        } while (num2 <= 100 || num2 >= 999);
//
//        String numStr = Integer.toString(num2);
//        int n1 = Integer.parseInt(numStr.substring(2)) ;
//        int n2 = Integer.parseInt(numStr.substring(1,2)) ;
//        int n3 = Integer.parseInt(numStr.substring(0,1)) ;
//
//        if (neg2){
//            n1 *= -1;
//            n2 *= -1;
//            n3 *= -1;
//        }
//
//        if (neg1) {
//            num1 *= -1;
//        }
//        if (neg2) {
//            num2 *= -1;
//        }
//
//        System.out.print("\nEl producto de la multiplicación es: "+(num1*num2)+
//                "\n\nEl proceso es:"+
//                "\n   "+num1+
//                "\n x "+num2+
//                "\n--------"+
//                "\n  "+(num1*n1)+
//                "\n "+(num1*n2)+"x "+
//                "\n"+(num1*n3)+"xx "+
//                "\n--------"+
//                "\n"+(num1*num2)+"\n");
//
//    }
}
