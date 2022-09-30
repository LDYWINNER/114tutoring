package com.company;
import java.util.Scanner;

/*

We saw how to iterate using while loops so far.  We will see another
kind of a loop, i.e., 'for' loop.

For loops:

  The syntax (format, grammar) of a for loop is of the following form:

        for (<init>; <test>; <modify>) <body>;

  <test> can be any legal logical (boolean) expression.
  <body> can be any statement, a single statement or a compound
         statement (i.e., a bunch of statements enclosed in a pair of
         curly braces).
  <init> is where you establish a loop control variable with an
         initial value.
  <modify> is where you update the value of the loop control variable
         that you set up in <init> so that you will eventually get out
         of the loop.

  The semantics (meaning) of it is: execute <init> first - ONCE!
  Then, evaluate <test> next.  If the <test> evaluates to false, then
  end the loop and continue with the line following the loop.  If the
  <test> evaluates to true on the other hand, do the <body>.  Then,
  execute <modify> next.  Then evaluate <test> again and repeat until
  it exits the loop.  Here again, you will want to modify something
  in the <modify> part of the loop so that <test> will eventually
  evaluate to false.  You can make modification(s) in the <body>
  part of the loop in addition to or instead of in <modify>.
  Usually, it is easier to understand your program if you do it in
  the <modify> part.   Here is a way to create an infinite loop with
  a for loop:

        for (;;) <body>;

  That is, all three parts inside the parentheses are optional.
  You can have 0, 1, 2, or 3 of those components inside the pair of
  parentheses depending on what you want to express.

 */

import java.util.Scanner;

public class ForLoops {

    public static void printNumbers1 (int maxCount) {

        int i = 1;
        while (i <= maxCount) {
            System.out.println("while i: " + i);
            i = i + 1;
        }

        System.out.println();

        // This for loop is equivalent to the while loop above.
        for( int x = 1; x <= maxCount; x = x+1 ) {
            System.out.println("for x: " + x);
        }
    }

    public static void printNumbersBackwards () {

        System.out.println("printNumbersBackwards");

        // Notice the different conditions for the for loop here.
        for( int x = 10; x >= 0; x = x-2 ) {
            System.out.println("x: " + x);
        }

        System.out.println();
    }

    public static void printStringByCharacter (String exampleString) {

        System.out.println("String '" + exampleString + "' has length: " + exampleString.length());

        for(int x = 0; x < exampleString.length(); x++) {
            char ch = exampleString.charAt(x);

            System.out.println("Character: " + ch);
        }
        System.out.println();
    }

    public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);

        printNumbers1(5);

        System.out.println();

        printNumbersBackwards();

        printStringByCharacter("Test");
    }

}

