package com.company;

public class Series {

    public static double whileSeries (double x, int n) {
        int i = 1;
        double result = 0;
        while (i <= n) {
            if(i % 2 == 0) {
                result = result + (-1 * i * Math.pow(x, i));
            } else {
                result += (i * Math.pow(x, i));
            }
            i++;
        }
        return result;
    }

    //Wrong
    public static double forSeries(double x, int n) {
        double term = 1, sum = 0;
        for (int i = 1; i <= n; i++) {
            term = i * Math.pow(x, i) + Math.pow((-x), i-1);
            sum += term;
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(whileSeries(0.75, 1));
        System.out.println(whileSeries(0.5, 3));
        System.out.println(whileSeries(0.35, 7));
    }
}
