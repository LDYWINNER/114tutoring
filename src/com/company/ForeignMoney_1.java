package com.company;

import java.util.Scanner;
public class ForeignMoney_1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number of shoos:");
        int shoos=scan.nextInt();
        System.out.println("Enter number of halters:");
        int halters=scan.nextInt();
        int totalhalters= (shoos*100)+halters;
        Scanner scan2= new Scanner(System.in);
        System.out.println("Enter bill used to pay (1,2,5,10,or 20):");
        int note= scan2.nextInt();
        int calculatehalter= note*100;
        int change= calculatehalter-totalhalters;

        System.out.println("Change:");
        int temp1=change/1000;
        int temp1remain1=change%1000;
        System.out.println("10 Shoo bills:"+ temp1);
        int temp2=temp1remain1/500;
        int temp2rm2=temp1remain1%500;
        System.out.println("5 Shoo bills:"+temp2);
        int temp3=temp2rm2/200;
        int temp3rm3=temp2rm2%200;
        System.out.println("2 Shoo bills:"+temp3);
        int temp4=temp3rm3/100;
        int temp4rm4=temp3rm3%100;
        System.out.println("1 Shoo bills:"+temp4);
        int temphalter1=temp4rm4/50;
        int temphal1rm1=temp4rm4%50;
        System.out.println("50 Halter coins:"+temphalter1);
        int temphalter2=temphal1rm1/10;
        int temphal2rm2=temphal1rm1%10;
        System.out.println("10 Halter coins:"+temphalter2);
        int temphalter3=temphal2rm2/5;
        int temphal3rm3=temphal2rm2%5;
        System.out.println("5 Halter coins:"+temphalter3);
        System.out.println("1 Halter coins:"+ temphal3rm3);
    }
}



