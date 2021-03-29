package com.company;
import java.util.*;

public class Spoj21ZliczaczLiter {

    public static void main(String[] args) {

        Scanner inputSc = new Scanner(System.in);
        int testNum = inputSc.nextInt();
        inputSc.nextLine();

        Set<Character> upperLetters = new HashSet<>();
        Set<Character> lowerLetters = new HashSet<>();
        String allTextLines = "";
        List<Character> sortedLetters = new ArrayList<>();

        for (int i = 0; i < testNum; ++i) {
            
            String textLine = inputSc.nextLine().replace(" ", "");
            for (int j = 0; j < textLine.length() ; ++j) {
                if (Character.isUpperCase(textLine.charAt(j))) {
                    upperLetters.add(textLine.charAt(j));
                }
                if (Character.isLowerCase(textLine.charAt(j))) {
                    lowerLetters.add(textLine.charAt(j));
                }
            }
            List<Character> lowerLettersList = new ArrayList<>(lowerLetters);
            Collections.sort(lowerLettersList);
            List<Character> upperLettersList = new ArrayList<>(upperLetters);
            Collections.sort(lowerLettersList);
            sortedLetters = new ArrayList<>(lowerLettersList);
            sortedLetters.addAll(upperLettersList);
            allTextLines += textLine;
        }
        for (Character letter : sortedLetters) {
            /*int letter_count3 = all_text_lines.length() - all_text_lines.replace(letter, "").length(); - crashes*/
            /*int letter_count2 = all_text_lines.replaceAll(String.valueOf(letter), "").length(); - gives wrong result*/
            int letterCount = allTextLines.split(String.valueOf(letter),-1).length-1;
            System.out.println(letter + " " + letterCount);
        }
    }
}