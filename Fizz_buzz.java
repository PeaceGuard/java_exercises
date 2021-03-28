package com.company;
import java.util.Scanner;

public class Fizz_buzz {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num_digits = input.nextInt();

        for (int i = 1; i <= num_digits; ++i) {
            if (i % 3 == 0 && i % 5 != 0) {
                System.out.println("Fizz");
            } else if (i % 3 != 0 && i % 5 == 0) {
                System.out.println("Buzz");
            } else if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("Fizz Buzz");
            } else {
                System.out.println(i);
            }
        }
    }
}