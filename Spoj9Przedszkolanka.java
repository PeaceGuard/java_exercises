package com.company;
import java.util.Scanner;

public class Spoj9Przedszkolanka {

    public static void main(String[] args) {

        Scanner inputSc = new Scanner(System.in);
        int testNum = inputSc.nextInt();
        inputSc.nextLine();

        for (int i = 0; i < testNum; ++i) {
            String[] kidNumbers = inputSc.nextLine().split("\\s+");

            int groupA = Integer.parseInt(kidNumbers[0]);
            int groupB = Integer.parseInt(kidNumbers[1]);

            int biggerNum = Math.max(groupA, groupB);
            while (biggerNum % groupA != 0 || biggerNum % groupB != 0) {
                biggerNum += 1;
            }
            int lcm = biggerNum;
            System.out.println(lcm);
        }
    }
}