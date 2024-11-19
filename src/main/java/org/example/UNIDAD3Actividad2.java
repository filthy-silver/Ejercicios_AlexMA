package org.example;

import java.util.Arrays;
import java.util.Random;

public class UNIDAD3Actividad2 {
    static Random rdn = new Random();

    private static final int longitude = rdn.nextInt(50)+50;
    static int [] arr = new int[longitude];

    public static int[] removeDuplicates(int[] arr) {
        System.out.println("Array original: \n"+ Arrays.toString(arr));
        Arrays.sort(arr);
        System.out.println("Array ordenado: \n"+ Arrays.toString(arr));

        int count = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] != arr[i + 1]) {
                count++;
            } else {
            }
            if (arr[i + 1] == arr[arr.length-1] && arr[i] != arr[i + 1]) {
                count++;
            } else if (arr[i + 1] == arr[arr.length-1]){
            }
        }

        int [] arr2 = new int[count];

        count = 0;
        for (int i = 0; i < arr.length - 1 ; i++) {
            if (arr[i] != arr[i + 1]) {
                arr2[count] = arr[i];
                count++;
            }
            if ((i + 1) == arr.length - 1){
                arr2[count] = arr[i + 1];
            }
        }
        System.out.println("Se han eliminado "+ (arr.length - count) + " duplicados en un array de longitud "+longitude);
        return arr2;
    }

    public static void main(String[] args) {

        for (int i = 0; i < arr.length; i++) {
            arr[i] = rdn.nextInt(21) - 10;
        }

        int [] arrD = removeDuplicates(arr);
        Arrays.sort(arrD);
        System.out.println(Arrays.toString(arrD) + "\n");


        int [] arr = {1, 1, 2, 2, 3, 4, 5, 5, 6, 7, 7};
        int count = 0;

        System.out.println("Array: "+ Arrays.toString(arr));

        for (int i = 0; i < arr.length - 1; i++) {

            if (arr[i] != arr[i + 1]) {
                count++;
            } else {
            }
            if (arr[i + 1] == arr[arr.length-1] && arr[i] != arr[i + 1]) {
                count++;
            } else if (arr[i + 1] == arr[arr.length-1]){
            }
        }

        System.out.println("Se han eliminado "+ (arr.length - count) + " duplicados");

        int [] arr2 = new int[count];

        count = 0;
        for (int i = 0; i < arr.length - 1 ; i++) {
            if (arr[i] != arr[i + 1]) {
                arr2[count] = arr[i];
                count++;
            }
            if ((i + 1) == arr.length - 1){
                arr2[count] = arr[i + 1];
            }
        }

        System.out.println("Array sin duplicados: "+ Arrays.toString(arr2) + "\n");

        int [] arr3 = {1, 3, 4, 5, 6, 7, 8, 3, 4, 5, 6, 7, 4, 3, 3, 4, 5, 6, 8, 8, 2, 2, 1, 2, 3, 4, 5, 6, 8, 6, 5, 4,
                3, 2, 1, 2, 3, 4, 5, 6, 7, 8, 9, 0, 0, 9, 8, 7, 6, 5, 4, 3, 2, 1, 0, 9, 8, 7, 6, 5, 4, 3, 2, 0, 0};

        System.out.println("Array 3 original: "+ Arrays.toString(arr3));

        Arrays.sort(arr3);

        System.out.println("Array 3 ordenado: "+ Arrays.toString(arr3));

        count = 0;
        for (int i= 0; i < arr3.length - 1; i++) {
            if (arr3[i] == arr3[i+1]){
                arr3[i] = rdn.nextInt(10);
                count++;
            }
        }
        System.out.println("Se han recalculado "+count+" cifras\nArray 3 recalculado: "+ Arrays.toString(arr3));
        Arrays.sort(arr3);
        System.out.println("Array 3 recalculado ordenado: "+ Arrays.toString(arr3));

        count = 0;

        for (int i = 0; i < arr3.length - 1; i++) {

            if (arr3[i] != arr3[i + 1]) {
                count++;
            }
            if (arr3[i + 1] == arr3[arr.length-1] && arr3[i] != arr3[i + 1]) {
                count++;
            }
        }

        int [] arr4 = new int[count];

        count = 0;
        for (int i = 0; i < arr3.length - 1 ; i++) {
            if (arr3[i] != arr3[i + 1]) {
                arr4[count] = arr3[i];
                count++;

            }
            if ((i + 1) == arr3.length - 1){
                arr4[count] = arr3[i + 1];
            }
        }

        System.out.println("Se han eliminado "+ (arr3.length - count) + " duplicados\nArray 3 sin duplicados: "+ Arrays.toString(arr4));

    }
}
