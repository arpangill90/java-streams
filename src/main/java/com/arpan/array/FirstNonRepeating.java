package com.arpan.array;

import java.util.LinkedHashMap;
import java.util.Map;

public class FirstNonRepeating {

    public static void main(String[] args) {
        String value = findFirstNonRepeatChar("swiss");
        System.out.println(value);
    }

    private static String findFirstNonRepeatChar(String string) {
        Map<Character, Integer> map = new LinkedHashMap<>();

        for (char c : string.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1); //the char with no repeat would remain 0
        }

        for( var entry : map.entrySet()) {
            if (entry.getValue() == 1) {
                return entry.getKey().toString();
            }
        }

        return ""; //if no char found, return empty

    }
}
