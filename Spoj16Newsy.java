package com.company;
import java.util.*;
import java.util.Scanner;

public class Spoj16Newsy {

    public static void main(String[] args) {

        Scanner inputSc = new Scanner(System.in);
        int testNum = inputSc.nextInt();
        inputSc.nextLine();

        for (int i = 0; i < testNum; ++i) {
            String[] dataset = inputSc.nextLine().split("\\s+");

            int numMessages = Integer.parseInt(dataset[1]);
            String numOfSource = dataset[2];
            List<String> orderedChainMembers = new ArrayList<>(Collections.singletonList(numOfSource));
            Set<String> chainMembers = new HashSet<>(Collections.singleton(numOfSource));

            for (int j = 0; j < numMessages; ++j) {
                String[] message = inputSc.nextLine().split("\\s+");
                if (chainMembers.contains(message[0]) && chainMembers.contains(message[1])) {
                    orderedChainMembers.add(message[1]);
                    chainMembers.add(message[1]);
                }
            }
            for (String member : orderedChainMembers) {
                System.out.println(member);
            }
        }
    }
}