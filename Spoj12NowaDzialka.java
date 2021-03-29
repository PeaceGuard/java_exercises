package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Spoj12NowaDzialka {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int test_num = input.nextInt();

        List<Integer> area_list = new ArrayList<>();

        for (int i = 0; i < test_num; ++i) {

            Scanner input2 = new Scanner(System.in);
            int side_length = input2.nextInt();
            int area = side_length * side_length;
            area_list.add(area);
        }

        for (int element : area_list) {
            System.out.println(element);
        }
    }
}
