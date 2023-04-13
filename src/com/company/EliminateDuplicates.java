package com.company;


import java.util.Scanner;
public class EliminateDuplicates{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of integers you will give me: ");
        int size = sc.nextInt();
        int[] inArray = new int[size];

        System.out.print("Enter all of the integers now: ");
        for (int i = 0; i < size; i++) {
            inArray[i] = sc.nextInt();
        }
        int[] outArray = eliminateDuplicates(inArray, size);

        System.out.print("After elimination: ");
        for (int i = 0; i < outArray.length; i++) {
            System.out.print(outArray[i] + " ");
        }
        sc.close();
    }

    public static int[] eliminateDuplicates(int[] inArray, int size) {
        for (int i = 0; i < size; i++) {
            for (int j = i + 1; j < size; j++) {
                if (inArray[i] == inArray[j]) {
                    for (int k = j; k < size - 1; k++) {
                        inArray[k] = inArray[k + 1];
                    }
                    size--;
                    j--;
                }
            }
        }
        int[] outArray = new int[size];
        for (int i = 0; i < size; i++) {
            outArray[i] = inArray[i];
        }
        return outArray;
    }
}
