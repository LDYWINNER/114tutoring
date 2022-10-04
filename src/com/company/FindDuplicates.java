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
        int[] storage = new int[input.length];
        int storageIndex = 0;
        int tempIndex = 0;

        for (int i = 0; i < input.length; i++) {
            if(isPresent(input, input[i])) {
                boolean storeOrNot = true;

                for(int num : storage) {
                    if (num == input[i]) {
                        storeOrNot = false;
                        break;
                    }
                }

                if(storeOrNot) {
                    temp[tempIndex] = input[i];
                    tempIndex++;
                    storage[storageIndex] = input[i];
                    storageIndex++;
                }
            }
        }

        int[] result = new int[tempIndex];
        for(int j = 0; j < tempIndex; j++) {
            result[j] = temp[j];
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
