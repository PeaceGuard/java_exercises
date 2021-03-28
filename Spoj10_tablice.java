package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Spoj10_tablice {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        input.nextLine();  // Consume newline left-over
        for (int i = 0; i < t; ++i) {
            String[] s = input.nextLine().split("\\s+");
            ArrayList<String> digits_list = new ArrayList<>(Arrays.asList(s));
            //digits_list = ArrayUtils.remove(digits_list, index);
            digits_list.remove(0);
            Collections.reverse(digits_list);
            System.out.println(String.join(" ", digits_list));

            /*for (String digit : digits_list) {
                System.out.print(digit);
            }*/
        }
        System.out.println(); // Printing with end = "" instead of /n
    }
}