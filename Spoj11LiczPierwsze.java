package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Spoj11LiczPierwsze {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int test_num = input.nextInt();
        List<String> result_list = new ArrayList<>(); // When use String[] and when ArrayList? And when other similar?

        for (int i = 0; i < test_num; ++i) {
            Scanner input2 = new Scanner(System.in);
            int number = input2.nextInt();

            int divisor = 2;
            double number_sq = Math.sqrt(number);
            while (divisor <= number_sq) {
                if (number % divisor == 0) {
                    result_list.add("NIE");
                    break;
                } else {
                    divisor += 1;
                }
            }
            if (number == 1) {
                result_list.add("NIE");
                continue;
            }
            if (divisor > number_sq) {
                result_list.add("TAK");
            }
        }

        for (String result : result_list) {
            System.out.println(result);
        }
    }
}
