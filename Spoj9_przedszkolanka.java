package com.company;

import java.util.Scanner;

public class Spoj9_przedszkolanka {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int test_num = input.nextInt();

        for (int i = 0; i < test_num; ++i) {
            Scanner input2 = new Scanner(System.in);
            String[] kid_numbers = input2.nextLine().split("\\s+");

            int group_a = Integer.parseInt(kid_numbers[0]);
            int group_b = Integer.parseInt(kid_numbers[1]);

            int bigger_num = Math.max(group_a, group_b);
            while (bigger_num % group_a != 0 || bigger_num % group_b != 0) {
                bigger_num += 1;
            }
            int lcm = bigger_num;
            System.out.println(lcm);
        }
    }
}