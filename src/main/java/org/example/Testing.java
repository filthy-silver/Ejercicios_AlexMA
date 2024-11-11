package org.example;

public class Testing {
    public static void main(String[] args) {
//        int a = 1, b = 2, c = 3;
//        int resultado = a++ == 2 && c > b++ ? a += b : //b no se incrementa
//                a > 0 && a == b ? a += c :
//                        a == c ? a++ : a--; //a=5, b=2, c=3,resultado=5
//        System.out.println(a);

        int n = 0, m = 0, x;
        do {
            m += n;
            n--;
            x = m - n;
            System.out.println(x);
        } while (x >= 0);


    }


}
