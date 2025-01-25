package com.arpan.array;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] array = {10, 4, 6, 3, 7};
         sortArray(array);

        System.out.println(Arrays.toString(array));
    }

    private static void sortArray(int[] array) {
        for (int i = array.length-1; i>0; i--) {
            for (int j=0; j<i; j++){
                if (array[j] > array[j+1]) {
                    //use temp to switch
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }
    }
}
