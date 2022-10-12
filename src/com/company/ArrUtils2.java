package com.company;

import java.util.Random;
public class ArrUtils2 {
    public static int [] randomArray(int rangeMax, int count){
        int array[] = new int[count];
        Random rd = new Random();

        for(int i=0; i<count; i++){
            array[i]=rd.nextInt(rangeMax);
        }
        return array;
    }

    public static void print1D(int[] ary){
        int i;
        for(i=0; i<ary.length; i++){
            System.out.print(ary[i]+ " ");
        }

    }

    public static int arrSum(int[] theArray){
        int sum=0;
        for(int i=0; i<theArray.length; i++){
            sum = sum+theArray[i];
        }
        return sum;
    }
    public static boolean contains(int theValue, int[] theArray){
        int i;
        for(i=0; i<theArray.length; i++){
            if(theArray[i] == theValue){
                return true;
            }
        }
        return false;
    }

    public static int indexOf(int theValue, int[] theArray){
        int i;
        int a=-1;
        for(i=0; i<theArray.length; i++){
            if(theArray[i] == theValue){
                return i;
            }
        }
        return a;
    }

    public static int rightIndexOf(int theValue, int[] theArray){
        int i;
        int a=-1;
        for(i = theArray.length - 1; i >= 0; i--){
            if(theArray[i] == theValue){
                return i;
            }
        }
        return a;
    }

    public static boolean isMultiple(int value, int checkNumber){
        if(checkNumber % value == 0)
            return true;
        else{
            return false;
        }

    }
    public static int countMultiples(int checkNumber, int[] theArray){
        int b=0;
        for(int i=0; i<theArray.length; i++){
            if(isMultiple(checkNumber, theArray[i]))
                b++;
        }
        return b;

    }
    public static int getLargest(int[] theArray){
        int i;
        int max = theArray[0];
        for(i=0; i<theArray.length; i++)
            if(theArray[i]>max)
                max=theArray[i];
        return max;
    }


    public static int getMaxMinDifference(int[] theArray){
        int maxNum = theArray[0];
        int minNum = theArray[1];

        for(int i=0; i<theArray.length; i++){
            if(theArray[i] > maxNum){
                maxNum = theArray[i];
            }
            if(theArray[i] < minNum){
                minNum = theArray[i];
            }
        }
        return maxNum-minNum;


    }

    public static void main(String[] args) {


        int[] testArray = randomArray(21, 100);

        System.out.print("Test Array: ");
        print1D(testArray);
        System.out.print("Average is : ");
        System.out.println((double) arrSum(testArray) / testArray.length);
        System.out.println("testArray contains 12: " + contains(12, testArray));
        System.out.println("testArray indexOf 12: " + indexOf(12, testArray));
        System.out.println("testArray rightIndexOf 12: " + rightIndexOf(12, testArray));


        System.out.println("Test 2:");
        int[] testArray1 = randomArray(21, 7);
        System.out.print("Test Array: ");
        print1D(testArray1);
        System.out.println();
        System.out.print("Average is : ");
        System.out.println((double) arrSum(testArray1) / testArray1.length);
        System.out.println("testArray contains 12: " + contains(12, testArray1));
        System.out.println("testArray indexOf 12: " + indexOf(12, testArray1));
        System.out.println("testArray rightIndexOf 12: " + rightIndexOf(12, testArray1));
        System.out.println("testArray maxmindifference: " + getMaxMinDifference(testArray1));

        int[] testArray2 = {1, 1, 1, 5, 1, 3, 7, 4, 1, 2, 5, 5, 4, 5, 5, 1, 0, 0,};

        System.out.println("There are " + countMultiples(7, testArray2) + " multiples of 7");
        System.out.println("There are " + countMultiples(5, testArray2) + " multiples of 5");

        print1D(testArray2);



        int[] testArray3 = randomArray(10, 100);
        System.out.print("testArray3: ");
        print1D(testArray3);
        System.out.println();


        int[] testArray4 = {100, 10, 31, 25, -1, -3, 14, 51, -14, 20, 59};

        System.out.print("testArray4: ");
        print1D(testArray4);
        System.out.println();

        System.out.println("testArray4 maxmindifference: " + getMaxMinDifference(testArray4));

    }

}



