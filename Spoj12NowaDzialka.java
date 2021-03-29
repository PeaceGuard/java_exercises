package com.company;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Spoj12NowaDzialka {

    public static void main(String[] args) {

        Scanner inputSc = new Scanner(System.in);
        int testNum = inputSc.nextInt();
        inputSc.nextLine();

        List<Integer> areaList = new ArrayList<>();

        for (int i = 0; i < testNum; ++i) {

            int sideLength = inputSc.nextInt();
            int area = sideLength * sideLength;
            areaList.add(area);
        }

        for (int area : areaList) {
            System.out.println(area);
        }
    }
}