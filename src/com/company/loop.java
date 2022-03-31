package com.company;

public class loop {

    public static void main(String[] args) {


        for (int i = 0; i < 13; i++) {
            if(!(i % 3 == 0 || i % 5 == 0)) {
                System.out.println(i);
            }
        }


    }
}
