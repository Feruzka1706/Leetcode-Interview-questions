package com.cydeo.secondWeek;

import java.util.HashMap;
import java.util.Map;

public class CountNumberOfDuplicatedChars {

    public static void main(String[] args) {

        System.out.println(countDuplicates("abcde")); // Output: 0
        System.out.println(countDuplicates("aabbcde")); // Output: 2
        System.out.println(countDuplicates("aabBcde")); // Output: 2
        System.out.println(countDuplicates("indivisibility")); // Output: 1
        System.out.println(countDuplicates("Indivisibilities")); // Output: 2
        System.out.println(countDuplicates("aA11")); // Output: 2
        System.out.println(countDuplicates("ABBA")); // Output: 2

    }


    public static Object countDuplicates(String input) {
        Map<Character, Integer> charFrequencyMap = new HashMap<>();

        input = input.toLowerCase();
        input.chars().forEach(ch -> charFrequencyMap.merge((char) ch, 1, Integer::sum));

        Map<Character, Integer> duplicatesMap = charFrequencyMap.entrySet().stream()
                .filter(entry -> entry.getValue() > 1)
                .collect(HashMap::new, (m, entry) -> m.put(entry.getKey(), entry.getValue()), HashMap::putAll);

        return duplicatesMap.isEmpty() ? input : duplicatesMap;
    }


}
