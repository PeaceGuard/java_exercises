package com.company;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Spoj11LiczPierwsze {

    public static void main(String[] args) {

        Scanner inputSc = new Scanner(System.in);
        int testNum = inputSc.nextInt();
        inputSc.nextLine();
        List<String> resultList = new ArrayList<>(); // When use String[] and when ArrayList? And when other similar?

        for (int i = 0; i < testNum; ++i) {
            int number = inputSc.nextInt();

            int divisor = 2;
            double numberSq = Math.sqrt(number);
            while (divisor <= numberSq) {
                if (number % divisor == 0) {
                    resultList.add("NIE");
                    break;
                } else {
                    divisor += 1;
                }
            }
            if (number == 1) {
                resultList.add("NIE");
                continue;
            }
            if (divisor > numberSq) {
                resultList.add("TAK");
            }
        }

        for (String result : resultList) {
            System.out.println(result);
        }
    }
}