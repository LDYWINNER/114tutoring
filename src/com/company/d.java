package com.company;

import java.util.Scanner;

public class d{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter an integer (int):");
        int x1 = scan.nextInt();
        System.out.print("Enter an integer (int) :");
        int x2 = scan.nextInt();
        System.out.print("Enter an integer (int) :");
        int y1= scan.nextInt();
        System.out.print("Enter an integer (int) :");
        int y2 = scan.nextInt();

        double result = distance(x1, y1, x2, y2);
        System.out.println(result);
    }
    public static double distance (int x1, int y1, int x2, int y2){
        int examp1= (x2-x1);
        double rootmaker1= Math.pow(examp1,2);
        int examp2= (y2-y1);
        double rootmaker2= Math.pow(examp2,2);
        double result1= rootmaker1+rootmaker2;
        double result2 = Math.pow(result1,0.5);
        return result2;
    }
}
