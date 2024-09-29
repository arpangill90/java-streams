package com.arpan;

import java.util.List;

/**
 * Contains examples for
 * Reduce - to do sum of numbers in a list
 */
public class StreamsExamples {

    public static void main(String[] args) {
        System.out.println(sumOfList(List.of(1, 2, 3, 4, 5)));
        System.out.println(sumOfOddNumbers(List.of(1, 2, 3, 4, 5)));
    }

    private static int sumOfList(List<Integer> numbers) {
        return numbers.stream()
                .reduce(0, Integer::sum); //to use lambda .reduce(0, (a,b) -> a+b)
    }

    private static int sumOfOddNumbers(List<Integer> numbers) {
        return numbers.stream()
                .filter(n ->  n%2 != 0)
                .reduce(0, Integer::sum);
    }
}
