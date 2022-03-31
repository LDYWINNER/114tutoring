package com.company;

import java.util.Scanner;

public class ForeignMoney {
    public static void main(String[] args) {

        int Halter_Coin = 1;
        int shoos= 100 * Halter_Coin;

        int shoos_20 = 20 * shoos;
        int shoos_10 = 10 * shoos;
        int shoos_5 = 5 * shoos;
        int shoos_2 = 2 * shoos;

        int Halter_50Coin = 50;
        int Halter_10Coin = 10;
        int Halter_5Coin = 5;

        Scanner scan = new Scanner(System.in);

        System.out.println("→ Insert numbers of shoos / halters being spent");
        System.out.print("Enter number of shoos:   ");
        int Shoos = scan.nextInt();
        System.out.print("Enter number of halters: ");
        int Halters = scan.nextInt();
        System.out.println();

        int Totalhalters = (Shoos*100) + Halters;
        System.out.println("Total halters:         " + Totalhalters);
        System.out.println();

        System.out.print("Enter payment: "); //"Assume also that the payment is made with a single bill (1, 2, 5, 10 or 20 shoo note)."라고 적혀있으니 payment는 단일 shoo 지폐로 받는 방식입니다.

        int Payment = scan.nextInt();
        int Payment_in_halter = Payment * 100; //따라서 'Payment'를 100배 해주어서 halter로 고쳐야 합니다.
        System.out.println();

        System.out.println("Calculating... please wait.");
        System.out.println();
        int Change = Payment_in_halter - Totalhalters;
        System.out.println("Change:                " + Change);

        // 1172
        int No_Needed_Shoo10Notes = (Payment_in_halter - Totalhalters) / 1000;
        int LeftOver_10Note = (Payment_in_halter - Totalhalters) % 1000;                   // 172
        int No_Needed_Shoo5Notes = LeftOver_10Note / 500;
        int No_Needed_Shoo2Notes = LeftOver_10Note / 200;
        int No_Needed_ShooNotes = LeftOver_10Note / 100;
        int LeftOverFor_Note = LeftOver_10Note % 100;                     // 72

        int No_Needed_50HalterCoins = LeftOverFor_Note / 50;
        int LeftOverFor_50HalterCoins = LeftOverFor_Note % 50;            // 22
        int No_Needed_10HalterCoins = LeftOverFor_50HalterCoins / 10;
        int LeftOverFor_10HalterCoins = LeftOverFor_50HalterCoins % 10;   // 2
        int No_Needed_5HalterCoins = LeftOverFor_10HalterCoins / 5;
        int No_Needed_HalterCoins = LeftOverFor_10HalterCoins / 1;        // 0

        System.out.println("For change, You need...");
        System.out.println();
        System.out.println("────────────────────────────── Amount");
        //System.out.println("Need of (20 note) Shoos:        " + No_Needed_Shoo20Notes); "Assume the cost entered in shoos and halters will always be below 20 shoos." 라고 했으니 20 shoo note가 change로 나올 확률은 없습니다.
        System.out.println("Need of (10 note) Shoos:        " + No_Needed_Shoo10Notes);
        System.out.println("Need of (5 note) Shoos:         " + No_Needed_Shoo5Notes);
        System.out.println("Need of (2 note) Shoos:         " + No_Needed_Shoo2Notes);
        System.out.println("Need of (1 note) Shoos:         " + No_Needed_ShooNotes);

        System.out.println("Need of (50) Halter coins:      " + No_Needed_50HalterCoins);
        System.out.println("Need of (10) Halter coins:      " + No_Needed_10HalterCoins);
        System.out.println("Need of (5) Halter coins:       " + No_Needed_5HalterCoins);
        System.out.println("Need of (1) Halter coins:       " + No_Needed_HalterCoins);
        System.out.println();

        int Totalchange = ((No_Needed_Shoo10Notes*shoos_10) + (No_Needed_Shoo5Notes*shoos_5) + (No_Needed_Shoo2Notes*shoos_2) + (No_Needed_ShooNotes*shoos) + (No_Needed_50HalterCoins*Halter_50Coin) + (No_Needed_10HalterCoins*Halter_10Coin) + (No_Needed_5HalterCoins*Halter_5Coin) + (No_Needed_HalterCoins*Halter_Coin));
        System.out.println("Total change ──────────────── " + Totalchange + " Halters");
        System.out.println();

        System.out.println("→ Please insert number as written above for accurate calculation of change.");
        System.out.println();
        //System.out.print("Needed number of (20 note) Shoos:   ");
        //int No_Shoo20Notes = scan.nextInt();
        System.out.print("Needed number of (10 note) Shoos:   ");
        int No_Shoo10Notes = scan.nextInt();
        System.out.print("Needed number of (5 note) Shoos:    ");
        int No_Shoo5Notes = scan.nextInt();
        System.out.print("Needed number of (2 note) Shoos:    ");
        int No_Shoo2Notes = scan.nextInt();
        System.out.print("Needed number of (1 note) Shoos:    ");
        int No_ShooNotes = scan.nextInt();

        System.out.print("Needed number of (50) Halter coins: ");
        int No_Halter50Coin = scan.nextInt();
        System.out.print("Needed number of (10) Halter coins: ");
        int No_Halter10Coin = scan.nextInt();
        System.out.print("Needed number of (5) Halter coins:  ");
        int No_Halter5Coin = scan.nextInt();
        System.out.print("Needed number of Halter coins:      ");
        int No_HalterCoins = scan.nextInt();

        System.out.println();


        int Actualchange = (No_Shoo10Notes*shoos_10)+(No_Shoo5Notes*shoos_5)+(No_Shoo2Notes*shoos_2)+(No_ShooNotes*shoos)+(No_Halter50Coin*Halter_50Coin)+(No_Halter10Coin*Halter_10Coin)+(No_Halter5Coin*Halter_5Coin)+(No_HalterCoins*Halter_Coin);

        System.out.println("Calculating... Please Wait");
        System.out.println();
        System.out.println("Total                             " + Totalhalters + " Halters");
        System.out.println("Payment :                         " + Payment_in_halter + " Halters" );
        System.out.println();
        System.out.println("Expected change:                  " + (Payment_in_halter - Totalhalters) + " Halters");
        System.out.println("The change you will be given:     " + Actualchange + " Halters");

        scan.close();

        System.out.println();
        System.out.println("┌───────────────── Receipt ──────────────.....");
        System.out.println("│");
        System.out.println("│        Total halters: " + Totalhalters);
        System.out.println("│        Payment:       " + Payment);
        System.out.println("│        Your changes:  " + Actualchange);
        System.out.println("│");
        System.out.println("│        Caution!");
        System.out.println("│        Must check Expected change");
        System.out.println("│        Expected change: " + (Payment_in_halter - Totalhalters));
        System.out.println("│");
        System.out.println("│        Thank you! Please come again");
        System.out.println("│        For extra infomation,");
        System.out.println("│        Please call ☎ 010-4799-0156");
        System.out.println("└─────────────────────────────────────────.....");
        System.out.println();
        System.out.println("┌────────── Currency infomation ──────────.....");
        System.out.println("│        1 shoo = 100 Halter coins");
        System.out.println("│             Halter coin = 1");
        System.out.println("└─────────────────────────────────────────.....");


    }
}

