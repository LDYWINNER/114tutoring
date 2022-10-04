package com.company;

public class CountInRange {

    public static int countInRange (int[] integers, int a, int b) {
        int upper, lower;
        int total = 0;
        if(a > b) {
            upper = a;
            lower = b;
        } else {
            upper = b;
            lower = a;
        }
        for (int integer : integers) {
            if(upper >= integer && lower <= integer) {
                total ++;
            }
        }
        return total;
    }

    public static void main(String[] args) {
        int[] al = {14, 1, 22, 17, 36, 7, -43, 5};
        System.out.println(countInRange(al, 17, 4));
    }
}
