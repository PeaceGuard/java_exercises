package com.company;
import java.util.Scanner;

public class Spoj6KtoraGodz {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String binary_numbers = input.nextLine();
        String[] binary_list = binary_numbers.split("\\s+");

        String hour = Integer.toString(Integer.parseInt(binary_list[0],2)) + Integer.toString(Integer.parseInt(binary_list[1],2));
        String minute = Integer.toString(Integer.parseInt(binary_list[2],2)) + Integer.toString(Integer.parseInt(binary_list[3],2));

        String display_hour = String.format("%2d", Integer.parseInt(hour)).replace(" ", "0");
        String display_minute = String.format("%2d", Integer.parseInt(minute)).replace(" ", "0");
        /*#hours = str(int(binary_list[0], 2)) + str(int(binary_list[1], 2))
        #minutes = str(int(binary_list[2], 2)) + str(int(binary_list[3], 2))*/
        System.out.println(display_hour + ":" + display_minute);
    }
}
