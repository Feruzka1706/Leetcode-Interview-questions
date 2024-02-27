package com.cydeo.secondWeek;

import java.util.Arrays;
import java.util.stream.Collectors;

public class JadenCasingConverter {

    public static void main(String[] args) {
        String original = "H     can mirrors be REAL if our eyes aren't real";
        String jadenCased = toJadenCase(original);
        System.out.println("Not Jaden-Cased: " + original);
        System.out.println("Jaden-Cased: " + jadenCased);

        System.out.println("*****************************");
        System.out.println(Arrays.toString(original.split("\\s+")));
    }

    public static String toJadenCase(String input) {


        if (input == null || input.isEmpty()) {
            return "";
        }

        //check if origin word contains all characters/words are lowercase
        input= input.toLowerCase();

        return Arrays.stream(input.split("\\s"))
                .filter(word -> !word.isEmpty())
                .map(word -> Character.toUpperCase(word.charAt(0)) + word.substring(1)) //h = 0
                .collect(Collectors.joining(" "));
    }


}
