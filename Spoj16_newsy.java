package com.company;
import java.util.*;
import java.util.Scanner;

public class Spoj16_newsy {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int test_num = input.nextInt();

        for (int i = 0; i < test_num; ++i) {
            Scanner input2 = new Scanner(System.in);
            String[] dataset = input2.nextLine().split("\\s+");

            int num_messages = Integer.parseInt(dataset[1]);
            String num_of_source = dataset[2];
            List<String> ordered_chain_members = new ArrayList<>(Collections.singletonList(num_of_source));
            Set<String> chain_members = Collections.singleton(num_of_source);

            for (int j = 0; j < num_messages; ++j) {
                Scanner input3 = new Scanner(System.in);
                String[] message = input3.nextLine().split("\\s+");
                if (chain_members.contains(message[0]) && chain_members.contains(message[1])) {
                    ordered_chain_members.add(message[1]);
                    chain_members.add(message[1]);
                }
            }
            for (String member : ordered_chain_members) {
                System.out.println(member);
            }
        }
    }
}