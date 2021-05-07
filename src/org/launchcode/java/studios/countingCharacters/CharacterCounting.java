package org.launchcode.java.studios.countingCharacters;

import java.util.HashMap;
import java.util.Scanner;

public class CharacterCounting {
    public static void main(String[] args) {
        String newString = new String();
        Scanner input = new Scanner(System.in);

        System.out.println("Enter any String:");
        newString=input.nextLine();



        CharacterCounting.characterCount(newString);
    }

    public static void characterCount(String inputString) {

        HashMap<Character, Integer> strings = new HashMap<>();
        char[] strArray = inputString.toCharArray();
        for (char c : strArray) {
            if (strings.containsKey(c)) {
                strings.put(c, strings.get(c) + 1);
            }
            else{
                strings.put(c, 1);
            }
        }
        for (HashMap.Entry entry : strings.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }
}
