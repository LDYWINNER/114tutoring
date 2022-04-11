package com.company;

import java.util.Arrays;

public class Rotate_2 {

    public static void rotate(int[][] matrix, int numColumns, char direction) {
        if (numColumns <= 0) {
            System.out.println("numColumns less than zero!");
        } else {
            if(direction == 'l') {
                for(int j = 0; j < matrix.length; j++) {
                    for (int m = 0; m < numColumns; m++) {
                        // 12345 -> 123451 -> 23451
                        int[] temp1 = new int[matrix[j].length + 1];
                        temp1[matrix[j].length] = matrix[j][0];
                        for(int n = 0; n < temp1.length - 1; n++) {
                            temp1[n] = matrix[j][n];
                        }
                        int[] result1 = new int[temp1.length - 1];
                        for(int b = 1; b < temp1.length; b++) {
                            result1[b - 1] = temp1[b];
                        }
                        matrix[j] = result1;
                        System.out.println(Arrays.toString(result1));
                    }
                }
            } else {
                for(int i = 0; i < matrix.length; i++) {
                    for (int l = 0; l < numColumns; l++) {
                        int[] temp2 = new int[matrix[i].length + 1];
                        temp2[0] = matrix[i][matrix[i].length - 1];
                        for(int k = 1; k < matrix[i].length; k++) {
                            temp2[k] = matrix[i][k - 1];
                        }
                        int[] result2 = new int[temp2.length - 1];
                        for(int a = 0; a < temp2.length - 1; a++) {
                            result2[a] = temp2[a];
                        }
                        matrix[i] = result2;
                        System.out.println(Arrays.toString(result2));
                    }
                }
            }
        }
    }

    public static void main(String[] args) {

        int[][] nums = {
                {1, 3, 5, 7, 9},
                {1, 2, 3},
                {10, 20, 30, 40, 50, 60},
                {7, 1},
                {2, 4, 6, 8}
        };

        rotate(nums, 3, 'l');
        rotate(nums, 2, 'l');
        rotate(nums, 3, 'r');
        rotate(nums, 2, 'r');
    }
}
