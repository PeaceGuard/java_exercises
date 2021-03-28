package com.company;
import java.util.Scanner;

public class Spoj1_proste_dod {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int t = input.nextInt();

        for (int i = 0; i < t; ++i) {
            int total = 0;
            Scanner input2 = new Scanner(System.in);
            int n = input2.nextInt();
            Scanner input3 = new Scanner(System.in);
            String numbers = input3.nextLine();
            String[] split_numbers = numbers.split("\\s+");

            for (String number : split_numbers) {
                total += Integer.parseInt(number);
            }
            System.out.println(total);
        }
    }
}
