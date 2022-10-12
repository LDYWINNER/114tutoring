package com.company;

import java.util.Random;
public class ArrUtils {

    public static int[] randomArray(int upper, int size) {
        Random random = new Random();
        int[] array = new int[size];

        for(int i = 0; i < size; i++) {
            array[i] = random.nextInt(upper + 1);
        }
        return array;
    }

    public static StringBuilder print(int[] array) {
        StringBuilder temp = new StringBuilder();
        for (int j : array) {
            temp.append(j).append(" ");
        }
        return temp;
    }

    public static int arrSum(int[] array) {
        int sum = 0;
        for(int i : array) {
            sum += i;
        }
        return sum;
    }

    public static Boolean contains(int target, int[] array) {
        for(int i : array) {
            if(i == target) {
                return true;
            }
        }
        return false;
    }

    public static int indexof(int target, int[] array) {
        for(int i = 0; i < array.length; i++) {
            if(array[i] == target) {
                return i;
            }
        }
        return -1;
    }

    public static Boolean isMultiple(int divisor, int target) {
        return target % divisor == 0;
    }

    public static int countMultiplesOf(int divisor, int[] array) {
        int total = 0;
        if(divisor == 0) {
            total = array.length;
        } else {
            for(int i : array) {
                if(isMultiple(divisor, i)) {
                    total += 1;
                }
            }
        }
        return total;
    }

    public static int largest(int[] array) {
        int temp = array[0];
        for(int i : array) {
            if(i > temp) {
                temp = i;
            }
        }
        return temp;
    }

    public static int[] buildHistogram(int[] scores) {
        int largest = largest(scores);
        int size = largest + 1;

        // Initializing with 0
        int[] hist = new int[size];
        for(int i = 0; i < size; i++) {
            hist[i] = 0;
        }

        for(int j : scores) {
            hist[j] += 1;
        }
        return hist;
    }

    public static void printHistogram(int[] hist) {
        for(int j = 0; j < hist.length; j++) {
            StringBuilder star = new StringBuilder();
            for(int k = 0; k < hist[j]; k++) {
                star.append("*");
            }
            System.out.println(j + ": " + hist[j] + ": " + star);
        }
    }

    public static void main(String[] args) {
        // 2.
        int[] temp1 = randomArray(21, 101);
        //int[] temp1 = {21, 3, 12, 8, 3, 16, 2, 7, 18, 11, 4, 5, 12, 13, 6, 0, 16, 11, 19, 18, 11, 7, 17, 17, 20, 17, 0, 6, 8, 3, 3, 14, 19, 2, 2, 12, 21, 19, 18, 0, 11, 10, 8, 10, 21, 9, 5, 18, 5, 13, 17, 7, 4, 14, 0, 0, 12, 8, 6, 11, 12, 18, 14, 6, 14, 15, 3, 7, 11, 0, 2, 2, 1, 5, 2, 15, 7, 13, 7, 14, 20, 8, 21, 16, 2, 14, 2, 2, 13, 10, 16, 20, 12, 5, 9, 11, 20, 8, 4, 20, 1};
        //System.out.println(temp1);
        System.out.println();

        // 4.
        System.out.println(print(temp1));
        System.out.println();

        // 6.
        double average = (arrSum(temp1) + 0.0) / temp1.length;
        System.out.print("Average of the array with integers: ");
        System.out.printf("%.2f", average);
        System.out.println();
        System.out.println();

        //8.
        System.out.println(contains(14, temp1));
        System.out.println();

        //10.
        System.out.println(indexof(14, temp1));
        System.out.println();

        //12.
        System.out.println(countMultiplesOf(7, temp1));
        System.out.println();

        // 14.
        int[] histogram = buildHistogram(temp1);

        // 15.
        printHistogram(histogram);
    }
}

