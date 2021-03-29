package com.company;
import java.util.Scanner;

public class Spoj6KtoraGodz {

    public static void main(String[] args) {

        Scanner inputSc = new Scanner(System.in);
        String binaryNumbers = inputSc.nextLine();
        String[] binaryList = binaryNumbers.split("\\s+");

        String hour = Integer.toString(Integer.parseInt(binaryList[0],2)) + Integer.toString(Integer.parseInt(binaryList[1],2));
        String minute = Integer.toString(Integer.parseInt(binaryList[2],2)) + Integer.toString(Integer.parseInt(binaryList[3],2));

        String displayHour = String.format("%2d", Integer.parseInt(hour)).replace(" ", "0");
        String displayMinute = String.format("%2d", Integer.parseInt(minute)).replace(" ", "0");
        /*#hours = str(int(binaryList[0], 2)) + str(int(binaryList[1], 2))
        #minutes = str(int(binaryList[2], 2)) + str(int(binaryList[3], 2))*/
        System.out.println(displayHour + ":" + displayMinute);
    }
}