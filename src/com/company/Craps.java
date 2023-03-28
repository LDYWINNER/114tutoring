package com.company;

import java.util.Scanner;
import java.util.Random;

public class Craps {
    static int point = 0;

    public static char evaluateRoll(Integer currentPoint, Integer roll1, Integer roll2) {
        int totalRoll = roll1 + roll2;

        if ((currentPoint != 0) && (totalRoll == currentPoint)) {
            return 'w';
        } else if ((currentPoint != 0) && totalRoll == 7) {
            return 'l';
        }

        if ((currentPoint == 0) && (totalRoll == 7 || totalRoll == 11)) {
            return 'w';
        } else if ((currentPoint == 0) && (totalRoll == 2 || totalRoll == 3 || totalRoll == 12)) {
            return 'l';
        }

        else {
         if ((currentPoint == 0) && (totalRoll == 4 || totalRoll == 5 || totalRoll == 6 || totalRoll == 8 || totalRoll == 9 || totalRoll == 10)) {
             currentPoint = totalRoll;
             System.out.print("Point: " + currentPoint);
             return 'p';
         } else {
             return 'c';
         }
        }
    }

    public static Integer roll() {
        Random rd = new Random();
        return rd.nextInt(6) + 1;
    }

    public static void main (String[]args){
        Scanner sc = new Scanner(System.in);
        while(true) {
            System.out.print("Play Craps? (y/n) ");
            String yesOrNo = sc.nextLine();
            if (yesOrNo.equals("y")) {
                point = 0;
                while(true) {
                    int roll1 = roll();
                    int roll2 = roll();
                    System.out.print("(" + roll1 + ", " + roll2 + ")");
                    char rollResult = evaluateRoll(point, roll1, roll2);
                    if (rollResult == 'w') {
                        System.out.println(" Player wins!");
                        break;
                    } else if (rollResult == 'l') {
                        System.out.println(" Player looses!");
                        break;
                    } else if (rollResult == 'p') {
                        point = roll1 + roll2;
                    }
                }
            } else if (yesOrNo.equals("n")) {
                System.out.println("Thanks for playing!");
                break;
            }
        }
    }
}




