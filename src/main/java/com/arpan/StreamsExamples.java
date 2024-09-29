package com.arpan;

import java.util.Comparator;
import java.util.List;

/**
 * Contains examples for
 * Reduce
 */
public class StreamsExamples {

    public static void main(String[] args) {
        System.out.println(sumOfList(List.of(1, 2, 3, 4, 5)));
        System.out.println(sumOfOddNumbers(List.of(1, 2, 3, 4, 5)));
        System.out.println(sumOfSquareOfEvenNumbers(List.of(1, 2, 3, 4, 5)));
        printDistinctNumbers(List.of(5, 10, 13, 13, 2, 5, 4, 3, 4, 5));
        sortAndPrintNumbers(List.of(5, 10, 13, 13, 2, 5, 4, 3, 4, 5));
        sortAndPrintValues(List.of("", "JOE", "MOE", "MARY"));
        reverseSortAndPrintValues(List.of("", "JOE", "MOE", "MARY"));
        sortByLengthAndPrintValues(List.of("", "JOE", "MOE", "MARY"));

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

    private static int sumOfSquareOfEvenNumbers(List<Integer> numbers) {
        return numbers.stream()
                .filter(n -> n%2 ==0)
                .map( n -> n*n)
                .reduce(0, Integer::sum);
    }

    private static void printDistinctNumbers(List<Integer> numbers) {
        numbers.stream().distinct().forEach(System.out::println);
    }

    private static void sortAndPrintNumbers(List<Integer> numbers) {
        numbers.stream().sorted().forEach(System.out::println);
    }

    private static void sortAndPrintValues(List<String> names) {
        names.stream()
                .filter(name -> !name.isEmpty())
                .sorted()
                .forEach(System.out::println);
    }

    private static void reverseSortAndPrintValues(List<String> names) {
        names.stream()
                .filter(name -> !name.isEmpty())
                .sorted(Comparator.reverseOrder())
                .forEach(System.out::println);
    }

    private static void sortByLengthAndPrintValues(List<String> names) {
        names.stream()
                .filter(name -> !name.isEmpty())
                .sorted(Comparator.comparing(String::length))
                .forEach(System.out::println);
    }
}
