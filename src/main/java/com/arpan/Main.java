package com.arpan;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        printNumbers(List.of(1,2,3,4));
    }

    //Simple print using method reference
    private static void printNumbers(List<Integer> numbers){
        numbers.forEach(System.out::println); //for each integer in list, call this method
    }
}