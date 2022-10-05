package com.company;

public class FindDuplicates2 {

        public static int[] findDuplicates(int[] input) {
            int[] result = new int[input.length];
            int j = 0;
            for(int i = 0; i < input.length; i++){
                if(isPresent(input, input[i])){
                    result[j] = input[i];
                    j++;
                }
            }
            return result;
        }

        public static boolean isPresent(int[] array, int num1){
            for (int i = 0; i < array.length; i++){
                if (array[i] == num1){
                    return true;
                }
            }
            return false;
        }

        public static void printArray(int[] input){
            for (int i = 0; i < input.length; i++){
                System.out.print(input[i] + " ");
            }
        }

        public static String findDuplicates(String str){
            String result = "";
            for (int i = 0; i < str.length(); i++) {
                if (isPresent(str, str.charAt(i))) {
                    result = result + str.charAt(i);
                }
            }
            return result;
        }

        public static boolean isPresent (String sentence, char character) {
            for (int i = 0; i < sentence.length(); i++) {
                if (sentence.charAt(i) == character) {
                    return true;
                }
            }
            return false;
        }

        public static void printString (String sentence) {
            System.out.println(sentence);
        }


        public static void main(String[] args){
            int[] array1 = {5,10,21,105,-4,3,21,13,-3,-3,44,103,17};
            int[] array2 = {-3,88,14,3,17,5,21,105,-4,21,13,-3,-3,44,88,88,88,103,17};

            String sentence1 = "abracadabra";
            String sentence2 = "SUNY, Korea";
            String sentence3 = "Stony Brook University";
            String sentence4 = "This is a sentence.";

            System.out.println("Find Duplicates(Arrays)");
            System.out.println("Test Case 1: ");
            System.out.println("Original: ");
            printArray(array1);
            System.out.print("\n");
            System.out.print("Duplicates: ");
            printArray(findDuplicates(array1));
            System.out.print("\n");

            System.out.println("Find Duplicates(Arrays)");
            System.out.println("Test Case 2: ");
            System.out.print("Original: ");
            printArray(array2);
            System.out.print("\n");
            System.out.println("Duplicates: ");
            printArray(findDuplicates(array2));
            System.out.print("\n");

            System.out.println("Find Duplicates(Strings)");
            System.out.println("Test Case 1: ");
            System.out.println("Original: " + sentence1);
            System.out.println("Duplicates: ");
            printString(findDuplicates(sentence1));
            System.out.print("\n");


            System.out.println("Find Duplicates(Strings)");
            System.out.println("Test Case 2: ");
            System.out.println("Original: " + sentence2);
            System.out.println("Duplicates: ");
            printString(findDuplicates(sentence2));
            System.out.print("\n");

            System.out.println("Find Duplicates(Strings)");
            System.out.println("Test Case 3: ");
            System.out.println("Original: " + sentence3);
            System.out.println("Duplicates: ");
            printString(findDuplicates(sentence3));
            System.out.print("\n");

            System.out.println("Find Duplicates(Strings)");
            System.out.println("Test Case 4: ");
            System.out.println("Original: " + sentence4);
            System.out.println("Duplicates: ");
            printString(findDuplicates(sentence4));
            System.out.print("\n");
        }
}
