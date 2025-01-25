package com.arpan.array;

import java.util.HashMap;
import java.util.Map;

public class SubArraySum {
    public static void main(String[] args) {
        int[] array = {3, 4, 8, 1, 5};

        boolean sum = sumOfArray(array, 8);

        System.out.println(sum);
    }

    private static boolean sumOfArray(int[] array, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, 1); //init the sum as 0
        int sum = 0;

        for (int num : array) {
            sum += num;

            if (map.containsKey(sum-k)) {
                return true;
            }
            map.put(sum, map.getOrDefault(sum, 0)+ 1);
        }
        return false;
    }
}
