package com.company;
import java.util.Scanner;

public class Spoj14Podstawowka {

    public static void main(String[] args) {

        Scanner inputSc = new Scanner(System.in);
        int studentNum = inputSc.nextInt();
        inputSc.nextLine();

        float averageSum = 0;

        for (int i = 0; i < studentNum; ++i) {
            String[] studentList = inputSc.nextLine().split("\\s+");
            averageSum += Float.parseFloat(studentList[2]);
        }

        float average = averageSum / studentNum;

        System.out.printf("%.2f", average);
    }
}