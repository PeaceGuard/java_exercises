package com.company;
import java.util.Scanner;

public class Spoj05ProstIKwad {

    public static void main(String[] args) {

        Scanner inputSc = new Scanner(System.in);
        String[] sideLengths = inputSc.nextLine().split("\\s+");
        int a = Integer.parseInt(sideLengths[0]);
        int b = Integer.parseInt(sideLengths[1]);
        if (a >= b || a < 1 || b < 1 || a > 10000 || b > 10000) {
            System.out.println("Please provide inputSc in format 'a b', where both numbers are natural and meet 1 ≤ a < b ≤ 10⁴ condition");
        }
        int bigSqArea = a * a;

        int smallSqArea = 0;
        if (b <= 2 * a) {
            int sideDiff = b - a;
            smallSqArea = (int)Math.pow(sideDiff, 2);
        } else {
            smallSqArea = a * a;
        }
        int totalArea = bigSqArea + smallSqArea;
        System.out.println(totalArea);
    }
}