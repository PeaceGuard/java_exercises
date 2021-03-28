package com.company;
import java.util.Scanner;

public class Spoj04_pesel {

    public static void main(String[] args) {
        Scanner input_scanner = new Scanner(System.in);
        int test_num = input_scanner.nextInt();

        StringBuilder result = new StringBuilder();

        for (int i = 0; i < test_num; ++i) {

            String pesel = input_scanner.next();
            int total = 0;
            final int[] pesel_coefficients = {1, 3, 7, 9, 1, 3, 7, 9, 1, 3, 1};
            for (int j = 0; j <= 10; ++j) {
                total += (pesel.charAt(j) - '0') * pesel_coefficients[j];
                /*String pesel_coefficients = "13791379131";
                total += (pesel.charAt(j) - '0') * (pesel_digits.charAt(j) - '0');*/
            }
            System.out.println(total);
            if (total % 10 == 0) {
                result.append("D");
            }
            else {
                result.append("N");
            }
        }
        for (int k = 0; k < result.length(); ++k) {
            System.out.println(result.charAt(k));
        }
    }
}