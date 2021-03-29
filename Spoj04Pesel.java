package com.company;
import java.util.Scanner;

public class Spoj04Pesel {

    public static void main(String[] args) {
        Scanner inputSc = new Scanner(System.in);
        int testNum = inputSc.nextInt();

        StringBuilder result = new StringBuilder();

        for (int i = 0; i < testNum; ++i) {

            String pesel = inputSc.nextLine();
            int total = 0;
            final int[] peselCoefficients = {1, 3, 7, 9, 1, 3, 7, 9, 1, 3, 1};
            for (int j = 0; j <= 10; ++j) {
                total += (pesel.charAt(j) - '0') * peselCoefficients[j];
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