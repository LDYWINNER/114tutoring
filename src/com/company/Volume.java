package com.company;


import java.util.Scanner;

public class Volume {

    public static void main (String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Volume1:");
        System.out.print("Enter gallons (int):");
        int gallons = scan.nextInt();
        System.out.print("Enter quarts (int):");
        int quarts = scan.nextInt();
        System.out.print("Enter cups (int):");
        int cups= scan.nextInt();
        
        Scanner scan2 =new Scanner(System.in);
        System.out.println("Volume2:");
        System.out.print("Enter gallons (int):");
        int gallons2 = scan2.nextInt();
        System.out.print("Enter quarts (int):");
        int quarts2 = scan2.nextInt();
        System.out.print("Enter cups (int):");
        int cups2= scan2.nextInt();


        int resultofgallon= gallons+gallons2;
        int resultofquarts= quarts+quarts2;
        int resultofcups= cups+cups2;

        if(resultofcups > 4) {
            int temp1 = resultofcups / 4;
            resultofcups %= 4;
            resultofquarts += temp1;
        }

        if(resultofquarts > 4) {
            int temp2 = resultofquarts / 4;
            resultofquarts %= 4;
            resultofgallon += temp2;
        }

        System.out.print("Totals: " + "Gallons: " + resultofgallon + "Quarts: " + resultofquarts + "Cups: " + resultofcups);
    }


}
