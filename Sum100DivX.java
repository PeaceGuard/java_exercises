package com.company;
import java.util.Scanner;

public class Sum100DivX {

    public static int foo(String[] args) {
        int a = 0;
        return a;
    }
    public static Scanner bar() {
        Scanner inputSc = new Scanner(System.in);
        return inputSc;
    }
    public static void main(String[] args) {

        Scanner inputSc = bar();
        int divisor = inputSc.nextInt(); // exception handling - throw, try/catch?

        int tot = 0;
        int increm = divisor;
        for (int i = 1; i <= 100; ++i) {
            tot += increm;
            increm += divisor;
        }
        System.out.println("For: The sum of first 100 natural numbers is " + tot + ".");

        int number = divisor;
        int total = 0;
        int j = 1;
        while (j <= 100) {
            total += number;
            number += divisor;
            j += 1;
        }
        System.out.println("While: The sum of first 100 natural numbers is " + total + ".");
    }
}