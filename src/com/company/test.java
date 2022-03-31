package com.company;

public class test {
    public static void main(String[] args) {
        int change = 486;
        int temp1 = change / 500;
        change = change % 500;
        System.out.println(temp1);
        System.out.println(change);
        System.out.println();

        int temp2 = change / 200;
        change = change % 200;
        System.out.println(temp2);
        System.out.println(change);
        System.out.println();

        int temp3 = change / 100;
        change = change % 100;
        System.out.println(temp3);
        System.out.println(change);
        System.out.println();
    }
}
