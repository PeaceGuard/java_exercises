package com.company;
import java.util.Scanner;

public class Spoj8Kot { // Accepted

    public static void main(String[] args) {

        Scanner inputSc = new Scanner(System.in);
        String sequence = inputSc.nextLine();

        //int sequenceLen = sequence.length();
        int timesFound = 0;
        int letterK = 0;
        int letterT = 0;
        int letterO = 0;

        while (true) {
            letterK = sequence.indexOf("k", letterT);
            letterO = sequence.indexOf("o", letterK);
            letterT = sequence.indexOf("t", letterO);
            if (letterT == -1 || letterO == -1 || letterK == -1) {
                break;
            }
            timesFound += 1;
        }
        if (timesFound == 0) {
            System.out.println("NIE");
        } else {
            System.out.println(timesFound);
        }
    }
}