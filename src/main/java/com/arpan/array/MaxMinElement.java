package com.arpan.array;

import java.util.Arrays;

public class MaxMinElement {
    public static void main(String[] args) {
        int[] myList1 = {5, 3, 8, 1, 6, 9};
        int[] result1 = findMaxMin(myList1);
        System.out.println("Test case 1: MaxMin: " + Arrays.toString(result1)); // prints "[9, 1]"
    }

    public static int[] findMaxMin(int[] myList) {
        int max = myList[0];
        int min = myList[0];

        for (int i=1; i<myList.length; i++){
            if (myList[i] > max) {
                max = myList[i];
            }
            if (myList[i] < min) {
                min = myList[i];
            }
        }
        return new int[]{max, min};
    }
}
