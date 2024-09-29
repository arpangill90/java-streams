package com.arpan;

import java.util.List;

/**
 * Contains Simple stream examples and high level method reference
 */
public class Main {
    public static void main(String[] args) {

        printNumbers(List.of(1,2,3,4));
        printEvenNumbers(List.of(1,2,3,4));
        printSquareOfEvenNumbers(List.of(1,2,3,4));
        printLongNames(List.of("JOE", "MARRY", "JOHN", "BRANDON"));
        printNameLength(List.of("JOE", "MARRY", "JOHN", "BRANDON"));

    }

    private static void printSquareOfEvenNumbers(List<Integer> numbers) {
        numbers.stream()
                .filter(n -> n % 2 == 0)
                .map(n -> n * n)
                .forEach(System.out::println);
    }

    //Simple print using method reference
    private static void printNumbers(List<Integer> numbers){
        numbers.forEach(System.out::println); //for each integer in list, call this method
    }

    private static void printEvenNumbers(List<Integer> numbers){
        numbers.stream()
                .filter(n -> n % 2 == 0)
                .forEach(System.out::println);
    }

    private static void printLongNames(List<String> names) {
        names.stream()
                .filter(name -> name.length() > 3)
                .forEach(System.out::println);
    }

    private static void printNameLength(List<String> names) {
        names.stream()
                .map(String::length)
                .forEach(System.out::println);
    }
}