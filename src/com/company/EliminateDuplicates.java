package com.company;

import java.util.Locale;

public class EliminateDuplicates {

    public static String[] eliminateDuplicates(String str) {
        String left = "";
        String duplicates = "";

        int temp = 0;
        while(true) {
            if(str.length() == 0) {
                break;
            } else {
                for(int i = 0; i < str.length(); i++){

                    if(str.charAt(i) == str.charAt(temp)) {

                    }

                }
                temp ++;
            }
        }


        return new String[] {left, duplicates};
    }

    public static void main(String[] args) {
        String[] retStrings1 = eliminateDuplicates("abracadabra");
        System.out.println((retStrings1[0] + ", " + retStrings1[1]));

        String[] retStrings2 = eliminateDuplicates("Stony Brook University");
        System.out.println((retStrings2[0] + ", " + retStrings2[1]));

        String[] retStrings3 = eliminateDuplicates("This is a test sentence.");
        System.out.println((retStrings3[0] + ", " + retStrings3[1]));
    }
}
