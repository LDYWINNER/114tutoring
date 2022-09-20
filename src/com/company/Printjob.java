package com.company;

import java.util.Objects;
import java.util.Scanner;

public class Printjob{
    public static int computePrintJobCost(String colorType, String paperSize, int count){
        int cost = 0;

        if(Objects.equals(colorType, "Grayscale")){
            if(Objects.equals(paperSize, "A4")){
                cost = count*45;


            }
            else if(Objects.equals(paperSize, "A5")){
                cost = count*25;

            }
            else if(Objects.equals(paperSize, "Letter")){
                cost = count*35;

            }
            else if(Objects.equals(paperSize, "Legal")){
                cost = count*30;

            }

        }
        else if(Objects.equals(colorType, "Color")){
            if(Objects.equals(paperSize, "A4")){
                cost = count*55;
                System.out.println("hello");

            }
            else if(Objects.equals(paperSize, "A5")){
                cost = count*35;

            }
            else if(Objects.equals(paperSize, "Letter")){
                cost = count*45;

            }
            else if(Objects.equals(paperSize, "Legal")){
                cost = count*40;

            }

        }
        return cost;
    }

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter colortype papersize and count: ");
        String colortype = scan.next();
        String papersize = scan.next();
        int couNt = scan.nextInt();

        int cosT = computePrintJobCost(colortype, papersize, couNt);
        System.out.println("Print job cost: " + cosT );

    }
}

