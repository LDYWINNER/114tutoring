package com.company;

import java.util.Arrays;
public class Corrector {
    public static int counter = -1;
    public static String[] words;

    public static void main(String args[]) {
        splitInput(DictDoc.doc);
        String check = "hve";
        System.out.println( check + " is misspelled. Did you mean(?)");
        for (String word : words) {
            System.out.println(Arrays.toString(checkSwap(word)));
        }
    }



    public static void splitInput(String doc) {
        words = doc.replaceAll("[^a-zA-Z ]", "").split("\\s+");
    }

    public static String getNextWord() {
        counter++;
//        System.out.println(words[counter]);
        return words[counter];
    }

    public static Boolean checkInDict(String[] dict, String word){
        for (String s : dict) {
            if (s.equals(word.toLowerCase())) {
                return true;
            }
        }
        return false;
    }

    public static String[] checkSwap(String rawWord) {
        String[] tempResult = new String[10];
        int count = 0;
        for (int i = 0; i < rawWord.length() - 1; i++) {
            String tempWord = rawWord.substring(0, i) + rawWord.charAt(i + 1) + rawWord.charAt(i) + rawWord.substring(i + 2);
            System.out.println(tempWord);
            if(checkInDict(DictDoc.dict, tempWord)) {
                tempResult[count] = tempWord;
                count++;
            }
        }
        String[] result = new String[count];
        for (int j = 0; j < count; j++) {
            result[j] = tempResult[j];
        }
        return result;
    }

    public static String[] checkMissing(String rawWord) {
        return new String[]{"d"};
    }
    public static String[] checkExtra(String rawWord) {
        return new String[]{"d"};
    }
}

