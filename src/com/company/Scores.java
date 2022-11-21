package com.company;

import java.io.*;
public class Scores {
    public static String readALine(BufferedReader input){
        String line = "";
        try {
            line = input.readLine();
        }
        catch (IOException e) {
            System.out.println("Oops");
        }
        return line;
    }
    public static void main(String[] args) throws IOException {
        String input = "./scores.txt";
        BufferedReader br = new BufferedReader(new FileReader(input));
        PrintWriter output = new PrintWriter(new BufferedWriter(new FileWriter("scores.out")));
        String line;
        double totalsum;

        while((line = readALine(br))!=null) {
            String[] score = line.split(" ");
            totalsum = 0;
            for(int i = 1; i < 4;i++) {
                totalsum += Integer.parseInt(score[i]);
            }

            totalsum += Integer.parseInt(score[4])*2;

            double avg = totalsum/5.0;


            System.out.print(line);
            System.out.printf("     %.2f\n", avg);
            output.print(line);
            output.printf(".2f\n", avg);
        }

        br.close();
        output.close();
    }
}

