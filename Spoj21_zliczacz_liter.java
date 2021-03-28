package com.company;
import java.util.*;

public class Spoj21_zliczacz_liter {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int test_num = input.nextInt();

        Set<Character> upper_letters = new HashSet<>();
        Set<Character> lower_letters = new HashSet<>();
        String all_text_lines = "";
        List<Character> sorted_letters = new ArrayList<>();

        for (int i = 0; i < test_num; ++i) {

            Scanner input2 = new Scanner(System.in);
            String text_line = input2.nextLine().replace(" ", "");
            for (int j = 0; j < text_line.length() ; ++j) {
                if (Character.isUpperCase(text_line.charAt(j))) {
                    upper_letters.add(text_line.charAt(j));
                }
                if (Character.isLowerCase(text_line.charAt(j))) {
                    lower_letters.add(text_line.charAt(j));
                }
            }
            List<Character> lower_letters_list = new ArrayList<>(lower_letters);
            Collections.sort(lower_letters_list);
            List<Character> upper_letters_list = new ArrayList<>(upper_letters);
            Collections.sort(lower_letters_list);
            sorted_letters = new ArrayList<>(lower_letters_list);
            sorted_letters.addAll(upper_letters_list);
            all_text_lines += text_line;
        }

        for (Character letter : sorted_letters) {
            /*int letter_count3 = all_text_lines.length() - all_text_lines.replace(letter, "").length(); - crashes*/
            /*int letter_count2 = all_text_lines.replaceAll(String.valueOf(letter), "").length(); - gives wrong result*/
            int letter_count = all_text_lines.split(String.valueOf(letter),-1).length-1;
            System.out.println(letter + " " + letter_count);
        }
    }
}
