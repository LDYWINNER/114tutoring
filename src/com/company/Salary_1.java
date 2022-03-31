package com.company;

import java.util.Scanner;
public class Salary_1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Select your employee type: (c)corporate, (h)hourly, (s)sales ");
        String type = scan.nextLine();
        if(type.equals("c")) {
            System.out.println("Write down your weekly salary:");
            double salary = scan.nextDouble();
            System.out.printf("Your gross pay is.. :$ %.2f", salary);
            double tax = salary*0.145;
            System.out.printf("Taxes is.. : $ %.2f", tax);
            double netpay = salary-tax;
            System.out.printf("Your net pay is.. : $ %.2f", netpay);

        }

        else if(type.equals("h")) {
            System.out.println("Please enter your hourly wage:");
            double wage = scan.nextDouble();
            System.out.printf("Please enter hours you worked:");
            double workhours = scan.nextDouble();
            double pay =0;
            if(workhours > 40) {
                pay = (wage*40)+2*wage*(workhours-40);
                System.out.printf("Your gross pay is.. : $ %.2f", pay);
            }
            else if(workhours <= 40) {
                pay = wage*40;
                System.out.printf("Your gross pay is.. :$ %.2f", pay);
            }
            double tax = pay*0.145;
            System.out.printf("Taxes is.. : $%.2f ", tax );
            double netpay = pay-tax;
            System.out.printf("Your net pay is.. :$ %.2f", netpay);
        }

        else if(type.equals("s")) {
            System.out.println("Write down your weekly sales:");
            double sales = scan.nextDouble();
            double sls = 500+(sales*0.06);
            System.out.printf("Your gross pay is.. : $%.2f", sls);
            double tax = sls*0.145;
            System.out.printf("Taxes is.. : $%.2f", tax);
            double netpay = sls-tax;
            System.out.printf("Your net pay is.. : $%.2f", netpay);
        }

    }
}

