package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Spoj7_bmi {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int test_num = input.nextInt();

        List<String> underweight_list = new ArrayList<>();
        List<String> correctweight_list = new ArrayList<>();
        List<String> overweight_list = new ArrayList<>();

        for (int i = 0; i < test_num; ++i) {

            Scanner input2 = new Scanner(System.in);
            String[] person = input2.nextLine().split("\\s+");

            String person_name = person[0];
            float person_weight = Integer.parseInt(person[1]); // NumberFormatException
            float person_height = Float.parseFloat(person[2]) / 100;
            float bmi = person_weight / (person_height * person_height);
            if (bmi< 18.5) {
                underweight_list.add(person_name);
            }
            else if (bmi >=18.5 && bmi <25){
                correctweight_list.add(person_name);
            }
            else if (bmi >= 25) {
                overweight_list.add(person_name);
            }
        }

        System.out.println("niedowaga");
        for (String name : underweight_list) {
            System.out.println(name);
        }
        System.out.println();

        System.out.println("wartosc prawidlowa");
        for (String name : correctweight_list) {
            System.out.println(name);
        }
        System.out.println();

        System.out.println("nadwaga");
        for (String name : overweight_list) {
            System.out.println(name);
        }
    }
}