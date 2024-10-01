package com.arpan;

import java.util.List;
import java.util.function.Predicate;

public class DetailedExplanation {
    public static void main(String[] args) {
        printEvenNumbers(List.of(1, 2, 3, 4));
    }

    private static void printEvenNumbers(List<Integer> numbers){
        numbers.stream()
                .filter(getIntegerPredicate())
                .forEach(System.out::println);
    }

    private static Predicate<Integer> getIntegerPredicate() {
        return n -> n % 2 == 0;
        //what is happening here
       /* new Predicate<Integer>() {
            @Override
            public boolean test(Integer integer) {
                return integer % 2 == 0;
            }
        }*/
    }
}
