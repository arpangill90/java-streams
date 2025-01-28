package com.arpan.array;

import java.util.Arrays;

public class RotateArrayElements {

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4 , 5};

        process(numbers, 3);

        System.out.println(Arrays.toString(numbers));


    }
    private static void process(int[] numbers, int k) {
        k = k % numbers.length; //handle if k is greater than length
        reverse(numbers, 0, numbers.length-1); //reverse whole array
        reverse(numbers, 0, k-1); //reverse k elements
        reverse(numbers, k, numbers.length-1); //revers remaining

    }

    private static void reverse(int[] numbers, int start, int end) {
        while (start < end) {
            int temp = numbers[start];
            numbers[start] = numbers[end];
            numbers[end] = temp;
            start++;
            end--;

        }
    }
}
