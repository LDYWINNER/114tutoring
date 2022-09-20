package com.company;

//Minseo Park
//minseo.park@stonybrook.edu
import java.util.Scanner;

public class Printjob2{
    public static int computePrintJobCost(String colorType, String paperSize, int count){
        int cost = 0;

        if(colorType.equals("Grayscale")){
            if(paperSize.equals ("A4")){
                cost = count*45;

            }
            else if(paperSize.equals("A5")){
                cost = count*25;

            }
            else if(paperSize.equals("Letter")){
                cost = count*35;

            }
            else if(paperSize.equals("Legal")){
                cost = count*30;

            }

        }
        if(colorType.equals("Color")){
            if(paperSize.equals("A4")){
                cost = count*55;

            }
            else if(paperSize.equals("A5")){
                cost = count*35;

            }
            else if(paperSize.equals("Letter")){
                cost = count*45;

            }
            else if(paperSize.equals("Legal")){
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

