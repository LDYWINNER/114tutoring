package com.company;

import java.util.Scanner;

public class bin2Dec {
    public static int bin2Dec (String binaryString) {
        int decimal = 0;
        for (int i = binaryString.length() - 1; i >= 0; i--) {
            char c = binaryString.charAt(i);
            if (c == '1') {
                decimal += (int)(Math.pow(2, binaryString.length() - i - 1));
            }
        }
        return decimal;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a binary number: ");
        String binaryString = sc.next();
        System.out.print("Decimal number is: " + bin2Dec(binaryString));
    }
}
