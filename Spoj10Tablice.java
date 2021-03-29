package com.company;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Spoj10Tablice {

    public static void main(String[] args) {

        Scanner inputSc = new Scanner(System.in);
        int t = inputSc.nextInt();
        inputSc.nextLine();
        for (int i = 0; i < t; ++i) {
            String[] s = inputSc.nextLine().split("\\s+");
            ArrayList<String> digitsList = new ArrayList<>(Arrays.asList(s));
            //digits_list = ArrayUtils.remove(digits_list, index);
            digitsList.remove(0);
            Collections.reverse(digitsList);
            System.out.println(String.join(" ", digitsList));
            /*for (String digit : digits_list) {
                System.out.print(digit);
            }*/
        }
        System.out.println(); // Printing with end = "" instead of /n
    }
}