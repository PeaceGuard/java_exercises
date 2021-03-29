package com.company;
import java.util.Scanner;

public class Spoj2Polowa {

    public static void main(String[] args) {

        Scanner inputSc = new Scanner(System.in);
        int t = inputSc.nextInt();
        inputSc.nextLine();

        for (int i = 0; i < t; ++i) {
            String[] words = inputSc.nextLine().split("\\s+");

            for (String word : words) {
                String halfWord = "";
                int halfLength = word.length() / 2;
                for (int letter = 0; letter < halfLength; ++letter) {
                    halfWord += word.charAt(letter);
                }
                System.out.println(halfWord);
            }
        }
    }
}