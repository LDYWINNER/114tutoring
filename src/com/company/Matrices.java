package com.company;

import java.util.Random;

public class Matrices {

    public static void main (String[] args) {
        int[][] m1 = {{3, 4, 2}};
        int[][] m2 = {{13, 9, 7, 15},
                {8, 7, 4, 6},
                {6, 4, 0, 3}};
        int[][] resmat = multiply (m1, m2);

        System.out.println("Final: ");
        print2D(resmat);
        int[][] newresmat = scale(resmat, 3);
        print2D(newresmat);

        int[][] jag1 = new int[5][0];
        Random myrand = new Random();

        for (int i = 0; i < 5; i++) {

            jag1[i] = new int[myrand.nextInt(10)+1];
            for (int j = 0; j < jag1[i].length; j++) {
                jag1[i][j] = myrand.nextInt(10);
            }
        }

        print2D(jag1);
        int[][] jag2 = scale(jag1, 5);

        print2D(jag2);


    }

    public static void print2D(int[][] matrix){
        for (int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
    public static int[][] multiply(int[][] m1, int[][] m2){
        int[][] result = new int [m1.length][m2[0].length];
        for(int i=0; i<m1.length; i++){
            for(int j=0; j<m2[0].length; j++){
                for(int k=0; k<m1[0].length; k++){
                    result[i][j] += m1[i][k] * m2[k][j];
                }
            }
        }
        return result;
    }

    public static int[][] scale(int[][] m1, int factor){
        int array[][] = new int[m1.length][];
        for (int i=0; i<m1.length; i++){
            array[i] = new int[m1[i].length];
            for(int j=0; j<m1[i].length; j++){
                array[i][j] = m1[i][j]*factor;
            }
        }
        return array;

    }
}



