package com.company;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Spoj7Bmi {

    public static void main(String[] args) {

        Scanner inputSc = new Scanner(System.in);
        int testNum = inputSc.nextInt();
        inputSc.nextLine();

        List<String> underweightList = new ArrayList<>();
        List<String> correctweightList = new ArrayList<>();
        List<String> overweightList = new ArrayList<>();

        for (int i = 0; i < testNum; ++i) {

            String[] person = inputSc.nextLine().split("\\s+");

            String personName = person[0];
            float personWeight = Integer.parseInt(person[1]);
            float personHeight = Float.parseFloat(person[2]) / 100;
            float bmi = personWeight / (personHeight * personHeight);
            if (bmi< 18.5) {
                underweightList.add(personName);
            }
            else if (bmi >=18.5 && bmi <25){
                correctweightList.add(personName);
            }
            else if (bmi >= 25) {
                overweightList.add(personName);
            }
        }

        System.out.println("niedowaga");
        for (String name : underweightList) {
            System.out.println(name);
        }
        System.out.println();

        System.out.println("wartosc prawidlowa");
        for (String name : correctweightList) {
            System.out.println(name);
        }
        System.out.println();

        System.out.println("nadwaga");
        for (String name : overweightList) {
            System.out.println(name);
        }
    }
}