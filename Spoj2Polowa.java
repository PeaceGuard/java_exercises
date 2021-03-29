package com.company;
import java.util.Scanner;

public class Spoj2Polowa {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int t = input.nextInt();

        for (int i = 0; i < t; ++i) {
            Scanner input2 = new Scanner(System.in);
            String[] words = input2.nextLine().split("\\s+");

            for (String word : words) {
                String half_word = "";
                int half_length = word.length() / 2;
                for (int letter = 0; letter < half_length; ++letter) {
                    half_word += word.charAt(letter);
                }
                System.out.println(half_word);
            }
        }
    }
}