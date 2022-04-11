package com.company;

public class Rotate {

    public static void rotate(int[][] matrix, int numColumns, char direction) {
        for(int i = 0; i < matrix.length; i++) {
            if(numColumns <= 0) {
                return;
            } else {
                if(direction == 'l') {
                    for(int j = 0; j < numColumns; j++) {
                        int temp = matrix[i][0];
                        //matix[i]



                        matrix[i][0] = matrix[i][matrix[i].length - 1];
                        matrix[i][matrix[i].length - 1] = temp;
                    }
                } else {
                    for(int j = 0; j < numColumns; j++) {
                        int temp = matrix[i][matrix[i].length - 1];
                        matrix[i][matrix[i].length - 1] = matrix[i][0];
                        matrix[i][matrix[i].length - 1] = temp;
                    }
                }
            }
        }
    }

    public static void main(String[] args) {

    }
}
