package com.company;
import java.util.Scanner;

public class Spoj1ProsteDod {

    public static void main(String[] args) {

        Scanner inputSc = new Scanner(System.in);
        int t = inputSc.nextInt();
        inputSc.nextLine();

        for (int i = 0; i < t; ++i) {
            int total = 0;
            int n = inputSc.nextInt();
            inputSc.nextLine();
            String numbers = inputSc.nextLine();
            String[] splitNumbers = numbers.split("\\s+");

            for (String number : splitNumbers) {
                total += Integer.parseInt(number);
            }
            System.out.println(total);
        }
    }
}
