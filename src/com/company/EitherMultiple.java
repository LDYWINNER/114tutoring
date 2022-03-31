package com.company;

public class EitherMultiple {

    public static boolean isEitherMultiple1(int a, int b) {
        return a % b == 0 || b % a == 0;
    }

    public static boolean isEitherMultiple2(int a, int b) {
        if (a % b == 0 || b % a == 0) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        boolean r1 = isEitherMultiple1(3, 15);
        boolean r2 = isEitherMultiple1(5, 21);
        boolean r3 = isEitherMultiple1(33, 21);
        boolean r4 = isEitherMultiple1(120, 15);
        System.out.println(r1);
        System.out.println(r2);
        System.out.println(r3);
        System.out.println(r4);
    }
}
