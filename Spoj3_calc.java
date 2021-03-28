package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;


public class Spoj3_calc {

    public static void main(String[] args) throws FileNotFoundException {

        File input_file = new File("/home/marek-stoppel/it/git/python_projects/calc");
        Scanner input = new Scanner(input_file);
        ArrayList<String> text = new ArrayList<>();
        while (input.hasNextLine()) {
            text.add(input.nextLine());
        }
        System.out.println(text);

        int result;
        for (String line : text) {
            String[] calculation = line.split("\\s+");
            System.out.println(Arrays.toString(calculation));
            if (calculation[0].equals("+")) {
                result = Integer.parseInt(calculation[1]) + Integer.parseInt(calculation[2]);
                System.out.println(result);
            } else if (calculation[0].equals("-")) {
                result = Integer.parseInt(calculation[1]) - Integer.parseInt(calculation[2]);
                System.out.println(result);
            } else if (calculation[0].equals("*")) {
                result = Integer.parseInt(calculation[1]) * Integer.parseInt(calculation[2]);
                System.out.println(result);
            } else if (calculation[0].equals("/")) {
                result = Math.floorDiv(Integer.parseInt(calculation[1]), Integer.parseInt(calculation[2]));
                System.out.println(result);
            } else if (calculation[0].equals("%")) {
                result = Integer.parseInt(calculation[1]) % Integer.parseInt(calculation[2]);
            }
        }
    }
}