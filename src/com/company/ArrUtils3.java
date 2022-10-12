package com.company;

import java.util.Random;
public class ArrUtils3 {
    public static void main(String[] args) {
        int[] testArray = randomArray(21, 100);
        print1D(testArray);
    }

    public static int[] randomArray(int rangeMax, int count) {
        Random rand = new Random();
        int[] array = new int[count];

            for (int i = 0; i < array.length ; i++) {
                array[i] = rand.nextInt(rangeMax);
            }

        return array;
    }

    public static void print1D(int[] ary) {
        for (int i=0; i < ary.length; i++) {
            System.out.print(ary[i] + ", ");
        }
        System.out.println();
    }
}
