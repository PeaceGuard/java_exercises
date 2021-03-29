package com.company;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Spoj13PrawieFib {

    public static void main(String[] args) {

        Scanner inputSc = new Scanner(System.in);
        int numberCount = inputSc.nextInt();
        inputSc.nextLine();

        String[] numberList = inputSc.nextLine().split("\\s+");

        ArrayList<Integer> consecutiveTriple = new ArrayList<>();
        int count = 0;

        consecutiveTriple.add(Integer.parseInt(numberList[0]));
        consecutiveTriple.add(Integer.parseInt(numberList[1]));
        String[] numberListTrim = Arrays.copyOfRange(numberList, 2, numberList.length); // Why red?

        for (String number : numberListTrim) { // Is it possible to have a range 2:number_count?
            int elem1Back = consecutiveTriple.get(0);
            int elem2Back = consecutiveTriple.get(1);
            if (Integer.parseInt(number) == elem1Back + elem2Back) {
                count += 1;
            }
            consecutiveTriple.add(Integer.parseInt(number));
            List<Integer> consecutiveTriple2 = consecutiveTriple;
            consecutiveTriple2.remove(0);
        }
        System.out.println(count);
    }
}