package com.arpan;

import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

/**
 * This class has some details of what happens behind the scenes with functional Java
 */
public class DetailedExplanation {
    public static void main(String[] args) {
        printEvenNumbers(List.of(1, 2, 3, 4));
        printSquareOfEvenNumbers(List.of(1, 2, 3, 4));
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

    private static void printSquareOfEvenNumbers(List<Integer> numbers) {
        numbers.stream()
                .filter(n -> n % 2 == 0)
                .map(squareFunction())
                .forEach(System.out::println);
    }

    private static Function<Integer, Integer> squareFunction() {
        return n -> n * n;

        //what is happening behind the scene
       /* new Function<Integer, Integer>() {

            @Override
            public Integer apply(Integer integer) {
                return integer*integer;
            }
        }*/
    }
}
