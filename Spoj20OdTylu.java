package com.company;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Spoj20OdTylu {

    public static void main(String[] args) {
        Scanner inputSc = new Scanner(System.in);
        String numbers = inputSc.nextLine();
        String[] splitNumbers = numbers.split("\\s+");
        Collections.reverse(Arrays.asList(splitNumbers));
        //System.out.println(Arrays.toString(split_numbers));
        System.out.println(String.join(" ", splitNumbers));
    }
}