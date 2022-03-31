package com.company;

import java.util.Arrays;

public class InterleaveArrays {

    public static int[] interleaveArrays(int[] array1, int[] array2) {
        int n = array1.length;
        int newlength = 2 * n;
        int[] newAr = new int [newlength];
        for(int i = 0; i < n; i++) {
            newAr[2 * i] = array1[i];
            newAr[2 * i + 1] = array2[i];
        }
        return newAr;
    }

    public static int[] mergeArrays(int[] array1, int[] array2) {
        int n1 = array1.length;
        int n2 = array2.length;
        int[] newArray = new int [n1 + n2];
        int n3 = newArray.length;
        int temp = 0;
        while(true) {
            if(array1.length == 1 && array2.length == 1) {
               if(array1[0] >= array2[0]) {
                   newArray[n3 - 2] = array2[0];
                   newArray[n3 - 1] = array1[0];
               } else {
                   newArray[n3 - 2] = array1[0];
                   newArray[n3 - 1] = array2[0];
               }
                break;
            } else if(array1.length == 0) {
                newArray[n3 - 2] = array2[0];
                newArray[n3 - 1] = array2[1];
                break;
            } else if(array2.length == 0) {
                newArray[n3 - 2] = array1[0];
                newArray[n3 - 1] = array1[1];
                break;
            }

            if(array1[0] <= array2[0]) {
                newArray[temp] = array1[0];
                temp ++;
                array1 = Arrays.copyOfRange(array1, 1, array1.length);
            } else {
                newArray[temp] = array2[0];
                temp ++;
                array2 = Arrays.copyOfRange(array2, 1, array2.length);
            }
            System.out.println(Arrays.toString(newArray));
        }

        return newArray;
    }

    public static void main(String[] args) {
        int[] res1 = mergeArrays(new int[]{2,5,15,20,25,40}, new int[]{10,20,30,40});
        System.out.println(Arrays.toString(res1));
        int[] res2 = mergeArrays(new int[]{1, 11, 31, 45, 77, 78, 79, 101}, new int[]{2, 5, 12, 80, 103, 120});
        System.out.println(Arrays.toString(res2));
    }
}
