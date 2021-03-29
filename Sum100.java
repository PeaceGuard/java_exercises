package com.company;
import java.util.stream.IntStream;

public class Sum100 {

    public static void main(String[] args) {
        int tot = 0;
        for (int num = 1; num <= 100; ++num) {
            tot += num;
        }
        System.out.println("For: The sum of first 100 natural numbers is " + tot + ".");

        int number = 1;
        int total = 0;
        while (number <= 100) {
            total += number;
            number += 1;
        }
        System.out.println("While: The sum of first 100 natural numbers is " + total + ".");

        int tota = 0;
        IntStream intStream = IntStream.range(1, 101);
        intStream.forEach(System.out::println); // check ::
        System.out.println("Sum/range: The sum of first 100 natural numbers is " + tota + ".");
    }
}