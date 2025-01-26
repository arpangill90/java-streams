package com.arpan.generics;

import java.util.Arrays;
import java.util.List;

public class GenericMethods {

    public static void main(String[] args) {
        String[] names = {"JOE", "MARY", "JUNE"};
         Integer[] array = {5, 2, 7, 9};

        List<String> strings = convertArrauToList(names);
        strings.forEach(System.out::println);

        List<Integer> numbers = convertArrauToList(array);
        numbers.forEach(System.out::println);
    }

    private static <T> List<T> convertArrauToList(T[] array) {
        return Arrays.asList(array);
    }
}
