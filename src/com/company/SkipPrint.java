package com.company;

import java.util.Scanner;

public class SkipPrint {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        if (num <= 0) {
            System.out.println("The number is not a positive");
            return;
        }

        skipPrint(num);
        sc.close();
    }

    public static void skipPrint(int num) {
        for (int i = 0; i <= num; i++) {
            if (i % 3 == 0 || i % 5 == 0) {
                if (i < 1) {
                    System.out.println(i);
                }
                continue;
            }
            System.out.println(i);
        }
    }
}
