package com.company;
import java.util.Scanner;


public class EitherMultiple2 {
        public static boolean isEitherMultiple(int num1, int num2){
            int n = num1 % num2;
            int m = num2 % num1;
            boolean flag = true;
            if(m==0){
                flag = true;
            }
            if(n==0){
                flag = true;

            }
            if(m>0){
                flag = false;

            }
            if(n>0){
                flag = false;
            }
            return flag;
        }

        public static void main(String[] args){
            Scanner scan = new Scanner(System.in);
            System.out.println("Enter an integer: ");
            int x = scan.nextInt();

            Scanner scan2 = new Scanner(System.in);
            System.out.println("Enter an integer: ");
            int y = scan2.nextInt();

            System.out.println(isEitherMultiple(x,y));
        }


}
