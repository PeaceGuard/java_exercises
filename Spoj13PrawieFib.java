package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Spoj13PrawieFib {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int number_count = input.nextInt();

        Scanner input2 = new Scanner(System.in);
        String[] number_list = input2.nextLine().split("\\s+");

        ArrayList<Integer> consecutive_triple = new ArrayList<>();
        int count = 0;

        consecutive_triple.add(Integer.parseInt(number_list[0]));
        consecutive_triple.add(Integer.parseInt(number_list[1]));
        String[] number_list_trim = Arrays.copyOfRange(number_list, 2, number_list.length); // Why length, not length-1?

        for (String number : number_list_trim) { // Is it possible to have a range 2:number_count?
            int elem_1back = consecutive_triple.get(0);
            int elem_2back = consecutive_triple.get(1);
            if (Integer.parseInt(number) == elem_1back + elem_2back) {
                count += 1;
            }
            consecutive_triple.add(Integer.parseInt(number));
            List<Integer> consecutive_triple_2 = consecutive_triple;
            consecutive_triple_2.remove(0);
        }
        System.out.println(count);
    }
}
