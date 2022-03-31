package com.company;

import java.util.Scanner;
public class Salary {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.print("Select employee type: (c) corporate (h) hourly (s) sales: ");

        String typeEmployee = scan.nextLine();

        if (typeEmployee.equals ("c")) {
            System.out.print("Enter your weekly salary: ");
            double weeklySalary = scan.nextDouble();

            double tax = weeklySalary * 0.145;
            double net = weeklySalary * 0.855;

            System.out.printf("Your gross pay is: %.2f", weeklySalary);

            System.out.printf(" Your tax is: %.2f", tax);
            System.out.printf(" Your net pay: %.2f", net);
        } else if (typeEmployee.equals ("h")) {
            System.out.print("Enter your hourly wage: ");
            double hourlyWage = scan.nextDouble();
            System.out.print("Enter hours you worked: ");
            double hoursWorked = scan.nextDouble();

            if (hoursWorked > 40){
                double newWage = 2 * hourlyWage;

                double tax = newWage * hoursWorked * 0.145;
                double net = hoursWorked * newWage * 0.855;
                double grossPay = newWage * hoursWorked;

                System.out.printf("Your gross pay is: %.2f", grossPay);
                System.out.printf(" Your tax is: %.2f", tax);
                System.out.printf(" Your net pay is: %.2f", net);
            } else {
                double tax = hourlyWage * hoursWorked * 0.145;
                double net = hoursWorked * hourlyWage * 0.855;
                double grossPay = hourlyWage * hoursWorked;

                System.out.printf("Your gross pay is: %.2f", grossPay);
                System.out.printf(" Your tax is: %.2f", tax);
                System.out.printf(" Your net pay is: %.2f", net);
            }
        } else if (typeEmployee.equals ("s")) {
            System.out.print("Enter weekly sales: ");
            double sales = scan.nextDouble();

            double tax = (500 + sales * 0.06) * 0.145;
            double net = (500 + sales * 0.06) * 0.855;
            double grossPay = (500 + sales * 0.06);

            System.out.printf("Your gross pay is: %.2f", grossPay);
            System.out.printf(" Your tax is: %.2f", tax);
            System.out.printf (" Your net is: %.2f", net);
        } else {
            System.out.println("Invalid");
        }
        scan.close();
    }
}

