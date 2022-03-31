package com.company;

public class InterleaveArrays_1 {

    public static void arrayOutput(int[] array) {
        System.out.print("[ ");

        for (int i = 0; i < array.length; i++) {
            if (i == array.length - 1) {
                System.out.println(array[i] + " ]");
            } else {
                System.out.print(array[i] + ", ");
            }
        }
    }

    public static int[] interleaveArrays(int[] array1, int[] array2) {
        int[] interleaveArray = new int[array1.length + array2.length];

        for (int i = 0; i < interleaveArray.length / 2; i++) {
            interleaveArray[i * 2] = array1[i];
            interleaveArray[i * 2 + 1] = array2[i];
        }

        return interleaveArray;
    }

    public static int[] addition(int[] array1, int[] array2) {
        int[] result = new int[array1.length + array2.length];

        for (int i = 0; i < array1.length; i++) {
            result[i] = array1[i];
        }

        for (int i = 0; i < array2.length; i++) {
            result[i + array1.length] = array2[i];
        }

        return result;
    }

    public static int[] mergeArrays(int[] array1, int[] array2) {
        int[] combination = addition(array1, array2);

        for (int i = 0; i < combination.length; i++) {
            for (int j = 0; j < combination.length - (i + 1); j++) {
                if (combination[j] > combination[j + 1]) {
                    int lengths = combination[j + 1];
                    combination[j + 1] = combination[j];
                    combination[j] = lengths;
                }
            }
        }

        return combination;
    }

    public static void main(String[] args) {
        int[] interLeaveArray4 = interleaveArrays(new int[]{2, 6, 10, 14, 18}, new int[]{4, 8, 12, 16, 200});

        arrayOutput(interLeaveArray4);
    }
}
