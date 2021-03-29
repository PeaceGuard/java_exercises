package com.company;

public class Sum100Div7 {

    public static void main(String[] args) {
        int tot = 0;
        int num = 7;
        for (int i = 1; i <= 100; ++i) {
            tot += num;
            num += 7;
        }
        System.out.println("For: The sum of first 100 natural numbers is " + tot + ".");

        int number = 7;
        int total = 0;
        int j = 1;
        while (j <= 100) {
            total += number;
            number += 7;
            j += 1;
        }
        System.out.println("While: The sum of first 100 natural numbers is " + total + ".");
    }
}