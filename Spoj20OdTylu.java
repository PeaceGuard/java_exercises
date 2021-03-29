package com.company;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Spoj20OdTylu {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String numbers = input.nextLine();
        String[] split_numbers = numbers.split("\\s+");
        Collections.reverse(Arrays.asList(split_numbers));
        //System.out.println(Arrays.toString(split_numbers));
        System.out.println(String.join(" ", split_numbers));
    }
}