package com.company;
import java.util.Scanner;

public class Spoj14Podstawowka {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int student_num = input.nextInt();

        float average_sum = 0;

        for (int i = 0; i < student_num; ++i) {
            Scanner input2 = new Scanner(System.in);
            String[] student_list = input2.nextLine().split("\\s+");
            average_sum += Float.parseFloat(student_list[2]);
        }

        float average = average_sum / student_num;

        System.out.printf("%.2f", average);
    }
}
