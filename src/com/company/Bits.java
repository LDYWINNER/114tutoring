package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Bits{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter an integer greater than or equal to 0 (enter negative number to quit): ");
        int num1 = scan.nextInt();
        scan.close();
        int []num = new int[1000];
        if(num1 >= 0){
            int i = 0;
            while (num1>0){
                num[i] = num1 % 2;
                num1 = num1 / 2;
                i++;
            }
            for(int k = i - 1; k >= 0; k--){
                System.out.print(num[k]);
            }
        }
        else{
            System.out.println(" ");
        }
    }
}

// Not done