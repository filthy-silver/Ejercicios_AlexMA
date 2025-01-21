package org.unidad1;

public class Testing {
    static int proceso1(int n1){
        int p1 = 0;
        for (int i = 0; i < n1; i+=2) {
            p1 += proceso2(i);
        }
        return p1;
    }

    static int proceso2(int n2){
        int p2 = 0;
        for (int i = 0; i < n2; i++) {
            p2 += n2;
        }
        return p2;
    }

    public static void main(String[] args) {
        System.out.println(proceso1(5));
    }
}


