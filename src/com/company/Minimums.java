package com.company;

import java.util.Scanner;
public class Minimums {

    public static int min4(int num1, int num2, int num3, int num4) {
        int smallest;
        smallest = min2(num1, num2);
        smallest = min2(smallest, num3);
        smallest = min2(smallest, num4);
        return smallest ;
    }

    public static int min2(int num1, int num2) {
        if(num1 > num2) {
            return num2;
        } else {
            return num1;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 4 integers on one line: ");
        int integer1 = sc.nextInt();
        int integer2 = sc.nextInt();
        int integer3 = sc.nextInt();
        int integer4 = sc.nextInt();
        System.out.print("The smallest of these is: " + min4(integer1, integer2, integer3, integer4));
    }
}
