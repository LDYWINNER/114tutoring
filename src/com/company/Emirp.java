package com.company;

public class Emirp {
    public static void main(String[] args) {
        int count = 0;
        int answer = 11;
        while (count < 100) {
            if (PrimeOrNot(answer)) {
                if (PrimeOrNot(reverse(answer))) {
                    if (answer!=reverse(answer)) {
                        System.out.print(answer + " ");
                        count++;
                        if (count % 10 == 0 && count >= 10) {
                            System.out.println();
                        }
                    }

                }
            }
            answer++;
        }
    }

    public static boolean PrimeOrNot(int answer){
        int count=0;
        for(int i=1; i<=answer; i++){
            if(answer%i==0){
                count++;
            }
        }
        return count == 2;
    }

    public static int reverse(int answer) {
        int reverse = 0;

        while (answer != 0) {
            reverse = reverse * 10 + answer % 10;
            answer /= 10;
        }
        return reverse;
    }
}
