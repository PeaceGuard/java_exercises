package com.company;
import java.util.Scanner;

public class Spoj05ProstIKwad {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String[] side_lengths = input.nextLine().split("\\s+");
        int a = Integer.parseInt(side_lengths[0]);
        int b = Integer.parseInt(side_lengths[1]);
        if (a >= b || a < 1 || b < 1 || a > 10000 || b > 10000) {
            System.out.println("Please provide input in format 'a b', where both numbers are natural and meet 1 ≤ a < b ≤ 10⁴ condition");
        }
        int big_sq_area = a * a;

        int small_sq_area = 0;
        if (b <= 2 * a) {
            int side_diff = b - a;
            small_sq_area = (int)Math.pow(side_diff, 2);
        } else {
            small_sq_area = a * a;
        }
        int total_area = big_sq_area + small_sq_area;
        System.out.println(total_area);
    }
}