package com.company;

import java.util.Arrays;

public class FindDuplicates {

    public static void printArray(int[] input) {
        for(int num : input) {
            System.out.printf(num + " ");
        }
        System.out.println();
    }

    public static boolean isPresent(int[] arr, int i) {
        int count = 0;

        for(int num : arr) {
            if(num == i) {
                count++;
            }
        }

        return count > 1;
    }

    public static int[] findDuplicates(int[] input) {
        int[] temp = new int[input.length];
        int index = 0;
        for (int num : input) {
            if (isPresent(input, num)) {
                System.out.println("temp");
                System.out.println(Arrays.toString(temp));
                temp[index] = num;
                index++;
            }
        }


        return result;
    }

    public static void main(String[] args) {
        int[] input = {5, 10, 2, 17, 31, 17, 10, 14, 2};
        printArray(input);
        int[] result = findDuplicates(input);
        printArray(result);
    }
}
