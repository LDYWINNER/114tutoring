package com.company;

//Minseo Park
//minseo.park@stonybrook.edu

public class Recursion{
    public static int powRec(int x, int y){
        if(y == 0){
            return 1;
        }
        else{
            return x*powRec(x,y-1);
        }
    }
    public static int largest(int[] aa){
        return largestRec(aa, 1, aa[0]);
    }
    public static int largestRec(int[] aa, int next, int largest){
        if(next<aa.length){
            if(aa[next]>largest){
                return largestRec(aa, next+1, aa[next]);
            }
            else{
                return largestRec(aa, next+1, largest);
            }
        }
        else{
            return largest;
        }
    }
    public static void reverseArray(int[] aa) {
        reverseArrayRec(aa, 0, aa.length-1);
    }
    public static void reverseArrayRec(int[] aa, int from, int to){
        int temp;
        if(from<=to){
            temp = aa[from];
            aa[from] = aa[to];
            aa[to] = temp;
            reverseArrayRec(aa, from+1, to-1);
        }
    }
    public static void main(String[] args){
        System.out.println("Power(2^3) = "+powRec(2,3));
        int[] array = {1,2,3,4,5,6,7,8,9,10};
        System.out.println("Original Array");
        for(int i = 0; i<array.length; i++){
            System.out.print(array[i]+" ");
        }
        System.out.println();

        reverseArray(array);
        System.out.println("Reverse Array");
        for(int i = 0; i<array.length; i++){
            System.out.print(array[i]+" ");
        }
        System.out.println();
        System.out.println("Largest element in Array");
        System.out.println(largest(array));
    }


}

