package com.arpan.array;

import java.util.Arrays;

public class QuickSort {

    public static void main(String[] args) {

        int[] array = {1, 4, 6, 2, 9, 3};

        quickSort(array);

        System.out.println(Arrays.toString(array));
    }

    private static void quickSort(int[] array) {
        quickSortHelper(array, 0, array.length-1);
    }

    private static void quickSortHelper(int[] array, int left, int right) {
        if (left<right) {
            int pivotIndex = pivot(array, left, right);
            quickSortHelper(array, left, pivotIndex-1);
            quickSortHelper(array, pivotIndex+1, right);
        }
    }

    private static void swap(int[] array, int firstIndex, int secondIndex) {
        int temp = array[firstIndex];
        array[firstIndex] = array[secondIndex];
        array[secondIndex] = temp;
    }

    private static int pivot(int[] array, int pivotIndex, int endIndex) {
        int swapIndex = pivotIndex;
        for (int i=pivotIndex+1; i<=endIndex; i++) {
            if (array[i] < array [pivotIndex]) {
                swapIndex++;
                swap(array, swapIndex, i);
            }
        }
        swap(array, pivotIndex, swapIndex);
        return swapIndex;
    }
}
